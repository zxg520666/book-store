package com.test.zuuldemo;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootTest
@EnableDiscoveryClient
@EnableZuulProxy
class ZuulDemoApplicationTests {

    @Test
    void contextLoads() {
    }

}
