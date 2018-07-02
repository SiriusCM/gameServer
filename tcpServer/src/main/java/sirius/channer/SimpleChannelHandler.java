package sirius.channer;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import sirius.World;
import sirius.proto.ProtoBuf;

/**
 * @author 高连棣
 * @date 2018/7/2 11:03
 */
public class SimpleChannelHandler extends SimpleChannelInboundHandler<ProtoBuf.Message> {

	private static final Logger logger = LoggerFactory.getLogger(ChannelHandler.class);

	@Autowired
	private World world;

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		Channel incoming = ctx.channel();
		logger.info("Client:" + incoming.remoteAddress() + "上线");
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		Channel incoming = ctx.channel();
		logger.info("Client:" + incoming.remoteAddress() + "掉线");
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, ProtoBuf.Message message) throws Exception {
		world.getHandler(message.getId()).handler(ctx, message.getData());
	}
}
