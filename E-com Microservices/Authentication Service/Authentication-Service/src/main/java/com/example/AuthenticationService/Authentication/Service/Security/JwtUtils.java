package com.example.AuthenticationService.Authentication.Service.Security;

import java.util.Date;
import java.util.List;

import javax.crypto.SecretKey;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class JwtUtils {
    private final Algorithm algorithm;


    public JwtUtils( @Value("${jwt.secret}") String secret) {
        this.algorithm = Algorithm.HMAC256(secret);
    }

    public String generateToken(String login, String role){
        return JWT.create()
                .withSubject(login)
                .withClaim("userId", login)
                .withClaim("roles", role)
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 15))
                .sign(algorithm);
    }

    
    public String extractUsername(String token) {

        DecodedJWT jwt = JWT.decode(token);

        return jwt.getSubject();
    }
    

    public String extractRoles(String token) {
        DecodedJWT jwt = JWT.decode(token);
        return jwt.getClaim("roles")
                .asString();
    }
    
    public boolean validateToken(String token) {
        try {
            JWT.require(algorithm)
                    .build()
                    .verify(token);
            return true;
        } catch (IllegalArgumentException e) {
            log.info("Invalidate token");
            return false;
        }
    }
    
}
