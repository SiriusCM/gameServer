package com.sirius.server;

import com.sirius.server.sprite.Player;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.HashMap;
import java.util.Map;

@Component
public class World implements ServletContextListener {

    private static final Logger logger = LoggerFactory.getLogger(World.class);

    private final Map<ChannelHandlerContext, Player> playerMap = new HashMap<>();

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info("destroyed");
    }

    public Player getPlayerByCtx(ChannelHandlerContext ctx) {
        return playerMap.get(ctx);
    }

    public void addPlayer(ChannelHandlerContext ctx, Player player) {
        playerMap.put(ctx, player);
    }
}
