package com.keycloak.security.app.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClientCreds {
    @JsonProperty("client-secret")
    private String clientSecret;
    @JsonProperty("client-id")
    private String clientId;
    private String scope;
    @JsonProperty("authorization-grant-type")
    private String grantType;
    private String provider;
}
