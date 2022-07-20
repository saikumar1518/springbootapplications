package com.createiq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication

public class SpringBootAdminAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminAppApplication.class, args);
	}

}
