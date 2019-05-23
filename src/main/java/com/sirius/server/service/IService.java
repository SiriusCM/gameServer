package com.sirius.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface IService {

	Logger logger = LoggerFactory.getLogger(IService.class);

	void init();

	void destroy();
}
