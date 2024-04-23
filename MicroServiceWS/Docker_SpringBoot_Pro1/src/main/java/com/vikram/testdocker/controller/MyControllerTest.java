package com.vikram.testdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyControllerTest {
	
	@GetMapping()
	public String Test() {
		
		return " Welocme to test, the RestController is fine....";
	}
	
	

}
