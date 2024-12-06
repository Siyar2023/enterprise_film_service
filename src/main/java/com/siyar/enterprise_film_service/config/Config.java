package com.siyar.enterprise_film_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Config {
   @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(
            aut -> aut
                    .requestMatchers("/admin").permitAll()
                    .requestMatchers("/film").permitAll());



        return http.build();
    }
}
