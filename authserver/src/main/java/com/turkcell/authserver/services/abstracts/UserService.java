package com.turkcell.authserver.services.abstracts;

import com.turkcell.authserver.entities.User;
import com.turkcell.authserver.services.dtos.Requests.RegisterRequest;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {


    void add(User user);
    // void login();
    void add(RegisterRequest request);
}
