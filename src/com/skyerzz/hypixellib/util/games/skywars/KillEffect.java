package com.skyerzz.hypixellib.util.games.skywars;

import java.util.ArrayList;

/**
 * Created by sky on 25-12-2016.
 */
public enum KillEffect {
    NONE("NONE"),
    EXPLOSION("Blood Explosion Kill Effect"), //double values idk why
    BLOOD_EXPLOSION("Blood Explosion Kill Effect");

    private String displayName;

    KillEffect(String displayName){
        this.displayName = displayName;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(KillEffect item: KillEffect.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }
}
