package sirius.proto;

import com.google.protobuf.Parser;
import sirius.handler.impl.ComputeHandler;
import sirius.handler.impl.LoginHandle;
import sirius.handler.impl.MatchHandler;
import sirius.proto.protobuf.Compute;
import sirius.proto.protobuf.Login;
import sirius.proto.protobuf.Match;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 高连棣
 * @date 2018/6/30 18:47
 */
public enum MsgRequest {
	Content(101, ComputeHandler.class, Compute.Content.parser()),
	Login_In(1001, LoginHandle.class, Login.Position.parser()),
	Match_One(1015, MatchHandler.class, Match.Position.parser());
	
	private static final Map<Integer, MsgRequest> idMsgMap = new HashMap<>();
	
	static {
		for (MsgRequest msgProto : MsgRequest.values()) {
			idMsgMap.put(msgProto.getId(), msgProto);
		}
	}
	
	public static MsgRequest getMsgRequest(int msgId) {
		if (idMsgMap.containsKey(msgId)) {
			return idMsgMap.get(msgId);
		}
		return null;
	}
	
	private int id;
	
	private Class handler;
	
	private Parser parser;
	
	MsgRequest(int id, Class handler, Parser parser) {
		this.id = id;
		this.handler = handler;
		this.parser = parser;
	}
	
	public int getId() {
		return id;
	}
	
	public Class getHandler() {
		return handler;
	}
	
	public Parser getParser() {
		return parser;
	}
}
