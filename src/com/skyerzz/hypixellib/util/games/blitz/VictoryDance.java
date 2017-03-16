package com.skyerzz.hypixellib.util.games.blitz;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 19-11-2016.
 */
public enum VICTORY_DANCE {
    DRAGON_RIDER("Dragon Rider Dance", 0, RANK.MVP),
    PLAYER_FIREWORK("Player Firework Dance", 0, RANK.VIP_PLUS),
    EARTH("Earth Dance", 0, RANK.VIP_PLUS),
    CREEPER("Creeper Dance", 0, RANK.VIP),
    BLAZING_SPEED("Blazing Speed", 0, RANK.VIP_PLUS),
    METEOR_SHOWER("Meteor Shower Dance", 0, RANK.MVP);

    private String displayName;
    private int cost;
    private RANK rankRequirement;

    VICTORY_DANCE(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(VICTORY_DANCE item: VICTORY_DANCE.values()){
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

    public RANK getRankRequirement(){
        return rankRequirement;
    }
}
