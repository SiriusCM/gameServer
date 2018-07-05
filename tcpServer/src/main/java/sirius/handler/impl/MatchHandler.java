package sirius.handler.impl;

import sirius.handler.Handler;
import sirius.proto.MsgProto;
import sirius.proto.protobuf.Match;
import sirius.sprite.Player;

public class MatchHandler implements Handler {
	@Override
	public boolean handler(Player player, Object data) throws Exception {
		Match.Position position = (Match.Position) data;
		logger.info("(" + position.getX() + "," + position.getY() + "," + position.getZ() + ")");
		return false;
	}
	
	@Override
	public MsgProto getProto() {
		return MsgProto.Match_One;
	}
}