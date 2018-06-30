package sirius.handler;

import io.netty.channel.ChannelHandlerContext;
import sirius.proto.protobuf.Message;

public interface Handler {

	boolean handler(ChannelHandlerContext ctx, Message.Position msg) throws Exception;
}
