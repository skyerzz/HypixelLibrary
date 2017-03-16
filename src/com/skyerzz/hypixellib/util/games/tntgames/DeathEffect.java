package com.skyerzz.hypixellib.util.games.tntgames;

import com.skyerzz.hypixellib.util.Currency;
import com.skyerzz.hypixellib.util.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum DeathEffect {
    FIREWORK(   "Firework", 2000, Rank.VIP),
    CREEPER(    "Creeper",  4000, Rank.VIP),
    TNT(        "TNT",      6000, Rank.VIP_PLUS),
    WITHER(     "Wither",   6000, Rank.VIP_PLUS);

    private String displayName;
    private int cost;
    private Rank rankRequirement;

    DeathEffect(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(DeathEffect item: DeathEffect.values()){
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
