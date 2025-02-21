package com.research_assistant.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    private static final String GEMINI_API_BASE_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent";

    @Bean
    public WebClient webClient(WebClient.Builder builder) {
        return builder
                .baseUrl(GEMINI_API_BASE_URL) // Set the base URL
                .defaultHeader("Content-Type", "application/json") // Optional default headers
                .build();
    }
}

