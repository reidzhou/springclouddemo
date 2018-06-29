package com.demo.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.netflix.ribbon.proxy.annotation.Hystrix;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class EurekaFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignClientApplication.class, args);
	}
}
