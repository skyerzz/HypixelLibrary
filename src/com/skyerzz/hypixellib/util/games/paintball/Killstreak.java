package com.skyerzz.hypixellib.util.games.paintball;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 21-7-2016.
 */
public enum Killstreak {
    FLASHBANG("Flashbang", 2500, 2, Rank.NONE),
    TRIPLESHOT("Triple Shot", 2500, 3, Rank.NONE),
    CREEPERHEAD("Creeper Head", 2500, 8, Rank.NONE),
    TNTRAIN("TNT Rain", 2500, 10, Rank.NONE),
    PLUSTEN("+10", 2500, 15, Rank.NONE),
    NUKE("Nuke", 5500, 25, Rank.NONE),
    SUPERSTRONGARM("Super Strong Arm", 2500, 7, Rank.NONE),
    LIGHTNING("Lightning", 2500, 12, Rank.NONE),
    ENDERPEARL("Ender Pearl", 2500, 15, Rank.NONE),
    ENDEREYE("Ender Eye", 2500, 15, Rank.NONE),
    FORCEFIELD("Force Field", 6500, 50, Rank.NONE),
    BOMBERMAN("Bomber Man", 2500, 18, Rank.NONE),
    BACKSTAB("Backstab", 2500, 5, Rank.NONE),
    SENTRY("Sentry", 2500, 9, Rank.NONE),
    QUINTUPLESHOT("Quintuple Shot", 5000, 9, Rank.NONE),
    LANDMINE("Landmine", 2500, 3, Rank.NONE);

    private String displayName;
    private int cost;
    private int killcoinsCost;
    private Rank rankRequirement;

    Killstreak(String displayName, int cost, int killcoinsCost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.killcoinsCost = killcoinsCost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Killstreak item: Killstreak.values()){
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

    public int getKillcoinsCost() { return killcoinsCost; }
}
