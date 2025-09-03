package com.example.SoapRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SoapRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapRestApiApplication.class, args);
	}

}
