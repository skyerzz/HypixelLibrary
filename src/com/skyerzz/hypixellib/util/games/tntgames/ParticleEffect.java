package com.skyerzz.hypixellib.util.games.tntgames;


import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 21-7-2016.
 */
public enum PARTICLEEFFECT {
    SLIME(  "Slime",    10000, RANK.VIP),
    WATER(  "Water",    10000, RANK.VIP),
    LAVA(   "Lava",     10000, RANK.VIP),
    FLAME(  "Flame",    10000, RANK.VIP_PLUS),
    ENDER(  "Ender",    10000, RANK.VIP_PLUS);


    private String displayName;
    private int cost;
    private RANK rankRequirement;

    PARTICLEEFFECT(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(PARTICLEEFFECT item: PARTICLEEFFECT.values()){
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
