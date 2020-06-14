package com.atguigu.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//启用Eureka 服务器功能
@SpringBootApplication
public class AtaguiguMainType {
	public static void main(String[] args) {
		SpringApplication.run(AtaguiguMainType.class, args);
	}

}
