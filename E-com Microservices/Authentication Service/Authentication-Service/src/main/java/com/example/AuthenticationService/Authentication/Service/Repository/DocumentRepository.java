package com.example.AuthenticationService.Authentication.Service.Repository;

import com.example.AuthenticationService.Authentication.Service.Entity.DocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<DocumentEntity, Long> {
}
