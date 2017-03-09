package com.skyerzz.hypixellib.util;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum RANK {
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
    private RANK baseRank;

    RANK(String displayName){
        this.displayName = displayName;
    }

    RANK(String displayName, RANK baseRank){
        this(displayName);
        this.baseRank = baseRank;
    }


    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(RANK item: RANK.values()){
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
    public RANK getBaseRank(){
        return baseRank;
    }


}
