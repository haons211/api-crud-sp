package com.usercrud.usercrud.controller;

import com.usercrud.usercrud.model.Users;
import com.usercrud.usercrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping("/")
    public String greeting() {
        return "Xin chào, Hảo!";
    }

    @GetMapping("/all")
    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }
}
