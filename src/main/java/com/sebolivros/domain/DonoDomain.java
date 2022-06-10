package com.sebolivros.domain;

import javax.persistence.*;

@Entity
@Table(name = "TbDonos")
public class DonoDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDono;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idLivro;

    @Column
    private String nome;

    @Column
    private String sobrenome;

    @Column
    private String apelido;

    @Column
    private Integer idade;

    @Column
    private EnderecoDomain endereco;

    @Column
    private String cpf;

    @Column
    private String rg;

    @Column
    private String telefone;

    @Column
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public EnderecoDomain getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDomain endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
