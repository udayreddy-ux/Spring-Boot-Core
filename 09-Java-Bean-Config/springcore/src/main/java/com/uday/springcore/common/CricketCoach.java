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
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes!!!";
	}
}
