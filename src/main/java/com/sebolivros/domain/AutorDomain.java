package com.sebolivros.domain;

import javax.persistence.*;

@Entity
@Table(name = "tbautores")
public class AutorDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAutor;

    @Column
    @JoinColumn(name = "tblivros")
    private Integer idLivro;

    @Column(length = 130)
    private String nome;

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public Integer getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
