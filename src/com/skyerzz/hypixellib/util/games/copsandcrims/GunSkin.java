package com.skyerzz.hypixellib.util.games.copsandcrims;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

public enum GunSkin {
    USP(        "USP",          Gun.GUNTYPE.PISTOL, 0,   Rank.NONE),
    HK45(       "HK45",         Gun.GUNTYPE.PISTOL, 200, Rank.VIP),
    COLT_M1911( "Colt M1911",   Gun.GUNTYPE.PISTOL, 200, Rank.MVP_PLUS),

    DESERT_EAGLE(   "Desert Eagle",     Gun.GUNTYPE.MAGNUM, 0,   Rank.NONE),
    MAGNUM_REVOLVER("Magnum Revolver",  Gun.GUNTYPE.MAGNUM, 200, Rank.VIP_PLUS),
    RAGING_BULL(    "Raging Bull",      Gun.GUNTYPE.MAGNUM, 200, Rank.MVP),

    MP5("MP5", Gun.GUNTYPE.SMG, 0,   Rank.NONE),
    UZI("UZI", Gun.GUNTYPE.SMG, 200, Rank.VIP),
    P90("P90", Gun.GUNTYPE.SMG, 200, Rank.MVP_PLUS),

    M4(                 "M4",               Gun.GUNTYPE.CARBINE, 0,   Rank.NONE),
    STEYR_AUG(          "Steyr AUG",        Gun.GUNTYPE.CARBINE, 200, Rank.VIP),
    G36C(               "G36C",             Gun.GUNTYPE.CARBINE, 200, Rank.VIP_PLUS),
    SCAR_H(             "SCAR-H",           Gun.GUNTYPE.CARBINE, 200, Rank.MVP),
    ENCHANTED_SCAR_H(   "Enchanted SCAR-H", Gun.GUNTYPE.CARBINE, 200, Rank.MVP),

    AK_47(              "AK-47",            Gun.GUNTYPE.RIFLE, 0,   Rank.NONE),
    FN_FAL(             "FN-FAL",           Gun.GUNTYPE.RIFLE, 200, Rank.VIP_PLUS),
    ACR(                "ACR",              Gun.GUNTYPE.RIFLE, 200, Rank.MVP),
    AK_100(             "AK-100",           Gun.GUNTYPE.RIFLE, 200, Rank.MVP_PLUS),
    ENCHANTED_AK_100(   "Enchanted AK-100", Gun.GUNTYPE.RIFLE, 200, Rank.MVP_PLUS),

    PUMP_ACTION(    "Pump Action",  Gun.GUNTYPE.SHOTGUN, 0,   Rank.NONE),
    SPAS_12(        "Spas-12",      Gun.GUNTYPE.SHOTGUN, 200, Rank.VIP_PLUS),
    SAWED_OFF(      "Sawed Off",    Gun.GUNTYPE.SHOTGUN, 200, Rank.MVP),

    CAL_50("50 Cal", Gun.GUNTYPE.SNIPER, 0, Rank.NONE);

    private Gun.GUNTYPE gunType;
    private String displayName;
    private int cost;
    private Rank rankRequirement;

    GunSkin(String name, Gun.GUNTYPE gunType, int cost, Rank rankRequirement){
        this.displayName = name;
        this.gunType = gunType;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(GunSkin item: GunSkin.values()){
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

    public Rank getRankRequirement() {
        return rankRequirement;
    }

    public Currency getCurrency() { return Currency.COINS; }
}