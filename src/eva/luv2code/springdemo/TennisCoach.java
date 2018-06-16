package eva.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {


	private FortuneService fortuneService;
	
	@Autowired //Spring will scan for a component that implements the FortuneService interface
	public TennisCoach(FortuneService theFortuneService) {
		System.out.println("inside tenniscoach constructor");
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		System.out.println("inside getDailyWorkout method in TennisCoach");
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("inside getDailyFortune() in TennisCoach");
		return fortuneService.getFortune();
	}

}
