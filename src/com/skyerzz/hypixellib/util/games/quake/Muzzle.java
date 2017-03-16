package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum MUZZLE {
    NONE("No Muzzle", 0, RANK.NONE),
    CLAY("Clay Muzzle", 5000, RANK.NONE),
    WOOD("Wooden Muzzle", 5000, RANK.VIP),
    GOLD("Golden Muzzle", 7500, RANK.VIP),
    REDSTONE("Redstone Muzzle", 7500, RANK.VIP),
    IRON("Iron Muzzle", 8200, RANK.VIP_PLUS),
    DIAMOND("Diamond Muzzle", 9000, RANK.VIP_PLUS),
    EMERALD("Emerald Muzzle", 25000, RANK.VIP_PLUS),
    OBSIDIAN("Obsidian Muzzle", 50000, RANK.VIP_PLUS),
    COMMAND_BLOCK("Command Block Muzzle", 100000, RANK.VIP_PLUS);


    private String displayName;
    private int cost;
    private RANK rankRequirement;

    MUZZLE(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(MUZZLE item: MUZZLE.values()){
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
