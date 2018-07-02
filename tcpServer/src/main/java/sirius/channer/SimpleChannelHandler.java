package sirius.channer;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sirius.World;
import sirius.proto.ProtoBuf;

/**
 * @author 高连棣
 * @date 2018/7/2 11:03
 */
public class SimpleChannelHandler extends SimpleChannelInboundHandler<ProtoBuf.Message> {
	
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
	protected void channelRead0(ChannelHandlerContext ctx, ProtoBuf.Message message) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		World world = applicationContext.getBean(World.class);
		world.getHandler(message.getId()).handler(ctx, message.getData());
	}
}
