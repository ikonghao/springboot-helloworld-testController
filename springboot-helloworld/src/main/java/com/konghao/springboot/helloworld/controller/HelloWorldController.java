package com.konghao.springboot.helloworld.controller;

import static org.mockito.Matchers.intThat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.konghao.springboot.helloworld.exception.BusinessException;

@RestController
public class HelloWorldController {

	@Value("${konghao.msg}")
	private String msg;

	@RequestMapping("/hello")
	public String index() {
		//int no = 1 / 0;
		
		return this.msg;
	}
}
