package com.example.AuthenticationService.Authentication.Service.RestController;

import com.example.AuthenticationService.Authentication.Service.Dto.LoginRequest;
import com.example.AuthenticationService.Authentication.Service.Dto.LoginResponce;
import com.example.AuthenticationService.Authentication.Service.Dto.RegisterResponse;
import com.example.AuthenticationService.Authentication.Service.Entity.UserEntity;
import com.example.AuthenticationService.Authentication.Service.Repository.UserRepository;
import com.example.AuthenticationService.Authentication.Service.Service.IloginService;
import com.example.AuthenticationService.Authentication.Service.Security.JwtUtils;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    @Autowired
    private IloginService loginService;

    @Autowired
    private UserRepository loginRepository;

    private final JwtUtils jwtUtil;

    public LoginController(JwtUtils jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody UserEntity empData) {
        RegisterResponse response = loginService.register(empData);
        if (response.getStatus().equals("success")) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(401).body(response);
        }
    }

    // Login API
    @PostMapping("/login")
    public ResponseEntity<?> login(HttpServletRequest req, @RequestBody LoginRequest logindto) {
        LoginResponce login = loginService.login(logindto);
        if(login.isLoginFlag()){
            return ResponseEntity.ok(login);
        }

        return ResponseEntity.status(404).body(login);
    }

}
