package com.example.member_service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MemberService2Application {

    public static void main(String[] args) {
        SpringApplication.run(MemberService2Application.class, args);
    }

}
