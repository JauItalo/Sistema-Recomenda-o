package com.seuprojeto.promocoes;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import com.seuprojeto.promocoes.config.TestSecurityConfig;

@SpringBootTest
@Import(TestSecurityConfig.class)
class PromocoesApplicationTests {

	@Test
	void contextLoads() {
	}

}