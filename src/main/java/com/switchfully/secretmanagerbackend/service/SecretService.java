package com.switchfully.secretmanagerbackend.service;

import com.switchfully.secretmanagerbackend.domain.Secret;
import com.switchfully.secretmanagerbackend.domain.SecretRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class SecretService {
    private final SecretRepository repository;
    private final SecretMapper mapper;

    public SecretService(SecretRepository repository, SecretMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<SecretDto> getAllSecrets() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    public SecretDto getSecretById(UUID id) {
        return mapper.toDto(
                repository.findById(id)
                        .orElseThrow()
        );
    }

    public SecretDto createSecret(SecretCreateDto secretDto) {
        Secret newSecret = mapper.toEntity(secretDto);
        Secret result = repository.save(newSecret);
        return mapper.toDto(result);
    }
}
