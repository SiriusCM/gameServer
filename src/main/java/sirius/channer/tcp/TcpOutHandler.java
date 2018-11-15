package sirius.channer.tcp;

import com.google.protobuf.GeneratedMessageV3;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import org.springframework.stereotype.Component;
import sirius.proto.MsgResponse;
import sirius.proto.ProtoBuf;

import java.util.List;

@Component
public class TcpOutHandler extends MessageToMessageEncoder<GeneratedMessageV3> {
	
	@Override
	protected void encode(ChannelHandlerContext channelHandlerContext, GeneratedMessageV3 generatedMessageV3, List<Object> list) throws Exception {
		ProtoBuf.Message.Builder message = ProtoBuf.Message.newBuilder();
		message.setId(MsgResponse.getMsgResponse(generatedMessageV3.getClass()).getId());
		message.setData(generatedMessageV3.toByteString());
		list.add(message.build());
	}
}
