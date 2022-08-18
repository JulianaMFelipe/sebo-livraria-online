package com.sebolivros.service;

import com.sebolivros.domain.LivroDomain;
import com.sebolivros.dto.LivroDTO;
import com.sebolivros.repository.SeboLivrosRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class SeboLivrosService {

    final SeboLivrosRepository repository;

    public SeboLivrosService(SeboLivrosRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void cadastrarLivro(LivroDTO livro) {
        LivroDomain domain = new LivroDomain();
        BeanUtils.copyProperties(livro, domain);
        repository.save(domain);
/*
                LivroMapper.toLivroDomain(livro));
*/
    }

//    public List<LivroDomain> recuperarLivrosCadastrados(LivroDomain livro) {
//
//        return listaDeLivros;
//    }

//    public String deletarLivroPorNomeEDono(String nomeLivro, String nomeDono) {
//        for (LivroDomain livro : listaDeLivros) {
//            if (nomeLivro.equals(listaDeLivros.get(0).getNome()) && nomeDono.equals(listaDeLivros.get(0).getDono().getNome())) {
//                listaDeLivros.remove(0);
//                return "Livro deletado com sucesso";
//            }
//        }
//        return "Erro ao tentar deletar livro";
//    }

}
