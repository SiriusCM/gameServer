package com.sirius.server.channer.tcp;

import com.sirius.server.Loggers;
import com.sirius.server.World;
import com.sirius.server.exception.GameException;
import com.sirius.server.handler.IHandler;
import com.sirius.server.proto.MsgRequest;
import com.sirius.server.proto.ProtoBuf;
import com.sirius.server.sprite.Player;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public class TcpInHandler extends SimpleChannelInboundHandler<ProtoBuf.Message> {

    @Autowired
    private World world;

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        Player player = new Player(23, "高连棣", ctx);
        world.addPlayer(ctx, player);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) {
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ProtoBuf.Message message) {
        MsgRequest msgRequest = MsgRequest.getMsgRequest(message.getId());
        IHandler IHandler = World.getApplicationContext().getBean(msgRequest.getClazz());
        try {
            IHandler.handle(world.getPlayerByCtx(ctx), msgRequest.getParser().parseFrom(message.getData()));
        }catch (GameException e) {

        }catch (Exception e) {
            Loggers.world.error("错误:", e);
        }
    }
}
