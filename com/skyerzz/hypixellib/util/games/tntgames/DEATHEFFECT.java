package com.skyerzz.hypixellib.util.games.tntgames;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum DEATHEFFECT {
    FIREWORK(   "Firework", 2000, RANKTYPE.VIP),
    CREEPER(    "Creeper",  4000, RANKTYPE.VIP),
    TNT(        "TNT",      6000, RANKTYPE.VIP_PLUS),
    WITHER(     "Wither",   6000, RANKTYPE.VIP_PLUS);

    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    DEATHEFFECT(String displayName, int cost, RANKTYPE rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(DEATHEFFECT item: DEATHEFFECT.values()){
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
