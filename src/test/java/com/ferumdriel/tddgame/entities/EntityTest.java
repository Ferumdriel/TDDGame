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
    private Position expPosition;
    @Before
    public void setUp() {
        expPosition = new Position(1,1);
        expName = "Bogdan";
        entity = new Entity(expName, expPosition);
    }

    @Test
    public void whenInstantiatedThenNameIsSet(){
        Assert.assertEquals(entity.getName(), expName);
    }

    @Test
    public void whenInstantiatedThenPositionIsSet(){
        Assert.assertEquals(entity.getPosition(), expPosition);
    }

    @Test
    public void whenRightThenGoRight(){

    }
}