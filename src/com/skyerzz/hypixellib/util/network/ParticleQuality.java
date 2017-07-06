package com.skyerzz.hypixellib.util.network;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 14/03/2017.
 */
public enum ParticleQuality {
    OFF,
    LOW,
    MEDIUM,
    HIGH,
    EXTREME;


    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(ParticleQuality item: ParticleQuality.values()){
            list.add(item.name());
        }
        return list;
    }
}
