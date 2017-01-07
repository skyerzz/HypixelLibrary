package com.skyerzz.hypixellib.util.games.smashheroes;


import java.util.ArrayList;

/**
 * Created by sky on 7-1-2017.
 */
public enum CLASSTYPE {
    RANGED("Ranged"),
    MELEE("Melee"),
    HYBRID("Hybrid");

    private String displayName;

    CLASSTYPE(String displayName){
        this.displayName = displayName;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(CLASSTYPE item: CLASSTYPE.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }
}
