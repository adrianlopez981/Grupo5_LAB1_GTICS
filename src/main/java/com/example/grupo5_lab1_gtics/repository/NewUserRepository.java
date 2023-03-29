package com.example.grupo5_lab1_gtics.repository;

import com.example.grupo5_lab1_gtics.entity.NewUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewUserRepository
        extends JpaRepository<NewUser,Integer> {
}