package com.skyerzz.hypixellib.util.games.turbokartracers;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public enum Shoes {
    NO_SHOES(       "No shoes", 0, Rank.NONE),
    GOLD_SHOES(     "Slothdinger Pants",    0,      Rank.NONE), //checked
    CHAIN_SHOES(    "Blushell Inc Pants",   2000,   Rank.VIP),      //checked
    IRON_SHOES(     "Sphax-corp Pants",     3000,   Rank.VIP_PLUS),
    DIAMOND_SHOES(  "Turbobrine Pants",     4000,   Rank.MVP),
    LEATHER_SHOES(  "Hypesweggen Pants",    5000,   Rank.MVP_PLUS);

    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Shoes(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Shoes item: Shoes.values()){
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
