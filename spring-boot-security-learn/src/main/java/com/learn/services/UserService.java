package com.learn.services;

import com.learn.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("abc", "abc", "abc@gmail.com","ROLE_NORMAL"));
        list.add(new User("xyz", "xyz", "xyz@gmail.com","NORMAL_ADMIN"));
    }

    //get all users

    public List<User> getAllUsers() {

        return this.list;

    }

    //get a single user
    public User getUser(String username) {

        return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User addUser(User user) {
        this.list.add(user);
        return user;
    }


}
