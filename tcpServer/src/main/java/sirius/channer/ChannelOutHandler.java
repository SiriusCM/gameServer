package sirius.channer;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import sirius.proto.ProtoBuf;

import java.util.List;

public class ChannelOutHandler extends MessageToMessageEncoder<ProtoBuf.Message.Builder> {

	@Override
	protected void encode(ChannelHandlerContext channelHandlerContext, ProtoBuf.Message.Builder builder, List<Object> list) throws Exception {
		list.add(builder.build());
	}
}
