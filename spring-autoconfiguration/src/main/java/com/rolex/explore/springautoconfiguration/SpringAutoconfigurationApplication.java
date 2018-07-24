package com.rolex.explore.springautoconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@ComponentScan(basePackages = "com.rolex.explore.springautoconfiguration")
@SpringBootConfiguration
@EnableAutoConfiguration
//@EnableAutoConfiguration(excludeName = "com.rolex.explore.customstarter.config.CustomAutoConfiguration")
public class SpringAutoconfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringAutoconfigurationApplication.class, args);
		
		String customMethod = (String) appContext.getBean("customBean");
		
		System.out.println("### Autoconfigured bean value: " + customMethod);
	}
}
