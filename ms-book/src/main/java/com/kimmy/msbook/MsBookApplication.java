package com.kimmy.msbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBookApplication.class, args);
	}

}
