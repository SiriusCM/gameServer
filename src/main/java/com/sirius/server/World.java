package com.sirius.server;

import com.sirius.server.service.IService;
import com.sirius.server.sprite.Player;
import io.netty.channel.ChannelHandlerContext;
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

    private final Map<ChannelHandlerContext, Player> playerMap = new HashMap<>();

    @Override
    public void run() {
        ServerApplication.getApplicationContext().getBeansOfType(IService.class).values().forEach(e -> e.destroy());
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
}
