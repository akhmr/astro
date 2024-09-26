package com.destro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.destro.*" })
@SpringBootApplication
public class DestroApplication {

	public static void main(String[] args) {
		SpringApplication.run(DestroApplication.class, args);
	}

}
