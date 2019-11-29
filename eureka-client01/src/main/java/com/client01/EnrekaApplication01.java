package com.client01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EnrekaApplication01 {

    public static void main(String[] args) {
        SpringApplication.run(EnrekaApplication01.class);
    }
}