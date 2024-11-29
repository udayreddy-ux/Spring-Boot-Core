package com.uday.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Practice 5k running";
	}
}
