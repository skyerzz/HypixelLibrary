package com.skyerzz.hypixellib.util.games.vampirez;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum HumanPerk {
    //todo: check coin progression
    GOLD_STARTER(       "Gold Starter",     1250,  3, Rank.NONE),
    GOLD_BOOSTER(       "Gold Booster",     1250,  3, Rank.NONE),
    ZOMBIE_DOUBLER(     "Zombie Doubler",   1250,  3, Rank.NONE),
    VAMPIRE_DOUBLER(    "Vampire Doubler",  1250,  3, Rank.NONE),
    BABY_HATER(         "Baby Hater",       1250,  3, Rank.NONE),
    EXPLOSIVE_KILLER(   "Explosive Killer", 1250,  3, Rank.NONE),
    FIREPROOFING(       "Fireproofing",     1250,  3, Rank.NONE),
    TRANSFUSION(        "Transfusion",      3750,  3, Rank.NONE),
    VAN_HELSING(        "Van Helsing",      10000, 1, Rank.NONE),
    CONSTITUTION(       "Constitution",     1250,  3, Rank.NONE),
    FORESIGHT(          "Foresight",        6250,  10, Rank.NONE),
    THEOLOGY(           "Theology",         1250,  3, Rank.NONE),
    LOOT_DROPS(         "Loot Drops",       2500,  3, Rank.NONE),
    BASIC_SWAG(         "Basic Swag",       3750,  10, Rank.NONE),
    ADVANCED_SWAG(      "Advanced Swag",    6250,  10, Rank.NONE),
    EXPERT_SWAG(        "Expert Swag",      12500, 10, Rank.NONE);


    private String displayName;
    private int cost, maxLevel;
    private Rank rankRequirement;

    HumanPerk(String displayName, int cost, int maxLevel, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.maxLevel = maxLevel;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(HumanPerk item: HumanPerk.values()){
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

    public Currency getCurrencyType(){
        return Currency.COINS;
    }

    public Rank getRankRequirement(){
        return rankRequirement;
    }
}
