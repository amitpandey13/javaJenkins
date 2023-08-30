package com.learn.controllers;

import com.learn.models.User;
import com.learn.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    public static Logger logger = LoggerFactory.getLogger(UserController.class);
     //all users
    @GetMapping("/")
    public List<User> getAllUsers()
    {
        logger.info("logger estbalished...");
        return this.userService.getAllUsers();

    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){

        return this.userService.getUser(username);
    }
    @PostMapping("/add")
    public User add(@RequestBody User user){
        return this.userService.addUser(user);
    }


}
