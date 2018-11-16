package com.sirius.server.util;

import com.google.protobuf.GeneratedMessageV3;
import com.sirius.server.proto.ProtoBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.socket.DatagramPacket;

import java.net.InetSocketAddress;

public class UdpUtil {

    public static ProtoBuf.Message wrapMsg(GeneratedMessageV3 messageV3) {
        ProtoBuf.Message.Builder builder = ProtoBuf.Message.newBuilder();
        builder.setId(1015);
        //builder.setId(MsgResponse.getMsgResponse(messageV3.getClass()).getId());
        builder.setData(messageV3.toByteString());
        return builder.build();
    }

    public static void sendMsg(Channel channel, String host, int port, ProtoBuf.Message message) {
        try {
            channel.writeAndFlush(new DatagramPacket(Unpooled.copiedBuffer(message.toByteArray()),
                    new InetSocketAddress(host, port))).sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
