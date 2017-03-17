package com.skyerzz.hypixellib.util.network.pet;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 17/03/2017.
 */
public enum PetSpecies {
    IRON_GOLEM("Iron Golem"),
    WILD_OCELOT("Wild Ocelot"),
    WILD_OCELOT_BABY("Wild Ocelot Baby"),
    SILVERFISH("SilverFish"),
    SHEEP_PINK_BABY("Pink baby sheep");

    PetSpecies(String displayName){

    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(PetSpecies item: PetSpecies.values()){
            list.add(item.name());
        }
        return list;
    }
}
