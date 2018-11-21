package com.sirius.server;

import com.sirius.server.channer.tcp.TcpInit;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan("com.sirius.server.database.mapper")
public class ServerApplication {
	
	private static ApplicationContext applicationContext;
	
	private static ServerFactory factory = ServerFactory.getInstance();
	
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(ServerApplication.class, args);
		EventLoopGroup bossGroup = new NioEventLoopGroup(1);
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		try {
			Channel channel0 = factory.createTcpServer(new TcpInit(), bossGroup, workerGroup, 5555, 128);
//			Channel channel1 = factory.createUdpServer(new UdpInHandler(), workerGroup, 9999, true);
//			Channel channel2 = factory.createTcpClient(new ClientTcpInit(), workerGroup, "127.0.0.1", 1026);
//			Channel channel3 = factory.createUdpClient(new ClientUdpInHandler(), workerGroup, true);
//			Match.Position.Builder builder = Match.Position.newBuilder();
//			builder.setX(1);
//			builder.setY(2);
//			builder.setZ(4);
//			UdpUtil.sendMsg(channel3, "127.0.0.1", 9999, UdpUtil.wrapMsg(builder.build()));
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			workerGroup.shutdownGracefully();
			bossGroup.shutdownGracefully();
		}
	}
	
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
}
