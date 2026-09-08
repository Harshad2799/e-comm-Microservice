package com.example.AuthenticationService.Authentication.Service.Service;

import com.example.AuthenticationService.Authentication.Service.Dto.LoginRequest;
import com.example.AuthenticationService.Authentication.Service.Dto.LoginResponce;
import com.example.AuthenticationService.Authentication.Service.Dto.RegisterResponse;
import com.example.AuthenticationService.Authentication.Service.Entity.UserEntity;
import com.example.AuthenticationService.Authentication.Service.Repository.UserRepository;
import com.example.AuthenticationService.Authentication.Service.Security.JwtUtils;
import com.example.AuthenticationService.Authentication.Service.Validate.ValidationClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;

@Service
public class LoginServiceImpl implements IloginService {

    private static final Logger log = LoggerFactory.getLogger(LoginServiceImpl.class);
    @Autowired
    private UserRepository loginRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Autowired
    private JwtUtils jwtUtil;

    @Override
    public RegisterResponse register(UserEntity empData) {
        UserEntity savedEmp = null;
        RegisterResponse resDto = new RegisterResponse();
        try {
            String encryptedPassword = passwordEncoder.encode(empData.getPassword());
            empData.setPassword(encryptedPassword);
            savedEmp = loginRepository.save(empData);
            BeanUtils.copyProperties(savedEmp, resDto);
            resDto.setStatus("success");
            resDto.setResMsg("User registered successfully");
            return resDto;
        } catch (Exception e) {
            resDto.setStatus("failure");
            resDto.setResMsg("User registration failed");
            return resDto;
        }
    }

    @Override
    public LoginResponce login(LoginRequest request) {
        log.info("Call Start to validate user");
        LoginResponce login = new LoginResponce();
        try {
            ValidationClass.ValidateLoginFields(request, login);
            UserEntity emp = loginRepository.findByUserName(request.getUserName());
            if(emp ==  null){
                login.setLoginFlag(false);
                login.setResMsg("User Not Found");
                throw new RuntimeException("User Not Found");
            }
            boolean passwordCheck = passwordEncoder.matches(request.getPassword(), emp.getPassword());
            if (CollectionUtils.isEmpty(login.getError()) && (passwordCheck &&
                    request.getUserName().equals(emp.getUserName()))) {
                emp.setLastLogin(new Date());
                loginRepository.save(emp);
                login.setToken(jwtUtil.generateToken(request.getUserName()));
                login.setUsername(request.getUserName());
                login.setLoginFlag(true);
                return login;
            } else {
                login.setLoginFlag(false);
                login.setResMsg("Wrong Password");
            }
        }catch(Exception ex){
            log.error(ex.getMessage());
        }

        return login;
    }

}
