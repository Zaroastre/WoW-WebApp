package com.secursyst.wowwebappserver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WowWebappServerApplication {

	private static final Logger LOGGER = LogManager.getLogger(WowWebappServerApplication.class);
	public static void main(String[] args) {
		LOGGER.warn(">> Applicatino is strating...");
		SpringApplication.run(WowWebappServerApplication.class, args);
	}
}
