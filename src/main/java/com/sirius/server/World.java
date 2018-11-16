package com.sirius.server;

import com.sirius.server.sprite.Player;
import io.netty.channel.ChannelHandlerContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public final class World {
	
	private final Map<ChannelHandlerContext, Player> playerMap = new HashMap<>();
	
	public Player getPlayerByCtx(ChannelHandlerContext ctx) {
		return playerMap.get(ctx);
	}
	
	public void addPlayer(ChannelHandlerContext ctx, Player player) {
		playerMap.put(ctx, player);
	}
}
