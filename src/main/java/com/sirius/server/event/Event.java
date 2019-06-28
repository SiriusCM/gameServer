package com.sirius.server.event;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public abstract class Event extends Throwable {

	public abstract boolean trigger();
}
