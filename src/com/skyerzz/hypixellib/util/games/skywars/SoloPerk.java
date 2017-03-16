package com.skyerzz.hypixellib.util.games.skywars;

import com.skyerzz.hypixellib.util.Currency;

import java.util.ArrayList;

/**
 * Created by sky on 25-12-2016.
 */
public enum SoloPerk {
    ARROW_RECOVERY("Arrow Recovery", Rarity.RARE, 5),
    BLAZING_ARROWS("Blazing Arrows", Rarity.RARE, 5),
    BRIDGER("Bridger", Rarity.COMMON, 5),
    BULLDOZER("Bulldozer", Rarity.LEGENDARY, 5),
    ENDER_MASTERY("Ender Mastery", Rarity.COMMON, 5),
    ENVIRONMENTAL_EXPERT("Environmental Expert", Rarity.RARE, 5),
    INSTANT_SMELTING("Instant Smelting", Rarity.COMMON, 1),
    JUGGERNAUT("Juggernaut", Rarity.RARE, 5),
    LUCKY_CHARM("Lucky Charm", Rarity.COMMON, 6), //todo check final level & prices
    MARKSMANSHIP("Marksmanship", Rarity.LEGENDARY, 1),
    MINING_EXPERTISE("Mining Expertise", Rarity.COMMON, 5),
    SPEED_BOOST("Speed Boost", Rarity.RARE, 5),
    RESISTANCE_BOOST("Resistance Boost", Rarity.COMMON, 3),
    KNOWLEDGE("Knowledge", Rarity.COMMON, 3),
    ANNOY_O_MITE("Annoy-o-mite", Rarity.RARE, 5),
    NOURISHMENT("Nourishment", Rarity.COMMON, 1),
    REVENGE("Revenge", Rarity.LEGENDARY, 5),
    FAT("Fat", Rarity.RARE, 5);


    private String displayName;
    private Rarity rarity;
    private int maxLevel;

    SoloPerk(String displayName, Rarity rarity, int maxLevel){
        this.displayName = displayName;
        this.rarity = rarity;
        this.maxLevel = maxLevel;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(SoloPerk item: SoloPerk.values()){
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
                if(this == RESISTANCE_BOOST){
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
                return "Reduces environmental damage by " + 5*level + "%";
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
            case RESISTANCE_BOOST:
                return "Gain " + level*5 + "s of resistance II when the game starts.";
            case KNOWLEDGE:
                return (level==1) ? "Every kill you gain " + level + " EXP level." : "Every kill you gain " + level + " EXP levels.";
            case ANNOY_O_MITE:
                return "Chance to spawn a Silverfish next to enemies when you hit them with a bow. (" + level*5 + "%).";
            case NOURISHMENT:
                return "Every kill gives you full hunger and saturation.";
            case REVENGE:
                return level*5+"% chance to spawn a zombie when you die.";
            case FAT:
                return "Gain" + (3+level) + "s of absorption I when the game starts.";
        }
        return null;
    }
}
