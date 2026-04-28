package com.seuprojeto.promocoes.config;

import javax.crypto.spec.SecretKeySpec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;

@Configuration
@Profile("dev") // Só ativa se o profile for 'dev'
public class DevJwtDecoderConfig {
    @Bean
    public JwtDecoder jwtDecoder() {
        // Chave secreta fake para ambiente de desenvolvimento
        return NimbusJwtDecoder.withSecretKey(new SecretKeySpec("testtesttesttest".getBytes(), "HmacSHA256")).build();
    }
}
