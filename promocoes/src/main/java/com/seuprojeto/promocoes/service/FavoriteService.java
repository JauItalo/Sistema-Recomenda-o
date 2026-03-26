package com.seuprojeto.promocoes.service;

import java.util.List;
import java.util.Optional;
import com.seuprojeto.promocoes.repository.FavoriteRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.seuprojeto.promocoes.model.Favorite;
import com.seuprojeto.promocoes.model.User;


@Service
public class FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    public List<Favorite> findByUserId(User user) {
        return favoriteRepository.findByUser(user);
    }

    public Optional<Favorite> findById(Long id) {
        return favoriteRepository.findById(id);
    }
    
    public Favorite save(Favorite favorite) {
        return favoriteRepository.save(favorite);
    }

    public void deleteById(Long id) {
        favoriteRepository.deleteById(id);
    }
}
