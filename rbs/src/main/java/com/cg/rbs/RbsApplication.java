package com.cg.rbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/* @Configuration */
@EnableAutoConfiguration
@ComponentScan
public class RbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbsApplication.class, args);
	}

}
