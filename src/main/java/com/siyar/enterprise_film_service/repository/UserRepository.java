package com.siyar.enterprise_film_service.repository;

import com.siyar.enterprise_film_service.model.Film;
import com.siyar.enterprise_film_service.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <MyUser, Long>{
}
