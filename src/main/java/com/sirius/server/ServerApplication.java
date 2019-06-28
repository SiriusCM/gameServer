package com.sirius.server;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.sirius.server.database.mapper")
public class ServerApplication {

    public static void main(String[] args) {
        try {
            ApplicationContext applicationContext = SpringApplication.run(ServerApplication.class, args);
            applicationContext.getBean(World.class).start(applicationContext);
        } catch (Exception e) {
            Loggers.main.error("错误:", e);
        }
    }
}
