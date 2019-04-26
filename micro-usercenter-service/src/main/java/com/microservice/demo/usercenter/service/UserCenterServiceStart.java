package com.microservice.demo.usercenter.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 服务启动类
 *
 * @author liuhongjao
 * @date 2019/4/26 13:23
 */

@SpringBootApplication
@EnableEurekaClient
// 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@EnableTransactionManagement
//通过次注解开启FeignClient请求的支持，spring提供的一种http请求方式
@EnableFeignClients
@MapperScan(basePackages = "com.microservice.demo.usercenter.service.mapper")
public class UserCenterServiceStart {
	public static void main(String[] args) {
		SpringApplication.run(UserCenterServiceStart.class, args);
	}
}
