package com.rolex.explore.awss3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AwsConfig {
	
	@Bean
	public AmazonS3 s3() {
		AmazonS3 s3 = AmazonS3ClientBuilder.standard().withRegion("us-east-1").build();
		return s3;
	}

}
