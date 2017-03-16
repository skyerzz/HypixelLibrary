package com.skyerzz.hypixellib.util.games.skywars;

import java.util.ArrayList;

/**
 * Created by sky on 25-12-2016.
 */
public enum ProjectileTrail {
    VANILLA("Vanilla Trail"),
    HEARTS("Hearts Trail"),
    ENDER("Unknown"),
    MAGIC("Unknown"),
    BLOOD("Unknown"),
    GREEN_STAR("Unknown"),
    NOTES("Unknown"),
    SLIME("Unknown"),
    WHITE_SMOKE("Unknown"),
    FIRE("Unknown"),
    BLACK_SMOKE("Unknown");

    private String displayName;

    ProjectileTrail(String displayName){
        this.displayName = displayName;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(ProjectileTrail item: ProjectileTrail.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }
}
