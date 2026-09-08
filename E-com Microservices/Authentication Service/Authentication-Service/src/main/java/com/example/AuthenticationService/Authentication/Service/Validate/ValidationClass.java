package com.example.AuthenticationService.Authentication.Service.Validate;

import com.example.AuthenticationService.Authentication.Service.Dto.LoginRequest;
import com.example.AuthenticationService.Authentication.Service.Dto.LoginResponce;
import io.micrometer.common.util.StringUtils;

public class ValidationClass {

    public static void ValidateLoginFields(LoginRequest loginFeilds, LoginResponce response){
        if(!StringUtils.isNotBlank(loginFeilds.getUserName())){
            response.getError().add("Kindly enter User Name");
        }
        if(!StringUtils.isNotBlank(loginFeilds.getPassword())){
            response.getError().add("Kindly enter password");
        }
        if(!StringUtils.isNotBlank(loginFeilds.getEmail())){
            response.getError().add("Kindly enter email");
        }

    }
}
