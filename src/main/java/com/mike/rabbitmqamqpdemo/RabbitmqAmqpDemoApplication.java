package com.mike.rabbitmqamqpdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RabbitmqAmqpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqAmqpDemoApplication.class, args);
	}

}
