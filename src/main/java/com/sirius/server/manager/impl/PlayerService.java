package com.sirius.server.manager.impl;

import com.sirius.server.manager.Service;

@org.springframework.stereotype.Service
public class PlayerService implements Service {
	
	@Override
	public void init() {
		logger.info("PlayerService init");
	}

	@Override
	public void destroy() {
		logger.info("PlayerService destroy");
	}
}
