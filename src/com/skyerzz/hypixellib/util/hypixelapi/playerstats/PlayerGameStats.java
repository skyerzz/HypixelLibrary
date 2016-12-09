package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Created by sky on 7-7-2016.
 */
public abstract class PlayerGameStats {

    protected JsonObject json;

    public PlayerGameStats(JsonObject json){
        this.json = json;
    }

    public int getJsonInt(String key){
        if(json.get(key)==null){
            return -1;
        }
        return json.get(key).getAsInt();
    }

    public String getJsonString(String key){
        if(json.get(key)==null)
        {
            return "NULL";
        }
        return json.get(key).getAsString();
    }

    public JsonArray getJsonArray(String key) { return json.get(key).getAsJsonArray();}

    public JsonObject getJsonObject(String key) { return json.get(key).getAsJsonObject();

    }
}
