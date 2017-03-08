package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;

import java.util.Map;

/**
 * Created by Skyerzz-LAPOTOP on 08/03/2017.
 */
public class PlayerCommonStats extends PlayerGameStats{

    private int networkLevel;


    public PlayerCommonStats(JsonObject json) {
        super(json);
        initialize();
    }

    private void initialize() {
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase();
            if (setValue(key, e.getValue())) {
                continue;
            } else if (setSpecialValue(key, e.getValue())) {
                continue;
            }

            Logger.logWarn("[PlayerAPI.Common.initialize] Unknown value: " + key);
        }
    }

    private boolean setValue(String key, JsonElement element){
        switch(key) {
            case "NETWORKLEVEL":
                this.networkLevel = element.getAsInt();
                return true;
        }
        return false;
    }

    private boolean setSpecialValue(String key, JsonElement element){
        switch(key){

        }
        return false;
    }

    public int getNetworkLevel(){
        return networkLevel;
        
    }
}
