package com.skyerzz.hypixellib.util.games.tntgames;

import com.skyerzz.hypixellib.util.Currency;
import com.skyerzz.hypixellib.util.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum Hat {
    CREEPER_HEAD(       "Creeper Head Hat",     1200,   Rank.NONE),
    ZOMBIE_SKULL(       "Zombie Skull Hat",     1200,   Rank.NONE),
    SKELETON_SKULL(     "Skeleton Skull Hat",   1200,   Rank.NONE),
    SUMMER_HAT(         "Summer Hat",           900,    Rank.NONE),
    WITHER_SKULL(       "Wither Skull Hat",     1200,   Rank.NONE),
    WINTER_HAT(         "Winter Hat",           900,    Rank.NONE),
    SCHOLARS_CAP(       "Scholar's Cap",        900,    Rank.NONE),
    BATTERS_HELMET(     "Batter's Helmet",      1800,   Rank.VIP),
    THE_MILKMAN(        "The Milkman Hat",      1800,   Rank.VIP),
    THE_SUPERFAN(       "The Superfan Hat",     1800,   Rank.VIP),
    THE_ATTENDANT(      "The Attendant Hat",    1800,   Rank.VIP),
    SCOTLAND_HAT(       "Scotland Hat",         1500,   Rank.VIP),
    CANADA_HAT(         "Canada Hat",           1500,   Rank.VIP),
    MINERS_HAT(         "Miner's Hat",          1500,   Rank.VIP),
    DESERT_HAT(         "Desert Hat",           1500,   Rank.VIP),
    LUMBERJACK_HAT(     "Lumberjack Hat",       1500,   Rank.VIP),
    OVER_THE_RAINBOW(   "Over The Rainbow Hat", 2000,   Rank.VIP_PLUS),
    FRYING_PAN(         "Frying Pan Hat",       2000,   Rank.VIP_PLUS),
    GOLDIGGER(         "Golddigger Hat",       1500,   Rank.VIP_PLUS),
    BANKERS_DRAUGHT(    "Banker's Draught Hat", 1500,   Rank.VIP_PLUS),
    BAKERS_HAT(         "Baker's Hat",          1200,   Rank.VIP_PLUS),
    SPACEMAN_HELMET(    "Spaceman Helmet",      2000,   Rank.VIP_PLUS),
    LUMINOUS_HAT(       "Luminous Hat",         1200,   Rank.VIP_PLUS),
    HALLOWEEN_HAT(      "Halloween Hat",        1000,   Rank.NONE),
    TREASURE_HAT(       "Treasure Hat",         10000,  Rank.NONE),
    BOUNTY_HAT(         "Bounty Hat",           10000,  Rank.NONE),
    HAT_OF_UNDENIABLE_WEALTH_AND_RESPECT("Hat Of Undeniable Wealth And Respect", 50000, Rank.NONE),
    KINGS_CROWN(        "King's Crown",         333333, Rank.NONE);


    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Hat(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Hat item: Hat.values()){
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

    public Currency getCurrencyType(){
        return Currency.COINS;
    }

    public Rank getRankRequirement(){
        return rankRequirement;
    }
}
