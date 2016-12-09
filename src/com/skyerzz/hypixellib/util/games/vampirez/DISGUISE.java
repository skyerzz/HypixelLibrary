package com.skyerzz.hypixellib.util.games.vampirez;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum DISGUISE {
    ATTRACTIVE("Herobrine Disguise", 5000, RANKTYPE.VIP),
    ATTRACTIVE_SKELETON("Skeleton Disguise", 5000, RANKTYPE.VIP_PLUS),
    ATTRACTIVE_ENDERMAN("Witch Disguise", 5000, RANKTYPE.VIP_PLUS); //used to be enderman, was changed into witch, JSON value never changed.

    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    DISGUISE(String displayName, int cost, RANKTYPE rankRequirement){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
