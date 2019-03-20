package com.sirius.server;

import com.sirius.server.database.model.Model;
import com.sirius.server.manager.Manager;

public class WorldDestroy implements Runnable {
	@Override
	public void run() {
		ServerApplication.getApplicationContext().getBeansOfType(Model.class).values().forEach(e -> e.destroy());
		ServerApplication.getApplicationContext().getBeansOfType(Manager.class).values().forEach(e -> e.destroy());
	}
}
