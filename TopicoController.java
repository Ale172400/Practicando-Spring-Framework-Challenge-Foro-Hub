package com.forohub.controller;

import com.forohub.model.Topico;
import com.forohub.service.TopicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private TopicoService service;

    public TopicoController(TopicoService service){
        this.service=service;
    }

    @GetMapping
    public List<Topico> listar(){

        return service.listar();

    }

    @PostMapping
    public Topico crear(@RequestBody Topico topico){

        return service.crear(topico);

    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){

        service.eliminar(id);

    }

}
