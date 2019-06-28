package com.sirius.server;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
@Configuration
public class Config {

	@LoadBalanced
	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}
}
