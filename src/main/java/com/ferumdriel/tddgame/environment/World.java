package com.ferumdriel.tddgame.environment;

import com.ferumdriel.tddgame.entities.Entity;
import com.ferumdriel.tddgame.environment.maps.Map;

import java.util.ArrayList;

/**
 * Created by Binio on 2017-05-07.
 */
public class World {
    Map map;
    ArrayList<Entity> activeEntities;

    public World(Map map, ArrayList<Entity> activeEntities){
        this.map = map;
        this.activeEntities = activeEntities;
    }

    public Map getMap() {
        return map;
    }

    public ArrayList<Entity> getActiveEntities() {
        return activeEntities;
    }

    public void update(){
        
    }
}
