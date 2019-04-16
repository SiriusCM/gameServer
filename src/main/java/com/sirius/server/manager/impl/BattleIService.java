package com.sirius.server.manager.impl;

import com.sirius.server.manager.IService;
import org.springframework.stereotype.Service;

@Service
public class BattleIService implements IService {

    @Override
    public void init() {
        logger.info("BattleIService init");
    }

    @Override
    public void destroy() {
        logger.info("BattleIService destroy");
    }
}
