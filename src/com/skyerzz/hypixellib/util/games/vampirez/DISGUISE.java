package com.skyerzz.hypixellib.util.games.vampirez;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum DISGUISE {
    ATTRACTIVE("Herobrine Disguise", 5000, RANK.VIP),
    ATTRACTIVE_SKELETON("Skeleton Disguise", 5000, RANK.VIP_PLUS),
    ATTRACTIVE_ENDERMAN("Witch Disguise", 5000, RANK.VIP_PLUS); //used to be enderman, was changed into witch, JSON value never changed.

    private String displayName;
    private int cost;
    private RANK rankRequirement;

    DISGUISE(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(DISGUISE item: DISGUISE.values()){
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

    public RANK getRankRequirement(){
        return rankRequirement;
    }
}
