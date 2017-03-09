package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum KIT {
    @OutDated
            RICHKIT("OUTDATED - Rich Kit", -1, RANK.NONE),
    @OutDated
            FASHIONKIT("OUTDATED - Fashion Kit", -1, RANK.NONE),

    SOLDIER("Soldier Kit", 650, RANK.NONE),
    ELITE("Elite Kit", 2250, RANK.NONE),
    MAJESTIC("Majestic Kit", 2250, RANK.VIP),
    COMMANDER("Commander Kit", 2250, RANK.VIP),
    MARINEKIT("Marine Kit", 2250, RANK.VIP),
    SWATKIT("SWAT Kit", 2250, RANK.VIP_PLUS),
    SPECOPSKIT("Spec Ops Kit", 2250, RANK.VIP_PLUS),
    INVADERKIT("Invader Kit", 2250, RANK.VIP_PLUS),
    REVENGEKIT("Revenge Kit", 2250, RANK.VIP_PLUS),
    SPACEKIT("Space Kit", 2250, RANK.VIP_PLUS),
    SLIMEKIT("Slime Kit", 2250, RANK.VIP_PLUS),
    SNOWKIT("Snow Kit", 2250, RANK.VIP_PLUS),
    FASHIONISTAKIT("Fashionista Kit", 2250, RANK.VIP_PLUS),
    BUDDERKIT("Budder Kit", 3375, RANK.MVP),
    SWEGKIT("Sweg Kit", 4500, RANK.MVP_PLUS);


    private String displayName;
    private int cost;
    private RANK rankRequirement;

    KIT(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(KIT item: KIT.values()){
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
