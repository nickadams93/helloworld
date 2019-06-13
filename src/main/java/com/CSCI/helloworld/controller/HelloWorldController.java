package com.CSCI.helloworld.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {
	
	
	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}
	
	@RequestMapping("/nick")
	public String nickHello() {
		return "Hello World from Nick!";
	}
	
	@RequestMapping("/trey")
	public String treyHello() {
		return "Hello World from Trey!";
	}
	
	@RequestMapping("/xavier")
	public String xavierHello() {
		return "Hello World from Xavier!";
	}
}
