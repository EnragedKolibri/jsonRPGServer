package com.example.rpgserver.controller;

import com.example.rpgserver.entities.gameField.GameField;
import com.example.rpgserver.entities.player.Player;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GameProcessController {

    private Map<Integer,Player> playerStorageMap = new HashMap<>();

    private GameField gameField = new GameField();

    private Integer playerId = 1;

    @PostMapping(value = "/connect", produces = "application/json")
    GameField startGame(Player player)
    {
        player.setId(playerId++);
        playerStorageMap.put(player.getId(),player);
        gameField.setPlayer(playerStorageMap.get(player.getId()));
        return gameField;
    }

    @PostMapping("/mooveUp")
    GameField mooveUp(Player player)
    {
        playerStorageMap.get(player.getId()).setPositionY(playerStorageMap.get(player.getId()).getPositionY()+1);
        gameField.setPlayer(playerStorageMap.get(player.getId()));
        return gameField;
    }

    /*@PostMapping("/mooveDown")
    GameField mooveDown()
    {

    }

    @PostMapping("/mooveLeft")
    GameField mooveLeft()
    {

    }

    @PostMapping("/mooveRight")
    GameField mooveRight()
    {

    }*/

    void updatePlayerOnGameField(Player player){
        gameField.setPlayer(playerStorageMap.get(player.getId()));
    }

}
