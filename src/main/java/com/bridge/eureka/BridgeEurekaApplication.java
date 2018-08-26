package com.bridge.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author panqingqing
 * @version v1.0
 * @date 2018年8月26日 15:20:49
 * @work bridge项目注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class BridgeEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BridgeEurekaApplication.class, args);
    }
}
