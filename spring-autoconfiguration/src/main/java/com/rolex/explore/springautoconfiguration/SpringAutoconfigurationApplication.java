package com.rolex.explore.springautoconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@SpringBootApplication
@ComponentScan(basePackages = "com.rolex.explore.springautoconfiguration")
@EnableWebMvc
@EnableAutoConfiguration
//@EnableAutoConfiguration(excludeName = "com.rolex.explore.customstarter.config.CustomAutoConfiguration")
public class SpringAutoconfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringAutoconfigurationApplication.class, args);
		
		String customMethod = (String) appContext.getBean("customBean");
		
		System.out.println("### Autoconfigured bean value: " + customMethod);
	}
}
