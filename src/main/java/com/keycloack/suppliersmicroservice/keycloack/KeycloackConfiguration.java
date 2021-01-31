package com.keycloack.suppliersmicroservice.keycloack;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class KeyCloakConfig{
    @Bean
    KeycloakSpringBootConfigResolver keycloakConfigResolver()
    {
        return new KeycloakSpringBootConfigResolver();
    }
}
