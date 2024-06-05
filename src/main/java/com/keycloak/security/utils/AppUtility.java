package com.keycloak.security.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keycloak.security.app.config.ClientCreds;
import com.keycloak.security.app.config.KeycloakClientConfigLoader;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import java.util.Optional;

@Component
public class AppUtility {
    @Autowired
    private KeycloakClientConfigLoader keycloakClientConfigLoader;
    @Autowired
    private ObjectMapper mapper;
    @Value("${spring.security.oauth2.client.provider.keycloak.issuer-uri}")
    private String issueUri;

    public String encrypt(String text) {
        return Strings.EMPTY;
    }

    public String decrypt(String text) {
        return Strings.EMPTY;
    }

    public Optional<ClientCreds> retriveClientCreds(String clientId) {
        return Optional.ofNullable(keycloakClientConfigLoader
                .getClientCreds()
                .getOrDefault(clientId, null));
    }
    public String formatPath(String resourcepath, String... params) {
        resourcepath = String.format(resourcepath, params);
        return String.format(issueUri, resourcepath);
    }

    public MultiValueMap<String, String> castMultiValueMap(Object fromObject) {
       return null;
    }
}
