package com.ferumdriel.tddgame.environment.maps;

import com.ferumdriel.tddgame.entities.Entity;
import com.ferumdriel.tddgame.entities.supportive.Position;
import com.ferumdriel.tddgame.environment.TerrainType;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Binio on 2017-05-05.
 */
public class Map {
    private int[][] map;
    private int rows;
    private int columns;
    private ArrayList<Entity> activeEntities;

    private Map(MapBuilder mapBuilder){
        this.rows = mapBuilder.rows;
        this.columns = mapBuilder.columns;
        this.map = mapBuilder.map;
        activeEntities = new ArrayList<Entity>();
    }

    public int[][] getMap() {
        return map;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public ArrayList<Entity> getActiveEntities() {
        return activeEntities;
    }

    public Entity findPlayerOnList(Entity e){
        Entity tmp = null;
        for(Entity entities: activeEntities){
            if(entities == e) tmp = e;
        }
        return tmp;
    }

    public void showMap(){
        String s = "";
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                s+= map[i][j] + ",";
            }
            s+="\n";
        }
        System.out.println(s);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Map map1 = (Map) o;

        if (rows != map1.rows) return false;
        if (columns != map1.columns) return false;
        return Arrays.deepEquals(map, map1.map);
    }

    public static class MapBuilder implements MapBuilderInterface {
        private int[][] map;
        private int rows;
        private int columns;

        public MapBuilder(int rows, int columns){
            this.rows = rows;
            this.columns = columns;
            map = buildMap();
        }

        public MapBuilder rows(int rows){
            this.rows = rows;
            return this;
        }

        public MapBuilder columns(int columns){
            this.columns = columns;
            return this;
        }

        public MapBuilder map(int[][] map){
            this.map = map;
            return this;
        }

        public Map getMap() {
            return new Map(this);
        }

        public int[][] buildMap(){
            int rows = this.rows;
            int columns = this.columns;
            int[][] map = new int[rows][columns];
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++)
                    if(i==0 || i == rows-1){
                        map[i][j] = 0;
                    }else if(j == 0 || j == columns-1){
                        map[i][j] = 0;
                    }else{
                        map[i][j] = 1;
                    }
            }
            return map;
        }


    }

}
