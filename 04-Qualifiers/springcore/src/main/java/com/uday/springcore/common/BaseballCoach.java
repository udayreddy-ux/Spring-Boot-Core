package com.uday.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Speed 30 minutes in baseball practice";
	}
}
