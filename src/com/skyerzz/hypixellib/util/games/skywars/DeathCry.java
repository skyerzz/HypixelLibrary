package com.skyerzz.hypixellib.util.games.skywars;

import java.util.ArrayList;

/**
 * Created by sky on 25-12-2016.
 */
public enum DEATH_CRY {
    NONE("NONE"),
    SAD_PUPPY("UNUSED - Sad Puppy"),
    QUAKECRAFT("UNUSED - Quakecraft");

    private String displayName;

    DEATH_CRY(String displayName){
        this.displayName = displayName;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(DEATH_CRY item: DEATH_CRY.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }
}
