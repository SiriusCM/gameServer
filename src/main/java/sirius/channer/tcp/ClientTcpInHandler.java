package sirius.channer.tcp;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sirius.Start;
import sirius.World;
import sirius.handler.Handler;
import sirius.proto.MsgRequest;
import sirius.proto.ProtoBuf;

/**
 * @author 高连棣
 * @date 2018/7/2 11:03
 */
@Component
public class ClientTcpInHandler extends SimpleChannelInboundHandler<ProtoBuf.Message> {
	
	private static final Logger logger = LoggerFactory.getLogger(ClientTcpInHandler.class);
	
	@Autowired
	private World world;
	
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		Channel incoming = ctx.channel();
		logger.info("Server:" + incoming.remoteAddress() + "已连接");
	}
	
	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		Channel incoming = ctx.channel();
		logger.info("Server:" + incoming.remoteAddress() + "断开");
	}
	
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, ProtoBuf.Message message) throws Exception {
		MsgRequest msgRequest = MsgRequest.getMsgRequest(message.getId());
		Handler handler = (Handler) Start.applicationContext.getBean(msgRequest.getHandler());
		handler.exe(world.getPlayerByCtx(ctx), msgRequest.getParser().parseFrom(message.getData()));
	}
}
