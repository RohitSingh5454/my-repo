package com.example.OaathImplementation.Utils;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.security.config.annotation.rsocket.RSocketSecurity;

import java.security.Signature;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class JwtUtil {

    public String generateJwt(String userName){
        Map<String, Object> claims=new HashMap<>();
        return createToken(claims,userName);
    }
    private String createToken(Map<String,Object> claims,String subject){
        return new Jwts.builder().setClaims(claims).setSubject(subject).
                setIssuedDate(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+1000*60*60*10))
                .signWith(SignatureAlgorithm.HS256,secret).compact();

    }
}
