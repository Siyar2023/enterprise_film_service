package com.siyar.enterprise_film_service.service;

import com.siyar.enterprise_film_service.model.MyUser;
import com.siyar.enterprise_film_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;  // Anta att du har ett repository för användare

    public void registerUser(MyUser user) {
        // Hash lösenordet innan det sparas i databasen
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);  // Sätt det hashed lösenordet till användaren

        // Spara användaren i databasen
        userRepository.save(user);
    }
}

