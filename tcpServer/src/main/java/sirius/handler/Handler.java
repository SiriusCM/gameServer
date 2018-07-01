package sirius.handler;

import io.netty.channel.ChannelHandlerContext;
import org.apache.log4j.Logger;
import sirius.proto.MessageEnum;

public interface Handler {

	Logger logger = Logger.getLogger(Handler.class);

	boolean handler(ChannelHandlerContext ctx, byte[] data) throws Exception;

	MessageEnum getProto();
}
