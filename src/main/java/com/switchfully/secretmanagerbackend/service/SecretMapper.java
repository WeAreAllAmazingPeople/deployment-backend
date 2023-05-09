package com.switchfully.secretmanagerbackend.service;

import com.switchfully.secretmanagerbackend.domain.Secret;
import org.springframework.stereotype.Component;

@Component
public class SecretMapper {
    public SecretDto toDto(Secret secret) {
        return new SecretDto(secret.getId(), secret.getSecret());
    }

    public Secret toEntity(SecretDto secretDto) {
        return new Secret(secretDto.getId(), secretDto.getSecret());
    }

    public Secret toEntity(SecretCreateDto secretDto) {
        return new Secret(secretDto.getSecret());
    }
}
