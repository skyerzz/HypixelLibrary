package com.skyerzz.hypixellib.util.games.turbokartracers;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public enum PARTICLETRAIL {
    //TODO: check
    RAINBOWZ(       "Rainbowz Trail",       21000,  RANK.VIP),
    RED_DUST(       "Red Dust Trail",       1000,   RANK.VIP),
    HEARTS(         "Hearts Trail",         3000,   RANK.VIP),     //checked
    GREEN_MAGIC(    "Green Magic Trail",    2500,   RANK.VIP),
    PURPLE_MAGIC(   "Purple Magic Trail",   2500,   RANK.VIP),
    FLAMES(         "Flames Trail",         5000,   RANK.VIP),
    SLIME(          "Slime Trail",          5000,   RANK.VIP),
    LAVA_BURST(     "Lava Burst Trail",     17000,  RANK.VIP),
    DARK_SMOKE(     "Dark Smoke Trail",     3500,   RANK.VIP);

    private String displayName;
    private int cost;
    private RANK rankRequirement;

    PARTICLETRAIL(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(PARTICLETRAIL item: PARTICLETRAIL.values()){
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

    public CURRENCY getCurrencyType(){
        return CURRENCY.COINS;
    }

    public RANK getRankRequirement(){
        return rankRequirement;
    }
}
