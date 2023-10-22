package com.jpaexample.akash;

import com.jpaexample.akash.user.repo.UserRepo;
import com.jpaexample.akash.user.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AkashApplication implements CommandLineRunner {

	@Autowired
	private UserRepo userRepo;

	public static void main(String[] args) {
//		ConfigurableApplicationContext context =
				SpringApplication.run(AkashApplication.class, args);
//		UserRepo userRepo = context.getBean(UserRepo.class);

	}

	@Override
	public void run(String... args) throws Exception {

		userRepo.save( new UserEntity(
				null,
				"Akash Kumar",
				"Bokaro",
				"Jharkhand"
		));

		userRepo.save( new UserEntity(
				null,
				"Balmukund Pande",
				"Ara",
				"Bihar"
		));

	}
}
