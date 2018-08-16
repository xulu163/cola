package com.xulu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xulu
 * @date 2018/8/16
 * @link https://github.com/xulu163
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args){
        SpringApplication.run(EurekaApplication.class, args);
    }
}
