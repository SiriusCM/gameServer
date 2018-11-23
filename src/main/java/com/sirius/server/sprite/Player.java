package com.sirius.server.sprite;

import com.google.protobuf.GeneratedMessageV3;
import io.netty.channel.ChannelHandlerContext;

public class Player extends Sprite {
	
	private ChannelHandlerContext ctx;
	
	public Player(int id, String name, ChannelHandlerContext ctx) {
		this.id = id;
		this.name = name;
		this.ctx = ctx;
	}
	
	public void sendMsg(GeneratedMessageV3 messageV3) {
		ctx.writeAndFlush(messageV3);
	}
	
	public ChannelHandlerContext getCtx() {
		return ctx;
	}
}
