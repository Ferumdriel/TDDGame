package com.ferumdriel.tddgame.environment.maps;

import com.ferumdriel.tddgame.entities.Entity;
import com.ferumdriel.tddgame.entities.supportive.Position;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Binio on 2017-05-07.
 */
public class MapTest {
    private Map map;
    private final int rows = 10;
    private final int columns = 10;
    private int[][] expected;
    private ArrayList<Entity> activeEntities;
    private Entity e1;

    @Before
    public void setUp(){
        expected = new Map.MapBuilder(rows,columns).buildMap();
        map = new Map.MapBuilder(rows,columns).getMap();
        Position position = new Position(1,1);
        e1 = new Entity("TestAndrzej", position, map);
        activeEntities = new ArrayList<Entity>();
        activeEntities.add(e1);
        map.getActiveEntities().add(e1);
    }

    @Test
    public void whenInstantiatedThenXRangeIsSet(){
        Assert.assertEquals(map.getRows(), rows);
    }

    @Test
    public void whenInstantiatedThenYRangeIsSet(){
        Assert.assertEquals(map.getColumns(), columns);
    }

    @Test
    public void whenInstantiatedThenMapIsSet(){
        Assert.assertArrayEquals(map.getMap(),expected);
    }

    @Test
    public void whenNewActivePlayerAppearsThenHeIsAddedToList(){
        Assert.assertEquals(map.getActiveEntities().get(0),e1);
    }

    @Test
    public void whenNearBorderThenFindObstacle(){
        Assert.assertArrayEquals(arrayOnlyFromBorders(map.getMap()),arrayOnlyFromBorders(expected));
    }

    private int[] arrayOnlyFromBorders(int[][] array){
        int[] tmp = new int[2* columns + 2*(rows -2)];
        int k = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(i == 0 || i == rows-1 || j == 0 || j == columns-1){
                    tmp[k++] = array[i][j];
                }
            }
        }
        return tmp;
    }



}