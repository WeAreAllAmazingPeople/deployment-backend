package com.switchfully.secretmanagerbackend.service;

public class SecretCreateDto {
    private String secret;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public SecretCreateDto() {
    }

    public SecretCreateDto(String secret) {
        this.secret = secret;
    }
}
