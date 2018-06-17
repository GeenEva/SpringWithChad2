package eva.luv2code.springdemo;

import org.springframework.stereotype.Component;

//@Component
public class JobCoach implements Coach {

	public JobCoach() {
		System.out.println(">>Inside default constructor jobCoach");
	}
	
	@Override
	public String getDailyWorkOut() {
		System.out.println(">>Inside getDailyWorkOut");
		return "ReurnValue: Get a job";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
