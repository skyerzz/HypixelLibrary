package com.skyerzz.hypixellib.util.network.pet;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 20/03/2017.
 */
public enum CompanionSpecies {
    SHIBE("Doge?"); //todo check stuff

    private String name;

    CompanionSpecies(String name){
        this.name = name;
    }


    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(CompanionSpecies item: CompanionSpecies.values()){
            list.add(item.name());
        }
        return list;
    }
}
