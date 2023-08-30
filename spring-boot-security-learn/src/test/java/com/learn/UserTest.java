package com.learn;

import com.learn.models.User;
import com.learn.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
public class UserTest {


    @Autowired
    private UserService userService;

    @Test
    public void testGetAllUsers(){

      List<User> users = this.userService.getAllUsers();
      assertEquals(2,users.size());

    }
}
