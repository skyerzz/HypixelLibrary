package com.skyerzz.hypixellib.util.games.paintball;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 21-7-2016.
 */
public enum Hat {
    TNT_HAT("TNT Hat", 4200, Rank.NONE),
    SPEED_HAT("Speed Hat", 3000, Rank.NONE),
    SNOW_HAT("Snow Hat", 4200, Rank.NONE),
    HARD_HAT("Hard Hat", 4200, Rank.NONE),
    ENDER_HAT("Ender Hat", 4200, Rank.NONE),
    HAT_OF_DARKNESS("Hat of Darkness", 4200, Rank.NONE),
    TROLOLOL_HAT("Trololol Hat", 4200, Rank.NONE),
    NORMAL_HAT("Normal Hat", 2000, Rank.NONE),
    DRUNK_HAT("Drunk Hat", 4200, Rank.NONE),
    SQUID_HAT("Squid Hat", 4200, Rank.NONE),
    SPIDER_HAT("Spider Hat", 4200, Rank.NONE),
    SHAKY_HAT("Shaky Hat", 4200, Rank.NONE),
    VIP_AGENTK_HAT("AgentK Hat", 75000, Rank.NONE),
    VIP_KEVINKOOL_HAT("kevinkool Hat", 75000, Rank.NONE),
    VIP_REZZUS_HAT("Rezzus Hat", 75000, Rank.NONE),
    VIP_NEONMASTER_HAT("Mystery Hat", 75000, Rank.NONE),         //Mystery Hat IG, Neonmaster in API.
    VIP_HYPIXEL_HAT("hypixel Hat", 75000, Rank.NONE),
    VIP_CODENAME_B_HAT("codename_B Hat", 75000, Rank.NONE),
    VIP_PAINTBALLKITTY_HAT("PaintballKitty Hat", 75000, Rank.NONE),
    VIP_NOXYD_HAT("NoxyD Hat", 50000, Rank.NONE),
    VIP_GHOST_HAT("Ghost Hat", 50000, Rank.NONE);


    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Hat(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Hat item: Hat.values()){
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

    public Currency getCurrencyType(){ return Currency.COINS; }

    public Rank getRankRequirement(){
        return rankRequirement;
    }

}
