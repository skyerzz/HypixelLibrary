package com.skyerzz.hypixellib.util.hypixelapi;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Created by Skyerzz-LAPOTOP on 17/01/2017.
 */
public class FriendAPI extends AbstractAPIReply {

    private JsonObject json;

    public FriendAPI(JsonObject friends){
        this.json = friends;
    }

    public JsonArray getFriends(){
        return this.json.get("records").getAsJsonArray();
    }
}
