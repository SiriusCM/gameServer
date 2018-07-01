package sirius.channer;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sirius.World;
import sirius.proto.Message;
import sirius.proto.MessageEnum;

public class ChannelHandler extends ChannelInboundHandlerAdapter {

	private static final Logger logger = LoggerFactory.getLogger(ChannelHandler.class);

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
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		Message message = (Message) msg;
		for (MessageEnum m : MessageEnum.values()) {
			if (m.getId() == message.getId()) {
				byte[] data = message.getData();
				World.map.get(m).handler(ctx, data);
			}
		}
	}
}
