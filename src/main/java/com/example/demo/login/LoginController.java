package com.example.demo.login;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    LoginService loginService;

    @PostMapping("/login")
   ResponseEntity<String>loginAuth(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.status(HttpStatus.OK).body(loginService.loginService(loginRequest));
    }
}
