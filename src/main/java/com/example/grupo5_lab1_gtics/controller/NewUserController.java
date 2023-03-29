package com.example.grupo5_lab1_gtics.controller;

import com.example.grupo5_lab1_gtics.entity.NewUser;
import com.example.grupo5_lab1_gtics.repository.NewUserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewUserController {

    final NewUserRepository newUserRepository;

    public NewUserController(NewUserRepository newUserRepository) {

        this.newUserRepository = newUserRepository;

    }

    @PostMapping("/guardar")
    public String guardar(NewUser newUser) {
        newUserRepository.save(newUser);
        return "redirect:/listar";
    }
}
