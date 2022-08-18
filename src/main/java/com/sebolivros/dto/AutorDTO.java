package com.sebolivros.dto;

import java.util.List;

public class AutorDTO {
    private Integer idAutor;
    private List<Integer> idLivro;
    private String nome;

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public List<Integer> getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(List<Integer> idLivro) {
        this.idLivro = idLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
