package com.skyerzz.hypixellib.util.games.copsandcrims;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 25-8-2016.
 */
public enum ARMORSKIN {
    DEFAULT_HELMET_OCELOT(  "Cop Helmet: Kevlar Helmet",        350, RANKTYPE.DEFAULT),
    DEFAULT_ARMOR_OCELOT(   "Cop Armor: Kevlat Vest",           650, RANKTYPE.DEFAULT),
    VIP_OCELOT_HELMET(      "Cop Helmet: Tactical Helmet",      350, RANKTYPE.VIP_PLUS),
    VIP_OCELOT_ARMOR(       "Cop Armor: Tactical Vest",         650, RANKTYPE.VIP),
    MVP_OCELOT_HELMET(      "Cop Helmet: Skullaclava",          350, RANKTYPE.MVP_PLUS),
    MVP_OCELOT_ARMOR(       "Cop Armor: Tactical Vest Mk2",     650, RANKTYPE.MVP),

    DEFAULT_HELMET_CREEPER( "Crim Helmet: Kevlar Helmet",       350, RANKTYPE.DEFAULT),
    DEFAULT_ARMOR_CREEPER(  "Crim Armor: Kevlar Vest",          650, RANKTYPE.DEFAULT),
    VIP_CREEPER_HELMET(     "Crim Helmet: Facemask",            350, RANKTYPE.VIP_PLUS),
    VIP_CREEPER_ARMOR(      "Crim Armor: Combat Jacket",        650, RANKTYPE.VIP),
    MVP_CREEPER_HELMET(     "Crim Helmet: Bandana and Mask",    350, RANKTYPE.MVP_PLUS),
    MVP_CREEPER_ARMOR(      "Crim Armor: Jacket with Chain",    650, RANKTYPE.MVP);


    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    ARMORSKIN(String name, int cost, RANKTYPE rankRequirement){
        this.displayName = name;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(GUNSKIN item: GUNSKIN.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){return displayName;}

    public int getCost() {
        return cost;
    }

    public RANKTYPE getRankRequirement() {
        return rankRequirement;
    }

    public CURRENCY getCurrency() { return CURRENCY.COINS; }

}
