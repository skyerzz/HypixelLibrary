package com.skyerzz.hypixellib.util.games.vampirez;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum VampirePerk {
    VAMPIRIC_MINION(    "Vampiric Minion",  1250,   3, Rank.NONE),
    BLOOD_BOOSTER(      "Blood Booster",    1250,   3, Rank.NONE),
    DRAIN_PUNCH(        "Drain Punch",      1250,   3, Rank.NONE),
    WAVE_BOOSTER(       "Wave Booster",     1250,   3, Rank.NONE),
    KILL_BOOSTER(       "Kill Booster",     1250,   3, Rank.NONE),
    BLOOD_DRINKER(      "Blood Drinker",    1250,   3, Rank.NONE),
    FINAL_BREATH(       "Final Breath",     1250,   3, Rank.NONE),
    HELLBORN(           "Hellborn",         1250,   3, Rank.NONE),
    VAMPIRIC_SCREAM(    "Vampiric Scream",  1250,   3, Rank.VIP),           //TODO: unchecked
    RENFIELD(           "Renfield",         10000,  1, Rank.NONE),
    TERROR_LEVEL(       "Terror Level",     1250,   3, Rank.NONE),
    FRANKENSTEINS_MONSTER("Frankensteins Monster", 25000, 3, Rank.NONE); //TODO: unchecked

    private String displayName;
    private int cost, maxLevel;
    private Rank rankRequirement;

    VampirePerk(String displayName, int cost, int maxLevel, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.maxLevel = maxLevel;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(VampirePerk item: VampirePerk.values()){
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
