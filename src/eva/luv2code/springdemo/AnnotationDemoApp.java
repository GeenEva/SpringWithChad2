package eva.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//If you misspel the bean (for example TennisCoach instead of tennisCoach), then first the beans are constructed
		//anyway. After that you get a NoSuchBeanDefenitionException.
		
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail() + "  " + theCoach.getTeam());
		
		context.close();
		
		
	}

}
