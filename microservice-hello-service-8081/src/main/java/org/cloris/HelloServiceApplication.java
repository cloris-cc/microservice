package org.cloris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloServiceApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloServiceApplication.class, args);
	}
	

}	
