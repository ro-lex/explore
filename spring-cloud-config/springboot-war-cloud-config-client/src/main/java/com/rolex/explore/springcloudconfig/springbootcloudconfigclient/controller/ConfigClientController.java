package com.rolex.explore.springcloudconfig.springbootcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientController {
	
	@Value("${greeting-message}")
	private String propertyValue;

	
	@RequestMapping(path = "/configs/applications/one", method = RequestMethod.GET)
	public String getApplicationConfig() {
		return "Config as seen on client: " + propertyValue;
	}
}
