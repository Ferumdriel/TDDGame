package com.ferumdriel.tddgame.entities;

import com.ferumdriel.tddgame.entities.subentity.Position;

/**
 * Created by Binio on 2017-05-02.
 */
public class Entity {
    String name;
    Position position;

    public Entity(String name, Position position){
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
