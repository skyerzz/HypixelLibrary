package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum BARREL {
    SMALL_BALL("Small Barrel", 0, RANKTYPE.DEFAULT),
    LARGE_BALL("Large Barrel", 9000, RANKTYPE.DEFAULT),
    CREEPER("Creeper Barrel", 9000, RANKTYPE.VIP),
    BURST("Burst Barrel", 9000, RANKTYPE.VIP),
    STAR("Star Barrel", 9000, RANKTYPE.VIP_PLUS);

    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    BARREL(String displayName, int cost, RANKTYPE rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(BARREL item: BARREL.values()){
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

    public CURRENCY getCurrencyType(){ return CURRENCY.COINS; }

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
