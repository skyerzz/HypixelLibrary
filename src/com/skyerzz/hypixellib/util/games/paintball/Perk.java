package com.skyerzz.hypixellib.util.games.paintball;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 21-7-2016.
 */
public enum Perk {
    GODFATHER("Godfather", 5000, 50, Rank.NONE),
    ENDURANCE("Endurance", 7500, 50, Rank.NONE),
    SUPERLUCK("Superluck", 250, 20, Rank.NONE),
    FORTUNE("Fortune", 1000, 20, Rank.NONE),
    ADRENALINE("Adrenaline", 1000, 10, Rank.NONE),
    TRANSFUSION("Transfusion", 100, 10, Rank.NONE), //TODO: check if coins leveling linear
    HEADSTART("Headstart", 10000, 5, Rank.NONE); //TODO: check up if max value here is correct. Also check coins leveling linear?

    private String displayName;
    private int maxLevel;
    private int cost;
    private Rank rankRequirement;

    Perk(String displayName, int cost, int maxLevel, Rank rankRequirement){
        this.displayName = displayName;
        this.maxLevel = maxLevel;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Perk item: Perk.values()){
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

    public Currency getCurrencyType(){ return Currency.COINS; }

    public Rank getRankRequirement(){
        return rankRequirement;
    }

    public int getMaxLevel() { return maxLevel; }
}
