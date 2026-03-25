package com.seuprojeto.promocoes.repository;

import com.seuprojeto.promocoes.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
