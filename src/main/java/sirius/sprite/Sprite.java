package sirius.sprite;

/**
 * @author 高连棣
 * @date 2018/7/2 16:08
 */
public abstract class Sprite {
	
	protected int id;
	
	protected String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
