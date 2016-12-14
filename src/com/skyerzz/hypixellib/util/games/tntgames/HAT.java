package com.skyerzz.hypixellib.util.games.tntgames;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum HAT {
    CREEPER_HEAD(       "Creeper Head Hat",     1200,   RANKTYPE.DEFAULT),                  
    ZOMBIE_SKULL(       "Zombie Skull Hat",     1200,   RANKTYPE.DEFAULT),                  
    SKELETON_SKULL(     "Skeleton Skull Hat",   1200,   RANKTYPE.DEFAULT),
    SUMMER_HAT(         "Summer Hat",           900,    RANKTYPE.DEFAULT),
    WITHER_SKULL(       "Wither Skull Hat",     1200,   RANKTYPE.DEFAULT),
    WINTER_HAT(         "Winter Hat",           900,    RANKTYPE.DEFAULT),                  
    SCHOLARS_CAP(       "Scholar's Cap",        900,    RANKTYPE.DEFAULT),                  
    BATTERS_HELMET(     "Batter's Helmet",      1800,   RANKTYPE.VIP),                      
    THE_MILKMAN(        "The Milkman Hat",      1800,   RANKTYPE.VIP),                      
    THE_SUPERFAN(       "The Superfan Hat",     1800,   RANKTYPE.VIP),                      
    THE_ATTENDANT(      "The Attendant Hat",    1800,   RANKTYPE.VIP),                      
    SCOTLAND_HAT(       "Scotland Hat",         1500,   RANKTYPE.VIP),                      
    CANADA_HAT(         "Canada Hat",           1500,   RANKTYPE.VIP),                      
    MINERS_HAT(         "Miner's Hat",          1500,   RANKTYPE.VIP),                      
    DESERT_HAT(         "Desert Hat",           1500,   RANKTYPE.VIP),                      
    LUMBERJACK_HAT(     "Lumberjack Hat",       1500,   RANKTYPE.VIP),                      
    OVER_THE_RAINBOW(   "Over The Rainbow Hat", 2000,   RANKTYPE.VIP_PLUS),                 
    FRYING_PAN(         "Frying Pan Hat",       2000,   RANKTYPE.VIP_PLUS),                 
    GOLDIGGER(         "Golddigger Hat",       1500,   RANKTYPE.VIP_PLUS),
    BANKERS_DRAUGHT(    "Banker's Draught Hat", 1500,   RANKTYPE.VIP_PLUS),                 
    BAKERS_HAT(         "Baker's Hat",          1200,   RANKTYPE.VIP_PLUS),                 
    SPACEMAN_HELMET(    "Spaceman Helmet",      2000,   RANKTYPE.VIP_PLUS),                 
    LUMINOUS_HAT(       "Luminous Hat",         1200,   RANKTYPE.VIP_PLUS),                 
    HALLOWEEN_HAT(      "Halloween Hat",        1000,   RANKTYPE.DEFAULT),                  
    TREASURE_HAT(       "Treasure Hat",         10000,  RANKTYPE.DEFAULT),                  
    BOUNTY_HAT(         "Bounty Hat",           10000,  RANKTYPE.DEFAULT),                  
    HAT_OF_UNDENIABLE_WEALTH_AND_RESPECT("Hat Of Undeniable Wealth And Respect", 50000, RANKTYPE.DEFAULT), 
    KINGS_CROWN(        "King's Crown",         333333, RANKTYPE.DEFAULT);                  


    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    HAT(String displayName, int cost, RANKTYPE rankRequirement){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
