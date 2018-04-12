package com.rolex.explore.awss3.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;

@Service
public class AwsService {
	
	@Inject AmazonS3 s3;
	
	public List<Bucket> getAllS3Buckets() {

		List<Bucket> buckets = s3.listBuckets();

		for (Bucket bucket : buckets) {
			System.out.println(bucket.getName());
		}

		return buckets;

	}

}
