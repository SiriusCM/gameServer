package com.sirius.server;

import com.sirius.server.channer.tcp.TcpInit;
import com.sirius.server.channer.udp.UdpInHandler;
import com.sirius.server.database.model.Model;
import com.sirius.server.manager.Manager;
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
		ServerFactory factory = applicationContext.getBean(ServerFactory.class);
		EventLoopGroup bossGroup = new NioEventLoopGroup(1);
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		try {
			Channel channel0 = factory.createTcpServer(new TcpInit(), bossGroup, workerGroup, 5555, 128);
			Channel channel1 = factory.createUdpServer(new UdpInHandler(), workerGroup, 6666, true);
			applicationContext.getBeansOfType(Model.class).values().forEach(e -> e.init());
			applicationContext.getBeansOfType(Manager.class).values().forEach(e -> e.init());
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
