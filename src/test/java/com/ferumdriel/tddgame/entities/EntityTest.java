package com.ferumdriel.tddgame.entities;

import com.ferumdriel.tddgame.entities.supportive.Position;
import com.ferumdriel.tddgame.environment.maps.Map;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Binio on 2017-05-02.
 */
public class EntityTest {

    private Entity entity;
    private String expName;
    private Position position;
    Map map;
    @Before
    public void setUp() {
        map = new Map.MapBuilder(10,10).getMap();
        position = new Position(5,5);
        expName = "Bogdan";
        entity = new Entity(expName, position, map);
    }

    @Test
    public void whenInstantiatedThenNameIsSet(){
        Assert.assertEquals(expName,entity.getName());
    }

    @Test
    public void whenInstantiatedThenPositionIsSet(){
        Assert.assertEquals(position,entity.getPosition());
    }

    @Test
    public void whenRightThenGoRight(){
        Position expected = position.copy();
        expected.moveRight();
        entity.moveRight();
        Assert.assertEquals(expected,entity.getPosition());
    }
    @Test
    public void whenLeftThenGoLeft(){
        Position expected = position.copy();
        expected.moveLeft();
        entity.moveLeft();
        Assert.assertEquals(expected,entity.getPosition());
    }
    @Test
    public void whenUpThenGoUp(){
        Position expected = position.copy();
        expected.moveUp();
        entity.moveUp();
        Assert.assertEquals(expected,entity.getPosition());
    }
    @Test
    public void whenDownThenGoDown(){
        Position expected = position.copy();
        expected.moveDown();
        entity.moveDown();
        Assert.assertEquals(expected,entity.getPosition());
    }
    @Test
    public void whenReceiveCommandsThenAllAreExecuted(){
        Position expected = position.copy();
        expected.moveRight();
        expected.moveRight();
        expected.moveUp();
        expected.moveUp();
        entity.sequenceCommand("ddww");
        Assert.assertEquals(expected,entity.getPosition());
    }
    @Test
    public void whenEntityHitsObstacleThenStay(){
        Position positionNearObstacle = new Position(5,1);
        entity.sequenceCommand("wwwww");
        Assert.assertEquals(positionNearObstacle,entity.getPosition());
    }
}