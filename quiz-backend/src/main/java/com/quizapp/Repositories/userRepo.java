package com.quizapp.Repositories;

import com.quizapp.Entities.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface userRepo extends JpaRepository<user,Long> {

    Optional<user> findByUsername(String username);
    
}
