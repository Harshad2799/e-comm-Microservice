package com.example.AuthenticationService.Authentication.Service.Security;

import java.util.Date;
import java.util.List;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtils {

    private final SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode("mySuperSecretSecureKeyForEcomMicroserviceApplication2026!"));

    public String generateToken(String login, String role){
        return Jwts.builder()
                .setSubject(login)
                .claim("rolw", List.of("ROLE_"+ role))
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
    
    public String extractUsername(String token) {
        return extractAllClaims(token).getSubject();
    }
    
    private Claims extractAllClaims(String token) {
        return Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
    
    @SuppressWarnings("unchecked")
    public List<String> extractRoles(String token) {
        return extractAllClaims(token).get("roles", List.class);
    }
    
    public boolean validateToken(String token) {
        try {
            Jwts.parser().verifyWith(key).build().parseSignedClaims(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            // Token is expired, malformed, or signature is invalid
            return false;
        }
    }
    
}
