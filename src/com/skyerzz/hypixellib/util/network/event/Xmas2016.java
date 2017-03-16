package com.skyerzz.hypixellib.util.network.event;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 16/03/2017.
 */
public enum Xmas2016 {
    MAIN_LOBBY_1,
    MAIN_LOBBY_2,
    MAIN_LOBBY_3,
    MAIN_LOBBY_4,
    MAIN_LOBBY_5,
    MAIN_LOBBY_6,
    MAIN_LOBBY_7,
    MAIN_LOBBY_8,
    MAIN_LOBBY_9,
    MAIN_LOBBY_10,
    MAIN_LOBBY_11,
    MAIN_LOBBY_12,
    QUAKE,
    CRAZYWALLS,
    ARENA,
    ARCADE,
    TNT,
    MEGAWALLS,
    SKYWARS,
    VAMPZ,
    PAINTBALL,
    WALLS,
    BLITZ,
    CVC,
    WARLORDS,
    TKR,
    SPEEDUHC,
    SKYCLASH,
    SMASH,
    UHC;



    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Xmas2016 item: Xmas2016.values()){
            list.add(item.name());
        }
        return list;
    }
}
