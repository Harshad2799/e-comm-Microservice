package com.example.AuthenticationService.Authentication.Service.Entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@Data
public class UserEntity {

    @Column(name = "USER_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;

    @Column(name = "EMP_FNAME")
    @JsonProperty("fName")
    private String fName;

    @Column(name = "EMP_MNAME")
    @JsonProperty("mName")
    private String mName;

    @JsonProperty("lName")
    @Column(name = "EMP_LNAME")
    private String lName;

    @JsonProperty("deptId")
    @Column(name = "EMP_DEPT")
    private Double deptId;

    @Column(name = "EMP_LOGIN_NAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String password;

    @JsonProperty("otp")
    @Column(name = "OTP")
    private Double otp;

    @Column(name = "AUTHENTICATION")
    private String authenticated;

    @Column(name = "IP_ADDRESS")
    private String ipAddress;

    @Column(name="EMP_EMAIL")
    private String email;

    @Column(name = "LAST_LOGIN_DATE")
    private Date lastLogin;
}
