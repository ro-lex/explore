package com.rolex.explore.customstarter.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class AlwaysFalseCondition implements Condition {

	@Override
	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
		return false;
	}

}
