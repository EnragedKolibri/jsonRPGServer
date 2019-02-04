package com.example.rpgserver.services;


import com.example.rpgserver.entities.player.Player;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PlayerStorageService {
    private Map<Integer,Player> playerStorageMap = new HashMap<>();

    public Player getPlayerById (Integer id)
    {
        return playerStorageMap.get(id);
    }
}
