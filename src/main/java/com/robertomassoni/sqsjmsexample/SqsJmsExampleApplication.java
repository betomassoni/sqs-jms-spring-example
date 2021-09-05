package com.robertomassoni.sqsjmsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
public class SqsJmsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqsJmsExampleApplication.class, args);
	}

}
