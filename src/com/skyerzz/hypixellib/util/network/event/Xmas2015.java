package com.skyerzz.hypixellib.util.network.event;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 16/03/2017.
 */
public enum Xmas2015 {
    WARLORDS,
    WALLS,
    TNTGAMES,
    ARENA,
    ARCADE,
    CAPSNCRIMS,
    SKYWARS,
    CRAZYWALLS,
    MEGAWALLS,
    EXP,
    TURBOKARTRACERS,
    QUAKE,
    BLITZ,
    UHC,
    VAMPIREZ,
    PAINTBALL;



    public static final ArrayList<String> mapping = initializeMapping();

    private static java.util.ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Xmas2015 item: Xmas2015.values()){
            list.add(item.name());
        }
        return list;
    }
}
