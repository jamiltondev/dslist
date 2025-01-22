package com.estudo.dslist.services;

import com.estudo.dslist.dto.GameListDTO;
import com.estudo.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
        var resultado = gameListRepository.findAll();
        return resultado.stream().map(GameListDTO::new).toList();
    }

}
