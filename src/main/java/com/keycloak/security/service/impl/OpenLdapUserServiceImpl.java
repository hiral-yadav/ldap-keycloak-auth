package com.keycloak.security.service.impl;

import com.keycloak.security.app.config.ClientCreds;
import com.keycloak.security.app.config.KeycloakClientConfigLoader;
import com.keycloak.security.dao.OpenLdapUserDAO;
import com.keycloak.security.service.UserService;
import com.keycloak.security.utils.AppUtility;
import com.keycloak.security.utils.ENDPOINTS;
import com.keycloak.security.utils.LDAP_FEDERATION_CLIENTS;
import com.keycloak.security.utils.RestTemplateUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("openLdapUserService")
@AllArgsConstructor
public class OpenLdapUserServiceImpl implements UserService<OpenLdapUserDAO> {
    private RestTemplateUtils templateUtils;
    private AppUtility utility;

    @Override
    public OpenLdapUserDAO getUser(String uuid) {
        ClientCreds clientCreds = utility
                .retriveClientCreds(LDAP_FEDERATION_CLIENTS.OPENLDAP.getClientId())
                .orElseThrow();
        var result = templateUtils.get(utility.formatPath(ENDPOINTS.GET_USER.getPath()), clientCreds);
        return null;
    }

    @Override
    public List<OpenLdapUserDAO> getAllUsers() {
        return null;
    }

    @Override
    public OpenLdapUserDAO createUser(OpenLdapUserDAO user) {
        return null;
    }

    @Override
    public Long deleteUser(String id) {
        return null;
    }

    @Override
    public OpenLdapUserDAO updateUser(OpenLdapUserDAO user) {
        return null;
    }
}
