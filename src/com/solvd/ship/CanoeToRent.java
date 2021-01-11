package com.solvd.ship;

import java.util.HashMap;
import java.util.Map;

public class CanoeToRent {
    HashMap<String, Canoe> listOfCanoeToRent = new HashMap<>();

    public void addCanoe(String pier, Canoe canoe){
        listOfCanoeToRent.put(pier, canoe);
    }

    public HashMap<String, Canoe> getListOfCanoe(){
        return listOfCanoeToRent;
    }

    public void printEveryCanoeToRent() {
        for (HashMap.Entry<String, Canoe> entry : listOfCanoeToRent.entrySet()) {
            String pier = entry.getKey();
            Canoe canoe = entry.getValue();
            System.out.println(pier);
            canoe.printFields();
        }
    }
}
