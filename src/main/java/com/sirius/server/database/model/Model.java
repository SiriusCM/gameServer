package com.sirius.server.database.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Model {
	
	Logger logger = LoggerFactory.getLogger(Model.class);
	
	void init();

	void destroy();
}
