package com.sebolivros.domain;

import javax.persistence.*;

@Entity
@Table(name = "TbLivros")
public class LivroDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idLivro;

    @Column
    private DonoDomain dono;

    @Column
    private String nome;

    @Column
    private AutorDomain autor;

    @Column
    private String genero;

    @Column
    private String edicao;

    @Column
    private String editora;

    @Column
    private Boolean usado;

    @Column
    private Boolean vender;

    @Column
    private Boolean doar;

    @Column
    private Boolean emprestar;

    @Column
    private String sinopse;

    @Column
    private Double valor;

    @Column
    private String observacoes;

    @Column
    private Integer quantidade;

    public DonoDomain getDono() {
        return dono;
    }

    public void setDono(DonoDomain dono) {
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AutorDomain getAutor() {
        return autor;
    }

    public void setAutor(AutorDomain autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Boolean getUsado() {
        return usado;
    }

    public void setUsado(Boolean usado) {
        this.usado = usado;
    }

    public Boolean getVender() {
        return vender;
    }

    public void setVender(Boolean vender) {
        this.vender = vender;
    }

    public Boolean getDoar() {
        return doar;
    }

    public void setDoar(Boolean doar) {
        this.doar = doar;
    }

    public Boolean getEmprestar() {
        return emprestar;
    }

    public void setEmprestar(Boolean emprestar) {
        this.emprestar = emprestar;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
