package com.ferumdriel.parser;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Binio on 2017-05-07.
 */
public class JSONCreator {

        public static void createJsonFromObject(Object o, String path, String fileName){
            Gson gson = new Gson();
            try{
                FileWriter fileWriter = new FileWriter(path + fileName + ".json");
                gson.toJson(o, fileWriter);
                fileWriter.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        public static void main(String[] args){

        }
    }
