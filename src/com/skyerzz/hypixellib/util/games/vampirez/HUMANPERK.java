package com.skyerzz.hypixellib.util.games.vampirez;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum HUMANPERK {
    //todo: check coin progression
    GOLD_STARTER(       "Gold Starter",     1250,  3, RANKTYPE.DEFAULT),
    GOLD_BOOSTER(       "Gold Booster",     1250,  3, RANKTYPE.DEFAULT),
    ZOMBIE_DOUBLER(     "Zombie Doubler",   1250,  3, RANKTYPE.DEFAULT),
    VAMPIRE_DOUBLER(    "Vampire Doubler",  1250,  3, RANKTYPE.DEFAULT),
    BABY_HATER(         "Baby Hater",       1250,  3, RANKTYPE.DEFAULT),
    EXPLOSIVE_KILLER(   "Explosive Killer", 1250,  3, RANKTYPE.DEFAULT),
    FIREPROOFING(       "Fireproofing",     1250,  3, RANKTYPE.DEFAULT),
    TRANSFUSION(        "Transfusion",      3750,  3, RANKTYPE.DEFAULT),
    VAN_HELSING(        "Van Helsing",      10000, 1, RANKTYPE.DEFAULT),
    CONSTITUTION(       "Constitution",     1250,  3, RANKTYPE.DEFAULT),
    FORESIGHT(          "Foresight",        6250,  10, RANKTYPE.DEFAULT),
    THEOLOGY(           "Theology",         1250,  3, RANKTYPE.DEFAULT),
    LOOT_DROPS(         "Loot Drops",       2500,  3, RANKTYPE.DEFAULT),
    BASIC_SWAG(         "Basic Swag",       3750,  10, RANKTYPE.DEFAULT),
    ADVANCED_SWAG(      "Advanced Swag",    6250,  10, RANKTYPE.DEFAULT),
    EXPERT_SWAG(        "Expert Swag",      12500, 10, RANKTYPE.DEFAULT);


    private String displayName;
    private int cost, maxLevel;
    private RANKTYPE rankRequirement;

    HUMANPERK(String displayName, int cost, int maxLevel, RANKTYPE rankRequirement){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
