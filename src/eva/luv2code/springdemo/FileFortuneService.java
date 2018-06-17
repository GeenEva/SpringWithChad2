package eva.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "/Users/evavangeenen/FromUdemy/solution-practice-activities/solution-practice-activity-5-di-annotations/fortune-data.txt";
	private List<String> theFortunes;
	private Random myRandom = new Random();
	
	//Constructor initializes the theFortunes field 
	public FileFortuneService() {
		
		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		theFortunes = new ArrayList<String>();
		
		try(BufferedReader bufferedReader = new BufferedReader(
				new FileReader(theFile))) {
			
			String tempLine;
			
			while ((tempLine = bufferedReader.readLine()) != null) {
				theFortunes.add(tempLine);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@PostConstruct
	public void doCoolStuff() {
		System.out.println(">>Inside doCoolStuff(): Being very cool indeed...");
		for (int i = 0; i < theFortunes.size() ; i++) {
			System.out.println(theFortunes.get(i));
		}
		
		
	}
	
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(theFortunes.size());
		String thisFortune = theFortunes.get(index);
		return thisFortune;
	}

}
