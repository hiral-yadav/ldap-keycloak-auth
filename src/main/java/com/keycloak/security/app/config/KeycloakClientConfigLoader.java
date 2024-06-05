package com.keycloak.security.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;
@Component
@ConfigurationProperties(prefix = "spring.security.oauth2.client.registration")
@Data
public class KeycloakClientConfigLoader {
    private Map<String, ClientCreds> clientCreds = new HashMap<>();
}
