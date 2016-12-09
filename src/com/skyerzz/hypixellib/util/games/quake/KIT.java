package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum KIT {
    SOLDIER("Soldier Kit", 650, RANKTYPE.DEFAULT),
    ELITE("Elite Kit", 2250, RANKTYPE.DEFAULT),
    MAJESTIC("Majestic Kit", 2250, RANKTYPE.VIP),
    COMMANDER("Commander Kit", 2250, RANKTYPE.VIP),
    MARINEKIT("Marine Kit", 2250, RANKTYPE.VIP),
    SWATKIT("SWAT Kit", 2250, RANKTYPE.VIP_PLUS),
    SPECOPSKIT("Spec Ops Kit", 2250, RANKTYPE.VIP_PLUS),
    INVADERKIT("Invader Kit", 2250, RANKTYPE.VIP_PLUS),
    REVENGEKIT("Revenge Kit", 2250, RANKTYPE.VIP_PLUS),
    SPACEKIT("Space Kit", 2250, RANKTYPE.VIP_PLUS),
    SLIMEKIT("Slime Kit", 2250, RANKTYPE.VIP_PLUS),
    SNOWKIT("Snow Kit", 2250, RANKTYPE.VIP_PLUS),
    FASHIONISTAKIT("Fashionista Kit", 2250, RANKTYPE.VIP_PLUS),
    BUDDERKIT("Budder Kit", 3375, RANKTYPE.MVP),
    SWEGKIT("Sweg Kit", 4500, RANKTYPE.MVP_PLUS);


    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    KIT(String displayName, int cost, RANKTYPE rankRequirement){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
