package com.ferumdriel.tddgame.environment.maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Binio on 2017-05-07.
 */
public class MapLoader {
    public static String dirPath = MapSaver.dirPath;

    public static Map loadMap(String name){
        try {
            FileReader reader = new FileReader(new File(dirPath + "name"));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

    private static void generateMapFromFile(){

    }
}
