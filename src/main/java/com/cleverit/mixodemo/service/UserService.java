package com.cleverit.mixodemo.service;

import com.cleverit.mixodemo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    List<User> getAll();


    User addUser(User newUser);
}
