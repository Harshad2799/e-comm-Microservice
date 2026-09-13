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
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getResMsg() {
		return resMsg;
	}
	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    
}
