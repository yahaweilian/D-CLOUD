package com.ynding.cloud.core.server.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CoreServerConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreServerConfigApplication.class, args);
    }

}
