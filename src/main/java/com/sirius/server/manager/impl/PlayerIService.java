package com.sirius.server.manager.impl;

import com.sirius.server.manager.IService;
import org.springframework.stereotype.Service;

@Service
public class PlayerIService implements IService {

    @Override
    public void init() {
        logger.info("PlayerIService init");
    }

    @Override
    public void destroy() {
        logger.info("PlayerIService destroy");
    }
}
