package com.xulu.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author xulu
 * @date 2018/8/16
 * @link https://github.com/xulu163
 */
@EnableTurbine
@EnableEurekaClient
@SpringBootApplication
public class TurbineApplication {

    public static void main(String[] args){
        SpringApplication.run(TurbineApplication.class, args);
    }
}
