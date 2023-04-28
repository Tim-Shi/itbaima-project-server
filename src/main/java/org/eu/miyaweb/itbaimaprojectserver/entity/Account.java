package org.eu.miyaweb.itbaimaprojectserver.entity;

import lombok.Data;

@Data
public class Account {
    int id;
    String email;
    String username;
    String password;
}
