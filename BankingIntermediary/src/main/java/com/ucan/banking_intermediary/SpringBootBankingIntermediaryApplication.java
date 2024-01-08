package com.ucan.banking_intermediary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootBankingIntermediaryApplication {
    
        @Bean
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }


	public static void main(String[] args) {
		SpringApplication.run(SpringBootBankingIntermediaryApplication.class, args);
	}

}
