package com.seuprojeto.promocoes.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Service
public class MercadoLivreService {

    private final String BASE_URL = "https://api.mercadolibre.com/sites/MLB/search";


    public String buscarProdutos(String query) {
        RestTemplate restTemplate = new RestTemplate();
        String url = UriComponentsBuilder.fromUriString(BASE_URL)
                .queryParam("q", query)
                .toUriString();
        
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }
    
}
