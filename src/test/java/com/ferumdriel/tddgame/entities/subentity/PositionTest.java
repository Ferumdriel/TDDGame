package com.ferumdriel.tddgame.entities.subentity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.event.KeyEvent;

/**
 * Created by Binio on 2017-05-02.
 */
public class PositionTest{
    private int x = 5;
    private int y = 6;
    private Position position;

    @Before
    public void setUp(){
        x = 5;
        y = 6;
        position = new Position(x,y);
    }

    @Test
    public void whenInstantiatedThenXIsSet(){
        Assert.assertEquals(position.getX(),x);
    }

    @Test
    public void whenInstantiatedThenYIsSet(){
        Assert.assertEquals(position.getY(),y);
    }

    @Test
    public void whenRightThenAddToX(){
        x++;
        String movement = "d"; //WSAD
        position.move(movement);
        Assert.assertEquals(position.getX(),x);
    }

}