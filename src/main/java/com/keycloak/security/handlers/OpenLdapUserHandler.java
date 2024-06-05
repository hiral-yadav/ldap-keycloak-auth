package com.keycloak.security.handlers;

import com.keycloak.security.dao.OpenLdapUserDAO;
import com.keycloak.security.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ldap/v1")
@AllArgsConstructor()
public class OpenLdapUserHandler {
    private final UserService openLdapUserService;
    @GetMapping("/users")
    public List<OpenLdapUserDAO> getUsers(@PathVariable("clientId") String uuid) {
        return null;
    }
    @GetMapping("/user/{uuid}")
    public OpenLdapUserDAO getUser(@PathVariable("uuid") String uuid) {
        openLdapUserService.getUser(uuid);
        return null;
    }
    /*
    @PostMapping("/user")
    public OpenLdapUserDAO addUser(OpenLdapUserDAO user) {

    }
    @DeleteMapping("/user/{uuid}")
    public OpenLdapUserDAO deleteUser(@PathVariable("uuid") String uuid) {

    }

    @PutMapping("/user")
    public OpenLdapUserDAO editUser(OpenLdapUserDAO user) {

    }
*/

}
