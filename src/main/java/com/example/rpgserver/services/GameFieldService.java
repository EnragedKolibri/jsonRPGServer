package com.example.rpgserver.services;

import com.example.rpgserver.entities.Entity;
import com.example.rpgserver.entities.gameField.GameField;
import com.example.rpgserver.entities.player.Player;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GameFieldService {

    @Autowired
    private GameField gameField;


    public void addPlayer(Player player) {
        //if (gameField.getEntity(id)!=null)
        gameField.addEntity(player);
    }

    public GameField getGameField()
    {
        return gameField;
    }
}
