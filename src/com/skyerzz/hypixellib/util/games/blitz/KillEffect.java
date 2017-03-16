package com.skyerzz.hypixellib.util.games.blitz;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 19-11-2016.
 */
public enum KillEffect {
    SPEED("Speed", 0),
    RESISTANCE("Resistance", 5000),
    REGENERATION("Regeneration", 5000),
    FLAMING_ARROWS("Flaming Arrows", 5000),
    LEVEL_UP("Level Up", 5000);

    private String displayName;
    private int cost;

    KillEffect(String displayName, int cost){
        this.displayName = displayName;
        this.cost = cost;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(KillEffect item: KillEffect.values()){
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
        return Rank.NONE;
    }
}
