package com.sirius.server.sprite;

import com.google.protobuf.GeneratedMessageV3;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.socket.DatagramPacket;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public class Player extends Sprite {

    private transient ChannelHandlerContext ctx;

    public Player(int id, String name, ChannelHandlerContext ctx) {
        this.id = id;
        this.name = name;
        this.ctx = ctx;
    }

    public void sendMsg(GeneratedMessageV3 messageV3) {
        ctx.writeAndFlush(messageV3);
    }

    public void sendMsg(DatagramPacket datagramPacket) {
        ctx.writeAndFlush(datagramPacket);
    }

    public ChannelHandlerContext getCtx() {
        return ctx;
    }
}
