package com.sebolivros.mapper;

import com.sebolivros.domain.LivroDomain;
import com.sebolivros.dto.LivroDTO;

public class LivroMapper {

    public static LivroDomain toLivroDomain(LivroDTO dto){
        LivroDomain domain = new LivroDomain();
        domain.setIdLivro(dto.getIdLivro());
        domain.setDono(dto.getDono());
        domain.setNome(dto.getNome());
        domain.setGenero(dto.getGenero());
        domain.setEdicao(dto.getEdicao());
        domain.setEditora(dto.getEditora());
        domain.setUsado(dto.getUsado());
        domain.setVender(dto.getVender());
        domain.setDoar(dto.getDoar());
        domain.setEmprestar(dto.getEmprestar());
        domain.setSinopse(dto.getSinopse());
        domain.setValor(dto.getValor());
        domain.setObservacoes(dto.getObservacoes());
        domain.setQuantidade(dto.getQuantidade());

        return domain;
    }
}
