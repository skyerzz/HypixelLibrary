package com.skyerzz.hypixellib.util.games.walls;

import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.util.items.all.Item;
import com.skyerzz.hypixellib.util.items.all.ItemStack;

import java.util.ArrayList;

/**
 * Created by sky on 12-9-2016.
 */
public enum ADVCANCEDSTARTER {
    BOSS_SKILLS("Boss Skills", 1, 10),
    BOSS_DIGGER("Boss Digger", 1, 10),
    BOSS_GUARDIAN("Boss Guardian", 1, 10),
    SCOTSMAN("Scotsman", 1, 10),
    INSANE_FARMER("Insane Farmer", 5, 20),
    THATS_HOT("That's Hot!", 1, 0),
    GOLD_RUSH("Gold Rush", 2, 15),
    LEATHER_WORKER("Leather Worker", 1, 5),
    SOUP_DRINKER("Soup Drinker", 1, 5),
    REALLY_SHINY("Really Shiny", 1, 0),
    PYROMANIAC("Pyromaniac", 1, 0),
    EINSTEIN("Einstein", 1, 0),
    SKYBASE_KING("Skybase King", 1, 0),
    BURN_BABY_BURN("Burn Baby Burn", 1, 0),
    VERY_FORTUNATE("Very Fortunate", 2, 0),
    GET_TO_THE_CHOPPA("Get To The Choppa!", 2, 0),
    SURFACE_TO_AIR_MISSILE("Surface To Air Missile", 2, 0),
    CHAMPION("Champion", 1, 0);


    private String displayName;
    private int maxLevel;
    private int levelRequirement;

    ADVCANCEDSTARTER(String displayName, int maxLevel, int levelRequirement){
        this.displayName = displayName;
        this.maxLevel = maxLevel;
        this.levelRequirement = levelRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static java.util.ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(ADVCANCEDSTARTER item: ADVCANCEDSTARTER.values()){
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

    public int getCost(int level){
        if(getMaxLevel() > level || level <= 0){
            return -1;
        }
        switch(level) {
            case 1:
                switch (this) {
                    case CHAMPION:
                        return 120000;
                    case SURFACE_TO_AIR_MISSILE:
                        return 100000;
                    case GET_TO_THE_CHOPPA:
                        return 70000;
                    case VERY_FORTUNATE:
                        return 60000;
                    case SKYBASE_KING:
                    case BURN_BABY_BURN:
                        return 54000;
                    case EINSTEIN:
                        return 46000;
                    case REALLY_SHINY:
                        return 15900;
                    case GOLD_RUSH:
                        return 8500;
                    case INSANE_FARMER:
                        return 8000;
                    case THATS_HOT:
                        return 7900;
                    case BOSS_SKILLS:
                    case SCOTSMAN:
                        return 6000;
                    case PYROMANIAC:
                        return 4800;
                    case BOSS_DIGGER:
                    case BOSS_GUARDIAN:
                        return 3500;
                    case LEATHER_WORKER:
                    case SOUP_DRINKER:
                        return 1350;
                }
                return -1;
            case 2:
                switch (this) {
                    case SURFACE_TO_AIR_MISSILE:
                        return 105000;
                    case GET_TO_THE_CHOPPA:
                        return 90000;
                    case VERY_FORTUNATE:
                        return 80000;
                    case GOLD_RUSH:
                        return 19500;
                    case INSANE_FARMER:
                        return 15000;
                }
                return -1;
            case 3:
                switch (this) {
                    case INSANE_FARMER:
                        return 25000;
                }
                return -1;
            case 4:
                switch (this) {
                    case INSANE_FARMER:
                        return 50000;
                }
                return -1;
            case 5:
                switch (this) {
                    case INSANE_FARMER:
                        return 200000;
                }
                return -1;
        }
        return -1;
    }

    public int getLevelRequirement() {
        return levelRequirement;
    }

    public ArrayList<ItemStack> getKitItems(int level){
        if(this.getMaxLevel() > level || level <= 0){
            return null;
        }
        ArrayList<ItemStack> kit = new ArrayList<>();
        switch(this){
            case BOSS_SKILLS:
                kit.add(Item.stonePick);
                return kit;
            case BOSS_DIGGER:
                kit.add(Item.stoneShovel);
                return kit;
            case BOSS_GUARDIAN:
                kit.add(Item.stoneSword);
                return kit;
            case SCOTSMAN:
                kit.add(Item.stoneAxe);
                return kit;
            case INSANE_FARMER:
                switch(level){
                    case 1:
                        kit.add(Item.diamondHoe);
                        return kit;
                    case 2:
                        kit.add(Item.diamondHoeUnbreaking3);
                        return kit;
                    case 3:
                        kit.add(Item.diamondHoeUnbreaking3Loot3);
                        return kit;
                    case 4:
                        kit.add(Item.diamondHoeUnbreaking3Loot3Sharp5);
                        return kit;
                    case 5:
                        kit.add(Item.diamondHoeUnbreaking3Loot3Sharp6);
                        return kit;
                }
                return null;
            case THATS_HOT:
                kit.add(new ItemStack(Item.furnace, 1));
                return kit;
            case GOLD_RUSH:
                switch(level){
                    case 1:
                        kit.add(new ItemStack(Item.gold, 8));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.gold, 16));
                        return kit;
                }
                return null;
            case LEATHER_WORKER:
                kit.add(new ItemStack(Item.cowEgg, 1));
                return kit;
            case SOUP_DRINKER:
                kit.add(new ItemStack(Item.mooshEgg, 1));
                return kit;
            case REALLY_SHINY:
                kit.add(new ItemStack(Item.beacon, 1));
                return kit;
            case PYROMANIAC:
                kit.add(Item.flintNSteel);
                return kit;
            case EINSTEIN:
                kit.add(new ItemStack(Item.expBottle, 6));
                return kit;
            case SKYBASE_KING:
                kit.add(Item.ironBootsFf10);
                return kit;
            case BURN_BABY_BURN:
                kit.add(Item.ironHelmetFProt10);
                return kit;
            case VERY_FORTUNATE:
                switch(level){
                    case 1:
                        kit.add(Item.stonePickFortune3);
                        return kit;
                    case 2:
                        kit.add(Item.ironPickFortune1);
                        return kit;
                }
                return null;
            case GET_TO_THE_CHOPPA:
                switch(level){
                    case 1:
                        kit.add(Item.stoneAxeEff5);
                        return kit;
                    case 2:
                        kit.add(Item.diamondAxeEff3Unbreaking2);
                        return kit;
                }
                return null;
            case SURFACE_TO_AIR_MISSILE:
                switch(level){
                    case 1:
                        kit.add(Item.bowPunch1Pow1);
                        return kit;
                    case 2:
                        kit.add(Item.bowPunch2Pow1);
                        return kit;
                }
                return null;
            case CHAMPION:
                kit.add(new ItemStack(Item.creeperEgg, 1));
                return kit;

        }
        Logger.logError("[Games.Walls.AdvancedStarter] Starter or Level not found! " + this.toString() + " Level: " + level);
        return null;
    }
}
