package com.sirius.server.channer.tcp;

import com.sirius.server.ServerApplication;
import com.sirius.server.World;
import com.sirius.server.handler.IHandler;
import com.sirius.server.proto.MsgRequest;
import com.sirius.server.proto.ProtoBuf;
import com.sirius.server.sprite.Player;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public class TcpInHandler extends SimpleChannelInboundHandler<ProtoBuf.Message> {

    private World world = ServerApplication.getApplicationContext().getBean(World.class);

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        world.addPlayer(ctx, new Player(23, "高连棣", ctx));
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) {
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ProtoBuf.Message message) throws Exception {
        MsgRequest msgRequest = MsgRequest.getMsgRequest(message.getId());
        IHandler IHandler = ServerApplication.getApplicationContext().getBean(msgRequest.getClazz());
        IHandler.handle(world.getPlayerByCtx(ctx), msgRequest.getParser().parseFrom(message.getData()));
    }
}
