package com.cleverit.mixodemo.repository;

import com.cleverit.mixodemo.model.User;

import java.util.List;

public interface UserRepository {

    List<User> findAll();

    User addUser(User newUSer);

}
