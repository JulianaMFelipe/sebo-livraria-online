package com.sebolivros.domain;

public class Livro {
    private Dono dono;
    private String Nome;
    private Autor autor;
    private String genero;
    private String edicao;
    private String editora;
    private Boolean usado;
    private Boolean vender;
    private Boolean doar;
    private Boolean emprestar;
    private String sinopse;
    private Double valor;
    private String observacoes;
    private Integer quantidade;

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
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
