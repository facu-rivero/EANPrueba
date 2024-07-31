//package com.mercadona.eanprueba.controller;
//
//import com.mercadona.eanprueba.security.AuthenticationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import com.mercadona.eanprueba.repository.UserRepository;
//
//@RestController
//@RequestMapping("v1/api/login")
//public class AuthController {  -------------------------NO UTILIZADO POR FALLA EN LA AUTENTICACION----------------------------
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private AuthenticationService authenticationService;
//
//    @PostMapping()
//    public ResponseEntity<String> login() {
//
//        String token = authenticationService.generateToken("frr.1991@example.com");
//        return ResponseEntity.ok(token);
//    }
//}
