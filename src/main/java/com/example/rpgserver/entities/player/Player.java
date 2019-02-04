package com.example.rpgserver.entities.player;

import com.example.rpgserver.entities.Entity;
import com.example.rpgserver.entities.inventory.Inventory;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Player extends Entity {

    @JsonProperty("name")
    String name;
    Integer id;
    //Inventory inventory;

    @Override
    public void editPosition(int posX, int posY) {
        this.setPositionX(posX);
        this.setPositionY(posY);
    }
}
