package com.skyerzz.hypixellib.util.games.vampirez;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum VAMPIREPERK {
    VAMPIRIC_MINION(    "Vampiric Minion",  1250,   3, RANK.NONE),
    BLOOD_BOOSTER(      "Blood Booster",    1250,   3, RANK.NONE),
    DRAIN_PUNCH(        "Drain Punch",      1250,   3, RANK.NONE),
    WAVE_BOOSTER(       "Wave Booster",     1250,   3, RANK.NONE),
    KILL_BOOSTER(       "Kill Booster",     1250,   3, RANK.NONE),
    BLOOD_DRINKER(      "Blood Drinker",    1250,   3, RANK.NONE),
    FINAL_BREATH(       "Final Breath",     1250,   3, RANK.NONE),
    HELLBORN(           "Hellborn",         1250,   3, RANK.NONE),
    VAMPIRIC_SCREAM(    "Vampiric Scream",  1250,   3, RANK.VIP),           //TODO: unchecked
    RENFIELD(           "Renfield",         10000,  1, RANK.NONE),
    TERROR_LEVEL(       "Terror Level",     1250,   3, RANK.NONE),
    FRANKENSTEINS_MONSTER("Frankensteins Monster", 25000, 3, RANK.NONE); //TODO: unchecked

    private String displayName;
    private int cost, maxLevel;
    private RANK rankRequirement;

    VAMPIREPERK(String displayName, int cost, int maxLevel, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.maxLevel = maxLevel;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(VAMPIREPERK item: VAMPIREPERK.values()){
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
