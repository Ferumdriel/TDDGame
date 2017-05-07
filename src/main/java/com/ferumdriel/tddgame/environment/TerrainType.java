package com.ferumdriel.tddgame.environment;

/**
 * Created by Binio on 2017-05-07.
 */
public enum TerrainType {
    ROCK(0), GRASS(1);

    private final int type;

    TerrainType(int type){
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
