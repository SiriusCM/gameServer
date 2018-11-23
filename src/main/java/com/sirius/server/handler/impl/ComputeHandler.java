package com.sirius.server.handler.impl;


import com.sirius.server.handler.Handler;
import com.sirius.server.proto.MsgRequest;
import com.sirius.server.proto.protobuf.Compute;
import com.sirius.server.sprite.Player;
import org.springframework.stereotype.Component;

@Component
public class ComputeHandler implements Handler {
	
	@Override
	public boolean handler(Player player, Object data) throws Exception {
		Compute.Content content = (Compute.Content) data;
		String op = content.getOp();
		double x = content.getX();
		double y = content.getY();
		double r;
		switch (op) {
			case "+":
				r = x + y;
				break;
			case "-":
				r = x - y;
				break;
			case "*":
				r = x * y;
				break;
			case "/":
				r = x / y;
				break;
			default:
				return false;
		}
		Compute.Result.Builder builder = Compute.Result.newBuilder();
		builder.setResult(r);
		player.sendMsg(builder.build());
		return true;
	}
	
	@Override
	public MsgRequest getProto() {
		return MsgRequest.Content;
	}
}
