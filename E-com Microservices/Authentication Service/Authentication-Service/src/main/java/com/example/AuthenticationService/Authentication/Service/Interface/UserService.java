package com.example.AuthenticationService.Authentication.Service.Interface;

import com.example.AuthenticationService.Authentication.Service.Entity.UserEntity;

import java.util.List;
public interface UserService {
    List<UserEntity> findAllUsers();
}
