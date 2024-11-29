package com.uday.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach{
	
	public TrackCoach() {
		System.out.println("In constructor: "+getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		return "Practice 5k running";
	}
}
