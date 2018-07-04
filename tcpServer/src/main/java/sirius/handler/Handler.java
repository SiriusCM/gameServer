package sirius.handler;

import org.apache.log4j.Logger;
import sirius.proto.MsgProto;
import sirius.sprite.Player;

public interface Handler {
	
	Logger logger = Logger.getLogger(Handler.class);
	
	boolean handler(Player player, Object data) throws Exception;
	
	MsgProto getProto();
}
