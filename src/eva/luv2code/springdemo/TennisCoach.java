package eva.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("HAPPYFortuneService")
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		System.out.println(">>Inside default constructor TennisCoach");
	}
	
	/*
	@Autowired //Spring will scan for a component that implements the FortuneService interface
	public TennisCoach(FortuneService theFortuneService) {
		System.out.println("inside tenniscoach constructor");
		fortuneService = theFortuneService;
	}
	*/
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">>Inside setFortuneService() method in TennisCoach");
		this.fortuneService = fortuneService;
	}
	*/
	@Override
	public String getDailyWorkOut() {
		System.out.println(">>Inside getDailyWorkout method in TennisCoach");
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		System.out.println(">>Inside getDailyFortune() in TennisCoach");
		return fortuneService.getFortune();
	}

}
