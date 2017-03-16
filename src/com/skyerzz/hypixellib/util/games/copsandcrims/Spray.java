package com.skyerzz.hypixellib.util.games.copsandcrims;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;


/**
 * Created by sky on 10-8-2016.
 */
public enum Spray {
    CREEPER(    "Spray: Red Creeper",   300, Rank.MVP_PLUS),
    OCELOT(     "Spray: Blue Ocelot",   300, Rank.MVP_PLUS),
    MVP(        "Spray: MVP+ FTW",      300, Rank.MVP_PLUS),
    HEADSHOT(   "Spray: Headshot",      300, Rank.MVP_PLUS),
    REKT(       "Spray: #REKT",         300, Rank.MVP_PLUS);

    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Spray(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Spray item: Spray.values()){
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

    public Rank getRankRequirement(){
        return rankRequirement;
    }

    public Currency getCurrency() { return Currency.COINS; }
}
