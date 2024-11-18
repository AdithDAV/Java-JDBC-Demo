package com.project.SpringJDBCDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.project.SpringJDBCDemo.model.Alien;
import com.project.SpringJDBCDemo.repo.AlienRepo;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);
		
		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("Adith");
		alien1.setTech("SpringBot");
		
		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);
		
		System.out.println(repo.finadAll());
		
	}

}
