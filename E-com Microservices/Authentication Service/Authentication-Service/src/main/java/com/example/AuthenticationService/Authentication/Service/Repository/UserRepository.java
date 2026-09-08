package com.example.AuthenticationService.Authentication.Service.Repository;

import com.example.AuthenticationService.Authentication.Service.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("SELECT emp FROM UserEntity emp WHERE emp.userName = :userName")
    public UserEntity findByUserName(@Param("userName") String userName);
}
