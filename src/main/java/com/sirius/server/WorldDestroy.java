package com.sirius.server;

import com.sirius.server.manager.Service;

public class WorldDestroy implements Runnable {
    @Override
    public void run() {
        ServerApplication.getApplicationContext().getBeansOfType(Service.class).values().forEach(e -> e.destroy());
    }
}
