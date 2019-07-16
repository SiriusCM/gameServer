package com.sirius.server.channer.tcp;

import com.google.protobuf.InvalidProtocolBufferException;
import com.sirius.server.World;
import com.sirius.server.msg.ProtoBuf;
import com.sirius.server.service.impl.HandlerService;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public class TcpInHandler extends SimpleChannelInboundHandler<ProtoBuf.Message> {

    private HandlerService handlerService = World.getApplicationContext().getBean(HandlerService.class);

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) {
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ProtoBuf.Message message) throws InvalidProtocolBufferException {
        handlerService.handler(ctx, message);
    }
}
