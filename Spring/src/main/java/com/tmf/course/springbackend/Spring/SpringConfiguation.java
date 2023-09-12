package com.tmf.course.springbackend.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfiguation {
	@Bean
	public String name() {
		return "honey";
	}
	@Bean
	public String city() {
		return "vizag";
	}
	@Bean
	public int id() {
		return 101;
	}
	@Bean
	public Customer customer(int id,String name,String city) {
		return new Customer(id,name,city);
	}


}
