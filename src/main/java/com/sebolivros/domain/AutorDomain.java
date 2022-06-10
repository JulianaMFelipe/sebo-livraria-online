package com.sebolivros.domain;

import javax.persistence.*;

@Entity
@Table(name = "TbAutores")
public class AutorDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idLivro;

    @Column
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
