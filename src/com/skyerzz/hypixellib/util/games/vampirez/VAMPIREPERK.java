package com.skyerzz.hypixellib.util.games.vampirez;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum VAMPIREPERK {
    VAMPIRIC_MINION(    "Vampiric Minion",  1250,   3, RANKTYPE.DEFAULT),
    BLOOD_BOOSTER(      "Blood Booster",    1250,   3, RANKTYPE.DEFAULT),
    DRAIN_PUNCH(        "Drain Punch",      1250,   3, RANKTYPE.DEFAULT),
    WAVE_BOOSTER(       "Wave Booster",     1250,   3, RANKTYPE.DEFAULT),
    KILL_BOOSTER(       "Kill Booster",     1250,   3, RANKTYPE.DEFAULT),
    BLOOD_DRINKER(      "Blood Drinker",    1250,   3, RANKTYPE.DEFAULT),
    FINAL_BREATH(       "Final Breath",     1250,   3, RANKTYPE.DEFAULT),
    HELLBORN(           "Hellborn",         1250,   3, RANKTYPE.DEFAULT),
    VAMPIRIC_SCREAM(    "Vampiric Scream",  1250,   3, RANKTYPE.VIP),           //TODO: unchecked
    RENFIELD(           "Renfield",         10000,  1, RANKTYPE.DEFAULT),
    TERROR_LEVEL(       "Terror Level",     1250,   3, RANKTYPE.DEFAULT),
    FRANKENSTEINS_MONSTER("Frankensteins Monster", 25000, 3, RANKTYPE.DEFAULT); //TODO: unchecked

    private String displayName;
    private int cost, maxLevel;
    private RANKTYPE rankRequirement;

    VAMPIREPERK(String displayName, int cost, int maxLevel, RANKTYPE rankRequirement){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
