package com.sebolivros.service;

import com.sebolivros.domain.LivroDomain;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeboLivrosService {

    List<LivroDomain> listaDeLivros = new ArrayList<>();

    public void cadastrarLivro(LivroDomain livro) {
        listaDeLivros.add(livro);
    }

    public List<LivroDomain> recuperarLivrosCadastrados(LivroDomain livro) {

        return listaDeLivros;
    }

    public String deletarLivroPorNomeEDono(String nomeLivro, String nomeDono) {
        for (LivroDomain livro : listaDeLivros) {
            if (nomeLivro.equals(listaDeLivros.get(0).getNome()) && nomeDono.equals(listaDeLivros.get(0).getDono().getNome())) {
                listaDeLivros.remove(0);
                return "Livro deletado com sucesso";
            }
        }
        return "Erro ao tentar deletar livro";
    }
}
