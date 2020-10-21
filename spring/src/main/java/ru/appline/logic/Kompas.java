package ru.appline.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Kompas implements Serializable {
    private static final Kompas instance = new Kompas();

    private final Map<String, String> kompas;

    public Kompas(){
        kompas = new HashMap<String, String>();
    }

    public static Kompas getInstance(){
        return instance;
    }

    public void add(String side, String range){
        kompas.put(side, range);
    }

    public int[] getRange(String side){
        String[] array = kompas.get(side).split("-");
        int[] sides = new int[2];
        sides[0] = Integer.parseInt(array[0]);
        sides[1] = Integer.parseInt(array[1]);
        return sides;
    }

    public Map<String, String> getAll(){
        return kompas;
    }
}
