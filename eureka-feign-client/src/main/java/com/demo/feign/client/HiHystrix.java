package com.demo.feign.client;

import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements EurekaClientFeign {

	@Override
	public String sayHiFromClientEureka(String name) {
		return "Error from Feign!";
	}

}
