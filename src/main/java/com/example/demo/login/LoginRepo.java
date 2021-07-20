package com.example.demo.login;

import com.example.demo.appuser.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<AppUser,Long> {
    AppUser findByEmail(String email);
}
