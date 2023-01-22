package com.killerinstinct.containmentzone.controllers;

import com.killerinstinct.containmentzone.model.User;
import com.killerinstinct.containmentzone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired private UserRepository userRepository;
    @Autowired private PasswordEncoder passwordEncoder;

    @PostMapping("/user")
    public String createUser(@RequestBody User user){
        userRepository.save(user);
        return "User added successfully";
    }

    @GetMapping("/user")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

}
