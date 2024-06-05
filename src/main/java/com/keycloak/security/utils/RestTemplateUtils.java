package com.keycloak.security.utils;

import com.keycloak.security.app.config.ClientCreds;
import com.nimbusds.oauth2.sdk.util.MapUtils;
import com.nimbusds.oauth2.sdk.util.MultivaluedMapUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Component
@AllArgsConstructor
public class RestTemplateUtils {
    private WebClient webClient;

    public Object get(String url,
                      ClientCreds clientCreds) {
        Jwt token = getToken();
        return webClient.get()
                .uri("http://localhost:8080/admin/realms/test/users/3ca065c6-b4f2-4d39-8aae-03357a57a5b5")
                .header("authorization", token.getTokenValue())
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    private Jwt getToken() {
        return (Jwt) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
