package com.turkcell.authserver.services.abstracts;

import com.turkcell.authserver.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

//Kullanıcının eklenmesi güncellenmesi gibi yapıları içericek.
public interface UserService extends UserDetailsService {

    void add(User user);
}
