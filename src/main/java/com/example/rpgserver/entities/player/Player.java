package com.example.rpgserver.entities.player;

import com.example.rpgserver.entities.Entity;
import com.example.rpgserver.entities.inventory.Inventory;
import lombok.Data;

@Data
public class Player extends Entity {

    Integer id;
    Inventory inventory;

    @Override
    public void editPosition(int posX, int posY) {
        this.setPositionX(posX);
        this.setPositionY(posY);
    }
}
