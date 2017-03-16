package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.Currency;
import com.skyerzz.hypixellib.util.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum Barrel {
    SMALL_BALL("Small Barrel", 0, Rank.NONE),
    LARGE_BALL("Large Barrel", 9000, Rank.NONE),
    CREEPER("Creeper Barrel", 9000, Rank.VIP),
    BURST("Burst Barrel", 9000, Rank.VIP),
    STAR("Star Barrel", 9000, Rank.VIP_PLUS);

    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Barrel(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Barrel item: Barrel.values()){
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
