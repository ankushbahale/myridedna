package com.myridedna.core.service;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * This class is used for start application
 * 
 * @author reactiveworks
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.myridedna")
public class CoreServiceApplication {
	 
	public static void main(String[] args) throws IOException {
		SpringApplication.run(CoreServiceApplication.class, args);
	}
}
