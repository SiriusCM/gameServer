package com.sirius.server.service.impl;

import com.sirius.server.annotation.Schedule;
import com.sirius.server.service.IService;
import org.springframework.stereotype.Service;

/**
 * @Date:2019/7/1 18:36
 * @Author:高连棣
 */
@Service
public class DataBaseService implements IService {

    @Schedule(value = "0/5 * * * * ?")
    public void savePlayData() {

    }
}
