package com.sirius.server.channer.udp;

import com.sirius.server.proto.MsgResponse;
import com.sirius.server.proto.ProtoBuf;
import com.sirius.server.proto.protobuf.Compute;
import com.sirius.server.util.UdpUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UdpInHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    private Logger logger = LoggerFactory.getLogger(UdpInHandler.class);

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception {
        byte[] data = new byte[msg.content().readableBytes()];
        msg.content().readBytes(data);
        ProtoBuf.Message message = ProtoBuf.Message.parseFrom(data);

        int id = message.getId();
        Compute.Content content = Compute.Content.parseFrom(message.getData());
        Compute.Result.Builder builder0 = Compute.Result.newBuilder();
        builder0.setResult(content.getX() + content.getY());
        Compute.Result result = builder0.build();

        ProtoBuf.Message.Builder builder1 = ProtoBuf.Message.newBuilder();
        builder1.setId(MsgResponse.getMsgResponse(result.getClass()).getId());
        builder1.setData(result.toByteString());

        UdpUtil.sendMsg(ctx.channel(), msg.sender(), builder1.build());
    }
}