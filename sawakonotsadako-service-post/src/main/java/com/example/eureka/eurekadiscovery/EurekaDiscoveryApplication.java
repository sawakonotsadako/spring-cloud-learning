package com.example.eureka.eurekadiscovery;

import com.example.eureka.eurekadiscovery.model.Post;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EurekaDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryApplication.class, args);
	}


}
