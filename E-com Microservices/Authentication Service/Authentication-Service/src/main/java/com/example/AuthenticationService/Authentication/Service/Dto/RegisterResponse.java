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
    
    
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmNane() {
		return mNane;
	}
	public void setmNane(String mNane) {
		this.mNane = mNane;
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
	public Long getOrganization() {
		return organization;
	}
	public void setOrganization(Long organization) {
		this.organization = organization;
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
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
    
    
    
}
