package com.skyerzz.hypixellib.util.games.vampirez;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum Disguise {
    ATTRACTIVE("Herobrine Disguise", 5000, Rank.VIP),
    ATTRACTIVE_SKELETON("Skeleton Disguise", 5000, Rank.VIP_PLUS),
    ATTRACTIVE_ENDERMAN("Witch Disguise", 5000, Rank.VIP_PLUS); //used to be enderman, was changed into witch, JSON value never changed.

    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Disguise(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Disguise item: Disguise.values()){
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

    public Currency getCurrencyType(){
        return Currency.COINS;
    }

    public Rank getRankRequirement(){
        return rankRequirement;
    }
}
