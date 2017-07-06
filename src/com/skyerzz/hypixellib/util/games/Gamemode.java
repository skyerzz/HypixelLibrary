package com.skyerzz.hypixellib.util.games;

import java.util.ArrayList;

/**
 * Created by sky on 4-9-2016.
 */
public enum Gamemode {
    ARCADEGAMES("Arcade Games"),
    ARENA("Arena Brawl"),
    COPS_AND_CRIMS("Cops 'n Crims"),
    BLITZ("Blitz Survival Games"),
    WALLS("The Walls"),
    MEGA_WALLS("Mega Walls"),
    TNTGAMES("Tnt Games"),
    VAMPIREZ("VampireZ"),
    PAINTBALL("Paintball"),
    QUAKECRAFT("Quakecraft"),
    CRAZY_WALLS("Crazy Walls"),
    UHC("UHC"),
    WARLORDS("Warlords"),
    SKYWARS("Skywars"),
    TURBO_KART_RACERS("Turbo Kart Racers"),
    SMASH_HEROES("Smash Heroes"),
    SPEED_UHC("Speed UHC"),
    SKYCLASH("Skyclash"),
    BEDWARS("Bedwars"),
    PROTOTYPE("Prototype Lobby");

    private String displayName;

    Gamemode(String displayName){
        this.displayName = displayName;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Gamemode item: Gamemode.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

}
