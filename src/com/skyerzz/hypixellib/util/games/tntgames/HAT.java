package com.skyerzz.hypixellib.util.games.tntgames;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum HAT {
    CREEPER_HEAD(       "Creeper Head Hat",     1200,   RANK.NONE),
    ZOMBIE_SKULL(       "Zombie Skull Hat",     1200,   RANK.NONE),
    SKELETON_SKULL(     "Skeleton Skull Hat",   1200,   RANK.NONE),
    SUMMER_HAT(         "Summer Hat",           900,    RANK.NONE),
    WITHER_SKULL(       "Wither Skull Hat",     1200,   RANK.NONE),
    WINTER_HAT(         "Winter Hat",           900,    RANK.NONE),
    SCHOLARS_CAP(       "Scholar's Cap",        900,    RANK.NONE),
    BATTERS_HELMET(     "Batter's Helmet",      1800,   RANK.VIP),
    THE_MILKMAN(        "The Milkman Hat",      1800,   RANK.VIP),
    THE_SUPERFAN(       "The Superfan Hat",     1800,   RANK.VIP),
    THE_ATTENDANT(      "The Attendant Hat",    1800,   RANK.VIP),
    SCOTLAND_HAT(       "Scotland Hat",         1500,   RANK.VIP),
    CANADA_HAT(         "Canada Hat",           1500,   RANK.VIP),
    MINERS_HAT(         "Miner's Hat",          1500,   RANK.VIP),
    DESERT_HAT(         "Desert Hat",           1500,   RANK.VIP),
    LUMBERJACK_HAT(     "Lumberjack Hat",       1500,   RANK.VIP),
    OVER_THE_RAINBOW(   "Over The Rainbow Hat", 2000,   RANK.VIP_PLUS),
    FRYING_PAN(         "Frying Pan Hat",       2000,   RANK.VIP_PLUS),
    GOLDIGGER(         "Golddigger Hat",       1500,   RANK.VIP_PLUS),
    BANKERS_DRAUGHT(    "Banker's Draught Hat", 1500,   RANK.VIP_PLUS),
    BAKERS_HAT(         "Baker's Hat",          1200,   RANK.VIP_PLUS),
    SPACEMAN_HELMET(    "Spaceman Helmet",      2000,   RANK.VIP_PLUS),
    LUMINOUS_HAT(       "Luminous Hat",         1200,   RANK.VIP_PLUS),
    HALLOWEEN_HAT(      "Halloween Hat",        1000,   RANK.NONE),
    TREASURE_HAT(       "Treasure Hat",         10000,  RANK.NONE),
    BOUNTY_HAT(         "Bounty Hat",           10000,  RANK.NONE),
    HAT_OF_UNDENIABLE_WEALTH_AND_RESPECT("Hat Of Undeniable Wealth And Respect", 50000, RANK.NONE),
    KINGS_CROWN(        "King's Crown",         333333, RANK.NONE);


    private String displayName;
    private int cost;
    private RANK rankRequirement;

    HAT(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(HAT item: HAT.values()){
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

    public CURRENCY getCurrencyType(){
        return CURRENCY.COINS;
    }

    public RANK getRankRequirement(){
        return rankRequirement;
    }
}
