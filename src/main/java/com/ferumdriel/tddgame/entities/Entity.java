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

    /**
     *
     * @param e - sequence of moves that entity will do (WSAD)
     */
    public void move(String e){
        for(int i = 0; i < e.length(); i++) {
            if (e.charAt(i) == 'w') {
                moveUp();
            } else if (e.charAt(i) == 's') {
                moveDown();
            } else if (e.charAt(i) == 'a') {
                moveLeft();
            } else if (e.charAt(i) == 'd') {
                moveRight();
            }
        }
    }

    public void moveRight(){
        position.moveRight();
    }

    public void moveLeft(){
        position.moveLeft();
    }

    public void moveUp(){
        position.moveUp();
    }

    public void moveDown(){
        position.moveDown();
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void sequenceCommand(String e){
        for(int i = 0; i < e.length(); i++) {
            if (e.charAt(i) == 'w') {
                moveUp();
            } else if (e.charAt(i) == 's') {
                moveDown();
            } else if (e.charAt(i) == 'a') {
                moveLeft();
            } else if (e.charAt(i) == 'd') {
                moveRight();
            }
        }
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
