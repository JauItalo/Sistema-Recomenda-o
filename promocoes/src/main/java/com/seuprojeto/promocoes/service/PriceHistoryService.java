package com.seuprojeto.promocoes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seuprojeto.promocoes.model.PriceHistory;
import com.seuprojeto.promocoes.model.Product;
import com.seuprojeto.promocoes.repository.PriceHistoryRepository;

@Service
public class PriceHistoryService {

    @Autowired
    private PriceHistoryRepository priceHistoryRepository;

    public List<PriceHistory> findByProductOrderByDateDesc(Product product) {
        return priceHistoryRepository.findByProductOrderByDateDesc(product);
    }

    public Optional<PriceHistory> findById(Long Id) {
        return priceHistoryRepository.findById(Id);
    }

    public PriceHistory save(PriceHistory priceHistory) {
        return priceHistoryRepository.save(priceHistory);
    }

    public void deleteById(Long Id) {
        priceHistoryRepository.deleteById(Id);
    }
    
}
