package com.sirius.server.service.impl;

import com.sirius.server.service.IService;
import org.springframework.stereotype.Service;

@Service
public class BattleService implements IService {

    @Override
    public void init() {
        logger.info("BattleIService init");
    }

    @Override
    public void destroy() {
        logger.info("BattleIService destroy");
    }
}
