package com.test.showdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShowDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShowDemoApplication.class, args);
    }

}
