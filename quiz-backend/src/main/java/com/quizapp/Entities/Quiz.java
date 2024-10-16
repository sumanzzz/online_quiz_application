package com.quizapp.Entities;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String title;
    private String Description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quiz")
    
    private List <Question>questions;
    
}
