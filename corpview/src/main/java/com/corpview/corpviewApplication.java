package com.corpview;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class corpviewApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(corpviewApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(corpviewApplication.class, args);
		log.info("Application Running Successfully");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
