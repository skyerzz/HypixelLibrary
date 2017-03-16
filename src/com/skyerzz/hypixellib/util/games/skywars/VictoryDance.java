package com.skyerzz.hypixellib.util.games.skywars;

import java.util.ArrayList;

/**
 * Created by sky on 25-12-2016.
 */
public enum VictoryDance {
    FIREWORKS("Fireworks Victory Dance"),
    DRAGON_RIDER("Dragon Rider Victory Dance"),
    GUARDIANS("Guardians Victory Dance");

    private String displayName;

    VictoryDance(String displayName){
        this.displayName = displayName;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(VictoryDance item: VictoryDance.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }
}
