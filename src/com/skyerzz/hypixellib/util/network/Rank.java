package com.skyerzz.hypixellib.util.network;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum Rank {
    NONE("default"),
    VIP("[VIP]"),
    VIP_PLUS("[VIP+]"),
    MVP("[MVP]"),
    MVP_PLUS("[MVP+]"),
    HELPER("[HELPER]"),
    MODERATOR("[MOD]"),
    ADMIN("[ADMIN]"),
    OWNER("[OWNER]", ADMIN),
    YOUTUBER("[YOUTUBER]"),
    MCPROHOSTING("[MCPROHOSTING]", YOUTUBER),
    MOJANG("[MOJANG]", MODERATOR);

    private String displayName;
    private Rank baseRank;

    Rank(String displayName){
        this.displayName = displayName;
    }

    Rank(String displayName, Rank baseRank){
        this(displayName);
        this.baseRank = baseRank;
    }


    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Rank item: Rank.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    /**
     * returns the baserank if it exists, otherwise null
     * @return baserank / null
     */
    public Rank getBaseRank(){
        return baseRank;
    }


}
