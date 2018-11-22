package com.sirius.server;

import com.sirius.server.channer.tcp.ClientTcpInit;
import com.sirius.server.channer.tcp.TcpInit;
import com.sirius.server.channer.udp.ClientUdpInHandler;
import com.sirius.server.channer.udp.UdpInHandler;
import com.sirius.server.database.service.Service;
import com.sirius.server.manager.Manager;
import com.sirius.server.proto.protobuf.Match;
import com.sirius.server.util.ClassUtil;
import com.sirius.server.util.UdpUtil;
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
	
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(ServerApplication.class, args);
		EventLoopGroup bossGroup = new NioEventLoopGroup(1);
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		try {
			ServerFactory factory = applicationContext.getBean(ServerFactory.class);
			Channel channel0 = factory.createTcpServer(new TcpInit(), bossGroup, workerGroup, 1026, 128);
			Channel channel1 = factory.createUdpServer(new UdpInHandler(), workerGroup, 9999, true);
			Channel channel2 = factory.createTcpClient(new ClientTcpInit(), workerGroup, "127.0.0.1", 1026);
			Channel channel3 = factory.createUdpClient(new ClientUdpInHandler(), workerGroup, true);
			Match.Position.Builder builder = Match.Position.newBuilder();
			builder.setX(1);
			builder.setY(2);
			builder.setZ(4);
			UdpUtil.sendMsg(channel3, "127.0.0.1", 9999, UdpUtil.wrapMsg(builder.build()));
			
			ClassUtil.getAllClassByInterface(Service.class).forEach(e -> {
				Service service = (Service) applicationContext.getBean(e);
				service.init();
			});
			ClassUtil.getAllClassByInterface(Manager.class).forEach(e -> {
				Manager manager = (Manager) applicationContext.getBean(e);
				manager.init();
			});
			
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
