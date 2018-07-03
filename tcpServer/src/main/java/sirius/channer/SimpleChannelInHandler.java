package sirius.channer;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sirius.World;
import sirius.proto.MsgProto;
import sirius.proto.ProtoBuf;
import sirius.proto.protobuf.Login;

/**
 * @author 高连棣
 * @date 2018/7/2 11:03
 */
public class SimpleChannelInHandler extends SimpleChannelInboundHandler<ProtoBuf.Message> {

	private static final Logger logger = LoggerFactory.getLogger(ChannelHandler.class);

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		Channel incoming = ctx.channel();
		logger.info("Client:" + incoming.remoteAddress() + "上线");
		Login.Position.Builder builder = Login.Position.newBuilder();
		builder.setX(1);
		builder.setY(4);
		builder.setZ(-7);

		ProtoBuf.Message.Builder message = ProtoBuf.Message.newBuilder();
		message.setId(World.getInstance().getMsgId(Login.Position.parser()));
		message.setData(builder.build().toByteString());
		ctx.writeAndFlush(message);
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		Channel incoming = ctx.channel();
		logger.info("Client:" + incoming.remoteAddress() + "掉线");
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, ProtoBuf.Message message) throws Exception {
		MsgProto msgProto = World.getInstance().getMsgProto(message.getId());
		World.getInstance().getHandler(msgProto).handler(ctx, msgProto.getParser().parseFrom(message.getData()));
	}
}
