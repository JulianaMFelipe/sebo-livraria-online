package com.sebolivros.domain;

import javax.persistence.*;

@Entity
@Table(name = "tbenderecos")
public class EnderecoDomain {

    @Id
    private String cep;

    @Column
    @JoinColumn(name = "tbautores")
    private Integer idDono;

    @Column(length = 130)
    private String pais;

    @Column(length = 130)
    private String estado;

    @Column(length = 130)
    private String cidade;

    @Column(length = 130)
    private String bairro;

    @Column(length = 130)
    private String tipoLogradouro;

    @Column(length = 130)
    private String logradouro;

    @Column(length = 130)
    private String numero;

    @Column(length = 130)
    private String complemento;

    @Column(length = 130)
    private String pontoDeReferencia;

    public Integer getIdDono() {
        return idDono;
    }

    public void setIdDono(Integer idDono) {
        this.idDono = idDono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getPontoDeReferencia() {
        return pontoDeReferencia;
    }

    public void setPontoDeReferencia(String pontoDeReferencia) {
        this.pontoDeReferencia = pontoDeReferencia;
    }

}
