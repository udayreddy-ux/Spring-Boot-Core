package com.uday.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach implements Coach{
	
	public BaseballCoach() {
		System.out.println("In constructor: "+getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		return "Speed 30 minutes in baseball practice";
	}
}
