package com.estudo.dslist.services;

import com.estudo.dslist.dto.GameDTO;
import com.estudo.dslist.dto.GameMinDTO;
import com.estudo.dslist.entities.Game;
import com.estudo.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        var resultado = gameRepository.findAll();
        return resultado.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        var resultado = gameRepository.findById(id).get();
        return new GameDTO(resultado);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        var resultado = gameRepository.searchByList(listId);
        return resultado.stream().map(GameMinDTO::new).toList();
    }

}
