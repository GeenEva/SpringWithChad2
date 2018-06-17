package eva.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortuneArray = { "Hollar hollar",	
										"The cosmos loves you",
										"The stars are alined for you"
									};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortuneArray.length);
		String theFortune = fortuneArray[index];
		return "A random fortune for you: " + theFortune;
	}

}
