package com.example.AuthenticationService.Authentication.Service.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AuthenticationService.Authentication.Service.Dto.RoleResponce;

@RestController
@RequestMapping("/api/admin")
public class PermissionRestController {
	
	
	@PostMapping("/addrole")
	public ResponseEntity<String> addRole() {
		
		return ResponseEntity.ok("Role Added");
	}
	
	
	@PostMapping("/addpermission")
	public ResponseEntity<String> addPermission() {
		
		return ResponseEntity.ok("Role Added");
	}
	
	
	@PutMapping("/removepermission")
	public ResponseEntity<String> removePermission() {
		
		return ResponseEntity.ok("Role Added");
	}
	
	
	@PutMapping("/updatepermission")
	public ResponseEntity<String> updateRolePermission() {
		
		return ResponseEntity.ok("Role Added");
	}
	
	
	
	

}
