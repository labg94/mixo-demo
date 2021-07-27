package com.cleverit.mixodemo.service;

import com.cleverit.mixodemo.model.User;
import com.cleverit.mixodemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User newUser) {
        return userRepository.addUser(newUser);
    }


}
