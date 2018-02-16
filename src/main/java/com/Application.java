package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// for global CORS 
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    // for global CORS 
    @Bean
    public WebMvcConfigurer corsConfigurer() {
    	return new WebMvcConfigurerAdapter() {
    		@Override
    		public void addCorsMappings(CorsRegistry reg) {
    			String origin4020 = "http://localhost:4020";
    			String origin5020 = "http://localhost:5020";
    			reg.addMapping("/employee/all").allowedOrigins(origin4020, origin5020);
    			reg.addMapping("/customer/all").allowedOrigins(origin4020, origin5020);
    			reg.addMapping("/greeting").allowedOrigins(origin4020, origin5020);
    		}
    	};
    }
    
}
