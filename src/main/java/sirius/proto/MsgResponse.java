package sirius.proto;

import sirius.proto.protobuf.Compute;

import java.util.HashMap;
import java.util.Map;

/**
 * create by gaoliandi on 2018/11/15
 **/
public enum MsgResponse {
	
	Result(102, Compute.Result.class);
	
	private static final Map<Class, MsgResponse> clazzMsgMap = new HashMap<>();
	
	static {
		for (MsgResponse e : MsgResponse.values()) {
			clazzMsgMap.put(e.getClazz(), e);
		}
	}
	
	public static MsgResponse getMsgResponse(Class clazz) {
		if (clazzMsgMap.containsKey(clazz)) {
			return clazzMsgMap.get(clazz);
		}
		return null;
	}
	
	private int id;
	
	private Class clazz;
	
	MsgResponse(int id, Class clazz) {
		this.id = id;
		this.clazz = clazz;
	}
	
	public int getId() {
		return id;
	}
	
	public Class getClazz() {
		return clazz;
	}
}
