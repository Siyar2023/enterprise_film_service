

package com.siyar.enterprise_film_service.controller;

import com.siyar.enterprise_film_service.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/api/fetch-random-film")
    public String fetchRandomFilm() {
        return filmService.fetchRandomFilm(); // Returnerar API-datan direkt till klienten
    }

    @GetMapping
    public String defaultEndpoint() {
        return "Välkommen till Film API!";
    }
}
