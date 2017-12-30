package com.skyerzz.hypixellib.util.achievements;

import com.skyerzz.hypixellib.util.games.Gamemode;

import java.util.ArrayList;

/**
 * Created by sky on 11-11-2017.
 */
public enum AchievementGameType {
    HALLOWEEN2017("Halloween 2017"),
    CHRISTMAS2017("Christmas 2017"),
    HOUSING("Housing"),
    GENERAL("General"),
    ARCADE("Arcade Games"),
    ARENA("Arena Brawl"),
    COPSANDCRIMS("Cops 'n Crims"),
    BLITZ("Blitz Survival Games"),
    WALLS("The Walls"),
    WALLS3("Mega Walls"),
    TNTGAMES("Tnt Games"),
    VAMPIREZ("VampireZ"),
    PAINTBALL("Paintball"),
    QUAKE("Quakecraft"),
    TRUECOMBAT("Crazy Walls"),
    UHC("UHC"),
    WARLORDS("Warlords"),
    SKYWARS("Skywars"),
    GINGERBREAD("Turbo Kart Racers"),
    SUPERSMASH("Smash Heroes"),
    SPEEDUHC("Speed UHC"),
    SKYCLASH("Skyclash"),
    BEDWARS("Bedwars"),
    PROTOTYPE("Prototype Lobby"),
    LEGACY("Legacy Lobby"),
    MURDERMYSTERY("Murder Mystery"),
    BUILDBATTLE("Build Battle");

    private String displayName;

    AchievementGameType(String displayName){
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
