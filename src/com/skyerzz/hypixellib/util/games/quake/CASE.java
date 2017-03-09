package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum CASE {
    WOOD_HOE("Wooden Case", 0, RANK.NONE),
    STONE_HOE("Marbled Case", 1000, RANK.NONE),
    IRON_HOE("Reinforced Case", 2500, RANK.VIP),
    GOLD_HOE("Plated Case", 4000, RANK.VIP),
    DIAMOND_HOE("Bling Case", 7000, RANK.VIP),
    SHINY_WOOD_HOE("Varnished Wood Case", 2000, RANK.VIP),
    SHINY_STONE_HOE("Polished Marble Case", 2000, RANK.VIP_PLUS),
    SHINY_IRON_HOE("Polished Reinforced Case", 200000, RANK.MVP),
    SHINY_GOLD_HOE("Polished Plated Case", 14000, RANK.VIP_PLUS),
    SHINY_DIAMOND_HOE("name", 100000, RANK.VIP_PLUS);


    private String displayName;
    private int cost;
    private RANK rankRequirement;

    CASE(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(CASE item: CASE.values()){
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
