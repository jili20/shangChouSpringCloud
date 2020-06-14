package com.atguigu.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
// 下面两个注解功能大致相同
//@EnableDiscoveryClient   启用发现服务功能，不局限于 Eureka 注册中心
//@EnableEurekaClient	   启用Eureka 客户端功能，必须是 Eureka 注册中心
@SpringBootApplication
public class AtaguiguMainType {
	public static void main(String[] args) {
		SpringApplication.run(AtaguiguMainType.class, args);
	}

}
