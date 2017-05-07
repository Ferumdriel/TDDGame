package com.ferumdriel.tddgame;

import com.ferumdriel.tddgame.entities.Entity;
import com.ferumdriel.tddgame.entities.supportive.Position;
import com.ferumdriel.tddgame.environment.maps.Map;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Binio on 2017-05-07.
 */
public class GameTest {
    private Game game;
    private Map map;
    private Entity e1;

    @Before
    public void setUp(){
        map = new Map.MapBuilder(10,10).getMap();
        Position position = new Position(5,5);
        e1 = new Entity("Adam", position, map);
        game = new Game(map);
    }

    @Test
    public void whenInstantiatedThenMapIsSet(){
        Assert.assertEquals(map, game.getMap());
    }
    @Test
    public void whenInstantiatedThenEntitiesListIsEmpty(){
        Assert.assertEquals(true,game.getActiveEntities().isEmpty());
    }
    @Test
    public void whenAddsNewEntityItExistsOnTheActiveEntitiesList(){
        game.getActiveEntities().add(e1);
        Assert.assertEquals(e1,game.getActiveEntities().get(0));
    }

}