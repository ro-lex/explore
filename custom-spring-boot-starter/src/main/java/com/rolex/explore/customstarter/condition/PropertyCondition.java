package com.rolex.explore.customstarter.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;

public class PropertyCondition implements Condition {

	@Override
	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
		
		String flag = arg0.getEnvironment().getProperty("enabled.flag");
		
		if(!StringUtils.isEmpty(flag) && flag.equals("true")) {
			return true;
		} else {
			return false;
		}
	}

}
