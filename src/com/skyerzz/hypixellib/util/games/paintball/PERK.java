package com.skyerzz.hypixellib.util.games.paintball;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 21-7-2016.
 */
public enum PERK {
    GODFATHER("Godfather", 5000, 50, RANKTYPE.DEFAULT),
    ENDURANCE("Endurance", 7500, 50, RANKTYPE.DEFAULT),
    SUPERLUCK("Superluck", 250, 20, RANKTYPE.DEFAULT),
    FORTUNE("Fortune", 1000, 20, RANKTYPE.DEFAULT),
    ADRENALINE("Adrenaline", 1000, 10, RANKTYPE.DEFAULT),
    TRANSFUSION("Transfusion", 100, 10, RANKTYPE.DEFAULT), //TODO: check if coins leveling linear
    HEADSTART("Headstart", 10000, 5, RANKTYPE.DEFAULT); //TODO: check up if max value here is correct. Also check coins leveling linear?

    private String displayName;
    private int maxLevel;
    private int cost;
    private RANKTYPE rankRequirement;

    PERK(String displayName, int cost, int maxLevel, RANKTYPE rankRequirement){
        this.displayName = displayName;
        this.maxLevel = maxLevel;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(PERK item: PERK.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getCost(int level){
        if(level > maxLevel || level < 1){
            return 0;
        }
        return level*cost;
    }

    public CURRENCY getCurrencyType(){ return CURRENCY.COINS; }

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }

    public int getMaxLevel() { return maxLevel; }
}
