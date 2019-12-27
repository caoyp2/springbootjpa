package com.ittest.springbootjpa.controller;

import com.ittest.springbootjpa.dao.UserRepository;
import com.ittest.springbootjpa.entity.User;
import com.ittest.springbootjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable("id") Integer id){

        Optional<User> userOptional = userRepository.findById(id);
        User user = userOptional.get();

        return user;
    }

    @GetMapping("/user")
    public User addUser(User user){

        User user1 = userRepository.save(user);

        return user1;
    }


    @GetMapping("/user1")
    public User addUser1(User user){
        User user1 = userService.addUser(user);
        return user1;
    }
}
