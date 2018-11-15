package sirius.handler.impl;

import sirius.handler.Handler;
import sirius.proto.MsgRequest;
import sirius.proto.protobuf.Login;
import sirius.proto.protobuf.Match;
import sirius.sprite.Player;

/**
 * @author 高连棣
 * @date 2018/6/30 18:59
 */
public class LoginHandle implements Handler {
	
	@Override
	public boolean exe(Player player, Object data) throws Exception {
		Login.Position position = (Login.Position) data;
		Match.Position.Builder builder = Match.Position.newBuilder();
		builder.setX(position.getX());
		builder.setY(position.getY());
		builder.setZ(position.getZ());
		player.sendMsg(builder.build());
		return true;
	}
	
	@Override
	public MsgRequest getProto() {
		return MsgRequest.Login_In;
	}
}
