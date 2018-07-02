package sirius.proto;

import com.google.protobuf.Parser;

/**
 * @author 高连棣
 * @date 2018/6/30 18:47
 */
public enum Message {
	Login(1, sirius.proto.protobuf.Login.Position.parser()),
	Match(2, sirius.proto.protobuf.Match.Position.parser());

	private int id;

	private com.google.protobuf.Parser parser;

	Message(int id, com.google.protobuf.Parser parser) {
		this.id = id;
		this.parser = parser;
	}

	public int getId() {
		return id;
	}

	public Parser getParser() {
		return parser;
	}
}
