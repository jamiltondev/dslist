package com.estudo.dslist.dto;

import com.estudo.dslist.entities.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GameDTO {

    private Long id;
    private String titulo;
    private Integer ano;
    private String genero;
    private String plataformas;
    private String pontuacao;
    private String imgUrl;
    private String descricaoCurta;
    private String descricaoLonga;

    public GameDTO(Game game) {
        id = game.getId();
        titulo = game.getTitulo();
        ano = game.getAno();
        genero = game.getGenero();
        plataformas = game.getPlataformas();
        pontuacao = game.getPontuacao();
        imgUrl = game.getImgUrl();
        descricaoCurta = game.getDescricaoCurta();
        descricaoLonga = game.getDescricaoLonga();
    }

}
