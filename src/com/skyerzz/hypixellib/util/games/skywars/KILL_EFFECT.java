package com.skyerzz.hypixellib.util.games.skywars;

import java.util.ArrayList;

/**
 * Created by sky on 25-12-2016.
 */
public enum KILL_EFFECT {
    NONE("NONE"),
    EXPLOSION("Blood Explosion Kill Effect"), //double values idk why
    BLOOD_EXPLOSION("Blood Explosion Kill Effect");

    private String displayName;

    KILL_EFFECT(String displayName){
        this.displayName = displayName;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(KILL_EFFECT item: KILL_EFFECT.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }
}
