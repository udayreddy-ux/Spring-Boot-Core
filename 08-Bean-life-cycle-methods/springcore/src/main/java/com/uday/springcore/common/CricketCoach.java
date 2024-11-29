package com.uday.springcore.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach{
	
	public CricketCoach() {
		System.out.println("In constructor: "+getClass().getSimpleName());
	}
	
	//define our init method
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("In doMyStartupStaff(): "+getClass().getSimpleName());
	}
	//define our destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes!!!";
	}
}
