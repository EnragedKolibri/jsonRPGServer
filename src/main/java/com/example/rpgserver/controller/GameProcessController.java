package com.example.rpgserver.controller;

import com.example.rpgserver.entities.gameField.GameField;
import com.example.rpgserver.entities.player.Player;
import com.example.rpgserver.services.GameFieldService;
import com.example.rpgserver.services.PlayerStorageService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class GameProcessController {

   @Autowired
   private PlayerStorageService playerStorageService;

   @Autowired
   private GameFieldService gameFieldService;

    @PostMapping(value = "/connect", produces = "application/json")
    public Player startGame(@RequestBody Player player) {
        log.info("Request on connection: Player: " + player);
        player.setId(1);
       gameFieldService.addPlayer(player);
       return player;
    }

    @PostMapping("/mooveUp")
    public GameField mooveUp(@RequestBody Player player)
    {
      //  System.out.println("Changed player position Y: " + playerStorageService.getPlayerById(player.getId()) +"Previouse position"+ playerStorageService.getPlayerById(player.getId()).getPosition().getY());
        Player playerOnEdit = playerStorageService.getPlayerById(player.getId());
        playerOnEdit.getPosition().setY(playerOnEdit.getPosition().getY()+1);
        gameFieldService.addPlayer(playerOnEdit);
        return gameFieldService.getGameField();
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


}
