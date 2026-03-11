package com.forohub.model;

import jakarta.persistence.*;

@Entity
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensaje;
    private String curso;
    private Long autorId;

    public Topico(){}

    public Topico(String titulo,String mensaje,String curso,Long autorId){
        this.titulo=titulo;
        this.mensaje=mensaje;
        this.curso=curso;
        this.autorId=autorId;
    }

    public Long getId(){return id;}
    public String getTitulo(){return titulo;}
    public String getMensaje(){return mensaje;}
}
