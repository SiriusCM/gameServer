package com.sirius.server;

import com.sirius.server.channer.tcp.TcpInit;
import com.sirius.server.channer.udp.UdpInHandler;
import com.sirius.server.service.IService;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

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
            factory.createTcpServer(new TcpInit(), bossGroup, workerGroup, 5555, 128);
            factory.createUdpServer(new UdpInHandler(), workerGroup, 6666, true);
            applicationContext.getBeansOfType(IService.class).forEach((name, e) -> {
                e.init();
            });
            Runtime.getRuntime().addShutdownHook(applicationContext.getBean(World.class));
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
