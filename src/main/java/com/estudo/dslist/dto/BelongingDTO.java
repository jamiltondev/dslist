package com.estudo.dslist.dto;

import com.estudo.dslist.entities.Belonging;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Getter
@NoArgsConstructor
public class BelongingDTO {

    private Long id;
    private String titulo;
    private Integer ano;
    private String genero;
    private String plataformas;
    private String pontuacao;
    private String imgUrl;
    private String descricaoCurta;
    private String descricaoLonga;

    public BelongingDTO(Belonging entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
