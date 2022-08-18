package com.sebolivros.controller;

import com.sebolivros.dto.LivroDTO;
import com.sebolivros.service.SeboLivrosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
public class SeboLivrosController {

    final SeboLivrosService service;

    public SeboLivrosController(SeboLivrosService service) {
        this.service = service;
    }

    @PostMapping("/adicionar-livro")
    public ResponseEntity<Void> cadastraLivro(@RequestBody LivroDTO livro) {

        service.cadastrarLivro(livro);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

//    @GetMapping("/recuperar-livros-cadastrados")
//    public ResponseEntity<List<LivroDomain>> recuperarLivrosCadastrados(LivroDomain livro) {
//
//        var lista = service.recuperarLivrosCadastrados(livro);
//
//        return ResponseEntity.ok(lista);
//    }

//    @DeleteMapping("/deletar-livro-por-nome-e-dono")
//    public ResponseEntity<String> deletarLivroPorNomeEDono(@RequestHeader String nomeLivro, @RequestHeader String nomeDono) {
//
//        var retorno = service.deletarLivroPorNomeEDono(nomeLivro, nomeDono);
//
//        return ResponseEntity.ok(retorno);
//    }
}
