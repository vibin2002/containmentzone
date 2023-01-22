package com.killerinstinct.containmentzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ContainmentzoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainmentzoneApplication.class, args);
	}

}
