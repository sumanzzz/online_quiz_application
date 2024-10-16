package com.quizapp.quiz_backend;

import jakarta.persistence.*;

@Entity
public class user {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String password;
    private String role; // e.g., "USER" or "ADMIN"

    // Getters and setters
}
