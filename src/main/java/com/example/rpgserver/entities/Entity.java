package com.example.rpgserver.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public abstract class Entity implements IEntity
{

    private Integer positionX;
    private Integer positionY;


    @Override
    public void setStartPosition(int posX, int posY) {
        this.positionX = posX;
        this.positionY = posY;
    }
}
