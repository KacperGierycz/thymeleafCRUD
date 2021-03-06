package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class BikeCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public BikeCoach(FortuneService theForuneService) {
		fortuneService=theForuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Ride to the forest and runn there";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
