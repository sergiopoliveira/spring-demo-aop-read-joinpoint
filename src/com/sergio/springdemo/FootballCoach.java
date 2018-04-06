package com.sergio.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Chuta 10 vezes à baliza";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
}
