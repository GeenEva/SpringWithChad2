package eva.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	
	private String[] fortuneArray;
	
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortuneArray.length);
		String theFortune = fortuneArray[index];
		return "A random fortune for you: " + theFortune;
	}

}
