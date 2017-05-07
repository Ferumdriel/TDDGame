package com.ferumdriel.tddgame.entities;

import com.ferumdriel.tddgame.entities.supportive.Position;
import com.ferumdriel.tddgame.environment.TerrainType;
import com.ferumdriel.tddgame.environment.maps.Map;
import com.ferumdriel.tddgame.input.KeyManager;

/**
 * Created by Binio on 2017-05-02.
 */
public class Entity{
    String name;
    Position position;
    private int yMove;
    private int xMove;
    KeyManager keyManager;
    Map map;

    public Entity(String name, Position position, Map map){
        this.name = name;
        this.position = position;
        yMove = 0;
        xMove = 0;
        keyManager = new KeyManager();
        this.map = map;
    }

    public void loadMap(Map map){
        this.map = map;
    }

    private void showCurrentPosition(){
        System.out.println("Current position: " + position);
    }

    public void move(){
//        map.moveEntity(this,getInput());
        showCurrentPosition();
    }

    public void getInput(){
        if(keyManager.up){moveUp();}
        if(keyManager.down){moveDown();}
        if(keyManager.left){moveLeft();}
        if(keyManager.right){moveRight();}

    }

    public void moveRight(){
        Position tmp = position.copy();
        tmp.moveRight();
        correctPosition(tmp);
    }

    public void moveLeft(){
        Position tmp = position.copy();
        tmp.moveLeft();
        correctPosition(tmp);
    }

    public void moveUp(){
        Position tmp = position.copy();
        tmp.moveUp();
        correctPosition(tmp);
    }

    public void moveDown(){
        Position tmp = position.copy();
        tmp.moveDown();
        correctPosition(tmp);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    /**
     *
     * @param e - sequence of moves that entity will do (WSAD)
     */
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
            showCurrentPosition();
        }
    }

    private void correctPosition(Position pos){
        if(map.getMap()[pos.getX()][pos.getY()]!= TerrainType.ROCK.getType()){
            setPosition(pos);
        }else{
            System.out.println("Met obstacle");
        }
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Entity copy(){
        return new Entity(name, position.copy(), map);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void tick(){

    }

    public static void main(String[] args){
        Map map = new Map.MapBuilder(10,10).getMap();
        Entity e1 = new Entity("Jan", new Position(1,1), map);
        e1.loadMap(map);
        int k = 0;

    }
}
