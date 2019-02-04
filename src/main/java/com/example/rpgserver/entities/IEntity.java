package com.example.rpgserver.entities;

import com.example.rpgserver.entities.entityPosition.Position;

public interface IEntity {

    void setStartPosition(int posX, int posY);
    void editPosition(int posX, int posY);
    //Position getCurrentNoPosition();
}
