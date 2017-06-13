package com.skyerzz.hypixellib.util.network.collectibles.pet;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 17/03/2017.
 */
public enum PetConsumable {

    ;

    private String displayName, lore;
    private consumableType type;

    PetConsumable(String displayName, String lore, consumableType type){
        this.displayName = displayName;
        this.lore = lore;
        this.type = type;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(PetConsumable item: PetConsumable.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public String getLore(){
        return lore;
    }

    public consumableType getType(){
        return type;
    }

    public enum consumableType{
        FOOD,
        DRINK,
        TOY;
    }
}
