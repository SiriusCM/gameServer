package handler;

import io.netty.channel.ChannelHandlerContext;
import proto.Message;

public interface Handler {

    boolean handler(ChannelHandlerContext ctx, Message.Position msg) throws Exception;
}
