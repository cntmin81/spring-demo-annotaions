package com.luv2code.springdemo;

public class SwimCoach implements Coach {
	
	FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000m as warmup";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}