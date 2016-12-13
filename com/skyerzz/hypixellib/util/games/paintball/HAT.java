package com.skyerzz.hypixellib.util.games.paintball;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 21-7-2016.
 */
public enum HAT {
    TNT_HAT("TNT Hat", 4200, RANKTYPE.DEFAULT),
    SPEED_HAT("Speed Hat", 3000, RANKTYPE.DEFAULT),
    SNOW_HAT("Snow Hat", 4200, RANKTYPE.DEFAULT),
    HARD_HAT("Hard Hat", 4200, RANKTYPE.DEFAULT),
    ENDER_HAT("Ender Hat", 4200, RANKTYPE.DEFAULT),
    HAT_OF_DARKNESS("Hat of Darkness", 4200, RANKTYPE.DEFAULT),
    TROLOLOL_HAT("Trololol Hat", 4200, RANKTYPE.DEFAULT),
    NORMAL_HAT("Normal Hat", 2000, RANKTYPE.DEFAULT),
    DRUNK_HAT("Drunk Hat", 4200, RANKTYPE.DEFAULT),
    SQUID_HAT("Squid Hat", 4200, RANKTYPE.DEFAULT),
    SPIDER_HAT("Spider Hat", 4200, RANKTYPE.DEFAULT),
    SHAKY_HAT("Shaky Hat", 4200, RANKTYPE.DEFAULT),
    VIP_AGENTK_HAT("AgentK Hat", 75000, RANKTYPE.DEFAULT),
    VIP_KEVINKOOL_HAT("kevinkool Hat", 75000, RANKTYPE.DEFAULT),
    VIP_REZZUS_HAT("Rezzus Hat", 75000, RANKTYPE.DEFAULT),
    VIP_NEONMASTER_HAT("Mystery Hat", 75000, RANKTYPE.DEFAULT),         //Mystery Hat IG, Neonmaster in API.
    VIP_HYPIXEL_HAT("hypixel Hat", 75000, RANKTYPE.DEFAULT),
    VIP_CODENAME_B_HAT("codename_B Hat", 75000, RANKTYPE.DEFAULT),
    VIP_PAINTBALLKITTY_HAT("PaintballKitty Hat", 75000, RANKTYPE.DEFAULT),
    VIP_NOXYD_HAT("NoxyD Hat", 50000, RANKTYPE.DEFAULT),
    VIP_GHOST_HAT("Ghost Hat", 50000, RANKTYPE.DEFAULT);


    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    HAT(String displayName, int cost, RANKTYPE rankRequirement){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }

}
