package com.seuprojeto.promocoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seuprojeto.promocoes.service.MercadoLibreService;




@RestController
@RequestMapping("/api/mercadolivre")
public class MercadoLivreController {


    @Autowired
    private MercadoLibreService mercadoLibreService;


    @GetMapping("/search")
    public ResponseEntity<String> search(@RequestParam String q) {
        String resultado = mercadoLibreService.buscarProdutos(q);
        return ResponseEntity.ok(resultado);
    }

    


    
}
