package com.example.AuthenticationService.Authentication.Service.Service;

import com.example.AuthenticationService.Authentication.Service.Dto.LoginRequest;
import com.example.AuthenticationService.Authentication.Service.Dto.LoginResponce;
import com.example.AuthenticationService.Authentication.Service.Dto.RegisterResponse;
import com.example.AuthenticationService.Authentication.Service.Entity.UserEntity;

public interface IloginService {

    public RegisterResponse register(UserEntity empData);

    public LoginResponce login(LoginRequest request);
}
