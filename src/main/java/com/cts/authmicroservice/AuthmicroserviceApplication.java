package com.cts.authmicroservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class AuthmicroserviceApplication extends SpringBootServletInitializer {

	private static final Logger LOGGER = LoggerFactory.getLogger(AuthmicroserviceApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Inside auth microservice");
		SpringApplication.run(AuthmicroserviceApplication.class, args);
	}
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources( AuthmicroserviceApplication.class);
	 }
}
