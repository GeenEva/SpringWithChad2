package eva.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "/Users/evavangeenen/FromUdemy/solution-practice-activities/solution-practice-activity-5-di-annotations/fortune-data.txt";
	private List<String> theFortunes;
	private Random myRandom = new Random();
	
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
	
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(theFortunes.size());
		String thisFortune = theFortunes.get(index);
		return thisFortune;
	}

}
