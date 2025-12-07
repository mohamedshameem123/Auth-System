package com.example.jwtauthdemo.Dao;

import com.example.jwtauthdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
