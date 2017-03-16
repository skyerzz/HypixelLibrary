package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum Case {
    WOOD_HOE("Wooden Case", 0, Rank.NONE),
    STONE_HOE("Marbled Case", 1000, Rank.NONE),
    IRON_HOE("Reinforced Case", 2500, Rank.VIP),
    GOLD_HOE("Plated Case", 4000, Rank.VIP),
    DIAMOND_HOE("Bling Case", 7000, Rank.VIP),
    SHINY_WOOD_HOE("Varnished Wood Case", 2000, Rank.VIP),
    SHINY_STONE_HOE("Polished Marble Case", 2000, Rank.VIP_PLUS),
    SHINY_IRON_HOE("Polished Reinforced Case", 200000, Rank.MVP),
    SHINY_GOLD_HOE("Polished Plated Case", 14000, Rank.VIP_PLUS),
    SHINY_DIAMOND_HOE("name", 100000, Rank.VIP_PLUS);


    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Case(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Case item: Case.values()){
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
