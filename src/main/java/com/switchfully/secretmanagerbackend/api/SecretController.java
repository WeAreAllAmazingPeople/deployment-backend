package com.switchfully.secretmanagerbackend.api;

import com.switchfully.secretmanagerbackend.service.SecretCreateDto;
import com.switchfully.secretmanagerbackend.service.SecretDto;
import com.switchfully.secretmanagerbackend.service.SecretService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/secrets")
public class SecretController {
    private final SecretService secretService;

    public SecretController(SecretService secretService) {
        this.secretService = secretService;
    }

    @GetMapping
    public List<SecretDto> getAllSecrets(){
        return secretService.getAllSecrets();
    }

    @GetMapping(path = "/{id}")
    public SecretDto getSecretByID(UUID id) {
        return secretService.getSecretById(id);
    }

    @PostMapping
    public void createNewSecret(@RequestBody SecretCreateDto secretDto) {
        secretService.createSecret(secretDto);
    }
}
