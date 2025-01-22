package com.estudo.dslist.repositories;

import com.estudo.dslist.entities.Game;
import com.estudo.dslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
            SELECT 
                tb_game.id, 
                tb_game.title AS titulo, 
                tb_game.game_year AS ano, 
                tb_game.img_url AS imgUrl,
            	tb_game.short_description AS descricaoCurta, 
            	tb_belonging.position AS posicao
            FROM 
            	tb_game INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
            WHERE 
            	tb_belonging.game_list_id = :listId
            ORDER BY 
            	tb_belonging.position
            """)
    List<GameMinProjection> searchByList(Long listId);

}
