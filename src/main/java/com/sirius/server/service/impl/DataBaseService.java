package com.sirius.server.service.impl;

import com.sirius.server.World;
import com.sirius.server.event.Schedule;
import com.sirius.server.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Date:2019/7/1 18:36
 * @Author:高连棣
 */
@Service
public class DataBaseService implements IService {

    @Autowired
    private World world;

    @Autowired
    private SerializeService serializeService;

    @Schedule(value = "0/5 * * * * ?")
    public void savePlayData() {
        world.getAllPlayer().forEach(e -> {
            byte[] data = serializeService.serialize(e);
        });
    }
}
