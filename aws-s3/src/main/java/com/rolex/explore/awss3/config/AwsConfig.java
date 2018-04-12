package com.rolex.explore.awss3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;

@Configuration
public class AwsConfig {
	
	@Value("${aws.s3.region}")
	private String region;
	
	@Bean
	public AmazonS3 s3() {
		AmazonS3 s3 = AmazonS3ClientBuilder.standard().withRegion(region).build();
		return s3;
	}

	@Bean
	public ObjectMetadata aes256Encrypted() {
		ObjectMetadata aes256Encrypted = new ObjectMetadata();
		aes256Encrypted.setSSEAlgorithm(ObjectMetadata.AES_256_SERVER_SIDE_ENCRYPTION);
		return aes256Encrypted;
	}
}
