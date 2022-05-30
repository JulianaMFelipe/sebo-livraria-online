package com.sebolivros.service;

import com.sebolivros.domain.Autor;
import com.sebolivros.domain.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeboLivrosService {

    List<Livro> listaDeLivros = new ArrayList<>();

    public void cadastrarLivro(Livro livro){
        listaDeLivros.add(livro);
    }

    public List<Livro> recuperarLivrosCadastrados(Livro livro){

            return listaDeLivros;
    }
}
