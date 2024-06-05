package com.keycloak.security.app.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {
    @Bean
    public WebClient getClient() {
        return WebClient.builder().build();
    }

    @Bean
    public ObjectMapper getMapper() {
        return new ObjectMapper();
    }
}
