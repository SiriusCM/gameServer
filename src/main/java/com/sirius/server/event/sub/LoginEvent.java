package com.sirius.server.event.sub;

import com.sirius.server.event.Event;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public class LoginEvent extends Event {
	@Override
	public boolean trigger() {
		return false;
	}
}
