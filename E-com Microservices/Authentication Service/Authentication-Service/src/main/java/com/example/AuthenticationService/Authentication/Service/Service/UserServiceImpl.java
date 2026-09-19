package com.example.AuthenticationService.Authentication.Service.Service;

import com.example.AuthenticationService.Authentication.Service.Entity.UserEntity;
import com.example.AuthenticationService.Authentication.Service.Interface.UserService;
import com.example.AuthenticationService.Authentication.Service.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public List<UserEntity> findAllUsers(){
        return userRepo.findAll();
    }
}
