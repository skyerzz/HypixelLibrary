package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum Kit {
    @OutDated
            RICHKIT("OUTDATED - Rich Kit", -1, Rank.NONE),
    @OutDated
            FASHIONKIT("OUTDATED - Fashion Kit", -1, Rank.NONE),

    SOLDIER("Soldier Kit", 650, Rank.NONE),
    ELITE("Elite Kit", 2250, Rank.NONE),
    MAJESTIC("Majestic Kit", 2250, Rank.VIP),
    COMMANDER("Commander Kit", 2250, Rank.VIP),
    MARINEKIT("Marine Kit", 2250, Rank.VIP),
    SWATKIT("SWAT Kit", 2250, Rank.VIP_PLUS),
    SPECOPSKIT("Spec Ops Kit", 2250, Rank.VIP_PLUS),
    INVADERKIT("Invader Kit", 2250, Rank.VIP_PLUS),
    REVENGEKIT("Revenge Kit", 2250, Rank.VIP_PLUS),
    SPACEKIT("Space Kit", 2250, Rank.VIP_PLUS),
    SLIMEKIT("Slime Kit", 2250, Rank.VIP_PLUS),
    SNOWKIT("Snow Kit", 2250, Rank.VIP_PLUS),
    FASHIONISTAKIT("Fashionista Kit", 2250, Rank.VIP_PLUS),
    BUDDERKIT("Budder Kit", 3375, Rank.MVP),
    SWEGKIT("Sweg Kit", 4500, Rank.MVP_PLUS);


    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Kit(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Kit item: Kit.values()){
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
