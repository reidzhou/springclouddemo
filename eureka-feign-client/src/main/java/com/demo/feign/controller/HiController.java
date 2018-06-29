package com.demo.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.feign.service.HiService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@Autowired
	HiService hiService;
	
	@GetMapping("/hi")
	public String sayHi(@RequestParam(defaultValue = "Reid") String name) {
		return hiService.sayHi(name);
	}
}
