package com.sirius.server;

import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
@Configuration
public class Config {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public PoolingHttpClientConnectionManager poolingHttpClientConnectionManager() {
        long timeTolive = 10;
        int maxTotal = 200;
        int defaultMaxPerRoute = 20;
        PoolingHttpClientConnectionManager connMrg = new PoolingHttpClientConnectionManager(timeTolive, TimeUnit.SECONDS);
        connMrg.setMaxTotal(maxTotal);
        connMrg.setDefaultMaxPerRoute(defaultMaxPerRoute);
        return connMrg;
    }
}
