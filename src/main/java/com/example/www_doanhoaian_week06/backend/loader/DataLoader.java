//package com.example.www_doanhoaian_week06.backend.loader;
//
//import com.example.www_doanhoaian_week06.backend.models.User;
//import com.example.www_doanhoaian_week06.backend.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.time.Instant;
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Component
//public class DataLoader implements CommandLineRunner {
//    @Autowired
//    private UserRepository userRepository;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//
//
//        User user= new User("John", "Doe", "Smith", "0123456789", "john@example.com", "123", Instant.now(), Instant.now(), "Software Engineer", "john.png");
//
//        User user1= new User("Mary", "Jane", "Johnson", "0123456780", "mary@example.com", "123", Instant.now(), Instant.now(), "Data Analyst", "mary.png");
//
//        userRepository.save(user);
//        userRepository.save(user1);
//
//    }
//}
