package com.skyerzz.hypixellib.util.games.paintball;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 21-7-2016.
 */
public enum KILLSTREAK {
    FLASHBANG("Flashbang", 2500, 2, RANKTYPE.DEFAULT),
    TRIPLESHOT("Triple Shot", 2500, 3, RANKTYPE.DEFAULT),
    CREEPERHEAD("Creeper Head", 2500, 8, RANKTYPE.DEFAULT),
    TNTRAIN("TNT Rain", 2500, 10, RANKTYPE.DEFAULT),
    PLUSTEN("+10", 2500, 15, RANKTYPE.DEFAULT),
    NUKE("Nuke", 5500, 25, RANKTYPE.DEFAULT),
    SUPERSTRONGARM("Super Strong Arm", 2500, 7, RANKTYPE.DEFAULT),
    LIGHTNING("Lightning", 2500, 12, RANKTYPE.DEFAULT),
    ENDERPEARL("Ender Pearl", 2500, 15, RANKTYPE.DEFAULT),
    ENDEREYE("Ender Eye", 2500, 15, RANKTYPE.DEFAULT),
    FORCEFIELD("Force Field", 6500, 50, RANKTYPE.DEFAULT),
    BOMBERMAN("Bomber Man", 2500, 18, RANKTYPE.DEFAULT),
    BACKSTAB("Backstab", 2500, 5, RANKTYPE.DEFAULT),
    SENTRY("Sentry", 2500, 9, RANKTYPE.DEFAULT),
    QUINTUPLESHOT("Quintuple Shot", 5000, 9, RANKTYPE.DEFAULT),
    LANDMINE("Landmine", 2500, 3, RANKTYPE.DEFAULT);

    private String displayName;
    private int cost;
    private int killcoinsCost;
    private RANKTYPE rankRequirement;

    KILLSTREAK(String displayName, int cost, int killcoinsCost, RANKTYPE rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.killcoinsCost = killcoinsCost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(KILLSTREAK item: KILLSTREAK.values()){
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

    public int getKillcoinsCost() { return killcoinsCost; }
}
