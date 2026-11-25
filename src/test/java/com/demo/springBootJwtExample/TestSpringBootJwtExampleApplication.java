package com.demo.springBootJwtExample;

import org.springframework.boot.SpringApplication;

public class TestSpringBootJwtExampleApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringBootJwtExampleApplication::main)
		    // .with(TestcontainersConfiguration.class)
		    .run(args);
	}

}
