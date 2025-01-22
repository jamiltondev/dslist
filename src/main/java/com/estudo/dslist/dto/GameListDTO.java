package com.estudo.dslist.dto;

import com.estudo.dslist.entities.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GameListDTO {

    private Long id;
    private String nome;

    public GameListDTO(GameList gameList) {
        id = gameList.getId();
        nome = gameList.getNome();
    }

}
