package com.skyerzz.hypixellib.util.games.walls;

import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 12-9-2016.
 */
public enum PERK {
    SWIFT("Swift", 0, 0),
    OPPORTUNITY("Opportunity", 0, 0),
    BERSERK("Berserk", 0, 0),
    VAMPIRISM("Vampirism", 0, 0),
    FORTUNE("Fortune", 0, 0),
    HASTE("Haste", 0, 0),
    CHAINKILLER("Chainkiller", 0, 0),
    ADRENALINE("Adrenaline", 0, 0),
    TENACITY("Tenacity", 0, 0),
    EXPERT_MINER("Expert Miner", 0, 0),
    VITALITY("Vitality", 0, 0),
    SURFACE("Surface", 0, 3),
    SHOUT("Shout", 0, 2),
    FURNACE_PROTECTION("Furnace Protection", 0, 2),
    IRON_GOLEM("Iron Golem", 1, 10);

    private String displayName;
    private int maxLevel;
    private int levelRequirement;

    PERK(String displayName, int maxLevel, int levelRequirement){
        this.displayName = displayName;
        this.maxLevel = maxLevel;
        this.levelRequirement = levelRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static java.util.ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(PERK item: PERK.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getCost(int level) {
        switch(this){
        }
        return -1;
    }

    public int getLevelRequirement() {
        return levelRequirement;
    }
}
