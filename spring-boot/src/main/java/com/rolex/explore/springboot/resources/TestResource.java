package com.rolex.explore.springboot.resources;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {
	
	@RequestMapping(path = "/hello-world", method=RequestMethod.GET)
	public String testPath() {
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		date.setTime(calendar.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		String dateString = sdf.format(date);
		
		return "Hello World, this is your Spring Boot App!. The current time is: " + dateString;
	}

}
