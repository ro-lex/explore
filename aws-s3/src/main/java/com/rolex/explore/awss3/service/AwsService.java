package com.rolex.explore.awss3.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;

@Service
public class AwsService {
	
	@Inject AmazonS3 s3;
	
	@Value("${aws.s3.bucket}")
	private String bucketName;
	
	@Value("${aws.s3.keyname}")
	private String keyName;
	
	@Value("${local.file.location}")
	private String fileLocation;
	
	@Value("${aws.s3.encryption-enabled}")
	private boolean isEncryptionEnabled;
	
	@Inject private ObjectMetadata aes256Encrypted;
	
	public List<Bucket> getAllS3Buckets() {

		List<Bucket> buckets = s3.listBuckets();

		for (Bucket bucket : buckets) {
			System.out.println(bucket.getName());
		}

		return buckets;

	}
	
	public void writeObject() {
		try {
			PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, keyName, fileLocation);
			if(isEncryptionEnabled) {
				System.out.println("Encrypting the object.");
				putObjectRequest.setMetadata(aes256Encrypted);
			}
			s3.putObject(putObjectRequest);
			System.out.println("Successfully written object.");
		} catch(AmazonClientException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
