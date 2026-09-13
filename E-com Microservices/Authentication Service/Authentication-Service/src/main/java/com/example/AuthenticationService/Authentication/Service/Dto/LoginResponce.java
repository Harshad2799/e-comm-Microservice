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
    
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public List<String> getError() {
		return error;
	}
	public void setError(List<String> error) {
		this.error = error;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public boolean isLoginFlag() {
		return loginFlag;
	}
	public void setLoginFlag(boolean loginFlag) {
		this.loginFlag = loginFlag;
	}
	public String getResMsg() {
		return resMsg;
	}
	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}
    
    
}
