package com.example.BigliettiAereo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.BigliettiAereo")
public class BigliettiAereoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigliettiAereoApplication.class, args);
	}

}
