package com.example.rpgserver.controller;

import com.example.rpgserver.entities.gameField.GameField;
import com.example.rpgserver.entities.player.Player;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GameProcessController {

    private Map<Integer,Player> playerStorageMap = new HashMap<>();

    private GameField gameField = new GameField();

    private Integer playerId = 1;

    @PostMapping(value = "/connect", produces = "application/json")
    GameField startGame(@RequestBody Player player)
    {
        System.out.println("Player: " + player);
        player.setId(playerId++);
        player.setStartPosition(0,0);
        Integer id = player.getId();
        playerStorageMap.put(id,player);
        gameField.setPlayer(playerStorageMap.get(id));
        return gameField;
    }

    @PostMapping("/mooveUp")
    GameField mooveUp(@RequestBody Player player)
    {
        Player playerOnEdit = playerStorageMap.get(player.getId());
        playerOnEdit.setPositionY(playerOnEdit.getPositionY()+1);
        gameField.setPlayer(playerOnEdit);
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
