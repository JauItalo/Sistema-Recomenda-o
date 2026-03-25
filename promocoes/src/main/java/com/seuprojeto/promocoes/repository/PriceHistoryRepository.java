package com.seuprojeto.promocoes.repository;

import com.seuprojeto.promocoes.model.PriceHistory;
import com.seuprojeto.promocoes.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PriceHistoryRepository extends JpaRepository<PriceHistory, Long> {
    List<PriceHistory> findByProductOrderByDataDesc(Product product);
    
}
