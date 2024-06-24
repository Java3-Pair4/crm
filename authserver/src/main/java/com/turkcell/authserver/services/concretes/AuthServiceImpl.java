package com.turkcell.authserver.services.concretes;

import com.turkcell.authserver.entities.User;
import com.turkcell.authserver.services.abstracts.AuthService;
import com.turkcell.authserver.services.abstracts.UserService;
import com.turkcell.authserver.services.dtos.Requests.LoginRequest;
import com.turkcell.authserver.services.dtos.Requests.RegisterRequest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.turkcell.common.jwt.JwtService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final UserService userService;

    public AuthServiceImpl(PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager, JwtService jwtService, UserService userService) {
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
        this.userService = userService;
    }

    @Override
    public void register(RegisterRequest request) {
        userService.add(request);
    }

    @Override
    public String login(LoginRequest request) {
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));

        if(!authentication.isAuthenticated())
            throw new RuntimeException("E-posta veya şifre hatalı.");

        UserDetails user = userService.loadUserByUsername(request.getEmail());

        return JwtService.generateToken(user.getUsername(), user.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList());
    }
}
