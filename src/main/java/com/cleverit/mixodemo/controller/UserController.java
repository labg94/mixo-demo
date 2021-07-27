package com.cleverit.mixodemo.controller;

import com.cleverit.mixodemo.model.User;
import com.cleverit.mixodemo.repository.UserRepositoryImpl;
import com.cleverit.mixodemo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return this.userService.getAll();
    }

    @PostMapping
    public User addUser(@RequestBody User newUser){
        return userService.addUser(newUser);
    }


}
