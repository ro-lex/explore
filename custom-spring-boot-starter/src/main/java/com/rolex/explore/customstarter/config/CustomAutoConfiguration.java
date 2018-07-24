package com.rolex.explore.customstarter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.rolex.explore.customstarter.condition.AlwaysFalseCondition;
import com.rolex.explore.customstarter.condition.AlwaysTrueCondition;
import com.rolex.explore.customstarter.condition.PropertyCondition;

@Configuration
@Conditional(PropertyCondition.class)
//@Conditional(AlwaysTrueCondition.class)
//@Conditional(AlwaysFalseCondition.class)
public class CustomAutoConfiguration {
	
	@Bean
	public String customBean() {
		System.out.println("############## Bean in customBean created. #################");
		return new String(">>Success>>");
	}

}
