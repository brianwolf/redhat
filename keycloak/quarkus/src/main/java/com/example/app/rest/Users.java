package com.example.app.rest;

import org.jboss.resteasy.reactive.NoCache;

import com.example.app.model.User;

import io.quarkus.security.Authenticated;
import io.quarkus.security.identity.SecurityIdentity;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Authenticated
@Path("/api/users")
public class Users {

    @Inject
    SecurityIdentity identity;

    @GET
    @Path("/me")
    @NoCache
    public User me() {
        return new User(identity);
    }
}