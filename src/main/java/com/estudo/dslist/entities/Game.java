package com.estudo.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

    public Game() {
    }

    public Game(Long id, String titulo, Integer ano, String genero, String plataformas, String pontuacao, String imgUrl, String descricaoCurta, String descricaoLonga) {
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.plataformas = plataformas;
        this.pontuacao = pontuacao;
        this.imgUrl = imgUrl;
        this.descricaoCurta = descricaoCurta;
        this.descricaoLonga = descricaoLonga;
    }

}
