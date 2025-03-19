package com.instamart.main.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")//common prefix for all the endpoints in this rest controller
public class AuthController {

    @GetMapping("/public")
    public String publicEndpoint(){
        return "This is a public endpoint";
    }

    @GetMapping("/admin")
    public String adminEndpoint(){
        return "This is a admin endpoint";
    }

    @GetMapping("/user")
    public String userEndpoint(){
        return "This is a user endpoint";
    }

}
