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
public class ClientChannelInHandler extends SimpleChannelInboundHandler<ProtoBuf.Message> {
	
	private static final Logger logger = LoggerFactory.getLogger(ClientChannelInHandler.class);
	
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		Channel incoming = ctx.channel();
		logger.info("Server:" + incoming.remoteAddress() + "已连接");
		Login.Position.Builder builder = Login.Position.newBuilder();
		builder.setX(1);
		builder.setY(4);
		builder.setZ(-7);
		ctx.writeAndFlush(builder.build());
	}
	
	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		Channel incoming = ctx.channel();
		logger.info("Server:" + incoming.remoteAddress() + "断开");
	}
	
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, ProtoBuf.Message message) throws Exception {
		World world = World.getInstance();
		MsgProto msgProto = world.getMsgProto(message.getId());
		world.getHandler(msgProto).handler(world.getPlayerMap().get(ctx), msgProto.getParser().parseFrom(message.getData()));
	}
}
