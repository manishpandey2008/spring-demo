package com.jpaexample.akash.user.service;

import com.jpaexample.akash.user.model.UserEntity;
import com.jpaexample.akash.user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public UserEntity saveUser(UserEntity userEntity){
        //
        return  userRepo.save(userEntity);
    }

    public List<UserEntity> getAllUser(){
        return  userRepo.findAll();
    }
}
