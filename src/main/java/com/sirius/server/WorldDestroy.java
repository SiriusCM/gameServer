package com.sirius.server;

import com.sirius.server.manager.IService;

public class WorldDestroy implements Runnable {
    @Override
    public void run() {
        ServerApplication.getApplicationContext().getBeansOfType(IService.class).values().forEach(e -> e.destroy());
    }
}
