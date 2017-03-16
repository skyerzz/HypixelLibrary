package com.skyerzz.hypixellib.util.games.copsandcrims;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

public enum GUNSKIN{
    USP(        "USP",          Gun.GUNTYPE.PISTOL, 0,   RANK.NONE),
    HK45(       "HK45",         Gun.GUNTYPE.PISTOL, 200, RANK.VIP),
    COLT_M1911( "Colt M1911",   Gun.GUNTYPE.PISTOL, 200, RANK.MVP_PLUS),

    DESERT_EAGLE(   "Desert Eagle",     Gun.GUNTYPE.MAGNUM, 0,   RANK.NONE),
    MAGNUM_REVOLVER("Magnum Revolver",  Gun.GUNTYPE.MAGNUM, 200, RANK.VIP_PLUS),
    RAGING_BULL(    "Raging Bull",      Gun.GUNTYPE.MAGNUM, 200, RANK.MVP),

    MP5("MP5", Gun.GUNTYPE.SMG, 0,   RANK.NONE),
    UZI("UZI", Gun.GUNTYPE.SMG, 200, RANK.VIP),
    P90("P90", Gun.GUNTYPE.SMG, 200, RANK.MVP_PLUS),

    M4(                 "M4",               Gun.GUNTYPE.CARBINE, 0,   RANK.NONE),
    STEYR_AUG(          "Steyr AUG",        Gun.GUNTYPE.CARBINE, 200, RANK.VIP),
    G36C(               "G36C",             Gun.GUNTYPE.CARBINE, 200, RANK.VIP_PLUS),
    SCAR_H(             "SCAR-H",           Gun.GUNTYPE.CARBINE, 200, RANK.MVP),
    ENCHANTED_SCAR_H(   "Enchanted SCAR-H", Gun.GUNTYPE.CARBINE, 200, RANK.MVP),

    AK_47(              "AK-47",            Gun.GUNTYPE.RIFLE, 0,   RANK.NONE),
    FN_FAL(             "FN-FAL",           Gun.GUNTYPE.RIFLE, 200, RANK.VIP_PLUS),
    ACR(                "ACR",              Gun.GUNTYPE.RIFLE, 200, RANK.MVP),
    AK_100(             "AK-100",           Gun.GUNTYPE.RIFLE, 200, RANK.MVP_PLUS),
    ENCHANTED_AK_100(   "Enchanted AK-100", Gun.GUNTYPE.RIFLE, 200, RANK.MVP_PLUS),

    PUMP_ACTION(    "Pump Action",  Gun.GUNTYPE.SHOTGUN, 0,   RANK.NONE),
    SPAS_12(        "Spas-12",      Gun.GUNTYPE.SHOTGUN, 200, RANK.VIP_PLUS),
    SAWED_OFF(      "Sawed Off",    Gun.GUNTYPE.SHOTGUN, 200, RANK.MVP),

    CAL_50("50 Cal", Gun.GUNTYPE.SNIPER, 0, RANK.NONE);

    private Gun.GUNTYPE gunType;
    private String displayName;
    private int cost;
    private RANK rankRequirement;

    GUNSKIN(String name, Gun.GUNTYPE gunType, int cost, RANK rankRequirement){
        this.displayName = name;
        this.gunType = gunType;
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

    public Gun.GUNTYPE getGunType() {
        return gunType;
    }

    public int getCost() {
        return cost;
    }

    public RANK getRankRequirement() {
        return rankRequirement;
    }

    public CURRENCY getCurrency() { return CURRENCY.COINS; }
}