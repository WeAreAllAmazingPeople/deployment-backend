package com.switchfully.secretmanagerbackend.service;

import java.util.UUID;

public class SecretDto {
    private UUID id;
    private String secret;

    public SecretDto() {
    }

    public SecretDto(UUID id, String secret) {
        this.id = id;
        this.secret = secret;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
