package com.estudo.dslist.services;

import com.estudo.dslist.dto.GameMinDTO;
import com.estudo.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        var resultado = gameRepository.findAll();
        return resultado.stream().map(GameMinDTO::new).toList();
    }

}
