package com.keycloak.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class KeycloakLdapAuthApplication {
	public static void main(String[] args) {
		SpringApplication.run(KeycloakLdapAuthApplication.class, args);
	}

}
