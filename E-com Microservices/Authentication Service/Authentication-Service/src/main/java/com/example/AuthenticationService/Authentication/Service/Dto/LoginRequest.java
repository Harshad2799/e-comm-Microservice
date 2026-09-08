package com.example.AuthenticationService.Authentication.Service.Dto;

import lombok.Data;

import java.util.Date;

@Data
public class LoginRequest {
    private String userName;
    private String password;
    private Double otp;
    private String ipAddress;
    private String resMsg;
    private String status;
    private String token;
    private String email;
}
