package com.turkcell.authserver.services.abstracts;


import com.turkcell.authserver.services.dtos.requests.RegisterRequest;

//kayıt ol ve giriş yap methodlarını içericek
public interface AuthService {

    void register(RegisterRequest request);
   // void login();


}
