package com.example.spaceships.spaceships_marc_estalella;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpaceshipsMarcEstalellaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpaceshipsMarcEstalellaApplication.class, args);
	}

}
