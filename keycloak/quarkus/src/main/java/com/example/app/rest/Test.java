package com.example.app.rest;

import java.util.Map;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/test")
public class Test {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> test() {

        return Map.of("hola", "mundo");
    }
}
