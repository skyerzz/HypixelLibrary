package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum SIGHT {
    YELLOW("Yellow Laser", 0, RANKTYPE.DEFAULT),
    GREEN("Green Laser", 4000, RANKTYPE.DEFAULT),
    WHITE("White Laser", 4000, RANKTYPE.DEFAULT),
    RED("Red Laser", 5000, RANKTYPE.VIP),
    BLUE("Blue Laser", 7000, RANKTYPE.VIP),
    PURPLE("Purple Laser", 8000, RANKTYPE.VIP_PLUS),
    PINK("Pink Laser", 8000, RANKTYPE.VIP_PLUS),
    GOLD("Gold Laser", 50000, RANKTYPE.VIP_PLUS),
    EMERALD("Emerald Laser", 50000, RANKTYPE.VIP_PLUS),
    DIAMOND("Daimond Laser", 50000, RANKTYPE.VIP_PLUS);


    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    SIGHT(String displayName, int cost, RANKTYPE rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(SIGHT item: SIGHT.values()){
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
