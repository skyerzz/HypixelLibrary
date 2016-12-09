package com.skyerzz.hypixellib.util.games.copsandcrims;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 10-8-2016.
 */
public enum KNIFESKIN {
    KNIFE(                  "Knife",                    0,   RANKTYPE.DEFAULT),
    COMBAT_SHOVEL(          "Combat Shovel",            200, RANKTYPE.VIP),
    KUKRI(                  "Kukri",                    200, RANKTYPE.VIP_PLUS),
    TRENCH_KNIFE(           "Trench Knife",             200, RANKTYPE.MVP),
    DIVING_KNIFE(           "Diviing Knife",            200, RANKTYPE.MVP),
    NECK_KNIFE(             "Neck Knife",               200, RANKTYPE.MVP),
    TACTICAL_TOMAHAWK(      "Tactical Tomahawk",        200, RANKTYPE.MVP_PLUS),
    BOWIE_KNIFE(            "Bowie Knife",              200, RANKTYPE.MVP_PLUS),
    ENCHANTED_BOWIE_KNIFE(  "Enchanted Bowie Knife",    200, RANKTYPE.MVP_PLUS);

    private int cost;
    private String displayName;
    private RANKTYPE rankRequirement;

    KNIFESKIN(String displayName, int cost, RANKTYPE rankRequirement){
        this.cost = cost;
        this.displayName = displayName;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(KNIFESKIN item: KNIFESKIN.values()){
            list.add(item.name());
        }
        return list;
    }


    public int getCost() {
        return cost;
    }

    public RANKTYPE getRankRequirement() {
        return rankRequirement;
    }

    public CURRENCY getCurrency() { return CURRENCY.COINS; }

    public String getDisplayName() {return displayName;}
}
