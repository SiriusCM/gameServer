package com.sirius.server.service.impl;

import com.sirius.server.service.IService;
import org.springframework.stereotype.Service;

@Service
public class PlayerService implements IService {

    @Override
    public void init() {
        logger.info("PlayerIService init");
    }

    @Override
    public void destroy() {
        logger.info("PlayerIService destroy");
    }
}
