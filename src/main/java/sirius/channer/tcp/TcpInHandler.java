package sirius.channer.tcp;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sirius.Start;
import sirius.World;
import sirius.handler.Handler;
import sirius.proto.MsgRequest;
import sirius.proto.ProtoBuf;
import sirius.sprite.Player;

/**
 * @author 高连棣
 * @date 2018/7/2 11:03
 */
public class TcpInHandler extends SimpleChannelInboundHandler<ProtoBuf.Message> {
	
	private static final Logger logger = LoggerFactory.getLogger(TcpInHandler.class);
	
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		World world = Start.applicationContext.getBean(World.class);
		Channel incoming = ctx.channel();
		logger.info("Client:" + incoming.remoteAddress() + "上线");
		world.addPlayer(ctx, new Player(23, "高连棣", ctx));
	}
	
	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		Channel incoming = ctx.channel();
		logger.info("Client:" + incoming.remoteAddress() + "掉线");
	}
	
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, ProtoBuf.Message message) throws Exception {
		World world = Start.applicationContext.getBean(World.class);
		MsgRequest msgRequest = MsgRequest.getMsgRequest(message.getId());
		Handler handler = (Handler) Start.applicationContext.getBean(msgRequest.getHandler());
		handler.handler(world.getPlayerByCtx(ctx), msgRequest.getParser().parseFrom(message.getData()));
	}
}
