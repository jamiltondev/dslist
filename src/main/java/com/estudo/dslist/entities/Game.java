package com.estudo.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "title")
    private String titulo;

    @Column(name = "game_year")
    private Integer ano;

    @Column(name = "genre")
    private String genero;

    @Column(name = "platforms")
    private String plataformas;

    @Column(name = "score")
    private String pontuacao;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "short_description", columnDefinition = "TEXT")
    private String descricaoCurta;

    @Column(name = "long_description", columnDefinition = "TEXT")
    private String descricaoLonga;

}
