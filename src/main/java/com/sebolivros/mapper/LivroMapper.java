package com.sebolivros.mapper;

import com.sebolivros.domain.DonoDomain;
import com.sebolivros.domain.LivroDomain;
import com.sebolivros.dto.DonoDTO;
import com.sebolivros.dto.LivroDTO;

import java.util.ArrayList;
import java.util.List;

public class LivroMapper {

//    private static List<DonoDomain> donoList(List<DonoDTO> donoDTO){
//        List<DonoDomain> list = new ArrayList<>();
//        for(DonoDTO c : donoDTO){
//            list.add(c);
//        }
//        list;
//    }

    public static LivroDomain toLivroDomain(LivroDTO dto){
        LivroDomain domain = new LivroDomain();
//        domain.setIdLivro(dto.getIdLivro());
//        domain.setNome(dto.getNome());
//        domain.setDono(dto.getDono());
//        domain.setGenero(dto.getGenero());
//        domain.setEdicao(dto.getEdicao());
//        domain.setEditora(dto.getEditora());
//        domain.setUsado(dto.getUsado());
//        domain.setVender(dto.getVender());
//        domain.setDoar(dto.getDoar());
//        domain.setEmprestar(dto.getEmprestar());
//        domain.setSinopse(dto.getSinopse());
//        domain.setValor(dto.getValor());
//        domain.setObservacoes(dto.getObservacoes());
//        domain.setQuantidade(dto.getQuantidade());

        return domain;
    }
}
