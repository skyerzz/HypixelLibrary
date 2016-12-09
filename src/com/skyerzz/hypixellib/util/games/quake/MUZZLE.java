package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum MUZZLE {
    NONE("No Muzzle", 0, RANKTYPE.DEFAULT),
    CLAY("Clay Muzzle", 5000, RANKTYPE.DEFAULT),
    WOOD("Wooden Muzzle", 5000, RANKTYPE.VIP),
    GOLD("Golden Muzzle", 7500, RANKTYPE.VIP),
    REDSTONE("Redstone Muzzle", 7500, RANKTYPE.VIP),
    IRON("Iron Muzzle", 8200, RANKTYPE.VIP_PLUS),
    DIAMOND("Diamond Muzzle", 9000, RANKTYPE.VIP_PLUS),
    EMERALD("Emerald Muzzle", 25000, RANKTYPE.VIP_PLUS),
    OBSIDIAN("Obsidian Muzzle", 50000, RANKTYPE.VIP_PLUS),
    COMMAND_BLOCK("Command Block Muzzle", 100000, RANKTYPE.VIP_PLUS);


    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    MUZZLE(String displayName, int cost, RANKTYPE rankRequirement){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
