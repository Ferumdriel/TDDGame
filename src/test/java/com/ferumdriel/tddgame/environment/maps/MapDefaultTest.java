package com.ferumdriel.tddgame.environment.maps;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Binio on 2017-05-05.
 */
public class MapDefaultTest {
//    private MapDefault map;
//    private final int rows = 10;
//    private final int columns = 10;
//    private int[][] expected;
//    @Before
//    public void setUp(){
//        expected = generateMap();
//        map = new MapDefault(rows, columns);
//    }
//
//    private int[][] generateMap(){
//        int[][] expected = new int[rows][columns];
//        for(int i = 0; i < rows; i++){
//            for(int j = 0; j < columns; j++)
//                if(i==0 || i == rows -1){
//                    expected[i][j] = 0;
//                }
//                else if(j == 0 || j == columns -1){
//                    expected[i][j] = 0;
//                }
//        }
//        return expected;
//    }
//
//    @Test
//    public void whenInstantiatedThenXRangeIsSet(){
//        Assert.assertEquals(map.getRows(), rows);
//    }
//
//    @Test
//    public void whenInstantiatedThenYRangeIsSet(){
//        Assert.assertEquals(map.getColumns(), columns);
//    }
//
//    @Test
//    public void whenInstantiatedThenMapIsSet(){
//        Assert.assertArrayEquals(map.getMap(),expected);
//    }
//
//    @Test
//    public void whenNearBorderThenFindObstacle(){
//        Assert.assertArrayEquals(arrayOnlyFromBorders(map.getMap()),arrayOnlyFromBorders(expected));
//    }
//
//    private int[] arrayOnlyFromBorders(int[][] array){
//        int[] tmp = new int[2* columns + 2*(rows -2)];
//        int k = 0;
//        for(int i = 0; i < rows; i++){
//            for(int j = 0; j < columns; j++){
//                if(i == 0 || i == rows-1 || j == 0 || j == columns-1){
//                    tmp[k++] = array[i][j];
//                }
//            }
//        }
//        return tmp;
//    }
}