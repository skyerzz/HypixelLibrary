package com.skyerzz.hypixellib.util.games.copsandcrims;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 10-8-2016.
 */
public enum KnifeSkin {
    KNIFE(                  "Knife",                    0,   Rank.NONE),
    COMBAT_SHOVEL(          "Combat Shovel",            200, Rank.VIP),
    KUKRI(                  "Kukri",                    200, Rank.VIP_PLUS),
    TRENCH_KNIFE(           "Trench Knife",             200, Rank.MVP),
    DIVING_KNIFE(           "Diviing Knife",            200, Rank.MVP),
    NECK_KNIFE(             "Neck Knife",               200, Rank.MVP),
    TACTICAL_TOMAHAWK(      "Tactical Tomahawk",        200, Rank.MVP_PLUS),
    BOWIE_KNIFE(            "Bowie Knife",              200, Rank.MVP_PLUS),
    ENCHANTED_BOWIE_KNIFE(  "Enchanted Bowie Knife",    200, Rank.MVP_PLUS);

    private int cost;
    private String displayName;
    private Rank rankRequirement;

    KnifeSkin(String displayName, int cost, Rank rankRequirement){
        this.cost = cost;
        this.displayName = displayName;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(KnifeSkin item: KnifeSkin.values()){
            list.add(item.name());
        }
        return list;
    }


    public int getCost() {
        return cost;
    }

    public Rank getRankRequirement() {
        return rankRequirement;
    }

    public Currency getCurrency() { return Currency.COINS; }

    public String getDisplayName() {return displayName;}
}
