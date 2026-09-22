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
    
    @Column(name = "ROLE_PERMISSION")
    

    
	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Double getDeptId() {
		return deptId;
	}

	public void setDeptId(Double deptId) {
		this.deptId = deptId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getOtp() {
		return otp;
	}

	public void setOtp(Double otp) {
		this.otp = otp;
	}

	public String getAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(String authenticated) {
		this.authenticated = authenticated;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
    
    
}
