//package com.mercadona.eanprueba.security;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//
//@Service
//public class AuthenticationService {
//
//  -------------------------NO UTILIZADO POR FALLA EN LA AUTENTICACION----------------------------
//
//    private static final String JWT_SECRET = "Hola"; // Secreto para firmar el token
//    private static final long JWT_EXPIRATION_MS = 5 * 60 * 1000; // Expiración en 5 minutos
//
//    public String generateToken(String email) {
//        return Jwts.builder()
//                .setSubject(email)
//                .setIssuedAt(new Date())
//                .setExpiration(new Date((new Date()).getTime() + JWT_EXPIRATION_MS))
//                .signWith(SignatureAlgorithm.HS512, JWT_SECRET)
//                .compact();
//    }
//
//    public String getEmailFromToken(String token) {
//        Claims claims = Jwts.parser()
//                .setSigningKey(JWT_SECRET)
//                .parseClaimsJws(token)
//                .getBody();
//        return claims.getSubject();
//    }
//
//    public boolean validateToken(String token) {
//        try {
//            Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//}