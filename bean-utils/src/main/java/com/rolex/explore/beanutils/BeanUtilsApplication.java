package com.rolex.explore.beanutils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rolex.explore.beanutils.service.BeanUtilsService;

@SpringBootApplication
public class BeanUtilsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(BeanUtilsApplication.class, args);
		BeanUtilsService beanUtilsService = applicationContext.getBean(BeanUtilsService.class);
		beanUtilsService.exploreBeanUtil();
		applicationContext.close();
	}
}
