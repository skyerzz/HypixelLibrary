package com.skyerzz.hypixellib.util.games.vampirez;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum HUMANPERK {
    //todo: check coin progression
    GOLD_STARTER(       "Gold Starter",     1250,  3, RANK.NONE),
    GOLD_BOOSTER(       "Gold Booster",     1250,  3, RANK.NONE),
    ZOMBIE_DOUBLER(     "Zombie Doubler",   1250,  3, RANK.NONE),
    VAMPIRE_DOUBLER(    "Vampire Doubler",  1250,  3, RANK.NONE),
    BABY_HATER(         "Baby Hater",       1250,  3, RANK.NONE),
    EXPLOSIVE_KILLER(   "Explosive Killer", 1250,  3, RANK.NONE),
    FIREPROOFING(       "Fireproofing",     1250,  3, RANK.NONE),
    TRANSFUSION(        "Transfusion",      3750,  3, RANK.NONE),
    VAN_HELSING(        "Van Helsing",      10000, 1, RANK.NONE),
    CONSTITUTION(       "Constitution",     1250,  3, RANK.NONE),
    FORESIGHT(          "Foresight",        6250,  10, RANK.NONE),
    THEOLOGY(           "Theology",         1250,  3, RANK.NONE),
    LOOT_DROPS(         "Loot Drops",       2500,  3, RANK.NONE),
    BASIC_SWAG(         "Basic Swag",       3750,  10, RANK.NONE),
    ADVANCED_SWAG(      "Advanced Swag",    6250,  10, RANK.NONE),
    EXPERT_SWAG(        "Expert Swag",      12500, 10, RANK.NONE);


    private String displayName;
    private int cost, maxLevel;
    private RANK rankRequirement;

    HUMANPERK(String displayName, int cost, int maxLevel, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.maxLevel = maxLevel;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(HUMANPERK item: HUMANPERK.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getCost(int level){
        if(level < 1 || level > maxLevel){
            return 0;
        }
        return cost*level;
    }

    public int getMaxLevel() {return maxLevel; }

    public CURRENCY getCurrencyType(){
        return CURRENCY.COINS;
    }

    public RANK getRankRequirement(){
        return rankRequirement;
    }
}
