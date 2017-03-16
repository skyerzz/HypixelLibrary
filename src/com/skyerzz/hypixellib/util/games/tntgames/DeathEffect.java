package com.skyerzz.hypixellib.util.games.tntgames;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum DEATHEFFECT {
    FIREWORK(   "Firework", 2000, RANK.VIP),
    CREEPER(    "Creeper",  4000, RANK.VIP),
    TNT(        "TNT",      6000, RANK.VIP_PLUS),
    WITHER(     "Wither",   6000, RANK.VIP_PLUS);

    private String displayName;
    private int cost;
    private RANK rankRequirement;

    DEATHEFFECT(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(DEATHEFFECT item: DEATHEFFECT.values()){
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
