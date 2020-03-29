package com.luv2code.springdemo;

public class TrackCoach implements Coach {
    
	    // define a private field for dependency
		private FortuneService fortuneService;
		
		public TrackCoach() // for default cases: No-arg constructor
		{ }
		
	    // define constructor for DI
		
		public TrackCoach(FortuneService theFortuneService)
		{
			fortuneService=theFortuneService;
		}
		
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5 km";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: "+fortuneService.getFortune();
	}
	
	// Add start method
	public void doMyStartupStuff()
	{
		System.out.println("TrackCoach: Start stuff");
	}
	
	// Add end method
	public void doMyCleanupStuffYoYo()
	{
		System.out.println("TrackCoach: Clean stuff");
	}

}
