package com.keycloak.security.dao.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserDAO {
    private String id;
    private String username;
    private String firstName;
    private String lastName;
    private boolean enabled;
    private boolean totp;
    private boolean emailVerified;
    private AccessDAO access;
    private List[] disableableCredentialTypes;
    private List[] requiredActions;
    private int notBefore;
    private Object attributes;
}
