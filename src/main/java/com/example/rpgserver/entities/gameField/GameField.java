package com.example.rpgserver.entities.gameField;

import com.example.rpgserver.entities.Entity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GameField {
    private Map<Integer, Entity> entities = new HashMap<>();

    public Entity getEntity(Integer key){
        return entities.get(key);
    }

    public void addEntity(Entity entity){
        entities.put(entity.getId(), entity);
    }

    public void clear(){
        entities.clear();
    }
}
