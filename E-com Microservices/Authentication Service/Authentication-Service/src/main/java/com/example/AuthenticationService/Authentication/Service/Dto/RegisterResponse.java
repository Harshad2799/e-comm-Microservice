package com.example.AuthenticationService.Authentication.Service.Dto;

import lombok.Data;

import java.util.Date;

@Data
public class RegisterResponse {
    private String fName;
    private String mNane;
    private String lName;
    private Double deptId;
    private String userName;
    private String password;
    private Double otp;
    private String authenticated;
    private String ipAddress;
    private Long organization;
    private String resMsg;
    private String status;
    private String token;
    private String email;
    private Date lastLogin;
}
