package com.rolex.explore.springcloudconfig.springbootcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientController {
	
	@Value("${greeting-message}")
	private String propertyValue;
	
	@Autowired
	private Environment environment;

	
	@RequestMapping(path = "/configs/applications/one", method = RequestMethod.GET)
	public String getApplicationConfig() {
		String common = " Common properties > " + environment.getProperty("timezone") + " | " + environment.getProperty("city") + "\n";
		return "Config as seen on client deployable on Tomcat: " + propertyValue + common;
	}
}
