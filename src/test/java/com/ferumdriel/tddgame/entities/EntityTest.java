package com.ferumdriel.tddgame.entities;

import com.ferumdriel.tddgame.entities.subentity.Position;
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
    @Before
    public void setUp() {
        position = new Position(1,1);
        expName = "Bogdan";
        entity = new Entity(expName, position);
    }

    @Test
    public void whenInstantiatedThenNameIsSet(){
        Assert.assertEquals(entity.getName(), expName);
    }

    @Test
    public void whenInstantiatedThenPositionIsSet(){
        Assert.assertEquals(entity.getPosition(), position);
    }

    @Test
    public void whenRightThenGoRight(){
        Position expected = position.copy();
        expected.moveRight();
        entity.moveRight();
        Assert.assertEquals(entity.getPosition(),expected);
    }
    @Test
    public void whenLeftThenGoLeft(){
        Position expected = position.copy();
        expected.moveLeft();
        entity.moveLeft();
        Assert.assertEquals(entity.getPosition(),expected);
    }
    @Test
    public void whenUpThenGoUp(){
        Position expected = position.copy();
        expected.moveUp();
        entity.moveUp();
        Assert.assertEquals(entity.getPosition(),expected);
    }
    @Test
    public void whenDownThenGoDown(){
        Position expected = position.copy();
        expected.moveDown();
        entity.moveDown();
        Assert.assertEquals(entity.getPosition(),expected);
    }
    @Test
    public void whenReceiveCommandsThenAllAreExecuted(){
        Position expected = position.copy();
        expected.moveRight();
        expected.moveRight();
        expected.moveUp();
        expected.moveUp();
        entity.sequenceCommand("ddww");
        Assert.assertEquals(entity.getPosition(),expected);
    }
}