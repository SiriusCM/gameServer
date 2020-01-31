package com.sirius.server.service.impl;

import com.sirius.server.service.IService;
import org.springframework.stereotype.Service;

/**
 * @Date:2020/1/31 15:33
 * @Author:高连棣
 */
@Service
public class IdService implements IService {

    private long last = 0;

    public long applyId(Enum e) {
        synchronized (e) {
            long nanoTime = System.nanoTime();
            while (last == nanoTime) {
                nanoTime = System.nanoTime();
            }
            last = nanoTime;
            return System.currentTimeMillis() * 100000 + nanoTime / 100 % 100000;
        }
    }
}
