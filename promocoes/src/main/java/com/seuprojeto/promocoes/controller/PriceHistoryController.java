package com.seuprojeto.promocoes.controller;

import com.seuprojeto.promocoes.model.PriceHistory;
import com.seuprojeto.promocoes.model.Product;
import com.seuprojeto.promocoes.service.PriceHistoryService;
import com.seuprojeto.promocoes.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/price-history")
public class PriceHistoryController {
    

    @Autowired
    private PriceHistoryService priceHistoryService;

    @Autowired
    private ProductService productService;

    @GetMapping("/{productId}")
    public ResponseEntity<List<PriceHistory>> getPriceHistoryByProduct(@PathVariable Long productId) {
        Optional<Product> product = productService.findById(productId);
        if (product.isPresent()) {
            List<PriceHistory> priceHistory = priceHistoryService.findByProductOrderByDateDesc(product.get());
            return ResponseEntity.ok(priceHistory);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<PriceHistory> createPriceHistory(@RequestBody PriceHistory priceHistory) {
        PriceHistory saved = priceHistoryService.save(priceHistory);
        return ResponseEntity.ok(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePriceHistory(@PathVariable Long id) {
        priceHistoryService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
