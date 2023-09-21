package com.ticketbooking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;

@Configuration
public class CORSconfig {

    @Bean
   public CorsWebFilter corsWebFilter() {
	        CorsConfiguration corsConfig = new CorsConfiguration();
	        corsConfig.addAllowedOrigin("*"); // Set your allowed origins
	        corsConfig.addAllowedMethod("*"); // Set your allowed HTTP methods
	        corsConfig.addAllowedHeader("*"); // Set your allowed headers

	        return new CorsWebFilter(exchange -> corsConfig);
	    }
}
