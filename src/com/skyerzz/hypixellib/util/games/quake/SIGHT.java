package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum SIGHT {
    YELLOW("Yellow Laser", 0, RANK.NONE),
    GREEN("Green Laser", 4000, RANK.NONE),
    WHITE("White Laser", 4000, RANK.NONE),
    RED("Red Laser", 5000, RANK.VIP),
    BLUE("Blue Laser", 7000, RANK.VIP),
    PURPLE("Purple Laser", 8000, RANK.VIP_PLUS),
    PINK("Pink Laser", 8000, RANK.VIP_PLUS),
    GOLD("Gold Laser", 50000, RANK.VIP_PLUS),
    EMERALD("Emerald Laser", 50000, RANK.VIP_PLUS),
    DIAMOND("Daimond Laser", 50000, RANK.VIP_PLUS);


    private String displayName;
    private int cost;
    private RANK rankRequirement;

    SIGHT(String displayName, int cost, RANK rankRequirement){
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

    public RANK getRankRequirement(){
        return rankRequirement;
    }
}
