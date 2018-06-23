package com.zqs.sc.cloud.registercneter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 注册中心
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RegisterCenterApplication {
	public static void main(String[] args) {
		SpringApplication.run(RegisterCenterApplication.class, args);
	}
}