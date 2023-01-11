package com.Terms.Conditions.TermsAndConditions;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class TermsAndConditionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TermsAndConditionsApplication.class, args);
		System.out.println("Terms and Conditions");
	}
	
//	@Bean
//	public WebMvcConfigurer config() {
//		return new WebMvcConfigurer{
//			@Override
//		public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**")
//				.allowedOrigins("*")
//				.allowedHeaders("*")
//				.allowedMethods("*")
//				.maxAge(93600L);
//			}
//		};
//	}

}
