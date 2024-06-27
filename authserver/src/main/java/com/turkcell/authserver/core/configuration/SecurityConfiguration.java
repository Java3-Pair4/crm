package com.turkcell.authserver.core.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//Global SecurityConfigurationları yapılır.


@Configuration
public class SecurityConfiguration {


    @Bean
    public PasswordEncoder passwordEncoder(){
         //spring securtynin size sağladığı alg. bir tanesini seçiyoruz.
        return new BCryptPasswordEncoder();
    }

    //Spring securitynin size default olarak verdiği filtre zincirini değiştirebiliriz.
    //Zinciri(chaini) override etmek için bir bean tanımlıyoruz.Spring securtynin default olarak verdiği filtre zincirini değiştirebiliyoruz.
    //parametreden gelen http üzerinden chain işlemleri gerçekleştiririz.
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        //burada adım adım zinciri değiştirebiliriz.
        http
                //.authorizeHttpRequests((req)->req.anyRequest().authenticated())// tüm istek authenticatıt yap
                .csrf(AbstractHttpConfigurer::disable)   //1.zincir devre dışı bırak Cross-Site Request Forgery web güvenlik açığını devre dışı bırakır.
                .httpBasic(AbstractHttpConfigurer::disable);  //2.zincir devre dışı bırak. filter chainin belirliycem adım adım zincirde neler yapılması gerektiğini yazıcaz.



        return http.build();


       // return null;
    }

}
