package com.ferumdriel.tddgame.entities.subentity;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by Binio on 2017-05-02.
 */
public class Position{
    private int x;
    private int y;

    public Position(int x, int y){
        setPosition(x,y);
    }

    public void move(String e){
        if(e.equals("w")){
            y--;
        }else if(e.equals("s")){
            y++;
        }else if(e.equals("a")){
            x--;
        }else if(e.equals("d")){
            x++;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Position copy(){
        return new Position(this.getX(),this.getY());
    }

}
