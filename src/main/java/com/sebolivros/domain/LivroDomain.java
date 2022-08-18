package com.sebolivros.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbLivros")
public class LivroDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idLivro;

    @ManyToOne
    @JoinColumn(name = "dono")
    private DonoDomain dono;

    @ManyToMany
    @JoinTable(name = "tbLivroAutor",
            joinColumns = @JoinColumn(name = "livros"),
            inverseJoinColumns = @JoinColumn(name = "autores"))
    private List<AutorDomain> autores;

    @Column(length = 130)
    private String nome;

    @Column(length = 130)
    private String genero;

    @Column(length = 130)
    private String edicao;

    @Column(length = 130)
    private String editora;

    @Column
    private Boolean usado;

    @Column
    private Boolean vender;

    @Column
    private Boolean doar;

    @Column
    private Boolean emprestar;

    @Column(length = 130)
    private String sinopse;

    @Column
    private Double valor;

    @Column(length = 130)
    private String observacoes;

    @Column
    private Integer quantidade;

    public List<AutorDomain> getAutor() {
        return autores;
    }

    public void setAutor(List<AutorDomain> autores) {
        this.autores = autores;
    }

    public Integer getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
    }

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
