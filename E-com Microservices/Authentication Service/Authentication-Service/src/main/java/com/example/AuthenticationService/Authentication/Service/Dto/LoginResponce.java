package com.example.AuthenticationService.Authentication.Service.Dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LoginResponce {

    private String username;
    private String organization;
    private List<String> error = new ArrayList<>();
    private String token;
    private boolean loginFlag;
    private String resMsg;
}
