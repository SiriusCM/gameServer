package sirius.event.sub;

import sirius.event.Event;

/**
 * @author 高连棣
 * @date 2018/7/2 16:02
 */
public class LoginEvent extends Event {
	@Override
	public boolean trigger() {
		return false;
	}
}
