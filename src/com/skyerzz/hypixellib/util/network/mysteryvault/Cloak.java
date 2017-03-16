package com.skyerzz.hypixellib.util.network.mysteryvault;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 16/03/2017.
 */
public enum Cloak {
    FIREWINGS,
    SHAMAN;

    Cloak(){

    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Cloak item: Cloak.values()){
            list.add(item.name());
        }
        return list;
    }
}
