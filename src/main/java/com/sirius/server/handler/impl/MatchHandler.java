package com.sirius.server.handler.impl;


import com.sirius.server.handler.Handler;
import com.sirius.server.proto.MsgRequest;
import com.sirius.server.proto.protobuf.Match;
import com.sirius.server.sprite.Player;

public class MatchHandler implements Handler {
	@Override
	public boolean exe(Player player, Object data) throws Exception {
		Match.Position position = (Match.Position) data;
		return false;
	}
	
	@Override
	public MsgRequest getProto() {
		return MsgRequest.Match_One;
	}
}
