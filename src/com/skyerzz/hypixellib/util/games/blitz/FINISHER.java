package com.skyerzz.hypixellib.util.games.blitz;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 19-11-2016.
 */
public enum FINISHER {
    BOOM("Boom", 20),
    LIGHTNING_STRIKES("Lightning strikes", 20),
    CREEPER_FIREWORK("Creeper firework", 20),
    INFESTATION("Infestation", 40),
    GRAVESTONE("Gravestone", 40),
    SQUID_MISSILE("Squid missile", 40),
    REKT_HOLOGRAM("#rekt hologram", 1000);

    private String displayName;
    private int cost;

    FINISHER(String displayName, int cost){
        this.displayName = displayName;
        this.cost = cost;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(FINISHER item: FINISHER.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getCost(){
        return cost;
    }

    public CURRENCY getCurrencyType(){ return CURRENCY.MYSTERY_DUST; }

    public RANKTYPE getRankRequirement(){
        return RANKTYPE.DEFAULT;
    }
}
