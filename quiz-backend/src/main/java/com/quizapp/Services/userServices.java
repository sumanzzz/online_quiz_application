package com.quizapp.Services;

import com.quizapp.Entities.user;
import com.quizapp.Repositories.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userServices {

    @Autowired
    private userRepo UserRepo;

    public List<user>getAllUsers(){

        return UserRepo.findAll();
    }
    public Optional<user>getUserById(long id){
        return UserRepo.findById(id);
    }
    public user saveUser(user User){
        return UserRepo.save(User);

    }
    public void deleteuser(Long id){
         UserRepo.deleteById(id);
    }
    public Optional<user> getUserByUsername(String username) {
        return UserRepo.findByUsername(username);
    }
}
