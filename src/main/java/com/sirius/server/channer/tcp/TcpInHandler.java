package com.sirius.server.channer.tcp;

import com.sirius.server.ServerApplication;
import com.sirius.server.World;
import com.sirius.server.handler.Handler;
import com.sirius.server.proto.MsgRequest;
import com.sirius.server.proto.ProtoBuf;
import com.sirius.server.sprite.Player;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author 高连棣
 * @date 2018/7/2 11:03
 */
public class TcpInHandler extends SimpleChannelInboundHandler<ProtoBuf.Message> {

    private static final Logger logger = LoggerFactory.getLogger(TcpInHandler.class);

    private World world = ServerApplication.getApplicationContext().getBean(World.class);

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel incoming = ctx.channel();
        logger.info("Client:" + incoming.remoteAddress() + "上线");
        world.addPlayer(ctx, new Player(23, "高连棣", ctx));
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel incoming = ctx.channel();
        logger.info("Client:" + incoming.remoteAddress() + "掉线");
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ProtoBuf.Message message) throws Exception {
        MsgRequest msgRequest = MsgRequest.getMsgRequest(message.getId());
        msgRequest.getHandler().exe(world.getPlayerByCtx(ctx), msgRequest.getParser().parseFrom(message.getData()));
    }
}