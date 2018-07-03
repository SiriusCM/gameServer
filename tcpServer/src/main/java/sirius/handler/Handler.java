package sirius.handler;

import io.netty.channel.ChannelHandlerContext;
import org.apache.log4j.Logger;
import sirius.proto.MsgProto;

public interface Handler {
	
	Logger logger = Logger.getLogger(Handler.class);
	
	boolean handler(ChannelHandlerContext ctx, Object data) throws Exception;
	
	MsgProto getProto();
}
