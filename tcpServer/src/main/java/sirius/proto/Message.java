package sirius.proto;

/**
 * @author 高连棣
 * @date 2018/6/30 18:47
 */
public enum Message {
	Login(1),
	Match(2);

	private int id;

	Message(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
