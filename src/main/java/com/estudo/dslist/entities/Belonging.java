package com.estudo.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    @EqualsAndHashCode.Include
    private BelongingPK id = new BelongingPK();

    @Column(name = "position")
    private Integer posicao;

    public Belonging(Game game, GameList gameList, Integer posicao) {
        id.setGame(game);
        id.setGameList(gameList);
        this.posicao = posicao;
    }

}
