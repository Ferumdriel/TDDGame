package com.ferumdriel.tddgame.entities.supportive;


/**
 * Created by Binio on 2017-05-02.
 */
public class Position{
    private int x;
    private int y;

    public Position(int x, int y){
        setPosition(x,y);
    }



    public Position moveRight(){
        return new Position(x++,y);
    }

    public Position moveLeft(){
        return new Position(x--,y);
    }

    public Position moveUp(){
        return new Position(x,y--);
    }

    public Position moveDown(){
        return new Position(x,y++);
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

    public String toString(){
        return "x=" + x + ", y=" + y;
    }

    public Position copy(){
        return new Position(this.getX(),this.getY());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Position position = (Position) obj;
        if(getX() != position.getX()) return false;
        if(getY() != position.getY()) return false;
        return true;
    }
}
