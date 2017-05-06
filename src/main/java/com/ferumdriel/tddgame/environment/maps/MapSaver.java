package com.ferumdriel.tddgame.environment.maps;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Binio on 2017-05-05.
 */
public class MapSaver {
    public static String dirPath = "src/main/resources/maps/";
//    public static String dirTest = MapSaver.class.getClassLoader().getResource(dirPath).getPath();

    public static void saveMap(Map map, String name) {
        MapSaverHelper mapSaverHelper = new MapSaverHelper();
        mapSaverHelper.saveMap(map, name);
    }

    private static class MapSaverHelper {
        void saveMap(Map map, String name) {
        ClassLoader classLoader = getClass().getClassLoader();
            try {
                File dir = new File(dirPath);
                dir.mkdirs();
                File file = new File(getClass().getResource(name + ".txt").getFile());
                FileWriter writer = new FileWriter(file);
                writer.write(prepareMapToString(map));
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }catch (NullPointerException e){
                e.printStackTrace();
            }
        }
    }

    private static String prepareMapToString(Map map){
        String s = "";
        for(int i = 0; i < map.getRows(); i++){
            for(int j = 0; j < map.getColumns(); j++){
                s+= map.getMap()[i][j] + ",";
            }
            s+="\n";
        }
        return s;
    }

    public static void main(String[] args){
//        Map map = new Map(10,10);
//        MapSaver.saveMap(map,"testowe");
    }
}
