package com.skyerzz.hypixellib.util.games.turbokartracers;

import com.skyerzz.hypixellib.util.Currency;
import com.skyerzz.hypixellib.util.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public enum ParticleTrail {
    //TODO: check
    RAINBOWZ(       "Rainbowz Trail",       21000,  Rank.VIP),
    RED_DUST(       "Red Dust Trail",       1000,   Rank.VIP),
    HEARTS(         "Hearts Trail",         3000,   Rank.VIP),     //checked
    GREEN_MAGIC(    "Green Magic Trail",    2500,   Rank.VIP),
    PURPLE_MAGIC(   "Purple Magic Trail",   2500,   Rank.VIP),
    FLAMES(         "Flames Trail",         5000,   Rank.VIP),
    SLIME(          "Slime Trail",          5000,   Rank.VIP),
    LAVA_BURST(     "Lava Burst Trail",     17000,  Rank.VIP),
    DARK_SMOKE(     "Dark Smoke Trail",     3500,   Rank.VIP);

    private String displayName;
    private int cost;
    private Rank rankRequirement;

    ParticleTrail(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(ParticleTrail item: ParticleTrail.values()){
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
