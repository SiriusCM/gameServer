package com.sirius.server.sprite;

import java.io.Serializable;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public abstract class Sprite implements Serializable {

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
