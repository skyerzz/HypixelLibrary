package com.skyerzz.hypixellib.util.games.skywars;

import com.skyerzz.hypixellib.util.network.Currency;

import java.util.ArrayList;

/**
 * Created by sky on 25-12-2016.
 */
public enum MegaPerk {
    ARROW_RECOVERY("Arrow Recovery", Rarity.RARE, 5),
    BLAZING_ARROWS("Blazing Arrows", Rarity.RARE, 5),
    ENDER_MASTERY("Ender Mastery", Rarity.COMMON, 5),
    JUGGERNAUT("Juggernaut", Rarity.RARE, 5),
    MINING_EXPERTISE("Mining Expertise", Rarity.COMMON, 5),
    RUSHER("Rusher", Rarity.COMMON, 5),
    TANK("Tank", Rarity.LEGENDARY, 5),
    NOTORIETY("Notoriety", Rarity.LEGENDARY, 5),
    NOURISHMENT("Nourishment", Rarity.COMMON, 1),
    INSTANT_SMELTING("Instant Smelting", Rarity.COMMON, 1),
    MARKSMANSHIP("Marksmanship", Rarity.LEGENDARY, 1),
    BRIDGER("Bridger", Rarity.COMMON, 5),
    ENVIRONMENTAL_EXPERT("Environmental Expert", Rarity.RARE, 5),
    LUCKY_CHARM("Lucky Charm", Rarity.COMMON, 5); //todo unknown max level: find out

    private String displayName;
    private Rarity rarity;
    private int maxLevel;

    MegaPerk(String displayName, Rarity rarity, int maxLevel){
        this.displayName = displayName;
        this.rarity = rarity;
        this.maxLevel = maxLevel;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(MegaPerk item: MegaPerk.values()){
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
                switch(rarity){
                    case COMMON:
                        return 5000;
                    case RARE:
                        return 50000;
                    case LEGENDARY:
                        return 150000;
                }
            case 2:
                return 25000;
            case 3:
                return 75000;
            case 4:
                return 100000;
            case 5:
                return 125000;
        }
        return -1;
    }

    public Rarity getRarity(){
        return rarity;
    }

    public int getMaxLevel() { return maxLevel; }

    public Currency getCurrencyType(){ return Currency.COINS; }

    public String getDescription(int level){
        if(level < 1 || level > maxLevel){
            return null;
        }
        switch(this){
            case ARROW_RECOVERY:
                return "Chance of getting back your arrows on bow hit (" + 5*level + "%).";
            case BLAZING_ARROWS:
                return "Chance of shooting a fire arrow with a bow (" + 2*level + "%).";
            case ENDER_MASTERY:
                return "Reduces damages taken with enderpearls by " + 20*level + "%";
            case JUGGERNAUT:
                return "Enemy kills give you regen II for " + 2*level + " seconds.";
            case MINING_EXPERTISE:
                return level*5 + "% chance to get 1 extra ore per block mined.";
            case RUSHER:
                return "Gain " + level*3 + "s of speedI when the game starts.";
            case TANK:
                return "Enemy kills give you resistance I for " + level*2 + "s.";
            case NOTORIETY:
                return "Chance to add one level of sharpness to your sword after every kill with it. (" + level*2 + "%).";
            case NOURISHMENT:
                return "Every kill gives you full hunger and saturation.";
            case INSTANT_SMELTING:
                return "Automatically smelt mined ores into ingots!";
            case MARKSMANSHIP:
                return "After getting 3 kills with a bow, all your bows get enchanted with power I.";
            case LUCKY_CHARM:
                return level*2+"% Chance to get a Golden Apple on enemy kills.";
            case BRIDGER:
                return level+"% Chance for placeable blocks to not be consumed upon use.";
            case ENVIRONMENTAL_EXPERT:
                return "Reduces environmental damage by " + 5*level + "%";
        }
        return null;
    }
}
