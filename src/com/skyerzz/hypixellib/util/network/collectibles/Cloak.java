package com.skyerzz.hypixellib.util.network.collectibles;

import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.MysteryBoxType;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 16/03/2017.
 */
public enum Cloak {
    SUPERHERO("Superhero Cloak", "Straight from the comic books comes that signature red cloak!", MysteryBoxType.CRAFTED_MYSTERY_BOX_ONE),
    MYSTICAL("Mystical Cloak", "Shrouded in mystery, this cloak is the center of numeorous legends concerning its powers.", MysteryBoxType.CRAFTED_MYSTERY_BOX_ONE),
    FIREWINGS("Firewings Cloak",  "Rise from the ashes like a phoenix in this display of flames!", MysteryBoxType.CRAFTED_MYSTERY_BOX_ONE),
    VAMPIRE_WINGS("Vampite Wings Cloak", "Giant black and red wings extend from your back to form menacing vampire wings!", MysteryBoxType.HALLOWEEN),
    FROST("Frosty Cloak", "The cold never bothered me anyway!", MysteryBoxType.SUMMER),
    ICEWINGS("Icewings Cloak", "Is it just me or is it cold here?", MysteryBoxType.SUMMER),
    SHAMAN("Shaman Cloak", "Be surrounded by a tornado, similar to Shaman's Tornado from Mega Walls.", MysteryBoxType.CRAFTED_MYSTERY_BOX_TWO);

    private String displayName, lore;
    private MysteryBoxType boxType;

    Cloak(String displayName, String lore, MysteryBoxType boxType){
        this.displayName = displayName;
        this.lore = lore;
        this.boxType = boxType;
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
