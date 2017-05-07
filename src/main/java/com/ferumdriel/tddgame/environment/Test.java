package com.ferumdriel.tddgame.environment;

import com.ferumdriel.tddgame.entities.Entity;
import com.ferumdriel.tddgame.entities.supportive.Position;
import com.ferumdriel.tddgame.environment.maps.Map;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Binio on 2017-05-05.
 */
public class Test {
    String name;
    public Test(String name){
        this.name = name;
    }

    public void write(){
        try {
            String path = this.getClass().getResource("/jajko.txt").getFile();
            File file = new File(path);
            file.mkdirs();
            PrintWriter writer =
                    new PrintWriter(
                            file);
            writer.write("Probny tekst");
            writer.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void read(){
        try {
            InputStreamReader isReader =
                    new InputStreamReader(
                            this.getClass().getResourceAsStream("/jajko.txt"));
            BufferedReader br = new BufferedReader(isReader);

            System.out.println(br.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        ArrayList<Entity> testowa = new ArrayList<Entity>();
        System.out.println(testowa.isEmpty());
//        String s = "test";
//        Position pos = new Position(1,1);
//        Entity e = new Entity(s, pos);
//        Entity e1 = e.copy();
//        e.setName("jebaited");
//        System.out.println(e.getName());
//        System.out.println(e1.getName());
//        String p = s;
//        p = "bum";
//        System.out.println(s + p);

//        Map.MapBuilder builder = new Map.MapBuilder(5,10);
//        Map map = builder.getMap();
//        map.showMap();

//        Test test = new Test("kajak");
//        test.read();
//        test.write();
//        test.read();
    }

}
