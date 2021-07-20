package com.example.demo.login;

import com.example.demo.appuser.AppUser;
import com.example.demo.appuser.AppUserRepository;
import com.example.demo.security.PasswordEncoder;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class LoginService {
    AppUserRepository appUserRepository;
    LoginRepo loginRepo;
    PasswordEncoder passwordEncoder;
    public String loginService(LoginRequest loginRequest){
     AppUser appUser=loginRepo.findByEmail(loginRequest.getEmail());
       if(!passwordEncoder.bCryptPasswordEncoder().matches(loginRequest.getPassword(), appUser.getPassword())){
           throw new IllegalStateException("login error");
       }
       return "sucesss";

    }
}
