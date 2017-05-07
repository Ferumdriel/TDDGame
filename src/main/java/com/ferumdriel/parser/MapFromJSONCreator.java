package com.ferumdriel.parser;

import com.ferumdriel.tddgame.environment.maps.Map;
import com.ferumdriel.tddgame.environment.maps.MapSaver;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Binio on 2017-05-07.
 */
public class MapFromJSONCreator {

    public static Map createMapFromJSON(String fileName){
        Map tmp;
//        Type genericType = new TypeToken<T>(){}.getType();
//        Class genericClass = new TypeToken<T>(){}.getClass();
        try {
            FileReader fileReader = new FileReader(MapSaver.dirPath + fileName + ".json");
            Gson gson = new Gson();
            tmp = gson.fromJson(fileReader, Map.class);
            return tmp;
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args){
        Map map = createMapFromJSON("testowe");
        map.showMap();
    }
}
