package com.skyerzz.hypixellib.util.network;

import com.skyerzz.hypixellib.util.network.collectibles.pet.CompanionSpecies;

import java.util.ArrayList;

/**
 * Created by sky on 13-6-2017.
 */
public enum Banner {
    HYPIXEL("Hypixel Banner"),
    SNOW_BUNNY("Snow Bunny Banner"),
    REINDEER("Reindeer Banner"),
    HOLIDAY_TREE("Holiday Tree Banner"),
    SANTA("Santa Banner"),
    HOLIDAY_WREATH("Holiday Wreath Banner"),
    HEART("Heart Banner"),
    GUITAR("Guitar Banner"),
    DINO("Dino Banner"),
    REDPOOL("Redpool Banner"),
    PENGU("Pengu Banner"),
    SKULL_KING("Skull King Banner", 100);

    private String displayName;
    private int unlockLevel;

    Banner(String displayName){
        this(displayName, 0);
    }

    Banner(String displayName, int unlockLevel){
        this.displayName = displayName;
        this.unlockLevel = unlockLevel;
    }

    public String getDisplayName(){ return displayName;}

    public int getUnlockLevel(){ return unlockLevel; }



    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(CompanionSpecies item: CompanionSpecies.values()){
            list.add(item.name());
        }
        return list;
    }

}
