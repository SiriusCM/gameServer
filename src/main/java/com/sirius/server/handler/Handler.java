package com.sirius.server.handler;

import com.sirius.server.proto.MsgRequest;
import com.sirius.server.sprite.Player;

public interface Handler {
	
	boolean exe(Player player, Object data) throws Exception;
	
	MsgRequest getProto();
}
