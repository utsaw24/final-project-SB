package com.axis.lms;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.axis.lms.config.AppProperties;


@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
@EntityScan(basePackages = {"com.axis.lms.model"})
public class SpringSocialApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSocialApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
