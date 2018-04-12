package com.rolex.explore.awss3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rolex.explore.awss3.service.AwsService;

@SpringBootApplication
public class AwsS3Application {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(AwsS3Application.class, args);
		System.out.println("Hello, how are you?");
		AwsService awsService = appContext.getBean(AwsService.class);
		awsService.getAllS3Buckets();
		awsService.writeObject();
		System.out.println("I am good.");
	}
}
