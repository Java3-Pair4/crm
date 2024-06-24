package com.turkcell.authserver.controllers;

import com.turkcell.authserver.services.abstracts.AuthService;
import com.turkcell.authserver.services.dtos.Requests.LoginRequest;
import com.turkcell.authserver.services.dtos.Requests.RegisterRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthControllers {

    private final AuthService authService;

    public AuthControllers(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody RegisterRequest request)
    {
        authService.register(request);
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public String login(@RequestBody LoginRequest request)
    {
        return authService.login(request);
    }

}
