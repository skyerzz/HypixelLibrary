package com.skyerzz.hypixellib.util.games.skywars;

import com.skyerzz.hypixellib.util.CURRENCY;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;

/**
 * Created by sky on 25-12-2016.
 */
public enum SOLO_PERK {
    ARROW_RECOVERY("Arrow Recovery", RARITY.RARE, 5),
    BLAZING_ARROWS("Blazing Arrows", RARITY.RARE, 5),
    BRIDGER("Bridger", RARITY.COMMON, 5),
    BULLDOZER("Bulldozer", RARITY.LEGENDARY, 5),
    ENDER_MASTERY("Ender Mastery", RARITY.COMMON, 5),
    ENVIRONMENTAL_EXPERT("Environmental Expert", RARITY.RARE, 5),
    INSTANT_SMELTING("Instant Smelting", RARITY.COMMON, 1),
    JUGGERNAUT("Juggernaut", RARITY.RARE, 5),
    LUCKY_CHARM("Lucky Charm", RARITY.COMMON, 6), //todo check final level & prices
    MARKSMANSHIP("Marksmanship", RARITY.LEGENDARY, 1),
    MINING_EXPERTISE("Mining Expertise", RARITY.COMMON, 5),
    SPEED_BOOST("Speed Boost", RARITY.RARE, 5),
    RESISTANCE("Resistance Boost", RARITY.COMMON, 3);


    private String displayName;
    private RARITY rarity;
    private int maxLevel;

    SOLO_PERK(String displayName, RARITY rarity, int maxLevel){
        this.displayName = displayName;
        this.rarity = rarity;
        this.maxLevel = maxLevel;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(SOLO_PERK item: SOLO_PERK.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getCost(int level){
        if(level < 1 || level > maxLevel){
            return -1;
        }
        switch(level){
            case 1:
                switch(this.rarity){
                    case COMMON:
                        return 5000;
                    case RARE:
                        return 50000;
                    case LEGENDARY:
                        return 150000;
                }
            case 2:
                return 5000;
            case 3:
                if(this == RESISTANCE){
                    return 25000; //exception
                }
                return 15000;
            case 4:
                return 20000;
            case 5:
                return 25000;
        }
        return -1;
    }

    public RARITY getRarity(){
        return rarity;
    }

    public int getMaxLevel() { return maxLevel; }

    public CURRENCY getCurrencyType(){ return CURRENCY.COINS; }

    public String getDescription(int level){
        if(level < 1 || level > maxLevel){
            return null;
        }
        switch(this){
            case ARROW_RECOVERY:
                return level*5+"% Chance of getting your arrows back on hit.";
            case BLAZING_ARROWS:
                return level+"% Chance for arrows shot to be on fire.";
            case BRIDGER:
                return level+"% Chance for placeable blocks to not be consumed upon use.";
            case BULLDOZER:
                return "Enemy kills give you strength I for " + level + "s.";
            case ENDER_MASTERY:
                return level*20+"% less damage taken from Ender Pearls.";
            case ENVIRONMENTAL_EXPERT:
                return "Reduces environmental damage by UNKNOWN%";
            case INSTANT_SMELTING:
                return "Increases the smelt speed to make it instant.";
            case JUGGERNAUT:
                return "Enemy kills give you regen I for " + level*2 + " seconds.";
            case LUCKY_CHARM:
                return level*2+"% Chance to get a Golden Apple on enemy kills.";
            case MARKSMANSHIP:
                return "After getting 2 kills with a bow, all your bows get enchanted with Power I";
            case MINING_EXPERTISE:
                return level*10+"% Chance to get 1 extra ore per block mined.";
            case SPEED_BOOST:
                int extra = (level!=5) ? (level*level)-1 : 5; //this algorithm should work for correct seconds
                return "Get haste I for " + level*5+extra + "s when the game starts.";
            case RESISTANCE:
                return "Gain " + level*5 + "s of resistance II when the game starts.";
        }
        return null;
    }
}
