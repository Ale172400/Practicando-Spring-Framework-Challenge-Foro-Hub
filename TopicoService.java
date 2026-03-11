package com.forohub.service;

import com.forohub.model.Topico;
import com.forohub.repository.TopicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    private TopicoRepository repository;

    public TopicoService(TopicoRepository repository){
        this.repository=repository;
    }

    public List<Topico> listar(){
        return repository.findAll();
    }

    public Topico crear(Topico topico){
        return repository.save(topico);
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }

}
