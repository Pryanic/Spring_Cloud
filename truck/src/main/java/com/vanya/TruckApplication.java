package com.vanya;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "client")
@EnableDiscoveryClient
//@ComponentScan(basePackages = {"client", "com.vanya.*"})
public class TruckApplication {

    public static void main(String[] args) {
        SpringApplication.run(TruckApplication.class, args);
    }
}
