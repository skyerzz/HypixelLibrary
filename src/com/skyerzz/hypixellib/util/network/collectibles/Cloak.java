package com.skyerzz.hypixellib.util.network.collectibles;

import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.ObtainType;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 16/03/2017.
 */
public enum Cloak {
    SUPERHERO("Superhero Cloak", "Straight from the comic books comes that signature red cloak!", ObtainType.CRAFTED_MYSTERY_BOX_ONE),
    MYSTICAL("Mystical Cloak", "Shrouded in mystery, this cloak is the center of numeorous legends concerning its powers.", ObtainType.CRAFTED_MYSTERY_BOX_ONE),
    FIREWINGS("Firewings Cloak",  "Rise from the ashes like a phoenix in this display of flames!", ObtainType.CRAFTED_MYSTERY_BOX_ONE),
    VAMPIRE_WINGS("Vampite Wings Cloak", "Giant black and red wings extend from your back to form menacing vampire wings!", ObtainType.HALLOWEEN_MYSTERY_BOX),
    FROSTY_CLOAK("Frosty Cloak", "The cold never bothered me anyway!", ObtainType.SUMMER_MYSTERY_BOX),
    ICY_WINGS("Icewings Cloak", "Is it just me or is it cold here?", ObtainType.SUMMER_MYSTERY_BOX),
    SHAMAN("Shaman Cloak", "Be surrounded by a tornado, similar to Shaman's Tornado from Mega Walls.", ObtainType.CRAFTED_MYSTERY_BOX_TWO);

    private String displayName, lore;
    private ObtainType boxType;

    Cloak(String displayName, String lore, ObtainType boxType){
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


    public static Cloak getFromString(String cloak){
        cloak = cloak.toUpperCase().replace("CLOAK_", "");
        if(mapping.contains(cloak)){
            return Cloak.valueOf(cloak);
        }
        return null;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getLore() {
        return lore;
    }

    public ObtainType getBoxType() {
        return boxType;
    }
}
