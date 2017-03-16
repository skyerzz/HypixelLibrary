package com.skyerzz.hypixellib.util.games.skywars;

import java.util.ArrayList;

/**
 * Created by sky on 25-12-2016.
 */
public enum CAGE {
    //todo add materials too
    DEFAULT("Glass Cage", null), //also default for older profiles
    GLASS_CAGE("Glass Cage", null), //default

    BANANA_CAGE("Banana Cage", RARITY.COMMON),
    BUBBLEGUM_CAGE("Bubblegum Cage", RARITY.COMMON),
    CLOUD_CAGE("Cloud Cage", RARITY.COMMON),
    FARM_HUNT_CAGE("Farm Hunt Cage", RARITY.COMMON),
    GREEN_CAGE("Green Cage", RARITY.COMMON),
    LIME_CAGE("Lime Cage", RARITY.COMMON),
    MIST_CAGE("Mist Cage", RARITY.COMMON),
    NETHER_CAGE("Nether Cage", RARITY.COMMON),
    ORANGE_CAGE("Orange Cage", RARITY.COMMON),
    REDSTONE_MASTER_CAGE("Redstone Master Cage", RARITY.COMMON),
    SKY_CAGE("Sky Cage", RARITY.COMMON),
    TOFFEE_CAGE("Toffee Cage", RARITY.COMMON),
    VOID_CAGE("Void Cage", RARITY.COMMON),

    ANGEL_CAGE("Angel Cage", RARITY.RARE),
    BLUE_CAGE("Blue Cage", RARITY.RARE),
    DARK_CAGE("Dark Cage", RARITY.RARE),
    NOTCH_APPLE_CAGE("Notch Apple Cage", RARITY.RARE),
    PREMIUM_CAGE("Premium Cage", RARITY.RARE),
    RAGE_CAGE("Rage Cage", RARITY.RARE),
    ROYAL_CAGE("Royal Cage", RARITY.RARE),

    NICOLAS_CAGE("Nicolas Cage", RARITY.LEGENDARY),
    ICE_CAGE("Ice Cage", RARITY.LEGENDARY),
    PRISON_CAGE("Prison Cage", RARITY.LEGENDARY),
    RAINBOW_CAGE("Rainbow Cage", RARITY.LEGENDARY),
    SLIME_CAGE("Slime Cage", RARITY.LEGENDARY),
    TREE_CAGE("Tree Cage", RARITY.LEGENDARY),

    MAGIC_BOX_CAGE("Magic Box Cage", RARITY.RANKED_REWARD);


    private String displayName;
    private RARITY rarity;

    CAGE(String displayName, RARITY rarity){
        this.displayName = displayName;
        this.rarity = rarity;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(CAGE item: CAGE.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public RARITY getRarity(){ return rarity; }

    public String getDescription(){
        return "Select the " + getDisplayName() + ". This change is cosmetic";
    }
}
