package com.example.app.model;

import io.quarkus.security.identity.SecurityIdentity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String userName;

    public User(SecurityIdentity identity) {
        this.userName = identity.getPrincipal().getName();
    }
}
