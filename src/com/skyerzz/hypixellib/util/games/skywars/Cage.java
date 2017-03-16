package com.skyerzz.hypixellib.util.games.skywars;

import java.util.ArrayList;

/**
 * Created by sky on 25-12-2016.
 */
public enum Cage {
    //todo add materials too
    DEFAULT("Glass Cage", null), //also default for older profiles
    GLASS_CAGE("Glass Cage", null), //default

    BANANA_CAGE("Banana Cage", Rarity.COMMON),
    BUBBLEGUM_CAGE("Bubblegum Cage", Rarity.COMMON),
    CLOUD_CAGE("Cloud Cage", Rarity.COMMON),
    FARM_HUNT_CAGE("Farm Hunt Cage", Rarity.COMMON),
    GREEN_CAGE("Green Cage", Rarity.COMMON),
    LIME_CAGE("Lime Cage", Rarity.COMMON),
    MIST_CAGE("Mist Cage", Rarity.COMMON),
    NETHER_CAGE("Nether Cage", Rarity.COMMON),
    ORANGE_CAGE("Orange Cage", Rarity.COMMON),
    REDSTONE_MASTER_CAGE("Redstone Master Cage", Rarity.COMMON),
    SKY_CAGE("Sky Cage", Rarity.COMMON),
    TOFFEE_CAGE("Toffee Cage", Rarity.COMMON),
    VOID_CAGE("Void Cage", Rarity.COMMON),

    ANGEL_CAGE("Angel Cage", Rarity.RARE),
    BLUE_CAGE("Blue Cage", Rarity.RARE),
    DARK_CAGE("Dark Cage", Rarity.RARE),
    NOTCH_APPLE_CAGE("Notch Apple Cage", Rarity.RARE),
    PREMIUM_CAGE("Premium Cage", Rarity.RARE),
    RAGE_CAGE("Rage Cage", Rarity.RARE),
    ROYAL_CAGE("Royal Cage", Rarity.RARE),

    NICOLAS_CAGE("Nicolas Cage", Rarity.LEGENDARY),
    ICE_CAGE("Ice Cage", Rarity.LEGENDARY),
    PRISON_CAGE("Prison Cage", Rarity.LEGENDARY),
    RAINBOW_CAGE("Rainbow Cage", Rarity.LEGENDARY),
    SLIME_CAGE("Slime Cage", Rarity.LEGENDARY),
    TREE_CAGE("Tree Cage", Rarity.LEGENDARY),

    MAGIC_BOX_CAGE("Magic Box Cage", Rarity.RANKED_REWARD);


    private String displayName;
    private Rarity rarity;

    Cage(String displayName, Rarity rarity){
        this.displayName = displayName;
        this.rarity = rarity;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Cage item: Cage.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public Rarity getRarity(){ return rarity; }

    public String getDescription(){
        return "Select the " + getDisplayName() + ". This change is cosmetic";
    }
}
