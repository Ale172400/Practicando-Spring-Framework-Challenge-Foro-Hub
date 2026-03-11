package com.forohub.model;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String email;

    private String password;

    public Usuario(){}

    public Usuario(String email,String password){
        this.email=email;
        this.password=password;
    }

    public String getEmail(){return email;}
    public String getPassword(){return password;}
}
