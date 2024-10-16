package com.quizapp.Repositories;

import com.quizapp.Entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface quizRepo extends JpaRepository<Quiz,Long> {
    List<Quiz> findByTitleConstainingList(String keyword);
    
}
