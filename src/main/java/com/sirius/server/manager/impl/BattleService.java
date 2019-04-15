package com.sirius.server.manager.impl;

import com.sirius.server.manager.Service;

@org.springframework.stereotype.Service
public class BattleService implements Service {
	
	@Override
	public void init() {
		logger.info("BattleService init");
	}

	@Override
	public void destroy() {
		logger.info("BattleService destroy");
	}
}
