package com.skyerzz.hypixellib.util.games.turbokartracers;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public enum JACKET {
    //TODO: check
    NO_JACKET(       "No jacket", 0, RANKTYPE.DEFAULT),
    GOLD_JACKET(     "Slothdinger Pants",    0,      RANKTYPE.DEFAULT), //checked
    CHAIN_JACKET(    "Blushell Inc Pants",   2000,   RANKTYPE.VIP),      //checked
    IRON_JACKET(     "Sphax-corp Pants",     3000,   RANKTYPE.VIP_PLUS),
    DIAMOND_JACKET(  "Turbobrine Pants",     4000,   RANKTYPE.MVP),
    LEATHER_JACKET(  "Hypesweggen Pants",    5000,   RANKTYPE.MVP_PLUS);

    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    JACKET(String displayName, int cost, RANKTYPE rankRequirement){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
