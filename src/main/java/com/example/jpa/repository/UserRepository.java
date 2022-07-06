package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Integer> {
    
}
