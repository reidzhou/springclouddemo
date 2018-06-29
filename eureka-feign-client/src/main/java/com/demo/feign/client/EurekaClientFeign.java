package com.demo.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.feign.config.FeignConfig;

@FeignClient(value = "eureka-client", configuration = FeignConfig.class, fallback = HiHystrix.class)
public interface EurekaClientFeign {

	@GetMapping(value = "/hi")
	String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
