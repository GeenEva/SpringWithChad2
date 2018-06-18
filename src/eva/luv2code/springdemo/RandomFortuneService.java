package eva.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	
	private String[] fortuneArray ;
	
	private Random myRandom = new Random();
	
	
	@PostConstruct
	 	public void setUpArray() {
	 		fortuneArray = new String[5]; {
	 			fortuneArray[0] = "fortuneString1";
	 			fortuneArray[1] = "fortuneString2";
	 			fortuneArray[2] = "fortuneString3";
	 			fortuneArray[3] = "fortuneString4";
	 			fortuneArray[4] = "fortuneString5";
	 		}
	 	}
	
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortuneArray.length);
		String theFortune = fortuneArray[index];
		return "A random fortune for you: " + theFortune;
	}

}
