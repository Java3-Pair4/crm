package com.turkcell.authserver.services.concretes;

import com.turkcell.authserver.entities.User;
import com.turkcell.authserver.services.abstracts.AuthService;
import com.turkcell.authserver.services.abstracts.UserService;
import com.turkcell.authserver.services.dtos.requests.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {


    private final PasswordEncoder passwordEncoder ;

    private final UserService userService;

    public AuthServiceImpl(PasswordEncoder passwordEncoder, UserService userService) {
        this.passwordEncoder = passwordEncoder;
        this.userService = userService;
    }

    @Override
    public void register(RegisterRequest request) {

        User user = new User();
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());

        user.setPassword(passwordEncoder.encode(request.getPassword()));

        userService.add(user);
    }


}
