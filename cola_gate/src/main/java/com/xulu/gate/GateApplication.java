package com.xulu.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author xulu
 * @date 2018/8/16
 * @link https://github.com/xulu163
 */
@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
public class GateApplication {

    public static void main(String[] args){
        SpringApplication.run(GateApplication.class, args);
    }
}
