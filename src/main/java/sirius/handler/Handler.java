package sirius.handler;

import org.apache.log4j.Logger;
import sirius.proto.MsgRequest;
import sirius.sprite.Player;

public interface Handler {
	
	Logger logger = Logger.getLogger(Handler.class);
	
	boolean handler(Player player, Object data) throws Exception;
	
	MsgRequest getProto();
}
