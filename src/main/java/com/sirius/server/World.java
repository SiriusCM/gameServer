package com.sirius.server;

import com.sirius.server.annotation.Destory;
import com.sirius.server.annotation.Init;
import com.sirius.server.channer.tcp.TcpInit;
import com.sirius.server.channer.udp.UdpInHandler;
import com.sirius.server.service.impl.MethodService;
import com.sirius.server.sprite.Player;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.HashMap;
import java.util.Map;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
@Component
public class World extends Thread implements ServletContextListener {

    private static ApplicationContext applicationContext;

    private Map<ChannelHandlerContext, Player> playerMap = new HashMap<>();

    @Value("${port.tcp}")
    private int tcpPort;

    @Value("${port.udp}")
    private int udpPort;

    @Autowired
    private ServerFactory factory;

    @Autowired
    private MethodService methodService;

    public void start(ApplicationContext applicationContext) throws Exception {
        World.applicationContext = applicationContext;
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            Channel channel = factory.createTcpServer(new TcpInit(), bossGroup, workerGroup, tcpPort, 128);
            factory.createUdpServer(new UdpInHandler(), workerGroup, udpPort, true);
            Runtime.getRuntime().addShutdownHook(this);
            methodService.init();
            methodService.invoke(Init.class);
            channel.closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

    @Override
    public void run() {
        methodService.invoke(Destory.class);
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }

    public Player getPlayerByCtx(ChannelHandlerContext ctx) {
        return playerMap.get(ctx);
    }

    public void addPlayer(ChannelHandlerContext ctx, Player player) {
        playerMap.put(ctx, player);
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
