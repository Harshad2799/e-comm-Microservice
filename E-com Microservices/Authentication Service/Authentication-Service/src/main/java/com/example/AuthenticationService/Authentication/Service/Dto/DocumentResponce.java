package com.example.AuthenticationService.Authentication.Service.Dto;

import lombok.Data;
import java.util.Base64;

@Data
public class DocumentResponce {

    private long empId;
    private Base64 fileBytes;
    private String fileName;
}
