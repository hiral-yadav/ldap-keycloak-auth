package com.keycloak.security.utils;

public enum ENDPOINTS {
    ADD_USER("users"),
    GET_USERS("users"),
    GET_USER("/users/{0}");
    private String path;

    ENDPOINTS(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
