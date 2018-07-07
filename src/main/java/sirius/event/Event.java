package sirius.event;

/**
 * @author 高连棣
 * @date 2018/7/2 16:00
 */
public abstract class Event extends Throwable {

	public abstract boolean trigger();
}
