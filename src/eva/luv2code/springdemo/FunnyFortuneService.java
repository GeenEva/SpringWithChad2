package eva.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FunnyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
	
		return "Let me tell you a funny fortune.";
	}

}
