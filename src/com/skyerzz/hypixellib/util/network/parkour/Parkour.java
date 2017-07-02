package com.skyerzz.hypixellib.util.network.parkour;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sky on 2-7-2017.
 */
public class Parkour {

    private HashMap<ParkourType, ArrayList<ParkourInstance>> parkourTimes = new HashMap<>();


    public Parkour(JsonObject json){
        initialize(json);
    }

    private void initialize(JsonObject json) {
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase();
            if(ParkourType.mapping.contains(key)){
                this.parkourTimes.put(ParkourType.valueOf(key), getInstances(ParkourType.valueOf(key), e.getValue().getAsJsonArray()));
            }else {
                Logger.logWarn("[PlayerAPI.Common.Parkour] Unknown parkourType: " + key);
            }
        }
    }

    private ArrayList<ParkourInstance> getInstances(ParkourType type, JsonArray json){
        ArrayList<ParkourInstance> list = new ArrayList<>();
        for(JsonElement e: json){
            list.add(getSingleInstance(type, e.getAsJsonObject()));
        }
        return list;
    }

    private ParkourInstance getSingleInstance(ParkourType type, JsonObject json){
        long timeStart =-1, timeTook=-1;
        if(json.get("timeStart")!=null){
            timeStart = json.get("timeStart").getAsLong();
        }else{
            Logger.logWarn("[PlayerAPI.Common.Parkour] No timeStart in type: " + type);
        }
        if(json.get("timeTook")!=null){
            timeTook = json.get("timeTook").getAsLong();
        }else{
            Logger.logWarn("[PlayerAPI.Common.Parkour] No timeTook in type: " + type);
        }
        return new ParkourInstance(timeStart, timeTook);
    }
}
