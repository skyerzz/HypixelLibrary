package com.skyerzz.hypixellib.util.games.turbokartracers;

import com.skyerzz.hypixellib.util.Currency;
import com.skyerzz.hypixellib.util.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public enum Pants {
    NO_PANTS(       "No Pants", 0, Rank.NONE),
    GOLD_PANTS(     "Slothdinger Pants",    0,      Rank.NONE), //checked
    CHAIN_PANTS(    "Blushell Inc Pants",   2000,   Rank.VIP),      //checked
    IRON_PANTS(     "Sphax-corp Pants",     3000,   Rank.VIP_PLUS),
    DIAMOND_PANTS(  "Turbobrine Pants",     4000,   Rank.MVP),
    LEATHER_PANTS(  "Hypesweggen Pants",    5000,   Rank.MVP_PLUS);

    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Pants(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Pants item: Pants.values()){
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

    public Currency getCurrencyType(){
        return Currency.COINS;
    }

    public Rank getRankRequirement(){
        return rankRequirement;
    }
}
