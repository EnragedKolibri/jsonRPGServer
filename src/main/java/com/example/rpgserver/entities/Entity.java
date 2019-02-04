package com.example.rpgserver.entities;

import com.example.rpgserver.entities.entityPosition.Position;
import lombok.Data;

@Data
public abstract class Entity implements IEntity
{

    private Integer id;
    private Position position;

    @Override
    public void setStartPosition(int posX, int posY) {
      this.position.setX(posX);
      this.position.setY(posY);
    }

    @Override
    public void editPosition(int posX, int posY) {
        this.position.setX(posX);
        this.position.setY(posY);
    }

    //На сколько сдвинуть
}
