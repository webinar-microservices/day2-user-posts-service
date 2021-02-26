package in.webinar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;

@SpringBootApplication
public class Day2UsersPostServiceApplication {
	
	
	@Bean
	public Faker registerFakerToSpringContainer() {
		return new Faker();
	}
	

	public static void main(String[] args) {
		SpringApplication.run(Day2UsersPostServiceApplication.class, args);
	}

}
