package com.skyerzz.hypixellib.util.games.prototype;

import com.skyerzz.hypixellib.util.games.quake.BARREL;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 27/02/2017.
 */
public enum GAMETYPE {
    DUELS("Duels", true),
    UHC_DEATHMATCH("UHC Deathmatch", true),
    MURDER_MYSTERY("Murder Mystery", true),
    BED_WARS("Bed Wars", true);

    private boolean available;
    private String name;

    GAMETYPE(String name, boolean available){
        this.name = name;
        this.available = available;
    }

    private boolean isAvailable(){ return available;}

    private String getName(){ return name; }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(GAMETYPE item: GAMETYPE.values()){
            list.add(item.name());
        }
        return list;
    }
}
