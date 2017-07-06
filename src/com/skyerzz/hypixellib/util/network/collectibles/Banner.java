package com.skyerzz.hypixellib.util.network.collectibles;

import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.ObtainType;

import java.util.ArrayList;

/**
 * Created by sky on 5-7-2017.
 */
public enum Banner {
    HYPIXEL("Hypixel Banner"),
    SNOW_BUNNY("Snow Bunny Banner"),
    REINDEER("Reindeer Banner"),
    HOLIDAY_TREE("Holiday Tree Banner"),
    SANTA("Santa Banner"),
    HOLIDAY_WREATH("Holiday Wreath Banner"),
    HEART("Heart Banner"),
    GUITAR("Guitar Banner"),
    DINO("Dino Banner"),
    REDPOOL("Redpool Banner"),
    PENGU("Pengu Banner"),
    SKULL_KING("Skull King Banner", ObtainType.LEVEL_ONE_HUNDERD);

    private String displayName;
    private ObtainType obtainType;

    Banner(String displayName, ObtainType obtainType){
        this.displayName = displayName;
        this.obtainType = obtainType;
    }

    Banner(String displayName){
        this(displayName, ObtainType.SPECIAL_WEBSTORE_ITEM);
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Banner item: Banner.values()){
            list.add(item.name());
        }
        return list;
    }


    public static Banner getFromString(String banner){
        banner = banner.toUpperCase().replace("HAT_", "").replace("_BANNER", "");
        if(mapping.contains(banner)){
            return Banner.valueOf(banner);
        }
        return null;
    }

    public String getDisplayName() {
        return displayName;
    }

    public ObtainType getObtainType() {
        return obtainType;
    }
}
