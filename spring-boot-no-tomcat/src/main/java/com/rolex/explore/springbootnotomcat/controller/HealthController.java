package com.rolex.explore.springbootnotomcat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	
	@GetMapping("/health")
	public String getHealth() {
		return "Health check successful for Spring Boot App without Tomcat Starter.";
	}

}
