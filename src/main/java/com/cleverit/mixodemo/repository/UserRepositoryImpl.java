package com.cleverit.mixodemo.repository;

import com.cleverit.mixodemo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

   private ArrayList<User> users;

    public UserRepositoryImpl() {
        this.users = new ArrayList<>();
        User user = new User("Luis","Benavides",26);
        User mixo = new User("Mauricio","Rojas",29);
        users.add(user);
        users.add(mixo);
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User addUser(User newUSer) {
        users.add(newUSer);
        return newUSer;
    }


}
