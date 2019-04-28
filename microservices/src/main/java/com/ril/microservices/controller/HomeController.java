package com.ril.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	
	@GetMapping
	public String getMsg()
	{
		
		
		return "welcome";
	}
	
	
	@GetMapping("/data")
	public String getData()
	{
		
		return "This is demo";
	}
	
	
	
}
