package com.forohub.controller;

import com.forohub.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private AuthService service;

    public AuthController(AuthService service){
        this.service=service;
    }

    @PostMapping
    public String login(@RequestParam String email,@RequestParam String password){

        return service.login(email,password);

    }

}
