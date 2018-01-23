package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootProfileExperimentApplication  implements CommandLineRunner {

	@Value("${spring.application.name}")
	private String applicationName;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProfileExperimentApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println(" Application Name: " + this.applicationName);
	}
}
