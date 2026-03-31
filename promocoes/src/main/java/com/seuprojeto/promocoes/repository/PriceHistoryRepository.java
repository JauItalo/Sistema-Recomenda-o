package com.seuprojeto.promocoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seuprojeto.promocoes.model.PriceHistory;
import com.seuprojeto.promocoes.model.Product;

public interface PriceHistoryRepository extends JpaRepository<PriceHistory, Long> {
    List<PriceHistory> findByProductOrderByDateDesc(Product product);
    
}
