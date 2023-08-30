package com.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityLearnApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootSecurityLearnApplication.class);
	public  init(){

		logger.info("Logger started working in main");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityLearnApplication.class, args);
	}

}
