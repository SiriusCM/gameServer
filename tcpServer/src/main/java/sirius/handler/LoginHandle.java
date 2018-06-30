package sirius.handler;

import io.netty.channel.ChannelHandlerContext;
import sirius.proto.protobuf.Message;

/**
 * @author 高连棣
 * @date 2018/6/30 18:59
 */
public class LoginHandle implements Handler {

	private static final LoginHandle instance = new LoginHandle();

	private LoginHandle() {
	}

	@Override
	public boolean handler(ChannelHandlerContext ctx, Message.Position msg) throws Exception {
		return false;
	}

	public static LoginHandle getInstance() {
		return instance;
	}
}
