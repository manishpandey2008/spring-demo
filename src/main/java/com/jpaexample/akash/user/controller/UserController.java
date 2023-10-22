package com.jpaexample.akash.user.controller;


import com.jpaexample.akash.user.model.UserEntity;
import com.jpaexample.akash.user.repo.UserRepo;
import com.jpaexample.akash.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public UserEntity saveUser(@RequestBody UserEntity userEntity){
        return  userService.saveUser(userEntity);
    }

    @GetMapping("/all")
    public List<UserEntity> getAllUser(){
        return  userService.getAllUser();
    }

}
