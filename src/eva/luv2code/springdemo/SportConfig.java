package eva.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("eva.luv2code.springdemo")
@PropertySource("classpath:jobCoach.properties")
public class SportConfig {
	
	//define bean for funny fortune service
	
	@Bean //The name of the method is the bean id
	public FortuneService funnyFortuneService() {
		return new FunnyFortuneService();
	}
	
	//define bean for jobcoach AND inject dependency
	
	@Bean
	public Coach jobCoach() {
		return new JobCoach(funnyFortuneService());
	}
}
