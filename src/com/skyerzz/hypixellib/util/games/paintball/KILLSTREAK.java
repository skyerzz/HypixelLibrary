package com.skyerzz.hypixellib.util.games.paintball;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 21-7-2016.
 */
public enum KILLSTREAK {
    FLASHBANG("Flashbang", 2500, 2, RANK.NONE),
    TRIPLESHOT("Triple Shot", 2500, 3, RANK.NONE),
    CREEPERHEAD("Creeper Head", 2500, 8, RANK.NONE),
    TNTRAIN("TNT Rain", 2500, 10, RANK.NONE),
    PLUSTEN("+10", 2500, 15, RANK.NONE),
    NUKE("Nuke", 5500, 25, RANK.NONE),
    SUPERSTRONGARM("Super Strong Arm", 2500, 7, RANK.NONE),
    LIGHTNING("Lightning", 2500, 12, RANK.NONE),
    ENDERPEARL("Ender Pearl", 2500, 15, RANK.NONE),
    ENDEREYE("Ender Eye", 2500, 15, RANK.NONE),
    FORCEFIELD("Force Field", 6500, 50, RANK.NONE),
    BOMBERMAN("Bomber Man", 2500, 18, RANK.NONE),
    BACKSTAB("Backstab", 2500, 5, RANK.NONE),
    SENTRY("Sentry", 2500, 9, RANK.NONE),
    QUINTUPLESHOT("Quintuple Shot", 5000, 9, RANK.NONE),
    LANDMINE("Landmine", 2500, 3, RANK.NONE);

    private String displayName;
    private int cost;
    private int killcoinsCost;
    private RANK rankRequirement;

    KILLSTREAK(String displayName, int cost, int killcoinsCost, RANK rankRequirement){
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

    public RANK getRankRequirement(){
        return rankRequirement;
    }

    public int getKillcoinsCost() { return killcoinsCost; }
}
