package com.siyar.enterprise_film_service.repository;

import com.siyar.enterprise_film_service.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FilmRepository extends JpaRepository<Film, Long> {
    // Lägg till specifika metoder för att hämta data om det behövs
}
