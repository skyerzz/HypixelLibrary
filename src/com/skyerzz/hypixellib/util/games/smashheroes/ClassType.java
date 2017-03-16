package com.skyerzz.hypixellib.util.games.smashheroes;


import java.util.ArrayList;

/**
 * Created by sky on 7-1-2017.
 */
public enum ClassType {
    RANGED("Ranged"),
    MELEE("Melee"),
    HYBRID("Hybrid");

    private String displayName;

    ClassType(String displayName){
        this.displayName = displayName;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(ClassType item: ClassType.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }
}
