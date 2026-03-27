package com.seuprojeto.promocoes.controller;

import com.seuprojeto.promocoes.model.Favorite;
import com.seuprojeto.promocoes.model.User;
import com.seuprojeto.promocoes.service.FavoriteService;
import com.seuprojeto.promocoes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/favorites")
public class FavoriteController {


    @Autowired
    private FavoriteService favoriteService;

    @Autowired
    private UserService userService;

    @GetMapping("/{userEmail}")
    public ResponseEntity<List<Favorite>> getFavoritesByUserEmail(@PathVariable String userEmail) {
        Optional<User> user = userService.findByEmail(userEmail);
        if (user.isPresent()) {
            List<Favorite> favorites = favoriteService.findByUser(user.get());
            return ResponseEntity.ok(favorites);
        } else {
            return ResponseEntity.notFound().build();
        }

    }
    
    @PostMapping
    public ResponseEntity<Favorite> createFavorite(@RequestBody Favorite favorite) {
        Favorite savedFavorite = favoriteService.save(favorite);
        return ResponseEntity.ok(savedFavorite);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavorite(@PathVariable Long id) {
        favoriteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
    
