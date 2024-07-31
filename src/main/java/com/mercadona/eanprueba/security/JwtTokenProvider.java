//package com.mercadona.eanprueba.security;
//
//import com.mercadona.eanprueba.model.User;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
//@Component
//public class JwtTokenProvider { -------------------------NO UTILIZADO POR FALLA EN LA AUTENTICACION----------------------------
//
//    private String secretKey = "Hola";
//
//    private long expiration = 10L;
//
//    public String generateToken(Authentication authentication) {
//        User user = (User) authentication.getPrincipal();
//        return Jwts.builder()
//                .setSubject(user.getUsername())
//                .setExpiration(new Date(System.currentTimeMillis() + expiration))
//                .signWith(SignatureAlgorithm.HS512, secretKey.getBytes())
//                .compact();
//    }
//
//    public String getUsername(String token) {
//        return Jwts.parser()
//                .setSigningKey(secretKey.getBytes())
//                .parseClaimsJws(token)
//                .getBody()
//                .getSubject();
//    }
//
//    public boolean validateToken(String token) {
//        try {
//            Jwts.parser().setSigningKey(secretKey.getBytes()).parseClaimsJws(token);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//}