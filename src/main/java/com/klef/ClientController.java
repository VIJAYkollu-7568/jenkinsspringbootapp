package com.klef;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController 
{
	@GetMapping("/")
	public String home()
	{
		return "CI/CD and Cloud DevOps";
	}
	
	@GetMapping("/demo")
	public String demo()
	{
		return "Jenkins project";
	}

	@GetMapping("/test")
	public String test() {
		return "Deploy Spring boot using jenkins Tool";
	}
	
	@GetMapping("/test1")
	public String test1() {
		return "deploy success";
	}
}