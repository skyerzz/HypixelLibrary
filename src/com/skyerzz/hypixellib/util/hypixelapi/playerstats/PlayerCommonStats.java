package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.util.CHAT;
import com.skyerzz.hypixellib.util.RANK;

import java.util.Map;
import java.util.UUID;

/**
 * Created by Skyerzz-LAPOTOP on 08/03/2017.
 */
public class PlayerCommonStats extends PlayerGameStats{

    //<editor-fold desc="[Fields]">
    private int networkLevel, karma, networkEXP;
    private int mostRecentMinecraftVersion; //5 = 1.8.9 (forge 1722)

    private String _id, displayName, mostRecentlyThankedName, mostRecentlyTippedName;
    private UUID mostRecentlyThankedUUID, mostRecentlyTippedUUID;

    private CHAT selectedChannel;
    private RANK rank, newPackageRank;

    private long firstLogin, lastlogin; //todo make into date available through getter

    private boolean mainLobbyTutorialCompleted;

    //todo find out what values mean
    private boolean clock;
    //</editor-fold>

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

    private boolean setValue(String key, JsonElement value){
        switch(key) {
            //<editor-fold desc="[Values]">
            case "NETWORKLEVEL":
                this.networkLevel = value.getAsInt();
                return true;
            case "_ID":
                this._id = value.getAsString();
                return true;
            case "DISPLAYNAME":
                this.displayName = value.getAsString();
                return true;
            case "CLOCK":
                this.clock = value.getAsBoolean();
                return true;
            case "FIRSTLOGIN":
                this.firstLogin = value.getAsLong();
                return true;
            case "KARMA":
                this.karma = value.getAsInt();
                return true;
            case "LASTLOGIN":
                this.lastlogin = value.getAsLong();
                return true;
            case "MAINLOBBYTUTORIAL":
                this.mainLobbyTutorialCompleted = value.getAsBoolean();
                return true;
            case "MOSTRECENTMINECRAFTVERSION":
                this.mostRecentMinecraftVersion = value.getAsInt();
                return true;
            case "MOSTRECENTLYTHANKED":
                this.mostRecentlyThankedName = value.getAsString();
                return true;
            case "MOSTRECENTLYTIPPED":
                this.mostRecentlyTippedName = value.getAsString();
                return true;
            case "MOSTRECENTLYTHANKEDUUID":
                this.mostRecentlyThankedUUID = parseUUID(value.getAsString());
                return true;
            case "MOSTRECENTLYTIPPEDUUID":
                this.mostRecentlyTippedUUID = parseUUID(value.getAsString());
                return true;
            case "NETWORKEXP":
                this.networkEXP = value.getAsInt();
                return true;
            //</editor-fold>
        }
        return false;
    }

    private UUID parseUUID(String uuid){
        if(uuid.contains("-")){
            return UUID.fromString(uuid);
        }
        String newUUID = uuid.substring(0, 7) + "-" + uuid.substring(8, 11) + "-" + uuid.substring(12, 15) + "-" + uuid.substring(16, 19) + "-" + uuid.substring(20);
        return UUID.fromString(newUUID);
    }

    private boolean setSpecialValue(String key, JsonElement value){
        switch(key){
            case "ACHIEVEMENTS":
                //todo achievements
                return true;
            case "ACHIEVEMENTSONETIME":
                //todo
                return true;
            case "FRIENDREQUESTS":
                //// TODO: 09/03/2017
                return true;
            case "FRIENDREQUESTSUUID":
                //// TODO: 09/03/2017
                return true;
            case "KNOWNALIASES":
                // TODO: 09/03/2017
                return true;
            case "KNOWNALIASESLOWER":
                // TODO: 09/03/2017
                return true;
            case "PARKOURCOMPLETIONS":
                // TODO: 09/03/2017
                return true;
            case "QUESTS":
                // TODO: 09/03/2017
                return true;
            case "STATS":
                //is taken care of in HypixelPlayer already
                return true;


            case "CHANNEL":
                String channel = value.getAsString().toUpperCase();
                if(CHAT.mapping.contains(channel)){
                    this.selectedChannel = CHAT.valueOf(channel);
                }else{
                    Logger.logWarn("[HypixelAPI.common.channel] Unknown CHANNEL: " + value.getAsString());
                }
                return true;
            case "NEWPACKAGERANK":
                String newpackagerank = value.getAsString().toUpperCase();
                if(RANK.mapping.contains(newpackagerank)){
                    this.newPackageRank = RANK.valueOf(newpackagerank);
                }else{
                    Logger.logWarn("[HypixelAPI.common.newPackageRank] Unknown RANK: " + value.getAsString());
                }
                return true;
            case "RANK":
                String rank = value.getAsString().toUpperCase();
                if(RANK.mapping.contains(rank)){
                    this.rank = RANK.valueOf(rank);
                }else{
                    Logger.logWarn("[HypixelAPI.common.rank] Unknown RANK: " + value.getAsString());
                }
                return true;
        }
        return false;
    }

    public int getNetworkLevel(){
        return networkLevel;
    }

    public RANK getRank(){
        if(rank!=null) {
            return rank;
        }
        return newPackageRank;
    }
}
