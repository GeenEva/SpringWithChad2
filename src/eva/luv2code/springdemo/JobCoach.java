package eva.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class JobCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public JobCoach(FortuneService fortuneService) {
		System.out.println(">>Inside JobCoach constructor with fortune dependency");
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyWorkOut() {
		System.out.println(">>Inside getDailyWorkOut");
		return "ReturnValue: Get a job";
	}

	@Override
	public String getDailyFortune() {
		System.out.println(">>Inside getDailyFortune");
		return "Return tha fortune: " + fortuneService.getFortune();
	}

}
