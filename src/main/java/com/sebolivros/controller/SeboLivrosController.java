package com.sebolivros.controller;

import com.sebolivros.domain.Dono;
import com.sebolivros.domain.Livro;
import com.sebolivros.service.SeboLivrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SeboLivrosController {

    @Autowired
    private SeboLivrosService service;

    @PostMapping("/adicionar-livro")
    public ResponseEntity<Livro> cadastraLivro(@RequestBody Livro livro) {

        service.cadastrarLivro(livro);

        return ResponseEntity.ok(livro);
    }

    @GetMapping("/recuperar-livros-cadastrados")
    public ResponseEntity<List<Livro>> recuperarLivrosCadastrados(Livro livro) {

        var lista = service.recuperarLivrosCadastrados(livro);

        return ResponseEntity.ok(lista);
    }

    @DeleteMapping("/deletar-livro-por-nome-e-dono")
    public ResponseEntity<String> deletarLivroPorNomeEDono(@RequestHeader String nomeLivro, @RequestHeader String nomeDono) {

        var retorno = service.deletarLivroPorNomeEDono(nomeLivro, nomeDono);

        return ResponseEntity.ok(retorno);
    }
}
