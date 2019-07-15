package com.sirius.server.channer.tcp;

import com.google.protobuf.InvalidProtocolBufferException;
import com.sirius.server.MethodInvoke;
import com.sirius.server.World;
import com.sirius.server.event.Handler;
import com.sirius.server.proto.MsgRequest;
import com.sirius.server.proto.ProtoBuf;
import com.sirius.server.service.impl.MethodService;
import com.sirius.server.sprite.Player;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public class TcpInHandler extends SimpleChannelInboundHandler<ProtoBuf.Message> {

    private List<MethodInvoke<Handler>> list = World.getApplicationContext().getBean(MethodService.class).getMethods(Handler.class);

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
        list.forEach(e -> {
            if (e.getAnnotation().msg() == msgRequest) {
                try {
                    e.invoke(world.getPlayerByCtx(ctx), msgRequest.getParser().parseFrom(message.getData()));
                } catch (InvalidProtocolBufferException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
