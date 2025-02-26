package com.sampson.dio_api.controller;

import com.sampson.dio_api.model.User;
import com.sampson.dio_api.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> listAll(){
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id){
        return userRepository.findById(id);
    }

    @GetMapping("/users/name/{username}")
    public User getUserByName(@PathVariable String username){
        return userRepository.findByUsername(username);
    }

    @PostMapping("/users")
    public void save(@RequestBody User user){
        userRepository.save(user);
    }
}
