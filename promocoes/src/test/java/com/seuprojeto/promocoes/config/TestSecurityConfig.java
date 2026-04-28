package com.seuprojeto.promocoes.config;

import javax.crypto.spec.SecretKeySpec;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;

@TestConfiguration
public class TestSecurityConfig {
    @Bean
    public JwtDecoder jwtDecoder() {
        // Chave secreta fake para ambiente de teste
        return NimbusJwtDecoder.withSecretKey(new SecretKeySpec("testtesttesttest".getBytes(), "HmacSHA256")).build();
    }
}
