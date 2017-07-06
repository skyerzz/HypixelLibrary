package com.skyerzz.hypixellib.util.network.collectibles.mysteryvault;

import java.util.ArrayList;

/**
 * Created by sky on 5-7-2017.
 */
public enum BoxGiveaway {
    SOMETEST1("N/A - probably Agent doing stuff"),
    AGENTPARTY("N/A - probably Agent doing stuff.");

    private String obtainManner;

    BoxGiveaway(String obtainManner){
        this.obtainManner = obtainManner;
    }

    private static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(BoxGiveaway item: BoxGiveaway.values()){
            list.add(item.name());
        }
        return list;
    }

    public static BoxGiveaway getFromString(String boxGiveaway){
        boxGiveaway = boxGiveaway.toUpperCase().trim();
        if(mapping.contains(boxGiveaway)){
            return BoxGiveaway.valueOf(boxGiveaway);
        }
        return null;
    }
}
