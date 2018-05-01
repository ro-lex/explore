package com.rolex.explore.springbootjerseyproducer.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

@Component
@Path("/")
public class JerseyResource {
	
	@Path("/health")
	@Produces("application/text")
	@GET
	public String health() {
		return "Healthy!";
	}
	
	@Path("/process")
	@Produces("application/json")
	@GET
	public String process() {
		return "{\"status\":\"processed\"}";
	}

}
