package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum Sight {
    YELLOW("Yellow Laser", 0, Rank.NONE),
    GREEN("Green Laser", 4000, Rank.NONE),
    WHITE("White Laser", 4000, Rank.NONE),
    RED("Red Laser", 5000, Rank.VIP),
    BLUE("Blue Laser", 7000, Rank.VIP),
    PURPLE("Purple Laser", 8000, Rank.VIP_PLUS),
    PINK("Pink Laser", 8000, Rank.VIP_PLUS),
    GOLD("Gold Laser", 50000, Rank.VIP_PLUS),
    EMERALD("Emerald Laser", 50000, Rank.VIP_PLUS),
    DIAMOND("Daimond Laser", 50000, Rank.VIP_PLUS);


    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Sight(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Sight item: Sight.values()){
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
