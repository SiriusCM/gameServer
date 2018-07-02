package sirius.handler;

import com.google.protobuf.ByteString;
import io.netty.channel.ChannelHandlerContext;
import sirius.proto.Message;
import sirius.proto.protobuf.Login;

/**
 * @author 高连棣
 * @date 2018/6/30 18:59
 */
public class LoginHandle implements Handler {

	@Override
	public boolean handler(ChannelHandlerContext ctx, ByteString data) throws Exception {
		Login.Position position = Login.Position.parseFrom(data);
		logger.info(position.getX());
		return true;
	}

	@Override
	public Message getProto() {
		return Message.Login;
	}
}
