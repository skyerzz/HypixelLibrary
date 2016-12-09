package com.skyerzz.hypixellib.util.games.walls;

import com.skyerzz.hypixellib.util.RANKTYPE;
import com.skyerzz.hypixellib.util.items.all.Item;
import com.skyerzz.hypixellib.util.items.all.ItemStack;
import com.skyerzz.hypixellib.util.items.all.Material;

import java.util.ArrayList;

/**
 * Created by sky on 12-9-2016.
 */
public enum ADVCANCEDSTARTER {
    BOSS_SKILLS("Boss Skills", 1, 10), //checked
    BOSS_DIGGER("Boss Digger", 0, 10),
    BOSS_GUARDIAN("Boss Guardian", 1, 10), //checked
    SCOTSMAN("Scotsman", 0, 10),
    INSANE_FARMER("Insane Farmer", 0, 20),
    THATS_HOT("That's Hot!", 0, 0),
    GOLD_RUSH("Gold Rush", 0, 15),
    LEATHER_WORKER("Leather Worker", 0, 5),
    SOUP_DRINKER("Soup Drinker", 0, 5),
    REALLY_SHINY("Really Shiny", 0, 0),
    PYROMANIAC("Pyromaniac", 0, 0),
    EINSTEIN("Einstein", 0, 0),
    SKYBASE_KING("Skybase King", 0, 0),
    BURN_BABY_BURN("Burn Baby Burn", 0, 0),
    VERY_FORTUNATE("Very Fortunate", 0, 0),
    GET_TO_THE_CHOPPA("Get To The Choppa!", 0, 0),
    SURFACE_TO_AIR_MISSiLE("Surface To Air Missile", 0, 0),
    CHAMPION("Champion", 0, 0);


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
        if(getMaxLevel() > level || level < 0){
            return -1;
        }
        //todo implement
        switch(this){

        }
        return -1;
    }

    public int getLevelRequirement() {
        return levelRequirement;
    }

    private ArrayList<ItemStack> getKitItems(int level){
        if(this.getMaxLevel() > level || level < 0){
            return null;
        }
        ArrayList<ItemStack> kitItems = new ArrayList<>();
        switch(this){
            case BOSS_SKILLS:
                //todo
                break;

        }
        return kitItems;
    }
}
