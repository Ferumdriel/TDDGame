package com.ferumdriel.tddgame;

/**
 * Created by Binio on 2017-05-07.
 */
public enum Movement {
    UP(1),
    DOWN(2),
    LEFT(3),
    RIGHT(4);

    private final int value;

    Movement(int number){
        value = number;
    }

    public int getValue() {
        return value;
    }
}
