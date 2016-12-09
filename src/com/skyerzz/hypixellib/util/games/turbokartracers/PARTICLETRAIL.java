package com.skyerzz.hypixellib.util.games.turbokartracers;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public enum PARTICLETRAIL {
    //TODO: check
    RAINBOWZ(       "Rainbowz Trail",       21000,  RANKTYPE.VIP),
    RED_DUST(       "Red Dust Trail",       1000,   RANKTYPE.VIP),
    HEARTS(         "Hearts Trail",         3000,   RANKTYPE.VIP),     //checked
    GREEN_MAGIC(    "Green Magic Trail",    2500,   RANKTYPE.VIP),
    PURPLE_MAGIC(   "Purple Magic Trail",   2500,   RANKTYPE.VIP),
    FLAMES(         "Flames Trail",         5000,   RANKTYPE.VIP),
    SLIME(          "Slime Trail",          5000,   RANKTYPE.VIP),
    LAVA_BURST(     "Lava Burst Trail",     17000,  RANKTYPE.VIP),
    DARK_SMOKE(     "Dark Smoke Trail",     3500,   RANKTYPE.VIP);

    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    PARTICLETRAIL(String displayName, int cost, RANKTYPE rankRequirement){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
