package com.example.grupo5_lab1_gtics.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class NewUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Nombres")
    private String nombres;
    @Column(name = "Usuario")
    private String usuario;

    @Column(name = "Correo")
    private String correo;
    @Column(name = "Contraseña")
    private String contraseña;
}
