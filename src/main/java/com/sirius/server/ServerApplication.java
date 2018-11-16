package com.sirius.server;

import com.sirius.server.channer.tcp.ClientTcpInit;
import com.sirius.server.channer.tcp.TcpInit;
import com.sirius.server.channer.udp.ClientUdpInHandler;
import com.sirius.server.channer.udp.UdpInHandler;
import com.sirius.server.proto.MsgRequest;
import com.sirius.server.proto.ProtoBuf;
import com.sirius.server.proto.protobuf.Match;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.DatagramPacket;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.net.InetSocketAddress;

@SpringBootApplication
@MapperScan("com.sirius.server.database.mapper")
public class ServerApplication implements ServletContextListener, Runnable {
	
	public static ApplicationContext applicationContext;
	
	@Autowired
	private ServerFactory factory;
	
	@Autowired
	private TcpInit tcpInit;
	
	@Autowired
	private ClientTcpInit clientTcpInit;
	
	@Autowired
	private UdpInHandler udpInHandler;
	
	@Autowired
	private ClientUdpInHandler clientUdpInHandler;
	
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(ServerApplication.class, args);
	}
	
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		new Thread(this).start();
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
	}
	
	@Override
	public void run() {
		bootTcpServer();
		//bootUdpServer();
	}
	
	public void bootTcpServer() {
		EventLoopGroup bossGroup = new NioEventLoopGroup(1);
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		try {
			Channel channel0 = factory.createTcpServer(tcpInit, bossGroup, workerGroup, 8888);
			Channel channel1 = factory.createTcpClient(clientTcpInit, workerGroup, "127.0.0.1", 8888);
			channel0.closeFuture().sync();
			//Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			workerGroup.shutdownGracefully();
			bossGroup.shutdownGracefully();
		}
	}
	
	public void bootUdpServer() {
		EventLoopGroup group = new NioEventLoopGroup();
		try {
			Channel channel0 = factory.createUdpServer(udpInHandler, group, 9999);
			Channel channel1 = factory.createUdpClient(clientUdpInHandler, group);
			
			Match.Position.Builder builder = Match.Position.newBuilder();
			builder.setX(4);
			builder.setY(3);
			builder.setZ(14);
			ProtoBuf.Message.Builder message = ProtoBuf.Message.newBuilder();
			message.setId(MsgRequest.Match_One.getId());
			message.setData(builder.build().toByteString());
			channel1.writeAndFlush(new DatagramPacket(Unpooled.copiedBuffer(message.build().toByteArray()),
					new InetSocketAddress("127.0.0.1", 9999))).sync();
			//channel1.closeFuture().await(15000);
			channel0.closeFuture().await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			group.shutdownGracefully();
		}
	}
}
