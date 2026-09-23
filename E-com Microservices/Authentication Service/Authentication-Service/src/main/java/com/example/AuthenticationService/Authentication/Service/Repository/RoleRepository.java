package com.example.AuthenticationService.Authentication.Service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AuthenticationService.Authentication.Service.Entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
