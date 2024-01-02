package com.jps.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.jps.test.dao.UserRepository;
import com.jps.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("Durgesh kumar Tiwari");
		user.setCity("Delhi");
		user.setStatus("i am java programmer");
		
		User user1 = userRepository.save(user);
		System.out.println(user1);
		
		
	
	
	
	}

}
