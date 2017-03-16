package com.skyerzz.hypixellib.util.games.turbokartracers;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public enum JACKET {
    //TODO: check
    NO_JACKET(       "No jacket", 0, RANK.NONE),
    GOLD_JACKET(     "Slothdinger Pants",    0,      RANK.NONE), //checked
    CHAIN_JACKET(    "Blushell Inc Pants",   2000,   RANK.VIP),      //checked
    IRON_JACKET(     "Sphax-corp Pants",     3000,   RANK.VIP_PLUS),
    DIAMOND_JACKET(  "Turbobrine Pants",     4000,   RANK.MVP),
    LEATHER_JACKET(  "Hypesweggen Pants",    5000,   RANK.MVP_PLUS);

    private String displayName;
    private int cost;
    private RANK rankRequirement;

    JACKET(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(JACKET item: JACKET.values()){
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
