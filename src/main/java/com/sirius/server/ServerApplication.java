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
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.sirius.server.database.mapper")
public class ServerApplication {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) throws Exception {
		applicationContext = SpringApplication.run(ServerApplication.class, args);
		ServerFactory factory = applicationContext.getBean(ServerFactory.class);
		EventLoopGroup bossGroup = new NioEventLoopGroup(1);
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		try {
			Channel channel0 = factory.createTcpServer(new TcpInit(), bossGroup, workerGroup, 5555, 128);
			Channel channel1 = factory.createUdpServer(new UdpInHandler(), workerGroup, 6666, true);
			applicationContext.getBeansOfType(Model.class).values().forEach(e -> e.init());
			applicationContext.getBeansOfType(Manager.class).values().forEach(e -> e.init());
			Runtime.getRuntime().addShutdownHook(new Thread(new WorldDestroy()));
			Thread.currentThread().join();
		} finally {
			workerGroup.shutdownGracefully();
			bossGroup.shutdownGracefully();
		}
	}

	@LoadBalanced
	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
}
