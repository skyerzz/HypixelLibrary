package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum BARREL {
    SMALL_BALL("Small Barrel", 0, RANK.NONE),
    LARGE_BALL("Large Barrel", 9000, RANK.NONE),
    CREEPER("Creeper Barrel", 9000, RANK.VIP),
    BURST("Burst Barrel", 9000, RANK.VIP),
    STAR("Star Barrel", 9000, RANK.VIP_PLUS);

    private String displayName;
    private int cost;
    private RANK rankRequirement;

    BARREL(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(BARREL item: BARREL.values()){
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

    public CURRENCY getCurrencyType(){ return CURRENCY.COINS; }

    public RANK getRankRequirement(){
        return rankRequirement;
    }
}
