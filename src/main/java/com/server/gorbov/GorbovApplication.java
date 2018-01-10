package com.server.gorbov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class GorbovApplication {

	public static void main(String[] args) {
		SpringApplication.run(GorbovApplication.class, args);
	}
}
