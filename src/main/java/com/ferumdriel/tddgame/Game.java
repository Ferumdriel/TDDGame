package com.ferumdriel.tddgame;

import com.ferumdriel.parser.MapFromJSONCreator;
import com.ferumdriel.tddgame.entities.Entity;
import com.ferumdriel.tddgame.entities.supportive.Position;
import com.ferumdriel.tddgame.environment.maps.Map;

import java.util.ArrayList;

/**
 * Created by Binio on 2017-05-07.
 */
public class Game implements Runnable{

    private Map map;
    private ArrayList<Entity> activeEntities;
    private Entity activeEntity;

    public Game(Map map){
        this.map = map;
        activeEntities = new ArrayList<Entity>();
    }

    public static void main(String[] args){
        Map map = MapFromJSONCreator.createMapFromJSON("testowe");
        Game game = new Game(map);
        Entity e1 = new Entity("Testowy", new Position(5,5), map);
        game.addEntity(e1);
        game.setActiveEntity(e1);
        game.activeEntity.sequenceCommand("wwwwwwwssssdawsd");
    }

    public void setActiveEntity(Entity e){
        activeEntity = e;
    }

    public void addEntity(Entity e){
        activeEntities.add(e);
    }

    public Map getMap() {
        return map;
    }

    public ArrayList<Entity> getActiveEntities() {
        return activeEntities;
    }

    private boolean running;

    public void tick(){

    }

    public void init(){

    }



    public void run() {
        init();

        int fps = 60;
        double timePerTick = Math.pow(10,9)/fps;

        while(running){
            tick();
        }
        stop();
    }

    public synchronized void start(){
        if(running) return;


    }

    public synchronized void stop(){
        if(running) return;


    }
}
