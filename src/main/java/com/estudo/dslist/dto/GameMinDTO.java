package com.estudo.dslist.dto;

import com.estudo.dslist.entities.Game;

import lombok.Getter;

@Getter
public class GameMinDTO {

    private Long id;
    private String titulo;
    private Integer ano;
    private String imgUrl;
    private String descricaoCurta;

    public GameMinDTO() {
    }

    public GameMinDTO(Game game) {
        id = game.getId();
        titulo = game.getTitulo();
        ano = game.getAno();
        imgUrl = game.getImgUrl();
        descricaoCurta = game.getDescricaoCurta();
    }

}
