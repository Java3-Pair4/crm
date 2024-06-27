package com.turkcell.authserver.controllers;

import com.turkcell.authserver.services.abstracts.AuthService;
import com.turkcell.authserver.services.dtos.requests.RegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    final private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }


    @PostMapping("register")
    public void register(@RequestBody RegisterRequest registerRequest){

        authService.register(registerRequest);
    }



}
