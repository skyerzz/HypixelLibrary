package com.skyerzz.hypixellib.util.games.copsandcrims;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;


/**
 * Created by sky on 10-8-2016.
 */
public enum SPRAY {
    CREEPER(    "Spray: Red Creeper",   300, RANKTYPE.MVP_PLUS),
    OCELOT(     "Spray: Blue Ocelot",   300, RANKTYPE.MVP_PLUS),
    MVP(        "Spray: MVP+ FTW",      300, RANKTYPE.MVP_PLUS),
    HEADSHOT(   "Spray: Headshot",      300, RANKTYPE.MVP_PLUS),
    REKT(       "Spray: #REKT",         300, RANKTYPE.MVP_PLUS);

    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    SPRAY(String displayName, int cost, RANKTYPE rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(SPRAY item: SPRAY.values()){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }

    public CURRENCY getCurrency() { return CURRENCY.COINS; }
}
