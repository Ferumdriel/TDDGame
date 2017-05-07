package com.ferumdriel.tddgame.environment;

import com.ferumdriel.tddgame.entities.Entity;
import com.ferumdriel.tddgame.entities.supportive.Position;
import com.ferumdriel.tddgame.environment.maps.Map;
import org.junit.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Binio on 2017-05-07.
 */
public class WorldTest {
    ArrayList<Entity> activeEntities;
    Map map;
    World world;
    @Before
    public void setUp() throws Exception {
        map = new Map.MapBuilder(10,10).getMap();
        Position position = new Position(1,1);
        Entity e1 = new Entity("TestAndrzej", position, map);
        activeEntities = new ArrayList<Entity>();
        activeEntities.add(e1);
        world = new World(map,activeEntities);
    }

    @Test
    public void whenInstantiatedThenMapIsSet(){
        Assert.assertEquals(world.getMap(), map);
    }

    @Test
    public void whenInstantiatedThenActiveEntitiesAreSet(){
        Assert.assertEquals(world.getActiveEntities(), activeEntities);
    }

    @Test
    public void whenPlayerMovesToGoodFieldThenLetHimMove(){
//        Assert.assertEquals()
    }



}