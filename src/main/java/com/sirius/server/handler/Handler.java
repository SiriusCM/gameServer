package com.sirius.server.handler;

import com.sirius.server.proto.MsgRequest;
import com.sirius.server.sprite.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Handler {
	
	Logger logger = LoggerFactory.getLogger(Handler.class);
	
	boolean handler(Player player, Object data) throws Exception;
	
	MsgRequest getProto();
}
