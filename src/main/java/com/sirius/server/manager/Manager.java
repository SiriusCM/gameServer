package com.sirius.server.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Manager {
	
	Logger logger = LoggerFactory.getLogger(Manager.class);
	
	void init();
}
