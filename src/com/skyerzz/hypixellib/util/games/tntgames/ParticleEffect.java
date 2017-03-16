package com.skyerzz.hypixellib.util.games.tntgames;


import com.skyerzz.hypixellib.util.Currency;
import com.skyerzz.hypixellib.util.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 21-7-2016.
 */
public enum ParticleEffect {
    SLIME(  "Slime",    10000, Rank.VIP),
    WATER(  "Water",    10000, Rank.VIP),
    LAVA(   "Lava",     10000, Rank.VIP),
    FLAME(  "Flame",    10000, Rank.VIP_PLUS),
    ENDER(  "Ender",    10000, Rank.VIP_PLUS);


    private String displayName;
    private int cost;
    private Rank rankRequirement;

    ParticleEffect(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(ParticleEffect item: ParticleEffect.values()){
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
