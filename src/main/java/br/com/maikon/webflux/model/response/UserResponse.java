package br.com.maikon.webflux.model.response;

public record UserResponse(
        String id,
        String name,
        String email,
        String password
) { }
