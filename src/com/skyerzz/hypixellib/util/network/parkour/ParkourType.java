package com.skyerzz.hypixellib.util.network.parkour;

import java.util.ArrayList;

/**
 * Created by sky on 1-7-2017.
 */
public enum ParkourType {

    ARCADEGAMES,
    ARENA,
    BLITZLOBBY,
    COPSNCRIMS,
    MAINLOBBY,
    MEGAWALLS,
    PAINTBALL,
    QUAKECRAFT,
    TNT,
    THEWALLSLOBBY,
    CHRISTMAS,
    MAIN,
    UHC,
    VAMPIREZ,
    WARLORDS,
    TURBO,
    SKYWARS,
    NEWMAINLOBBY,
    ADVENTURE,
    TRUEPVPPARKOUR,
    SUPERSMASH,
    SPEEDUHC,
    SKYCLASH,
    PROTOTYPE,
    BEDWARS;


    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(ParkourType item: ParkourType.values()){
            list.add(item.name());
        }
        return list;
    }
}
