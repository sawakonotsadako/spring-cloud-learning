package com.example.feign.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
public class FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}

	@Autowired
	FeignCustomerService feignCustomerService;

	@RequestMapping("/feign/customer/{name}")
	public String findCustomerByFeign(@PathVariable(name = "name") String name) {
		return feignCustomerService.findCustomer(name);
	}
}
