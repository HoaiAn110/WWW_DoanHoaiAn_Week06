package com.example.www_doanhoaian_week06.backend.services;

import com.example.www_doanhoaian_week06.backend.models.User;
import com.example.www_doanhoaian_week06.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.time.Instant;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String register(User user){
        Optional<User> result = userRepository.findUserByEmail(user.getEmail());
        if(result.isPresent()) return "This email has been already token";

        userRepository.save(user);

        return "";
    }

    public Optional<User> login(User user){
        return userRepository.findUserByEmailAndPassword(user.getEmail(), user.getPassword());
    }

    public void update(User user){
        userRepository.save(user);
    }

    public void updateLoginTime(User user){
        user.setLastLogin(Instant.now());
        userRepository.save(user);
    }

    public Optional<User>findById(long id){
        return userRepository.findById(id);
    }


    public void save(User user){
        userRepository.save(user);
    }
}
