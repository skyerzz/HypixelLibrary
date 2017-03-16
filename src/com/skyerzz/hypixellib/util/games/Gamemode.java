package com.skyerzz.hypixellib.util.games;

import java.util.ArrayList;

/**
 * Created by sky on 4-9-2016.
 */
public enum Gamemode {
    ARCADE,
    ARENA_BRAWL,
    COPS_AND_CRIMS,
    BLITZ,
    WALLS,
    MEGA_WALLS,
    TNT_GAMES,
    VAMPIREZ,
    PAINTBALL,
    QUAKECRAFT,
    CRAZY_WALLS,
    UHC,
    WARLORDS,
    SKYWARS,
    TURBO_KART_RACERS,
    SMASH_HEROES,
    SPEED_UHC,
    SKYCLASH;

    Gamemode(){

    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Gamemode item: Gamemode.values()){
            list.add(item.name());
        }
        return list;
    }

}
