package com.nttdata.bootcamp.gateway.micro2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/micro2")
public class TestControl {
	@GetMapping(path="/helloMicro2")
	public String helloWorld() {
		return "Hello Micro2";
	}
}
