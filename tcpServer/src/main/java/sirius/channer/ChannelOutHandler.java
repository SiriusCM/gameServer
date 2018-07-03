package sirius.channer;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import sirius.proto.ProtoBuf;

import java.util.List;

public class ChannelOutHandler extends MessageToMessageEncoder<ProtoBuf.Message> {
	@Override
	protected void encode(ChannelHandlerContext channelHandlerContext, ProtoBuf.Message message, List<Object> list) throws Exception {
		int a;
	}
}
