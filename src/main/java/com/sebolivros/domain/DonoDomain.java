package com.sebolivros.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tbDonos")
public class DonoDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDono;

    @OneToMany(mappedBy = "dono")
    private List<LivroDomain> livros;

    @Column(length = 130)
    private String nome;

    @Column(length = 130)
    private String sobrenome;

    @Column(length = 130)
    private String apelido;

    @Column
    private LocalDate dataNascimento;

    @OneToOne
    @JoinColumn(name = "endereco")
    private EnderecoDomain endereco;

    @Column(length = 130)
    private String cpf;

    @Column(length = 130)
    private String rg;

    @Column(length = 130)
    private String telefone;

    @Column(length = 130)
    private String email;

    public Integer getIdDono() {
        return idDono;
    }

    public void setIdDono(Integer idDono) {
        this.idDono = idDono;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
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
