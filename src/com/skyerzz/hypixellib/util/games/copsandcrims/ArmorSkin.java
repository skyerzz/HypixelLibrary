package com.skyerzz.hypixellib.util.games.copsandcrims;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 25-8-2016.
 */
public enum ARMORSKIN {
    DEFAULT_HELMET_OCELOT(  "Cop Helmet: Kevlar Helmet",        350, RANK.NONE),
    DEFAULT_ARMOR_OCELOT(   "Cop Armor: Kevlat Vest",           650, RANK.NONE),
    VIP_OCELOT_HELMET(      "Cop Helmet: Tactical Helmet",      350, RANK.VIP_PLUS),
    VIP_OCELOT_ARMOR(       "Cop Armor: Tactical Vest",         650, RANK.VIP),
    MVP_OCELOT_HELMET(      "Cop Helmet: Skullaclava",          350, RANK.MVP_PLUS),
    MVP_OCELOT_ARMOR(       "Cop Armor: Tactical Vest Mk2",     650, RANK.MVP),

    DEFAULT_HELMET_CREEPER( "Crim Helmet: Kevlar Helmet",       350, RANK.NONE),
    DEFAULT_ARMOR_CREEPER(  "Crim Armor: Kevlar Vest",          650, RANK.NONE),
    VIP_CREEPER_HELMET(     "Crim Helmet: Facemask",            350, RANK.VIP_PLUS),
    VIP_CREEPER_ARMOR(      "Crim Armor: Combat Jacket",        650, RANK.VIP),
    MVP_CREEPER_HELMET(     "Crim Helmet: Bandana and Mask",    350, RANK.MVP_PLUS),
    MVP_CREEPER_ARMOR(      "Crim Armor: Jacket with Chain",    650, RANK.MVP);


    private String displayName;
    private int cost;
    private RANK rankRequirement;

    ARMORSKIN(String name, int cost, RANK rankRequirement){
        this.displayName = name;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(ARMORSKIN item: ARMORSKIN.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){return displayName;}

    public int getCost() {
        return cost;
    }

    public RANK getRankRequirement() {
        return rankRequirement;
    }

    public CURRENCY getCurrency() { return CURRENCY.COINS; }

}
