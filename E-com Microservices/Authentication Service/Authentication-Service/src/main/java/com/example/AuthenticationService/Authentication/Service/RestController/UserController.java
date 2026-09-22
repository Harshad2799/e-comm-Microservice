package com.example.AuthenticationService.Authentication.Service.RestController;


import com.example.AuthenticationService.Authentication.Service.Entity.UserEntity;
import com.example.AuthenticationService.Authentication.Service.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/admin")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserEntity>> findAllUsers(){
        return ResponseEntity.ok().body(userService.findAllUsers());
    }
}
