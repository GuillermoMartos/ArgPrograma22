package com.apitest.testing;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
// @EntityScan("com.apitest.testing.Model.Persona")
// @EntityScan("com.apitest.testing.Model.Persona");
public class TestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
	}

}
