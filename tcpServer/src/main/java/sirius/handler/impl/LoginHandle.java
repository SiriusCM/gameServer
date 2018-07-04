package sirius.handler.impl;

import sirius.handler.Handler;
import sirius.proto.MsgProto;
import sirius.proto.protobuf.Login;
import sirius.sprite.Player;

/**
 * @author 高连棣
 * @date 2018/6/30 18:59
 */
public class LoginHandle implements Handler {
	
	@Override
	public boolean handler(Player player, Object data) throws Exception {
		Login.Position position = (Login.Position) data;
		logger.info(position.getX());
		logger.info(position.getY());
		logger.info(position.getZ());
		return true;
	}
	
	@Override
	public MsgProto getProto() {
		return MsgProto.Login_In;
	}
}
