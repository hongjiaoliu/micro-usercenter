package com.microservice.demo.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 用户web服务启动类
 *
 * @author liuhongjao
 * @date 2019/4/26 15:56
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class UserCenterAPIStart {

	public static void main(String[] args) {
		SpringApplication.run(UserCenterAPIStart.class, args);
	}
}
