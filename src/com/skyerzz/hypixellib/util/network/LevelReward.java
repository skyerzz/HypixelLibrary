package com.skyerzz.hypixellib.util.network;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 14/03/2017.
 */
public enum LevelReward {
    ;

    LevelReward(){
        
    }


    public static final ArrayList<String> mapping = initializeMapping();

    private static java.util.ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(LevelReward item: LevelReward.values()){
            list.add(item.name());
        }
        return list;
    }
}
