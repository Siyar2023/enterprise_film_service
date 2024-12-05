
package com.siyar.enterprise_film_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FilmService {

    public String fetchRandomFilm() {
        String url = "https://owen-wilson-wow-api.onrender.com/wows/random";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        // Här kan du bearbeta och spara svaret från API:et i din databas.
        return response; // Returnera svaret för vidare presentation
    }
}
