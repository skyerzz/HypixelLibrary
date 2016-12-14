package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum CASE {
    WOOD_HOE("Wooden Case", 0, RANKTYPE.DEFAULT),
    STONE_HOE("Marbled Case", 1000, RANKTYPE.DEFAULT),
    IRON_HOE("Reinforced Case", 2500, RANKTYPE.VIP),
    GOLD_HOE("Plated Case", 4000, RANKTYPE.VIP),
    DIAMOND_HOE("Bling Case", 7000, RANKTYPE.VIP),
    SHINY_WOOD_HOE("Varnished Wood Case", 2000, RANKTYPE.VIP),
    SHINY_STONE_HOE("Polished Marble Case", 2000, RANKTYPE.VIP_PLUS),
    SHINY_IRON_HOE("Polished Reinforced Case", 200000, RANKTYPE.MVP),
    SHINY_GOLD_HOE("Polished Plated Case", 14000, RANKTYPE.VIP_PLUS),
    SHINY_DIAMOND_HOE("name", 100000, RANKTYPE.VIP_PLUS);


    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    CASE(String displayName, int cost, RANKTYPE rankRequirement){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
