package com.konghao.springboot.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Value("${konghao.msg}")
	private String msg;
	@RequestMapping("/hello")
	public String index() {
		return this.msg;
	}
}
