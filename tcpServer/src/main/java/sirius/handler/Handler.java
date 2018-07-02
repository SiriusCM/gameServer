package sirius.handler;

import com.google.protobuf.ByteString;
import io.netty.channel.ChannelHandlerContext;
import org.apache.log4j.Logger;
import sirius.proto.Message;

public interface Handler {

	Logger logger = Logger.getLogger(Handler.class);

	boolean handler(ChannelHandlerContext ctx, Object data) throws Exception;

	Message getProto();
}
