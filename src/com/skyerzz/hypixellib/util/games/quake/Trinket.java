package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.Currency;
import com.skyerzz.hypixellib.util.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum Trinket {
    COMPASS("Tracking Device", 2000, Rank.NONE),
    COLD_WAR("Map: Cold War", 10, Rank.NONE);


    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Trinket(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Trinket item: Trinket.values()){
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

    public Currency getCurrencyType(){ return Currency.COINS; }

    public Rank getRankRequirement(){
        return rankRequirement;
    }
}
