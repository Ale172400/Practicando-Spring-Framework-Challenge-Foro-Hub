package com.forohub.service;

import com.forohub.model.Usuario;
import com.forohub.repository.UsuarioRepository;
import com.forohub.security.JwtService;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private UsuarioRepository repository;
    private JwtService jwtService;

    public AuthService(UsuarioRepository repository,JwtService jwtService){
        this.repository=repository;
        this.jwtService=jwtService;
    }

    public String login(String email,String password){

        Usuario usuario = repository.findByEmail(email).orElseThrow();

        if(usuario.getPassword().equals(password)){

            return jwtService.generarToken(email);

        }

        throw new RuntimeException("Credenciales incorrectas");

    }

}
