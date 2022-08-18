package com.sebolivros.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbAutores")
public class AutorDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAutor;

    @ManyToMany(mappedBy = "autores")
    private List<LivroDomain> livros;

    @Column(length = 130)
    private String nome;

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public List<LivroDomain> getLivros() {
        return livros;
    }

    public void setLivros(List<LivroDomain> livros) {
        this.livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
