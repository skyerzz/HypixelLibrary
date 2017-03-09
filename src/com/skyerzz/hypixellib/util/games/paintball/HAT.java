package com.skyerzz.hypixellib.util.games.paintball;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 21-7-2016.
 */
public enum HAT {
    TNT_HAT("TNT Hat", 4200, RANK.NONE),
    SPEED_HAT("Speed Hat", 3000, RANK.NONE),
    SNOW_HAT("Snow Hat", 4200, RANK.NONE),
    HARD_HAT("Hard Hat", 4200, RANK.NONE),
    ENDER_HAT("Ender Hat", 4200, RANK.NONE),
    HAT_OF_DARKNESS("Hat of Darkness", 4200, RANK.NONE),
    TROLOLOL_HAT("Trololol Hat", 4200, RANK.NONE),
    NORMAL_HAT("Normal Hat", 2000, RANK.NONE),
    DRUNK_HAT("Drunk Hat", 4200, RANK.NONE),
    SQUID_HAT("Squid Hat", 4200, RANK.NONE),
    SPIDER_HAT("Spider Hat", 4200, RANK.NONE),
    SHAKY_HAT("Shaky Hat", 4200, RANK.NONE),
    VIP_AGENTK_HAT("AgentK Hat", 75000, RANK.NONE),
    VIP_KEVINKOOL_HAT("kevinkool Hat", 75000, RANK.NONE),
    VIP_REZZUS_HAT("Rezzus Hat", 75000, RANK.NONE),
    VIP_NEONMASTER_HAT("Mystery Hat", 75000, RANK.NONE),         //Mystery Hat IG, Neonmaster in API.
    VIP_HYPIXEL_HAT("hypixel Hat", 75000, RANK.NONE),
    VIP_CODENAME_B_HAT("codename_B Hat", 75000, RANK.NONE),
    VIP_PAINTBALLKITTY_HAT("PaintballKitty Hat", 75000, RANK.NONE),
    VIP_NOXYD_HAT("NoxyD Hat", 50000, RANK.NONE),
    VIP_GHOST_HAT("Ghost Hat", 50000, RANK.NONE);


    private String displayName;
    private int cost;
    private RANK rankRequirement;

    HAT(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(HAT item: HAT.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getCost(){
        return cost;
    }

    public CURRENCY getCurrencyType(){ return CURRENCY.COINS; }

    public RANK getRankRequirement(){
        return rankRequirement;
    }

}
