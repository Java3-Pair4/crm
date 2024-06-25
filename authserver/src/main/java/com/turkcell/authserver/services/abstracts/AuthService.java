package com.turkcell.authserver.services.abstracts;

import com.turkcell.authserver.services.dtos.Requests.LoginRequest;
import com.turkcell.authserver.services.dtos.Requests.RegisterRequest;

public interface AuthService {


    void register(RegisterRequest request);
    String login(LoginRequest request);

}
