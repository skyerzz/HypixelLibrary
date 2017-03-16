package com.skyerzz.hypixellib.util.games.smashheroes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by sky on 15-1-2017.
 */
public enum Map {
    COLOR_CLASH("Color Clash", "11-01-2016", true),
    CUBED("Cubed", "11-01-2016", false),
    GROVE("Grove", "11-01-2016", true),
    GUNMETAL("Gunmetal", "11-01-2016", true),
    LUXOR("Luxor", "11-01-2016", true),
    TOYBOX("Toybox", "11-01-2016", true),
    TRIPLETS("Triplets", "11-01-2016", true),
    STRAWBERRY_TOWERS("Strawberry Towers", "11-01-2016", true),

    AGORA("Agora", "02-02-2016", true),
    BAWK("Bawk", "02-02-2016", true),
    COBALT("Cobalt", "02-02-2016", true),
    COGSWORTH("Cogsworth", "02-02-2016", true),
    COSMOS("Cosmos", "02-02-2016", true),
    DOJO("Dojo", "02-02-2016", true),
    EQUINOX("Equinox", "02-02-2016", true),
    MOSAIC("Mosaic", "02-02-2016", true),
    SHARD("Shard", "02-02-2016", true),
    SWIFT("Swift", "02-02-2016", true),

    BASTION("Bastion", "01-09-2016", true),
    BLOSSOM("Blossom", "01-09-2016", true),
    COURTYARD("Courtyard", "01-09-2016", true),
    HARMONY("Harmony", "01-09-2016", true),
    LABORATORY("Laboratory", "01-09-2016", false),
    REMAINS("Remains", "01-09-2016", true),

    GRAVE("Grave", "11-01-2017", true),
    MARSHLAND("Marshland", "11-01-2017", true);

    private String displayName;
    private Date dateAdded;
    private boolean inRotation;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");

    Map(String displayName, String date, boolean inRotation){
        this.displayName = displayName;
        try {
            this.dateAdded = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.inRotation = inRotation;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Map item: Map.values()){
            list.add(item.name());
        }
        return list;
    }


}
