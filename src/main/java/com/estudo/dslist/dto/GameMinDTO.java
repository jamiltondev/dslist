package com.estudo.dslist.dto;

import com.estudo.dslist.entities.Game;

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

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Integer getAno() {
        return ano;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }

}
