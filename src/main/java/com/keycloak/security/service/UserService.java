package com.keycloak.security.service;

import com.keycloak.security.dao.common.UserDAO;
import java.util.List;

public interface UserService<T extends UserDAO> {
    T getUser(String uuid);
    List<T> getAllUsers();
    T createUser(T user);
    Long deleteUser(String id);
    T updateUser(T user);

}
