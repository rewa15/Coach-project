package com.luv2code.springdemo;

public class CricketCoach implements Coach
{
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	// Create constructor
	public CricketCoach()
	{
		System.out.println("CricketCoach: Inside the no-arg constructor");
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Practice Fast Bowling for 15 minutes";
	}
    
	// Setter Method
	public void setFortuneService(FortuneService fortuneService) {
		
		System.out.println("CricketCoach: Inside the setter method");
		this.fortuneService = fortuneService;
	}
   

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}
}
