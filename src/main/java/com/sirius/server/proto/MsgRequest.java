package com.sirius.server.proto;

import com.google.protobuf.Parser;
import com.sirius.server.handler.IHandler;
import com.sirius.server.handler.impl.ComputeHandler;
import com.sirius.server.proto.protobuf.Compute;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public enum MsgRequest {
	
	Content(101, ComputeHandler.class, Compute.Content.parser());
	
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
	
	private Class<? extends IHandler> clazz;
	
	private Parser parser;
	
	MsgRequest(int id, Class<? extends IHandler> clazz, Parser parser) {
		this.id = id;
		this.clazz = clazz;
		this.parser = parser;
	}
	
	public int getId() {
		return id;
	}
	
	public Class<? extends IHandler> getClazz() {
		return clazz;
	}
	
	public Parser getParser() {
		return parser;
	}
}
