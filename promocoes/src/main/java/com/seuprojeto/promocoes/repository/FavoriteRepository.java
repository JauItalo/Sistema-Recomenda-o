package com.seuprojeto.promocoes.repository;

import com.seuprojeto.promocoes.model.Favorite;
import com.seuprojeto.promocoes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    List<Favorite> findByUser(User user);
    
}
