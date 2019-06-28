package com.sirius.server.util;

import com.google.protobuf.GeneratedMessageV3;
import com.sirius.server.proto.MsgResponse;
import com.sirius.server.proto.ProtoBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.socket.DatagramPacket;

import java.net.InetSocketAddress;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public class UdpUtil {

    public static ProtoBuf.Message wrapMsg(GeneratedMessageV3 messageV3) {
        ProtoBuf.Message.Builder builder = ProtoBuf.Message.newBuilder();
        builder.setId(MsgResponse.getMsgResponse(messageV3.getClass()).getId());
        builder.setData(messageV3.toByteString());
        return builder.build();
    }

    public static DatagramPacket wrapMsg(String host, int port, ProtoBuf.Message message) throws InterruptedException {
        DatagramPacket datagramPacket = new DatagramPacket(Unpooled.copiedBuffer(message.toByteArray()), new InetSocketAddress(host, port));
        return datagramPacket;
    }

    public static DatagramPacket wrapMsg(InetSocketAddress inetSocketAddress, ProtoBuf.Message message) throws InterruptedException {
        DatagramPacket datagramPacket = new DatagramPacket(Unpooled.copiedBuffer(message.toByteArray()), inetSocketAddress);
        return datagramPacket;
    }
}
