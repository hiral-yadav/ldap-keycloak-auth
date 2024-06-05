package com.keycloak.security.utils;

public enum LDAP_FEDERATION_CLIENTS {
    OPENLDAP("test-cli"),
    MS365("ms365");

    private String clientId;

    LDAP_FEDERATION_CLIENTS(String clientId) {
        this.clientId = clientId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
