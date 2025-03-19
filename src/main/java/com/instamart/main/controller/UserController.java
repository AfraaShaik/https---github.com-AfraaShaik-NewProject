package com.instamart.main.controller;

import com.instamart.main.entity.Users;
import com.instamart.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user) {
        return userService.registerUser(user);
    }

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }
}
