package com.example.AuthenticationService.Authentication.Service.Security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtUtils {

    private final SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode("mySuperSecretSecureKeyForEcomMicroserviceApplication2026!"));

    public String generateToken(String login){
        return Jwts.builder()
                .setSubject(login)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 500000))
                .signWith(key)
                .compact();
    }

    public String validateAndExtractUserName(String token){
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}
