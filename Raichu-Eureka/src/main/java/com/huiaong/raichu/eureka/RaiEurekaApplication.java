package com.huiaong.raichu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RaiEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(RaiEurekaApplication.class, args);
    }
}
