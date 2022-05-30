package com.sebolivros.controller;

import com.sebolivros.domain.Livro;
import com.sebolivros.service.SeboLivrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeboLivrosController {

    @Autowired
    private SeboLivrosService service;

    @PostMapping("/adicionar-livro")
    public ResponseEntity<Livro> cadastraLivro(@RequestBody Livro livro) {

        service.cadastrarLivro(livro);

        return ResponseEntity.ok(livro);
    }
}
