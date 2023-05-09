package com.switchfully.secretmanagerbackend.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface SecretRepository extends CrudRepository<Secret, UUID> {
    List<Secret> findAll();
}
