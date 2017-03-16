package com.skyerzz.hypixellib.util.games.blitz;

import com.skyerzz.hypixellib.util.Currency;
import com.skyerzz.hypixellib.util.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 19-11-2016.
 */
public enum VictoryDance {
    DRAGON_RIDER("Dragon Rider Dance", 0, Rank.MVP),
    PLAYER_FIREWORK("Player Firework Dance", 0, Rank.VIP_PLUS),
    EARTH("Earth Dance", 0, Rank.VIP_PLUS),
    CREEPER("Creeper Dance", 0, Rank.VIP),
    BLAZING_SPEED("Blazing Speed", 0, Rank.VIP_PLUS),
    METEOR_SHOWER("Meteor Shower Dance", 0, Rank.MVP);

    private String displayName;
    private int cost;
    private Rank rankRequirement;

    VictoryDance(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(VictoryDance item: VictoryDance.values()){
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

    public Currency getCurrencyType(){ return Currency.COINS; }

    public Rank getRankRequirement(){
        return rankRequirement;
    }
}
