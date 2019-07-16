package com.sirius.server.channer.tcp;

import com.google.protobuf.GeneratedMessageV3;
import com.sirius.server.msg.MsgResponse;
import com.sirius.server.msg.ProtoBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public class TcpOutHandler extends MessageToMessageEncoder<GeneratedMessageV3> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, GeneratedMessageV3 generatedMessageV3, List<Object> list) {
        ProtoBuf.Message.Builder message = ProtoBuf.Message.newBuilder();
        message.setId(MsgResponse.getMsgResponse(generatedMessageV3.getClass()).getId());
        message.setData(generatedMessageV3.toByteString());
        list.add(message.build());
    }
}
