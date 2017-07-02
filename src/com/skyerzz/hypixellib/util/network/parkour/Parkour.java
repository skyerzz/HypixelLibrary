package com.skyerzz.hypixellib.util.network.parkour;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sky on 1-7-2017.
 */
public class Parkour {

    public HashMap<ParkourType, ArrayList<ParkourInstance>> parkourListings = new HashMap<>();

    public Parkour(JsonObject json){
        initialize(json);
    }

    private void initialize(JsonObject json) {
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase();
            if(ParkourType.mapping.contains(key)){
                initializeParkourValues(ParkourType.valueOf(key), e.getValue().getAsJsonArray());
            }else {
                Logger.logWarn("[PlayerAPI.Common.Parkour] Unknown ParkourType: " + key);
            }
        }
    }

    private void initializeParkourValues(ParkourType type, JsonArray array){
        ArrayList<ParkourInstance> instances = new ArrayList<>();
        for(JsonElement element: array){
            instances.add(initParkourInstance(element.getAsJsonObject(), type));
        }
        this.parkourListings.put(type, instances);
    }

    private ParkourInstance initParkourInstance(JsonObject json, ParkourType type){
        long timeStart = -1, timeTook = -1;
        if(json.get("timeStart")!=null){
            timeStart = json.get("timeStart").getAsLong();
        }else{
            Logger.logWarn("[PlayerAPI.Common.Parkour] No timeStart found!: " + type.name());
        }
        if(json.get("timeTook")!=null){
            timeStart = json.get("timeTook").getAsLong();
        }else{
            Logger.logWarn("[PlayerAPI.Common.Parkour] No timeTook found!: " + type.name());
        }
        return new ParkourInstance(timeStart, timeTook);
    }
}
