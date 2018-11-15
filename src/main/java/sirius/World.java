package sirius;

import io.netty.channel.ChannelHandlerContext;
import org.springframework.stereotype.Component;
import sirius.sprite.Player;

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
