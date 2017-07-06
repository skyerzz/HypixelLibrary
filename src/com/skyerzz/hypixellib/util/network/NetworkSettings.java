package com.skyerzz.hypixellib.util.network;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;

import java.util.Map;

/**
 * Created by sky on 1-7-2017.
 */
public class NetworkSettings {

    private boolean bloodVisibility, chatAlerts, chatVisibility, lobbySpeed, petVisibility, playerVisibility, autoSpawnPet, lobbyProtection, allowPartyRequests, allowFriendRequests, allowGuildRequests, legacyCompass, newsPopup;

    public NetworkSettings(JsonObject json){
        initialize(json);
    }



    private void initialize(JsonObject json) {
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase();
            if (setValue(key, e.getValue())) {
                continue;
            }

            Logger.logWarn("[PlayerAPI.Common.settings] Unknown value: " + key);
        }
    }

    public boolean setValue(String key, JsonElement e){
        switch(key.toUpperCase()){
            case "BLOODVISIBILITY":
                this.bloodVisibility = e.getAsBoolean();
                return true;
            case "CHATALERTS":
                this.chatAlerts = e.getAsBoolean();
                return true;
            case "CHATVISIBILITY":
                this.chatVisibility = e.getAsBoolean();
                return true;
            case "LOBBYSPEED":
                this.lobbySpeed = e.getAsBoolean();
                return true;
            case "PETVISIBILITY":
                this.petVisibility = e.getAsBoolean();
                return true;
            case "PLAYERVISIBILITY":
                this.playerVisibility = e.getAsBoolean();
                return true;
            case "AUTOSPAWNPET":
                this.autoSpawnPet = e.getAsBoolean();
                return true;
            case "LOBBYPROTECTION":
                this.lobbyProtection = e.getAsBoolean();
                return true;
            case "ALLOWPARTYREQUESTS":
                this.allowPartyRequests = e.getAsBoolean();
                return true;
            case "ALLOWFRIENDREQUESTS":
                this.allowFriendRequests = e.getAsBoolean();
                return true;
            case "ALLOWGUILDREQUESTS":
                this.allowGuildRequests = e.getAsBoolean();
                return true;
            case "LEGACYCOMPASS":
                this.legacyCompass = e.getAsBoolean();
                return true;
            case "NEWSPOPUP":
                this.newsPopup = e.getAsBoolean();
                return true;
        }
        return false;
    }
}
