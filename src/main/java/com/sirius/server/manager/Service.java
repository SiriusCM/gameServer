package com.sirius.server.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Service {

	Logger logger = LoggerFactory.getLogger(Service.class);

	void init();

	void destroy();
}
