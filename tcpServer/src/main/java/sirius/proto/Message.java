package sirius.proto;

/**
 * @author 高连棣
 * @date 2018/6/30 18:41
 */
public class Message {

	private int id;

	private byte[] data;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
}
