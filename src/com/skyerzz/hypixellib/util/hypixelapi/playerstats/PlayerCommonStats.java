package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.Chat;
import com.skyerzz.hypixellib.util.Rank;
import com.skyerzz.hypixellib.util.network.ParticleQuality;
import com.skyerzz.hypixellib.util.network.event.Xmas2015;
import com.skyerzz.hypixellib.util.network.event.Xmas2016;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Skyerzz-LAPOTOP on 08/03/2017.
 */
public class PlayerCommonStats extends PlayerGameStats{

    //note: eugine == deliveryman

    //<editor-fold desc="[Fields]">
    private int networkLevel, karma, networkEXP, thanksSent, thanksReceived;
    private int mostRecentMinecraftVersion; //5 = 1.8.9 (forge 1722)

    /** Hypixel Credit Value */
    private int vanityTokens; //todo check if actual credit value

    private String _id, displayName, mostRecentlyThankedName, mostRecentlyTippedName, playerName;
    private UUID mostRecentlyThankedUUID, mostRecentlyTippedUUID;

    private Chat selectedChannel;
    private Rank rank, newPackageRank;
    private UUID uuid;
    private ParticleQuality particleQuality;

    private long firstLogin, lastlogin; //todo make into date available through getter

    private boolean mainLobbyTutorialCompleted;

    private ArrayList<Integer> claimedLevelRewards = new ArrayList<>();
    private ArrayList<Xmas2016> foundXmas2016Presents = new ArrayList<>();
    private ArrayList<Xmas2015> foundXmas2015Presents = new ArrayList<>();

    @OutDated
    /** Used to allow you to go on the testing network */
    private boolean testpass;

    //todo find out what values mean
    private boolean clock, warlordsRedeemed, websiteSet;
    private String newClock;
    private long lastEugeneMessage, lastSurvey;
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
            case "NEWCLOCK":
                this.newClock = value.getAsString();
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
            case "PLAYERNAME":
                this.playerName = value.getAsString();
                return true;
            case "TESTPASS":
                this.testpass = value.getAsBoolean();
                return true;
            case "UUID":
                this.uuid = parseUUID(value.getAsString());
                return true;
            case "VANITYTOKENS":
                this.vanityTokens = value.getAsInt();
                return true;
            case "WARLORDSREDEEMED":
                this.warlordsRedeemed = value.getAsBoolean();
                return true;
            case "WEBSITESET":
                this.websiteSet = value.getAsBoolean();
                return true;
            case "THANKSSENT":
                this.thanksSent = value.getAsInt();
                return true;
            case "THANKSRECEIVED":
                this.thanksReceived = value.getAsInt();
                return true;
            case "LASTEUGENEMESSAGE":
                this.lastEugeneMessage = value.getAsLong();
                return true;
            case "LAST_SURVEY":
                this.lastSurvey = value.getAsLong();
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
            case "SETTINGS":
                // TODO: 14/03/2017
                return true;
            case "PARTICLEQUALITY":
                String particleQuality = value.getAsString().toUpperCase();
                if(ParticleQuality.mapping.contains(particleQuality)){
                    this.particleQuality = ParticleQuality.valueOf(particleQuality);
                }else{
                    Logger.logWarn("[HypixelAPI.common.particleQuality] Unknown Particle Quality: " + value.getAsString());
                }
                return true;
            case "STATS":
                //is taken care of in HypixelPlayer already
                return true;


            case "CHANNEL":
                String channel = value.getAsString().toUpperCase();
                if(Chat.mapping.contains(channel)){
                    this.selectedChannel = Chat.valueOf(channel);
                }else{
                    Logger.logWarn("[HypixelAPI.common.channel] Unknown CHANNEL: " + value.getAsString());
                }
                return true;
            case "NEWPACKAGERANK":
                String newpackagerank = value.getAsString().toUpperCase();
                if(Rank.mapping.contains(newpackagerank)){
                    this.newPackageRank = Rank.valueOf(newpackagerank);
                }else{
                    Logger.logWarn("[HypixelAPI.common.newPackageRank] Unknown Rank: " + value.getAsString());
                }
                return true;
            case "Rank":
                String rank = value.getAsString().toUpperCase();
                if(Rank.mapping.contains(rank)){
                    this.rank = Rank.valueOf(rank);
                }else{
                    Logger.logWarn("[HypixelAPI.common.rank] Unknown Rank: " + value.getAsString());
                }
                return true;
        }
        if(key.contains("LEVELINGREWARD_")){
            if(value.getAsBoolean()){
                int level = Integer.parseInt(key.replace("LEVELINGREWARD_", ""));
                this.claimedLevelRewards.add(level);
            }else{
                Logger.logWarn("[HypixelAPI.common.levelReward] FALSE value for reward? " + key);
            }
            return true;
        }
        if(key.contains("XMAS2016_")){
            String present = key.replace("XMAS2016_", "");
            if(value.getAsBoolean() && Xmas2016.mapping.contains(present)){
                this.foundXmas2016Presents.add(Xmas2016.valueOf(present));
            }else{
                Logger.logWarn("[HypixelAPI.common.xmas2016] Couldnt find xmas2016 value OR value was false: " + key);
            }
            return true;
        }
        if(key.contains("PRESENT_FIND_")){
            String present = key.replace("PRESENT_FIND_", "");
            if(value.getAsBoolean() && Xmas2015.mapping.contains(present)){
                this.foundXmas2015Presents.add(Xmas2015.valueOf(present));
            }else{
                Logger.logWarn("[HypixelAPI.common.xmas2015] Couldnt find xmas2015 value OR value was false: " + key);
            }
            return true;
        }
        return false;
    }

    public int getNetworkLevel(){
        return networkLevel;
    }

    public Rank getRank(){
        if(rank!=null) {
            return rank;
        }
        if(newPackageRank!=null){
            return newPackageRank;
        }
        //couldnt find any rank, lets return default
        return Rank.NONE;
    }
}
