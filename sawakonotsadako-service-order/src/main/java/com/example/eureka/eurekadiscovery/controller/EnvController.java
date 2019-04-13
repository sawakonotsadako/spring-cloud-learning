package com.example.eureka.eurekadiscovery.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvController {

    @Value("${my.favorite.movie}")
    private String favoriteMovie;

    @GetMapping(value = "favorite-movie")
    public String env() {
        return favoriteMovie;
    }
}
