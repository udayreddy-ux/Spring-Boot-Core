package com.uday.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
	}
}
