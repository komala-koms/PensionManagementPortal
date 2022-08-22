package com.pmp.pmpserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.CrossOrigin;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@EnableEurekaServer
@SpringBootApplication
@EnableSwagger2
public class PmpServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmpServerApplication.class, args);
	}

}
