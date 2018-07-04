package sirius.channer;

import com.google.protobuf.GeneratedMessageV3;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import sirius.World;
import sirius.proto.ProtoBuf;

import java.util.List;

public class ChannelOutHandler extends MessageToMessageEncoder<GeneratedMessageV3> {
	
	@Override
	protected void encode(ChannelHandlerContext channelHandlerContext, GeneratedMessageV3 generatedMessageV3, List<Object> list) throws Exception {
		ProtoBuf.Message.Builder message = ProtoBuf.Message.newBuilder();
		message.setId(World.getInstance().getMsgProto(generatedMessageV3.getClass()).getId());
		message.setData(generatedMessageV3.toByteString());
		list.add(message.build());
	}
}
