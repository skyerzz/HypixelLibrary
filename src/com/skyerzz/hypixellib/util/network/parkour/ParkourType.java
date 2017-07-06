package com.skyerzz.hypixellib.util.network.parkour;

import java.util.ArrayList;

/**
 * Created by sky on 1-7-2017.
 */
public enum ParkourType {

    ARCADEGAMES,
    ARENA,
    BLITZLOBBY, //new lobby
    BLITZ, //old blitz lobby (2015)
    COPSNCRIMS,
    MAINLOBBY,
    MEGAWALLS,
    OVERHAUL, //plancke got this stat in 2014...
    PAINTBALL,
    QUAKECRAFT,
    SC, //DeprecatedNether, assuming dev value for Skyclash
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
