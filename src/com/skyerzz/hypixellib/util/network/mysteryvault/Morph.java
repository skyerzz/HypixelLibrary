package com.skyerzz.hypixellib.util.network.mysteryvault;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 17/03/2017.
 */
public enum Morph {
    ;

    private String displayName;
    private Rarity rarity;

    Morph(String displayName, Rarity rarity){
        this.displayName = displayName;
        this.rarity = rarity;
    }

    public String getDisplayName(){
        return displayName;
    }

    public Rarity getRarity(){
        return rarity;
    }


    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Morph item: Morph.values()){
            list.add(item.name());
        }
        return list;
    }
}
