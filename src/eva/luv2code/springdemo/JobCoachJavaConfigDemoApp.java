package eva.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobCoachJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		JobCoach theCoach = context.getBean("jobCoach", JobCoach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
	
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("email: " + theCoach.getTeam());
		
		context.close();
		
		
	}

}
