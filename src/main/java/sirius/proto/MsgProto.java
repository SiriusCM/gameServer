package sirius.proto;

import com.google.protobuf.Parser;

/**
 * @author 高连棣
 * @date 2018/6/30 18:47
 */
public enum MsgProto {
	Message(0, sirius.proto.protobuf.Message.Data.class, sirius.proto.protobuf.Message.Data.parser()),
	Login_In(1000, sirius.proto.protobuf.Login.Position.class, sirius.proto.protobuf.Login.Position.parser()),
	Match_One(1015, sirius.proto.protobuf.Match.Position.class, sirius.proto.protobuf.Match.Position.parser());
	
	private int id;
	
	private Class clazz;
	
	private Parser parser;
	
	MsgProto(int id, Class clazz, Parser parser) {
		this.id = id;
		this.clazz = clazz;
		this.parser = parser;
	}
	
	public int getId() {
		return id;
	}
	
	public Class getClazz() {
		return clazz;
	}
	
	public Parser getParser() {
		return parser;
	}
}
