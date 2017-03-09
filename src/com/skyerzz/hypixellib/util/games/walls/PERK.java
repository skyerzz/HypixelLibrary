package com.skyerzz.hypixellib.util.games.walls;

import com.skyerzz.hypixellib.Logger;

import java.util.ArrayList;

/**
 * Created by sky on 12-9-2016.
 */
public enum PERK {
    SWIFT("Swift", 3, 0),
    OPPORTUNITY("Opportunity", 3, 0),
    BERSERK("Berserk", 3, 0),
    VAMPIRISM("Vampirism", 3, 0),
    FORTUNE("Fortune", 3, 0),
    HASTE("Haste", 10, 0),
    CHAINKILLER("Chainkiller", 3, 0),
    ADRENALINE("Adrenaline", 3, 0),
    TENACITY("Tenacity", 3, 0),
    EXPERT_MINER("Expert Miner", 3, 0),
    VITALITY("Vitality", 3, 0),
    SURFACE("Surface", 1, 3),
    SHOUT("Shout", 4, -1),
    FURNACE_PROTECTION("Furnace Protection", 1, 2),
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
        if(this.getMaxLevel() > level || level <= 0){
            return -1;
        }
        switch(level){
            case 1:
                switch(this){
                    case SHOUT:
                        return 625;
                    case SWIFT:
                        return 2300;
                    case ADRENALINE:
                        return 2500;
                    case OPPORTUNITY:
                    case EXPERT_MINER:
                        return 3500;
                    case BERSERK:
                    case VAMPIRISM:
                    case FORTUNE:
                    case TENACITY:
                        return 4600;
                    case HASTE:
                    case CHAINKILLER:
                        return 5000;
                    case VITALITY:
                        return 6000;
                    case SURFACE:
                    case FURNACE_PROTECTION:
                        return 7500;
                    case IRON_GOLEM:
                        return 235000;
                }
                return -1;
            case 2:
                switch(this){
                    case SHOUT:
                        return 1250;
                    case OPPORTUNITY:
                    case EXPERT_MINER:
                        return 4600;
                    case BERSERK:
                    case VAMPIRISM:
                    case FORTUNE:
                        return 5500;
                    case CHAINKILLER:
                    case TENACITY:
                        return 6500;
                    case SWIFT:
                    case ADRENALINE:
                        return 7500;
                    case VITALITY:
                        return 9000;
                    case HASTE:
                        return 10000;
                }
                return -1;
            case 3:
                switch(this){
                    case SHOUT:
                        return 4000;
                    case OPPORTUNITY:
                    case VAMPIRISM:
                    case FORTUNE:
                    case EXPERT_MINER:
                        return 6500;
                    case BERSERK:
                        return 8500;
                    case SWIFT:
                    case ADRENALINE:
                    case TENACITY:
                        return 9500;
                    case CHAINKILLER:
                        return 10000;
                    case HASTE:
                    case VITALITY:
                        return 15000;
                }
                return -1;
            case 4:
                switch(this){
                    case SHOUT:
                        return 7500;
                    case HASTE:
                        return 25000;
                }
                return -1;
            //only Haste comes this far
            case 5: return 50000;
            case 6: return 75000;
            case 7: return 85000;
            case 8: return 125000;
            case 9: return 130000;
            case 10: return 155000;
        }
        Logger.logError("[Games.Walls.Perk] Perk or Level not found! " + this.toString() + " Level: " + level);
        return -1;
    }

    public int getLevelRequirement(int level) {
        if(this.getMaxLevel() > level || level <= 0){
            return -1;
        }
        if(this == SHOUT){
            switch(level){
                case 1: return 2;
                case 2: return 5;
                case 3: return 15;
                case 4: return 25;
            }
        }
        return levelRequirement;
    }
}
