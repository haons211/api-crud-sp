package com.usercrud.usercrud.service;

import com.usercrud.usercrud.model.Users;
import com.usercrud.usercrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }
}


