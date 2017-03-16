package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum Muzzle {
    NONE("No Muzzle", 0, Rank.NONE),
    CLAY("Clay Muzzle", 5000, Rank.NONE),
    WOOD("Wooden Muzzle", 5000, Rank.VIP),
    GOLD("Golden Muzzle", 7500, Rank.VIP),
    REDSTONE("Redstone Muzzle", 7500, Rank.VIP),
    IRON("Iron Muzzle", 8200, Rank.VIP_PLUS),
    DIAMOND("Diamond Muzzle", 9000, Rank.VIP_PLUS),
    EMERALD("Emerald Muzzle", 25000, Rank.VIP_PLUS),
    OBSIDIAN("Obsidian Muzzle", 50000, Rank.VIP_PLUS),
    COMMAND_BLOCK("Command Block Muzzle", 100000, Rank.VIP_PLUS);


    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Muzzle(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Muzzle item: Muzzle.values()){
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
