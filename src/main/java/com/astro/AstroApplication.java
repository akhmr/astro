package com.astro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.astro.*" })
@SpringBootApplication
public class AstroApplication {

	public static void main(String[] args) {
		SpringApplication.run(AstroApplication.class, args);
	}

}
