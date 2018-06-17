package eva.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javafx.beans.binding.When;

@Component
public class SwimCoach implements Coach {

	/*When you forget to autowire the fortuneService field, the compiler gives a nullpointer,
	because returnvalue fortuneService.getFortune() holds null then.*/
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	@Override
	public String getDailyWorkOut() {
		System.out.println(">>Inside getDailyWorkOut() SwimCoach...");
		return "Returns daily workout from the swimming coach";
	}

	@Override
	public String getDailyFortune() {
		System.out.println(">>Inside getDailyFortune() SwimCoach...");
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	
}
