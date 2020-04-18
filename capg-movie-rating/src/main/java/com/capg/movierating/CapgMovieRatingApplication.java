package com.capg.movierating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CapgMovieRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapgMovieRatingApplication.class, args);
	}

}
