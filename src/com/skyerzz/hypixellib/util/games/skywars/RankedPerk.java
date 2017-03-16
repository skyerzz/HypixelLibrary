package com.skyerzz.hypixellib.util.games.skywars;

import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.CURRENCY;

import java.util.ArrayList;

/**
 * Created by sky on 25-12-2016.
 */
public enum RANKED_PERK {
    ARROW_RECOVERY("Arrow Recovery", RARITY.RARE, 5),
    BLAZING_ARROWS("Blazing Arrows", RARITY.RARE, 5),
    BRIDGER("Bridger", RARITY.COMMON, 5),
    ENDER_MASTERY("Ender Mastery", RARITY.COMMON, 5),
    ENVIRONMENTAL_EXPERT("Environmental Expert", RARITY.RARE, 5),
    JUGGERNAUT("Juggernaut", RARITY.RARE, 5),
    MINING_EXPERTISE("Mining Expertise", RARITY.COMMON, 5),
    COMBO("Combo", RARITY.RARE, 1),
    LAST_STAND("Last stand", RARITY.LEGENDARY, 3),
    RUSHER("Rusher", RARITY.COMMON, 5),
    TOUGH_SKIN("Tough Skin", RARITY.LEGENDARY, 3),

    //one time perks- kit dependant
    ARMORER("Armorer Perk", RARITY.LEGENDARY, 1),
    BOWMAN("Bowman Perk", RARITY.LEGENDARY, 1),
    CHAMPION("Champion Perk", RARITY.LEGENDARY, 1),
    MAGICIAN("Magician Perk", RARITY.LEGENDARY, 1),
    SCOUT("Scout Perk", RARITY.LEGENDARY, 1),
    ATHLETE("Athlete Perk", RARITY.LEGENDARY, 1),
    BLACKSMITH("Blacksmith Perk", RARITY.LEGENDARY, 1),
    HEALER("Healer Perk", RARITY.LEGENDARY, 1),
    PYROMANCER("Pyromancer Perk", RARITY.LEGENDARY, 1),

    @OutDated
    INSTANT_SMELTING("OUTDATED - Instant Smelting", null, -1);

    private String displayName;
    private RARITY rarity;
    private int maxLevel;

    RANKED_PERK(String displayName, RARITY rarity, int maxLevel){
        this.displayName = displayName;
        this.rarity = rarity;
        this.maxLevel = maxLevel;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(RANKED_PERK item: RANKED_PERK.values()){
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
            case ENDER_MASTERY:
                return level*20+"% less damage taken from Ender Pearls.";
            case ENVIRONMENTAL_EXPERT:
                return "Reduces environmental damage by UNKNOWN%";
            case JUGGERNAUT:
                return "Enemy kills give you regen I for " + level*2 + " seconds.";
            case MINING_EXPERTISE:
                return level*10+"% Chance to get 1 extra ore per block mined.";
            case COMBO:
                return "Next bow shot after a kill will have punch effect on target";
            case LAST_STAND:
                return "Below " + (3+level-1) + " hearts you gain resistance I";
            case RUSHER:
                return "Gain " + 3*level + "s of speed I when the game starts";
            case TOUGH_SKIN:
                return "You take " + level*5 + "% less damage from arrows.";

            //kit perks
            case ARMORER:
                return "Your Armorer armor gains 1 level of Protection after each kill. Only active is using the Armorer Kit.";
            case BOWMAN:
                return "Your Archery Bow gains 1 level of Power after each kill. Only active is using the Bowman Kit.";
            case CHAMPION:
                return "Your Champion Sword gains 1 level of Sharpness after each kill. Only active is using the Champion Kit.";
            case MAGICIAN:
                return "Your gain 1 level every 15 seconds and spawn with 3 levels. Every kill you gain 1 level. Only active is using the Magician Kit.";
            case SCOUT:
                return "Your obtain 1 Ender Pearl after each kill and your mining expertise perk percentage is doubled. Only active is using the Scout Kit.";
            case ATHLETE:
                return "Duration of all active perks is doubled and the duration of positive potion effects is increased by 25%. Only active is using the Athlete Kit.";
            case BLACKSMITH:
                return "Every kill you gain 3 levels and drop a random enchanted book up to LVL 1. Only active is using the Blacksmith Kit.";
            case HEALER:
                return "Upon kill, your max health increases by 4 HP and you gain 8 HP back. Only active is using the Healer Kit.";
            case PYROMANCER:
                return "Upon kill obtain 24 seconds of Fire Resistance, 10s of Speed II, and a 5s trail of fire. Only active is using the Pyromancer Kit.";
        }
        return null;
    }
}
