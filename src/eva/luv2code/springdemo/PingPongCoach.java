package eva.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkOut() {
		System.out.println(">>Inside getDailyWorkOut() PingPong");
		return "ReturnValue daily workout PingPong";
	}

	@Override
	public String getDailyFortune() {
		System.out.println(">>Inside getDailyFortune() PingPong");
		return "return from getDailyFortune PingPong: " + fortuneService.getFortune();
	}

}
