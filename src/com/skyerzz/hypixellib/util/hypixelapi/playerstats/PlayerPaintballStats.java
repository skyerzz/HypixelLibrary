package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.HypixelLib;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.games.paintball.HAT;
import com.skyerzz.hypixellib.util.games.paintball.KILLSTREAK;
import com.skyerzz.hypixellib.util.games.paintball.PERK;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sky on 21-7-2016.
 */
public class PlayerPaintballStats extends PlayerGameStats {

    //NOTE: TODO: headstart is at 10 if player is pre-eula donor. If not, its in the API.
    //<editor-fold desc="[Global Variables]>
    private int coins;
    private int kills;
    private int deaths;
    private int wins;
    private int shots;
    private int killstreaks;

    @OutDated
    private int teamDeaths;

    private int fortuneLevel;
    private int enduranceLevel;
    private int godfatherLevel;
    private int superluckLevel;
    private int adrenalineLevel;
    private int transfusionLevel;
    private int headstartLevel;

    private int forcefieldTime;

    private int weekly_kills_b;
    private int weekly_kills_a;
    private int monthly_kills_b;
    private int monthly_kills_a;

    private HAT selectedHat;

    private HashMap<String, HAT> unlockedHats = new HashMap<String, HAT>();
    private HashMap<String, KILLSTREAK> unlockedKillstreaks = new HashMap<String, KILLSTREAK>();
    private HashMap<String, PERK> unlockedPerks = new HashMap<String, PERK>();

    @OutDated
    private int votes_Juice, votes_Babyland, votes_Victorian, votes_Courtyard, votes_Outback, votes_Herobrine, votes_Octagon;

    //</editor-fold>

    public PlayerPaintballStats(JsonObject json) {
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

            Logger.logWarn("[PlayerAPI.Paintball.initialize] Unknown value: " + key);
        }
    }

    //TODO: make all endurance level and stuff +1 in the getter
    private boolean setValue(String key, JsonElement value){
        switch(key){
            //<editor-fold desc="[All]">
            case "COINS":
                this.coins = value.getAsInt();
                break;
            case "DEATHS":
                this.deaths = value.getAsInt();
                break;
            case "DEATHS_TEAMS":
                this.teamDeaths = value.getAsInt();
                break;
            case "ENDURANCE":
                this.enduranceLevel = value.getAsInt();
                break;
            case "ADRENALINE":
                this.adrenalineLevel = value.getAsInt();
                break;
            case "FORTUNE":
                this.fortuneLevel = value.getAsInt();
                break;
            case "GODFATHER":
                this.godfatherLevel = value.getAsInt();
                break;
            case "HEADSTART":
                this.headstartLevel = value.getAsInt();
                break;
            case "KILLS":
                this.kills = value.getAsInt();
                break;
            case "KILLSTREAKS":
                this.killstreaks = value.getAsInt();
                break;
            case "SHOTS_FIRED":
                this.shots = value.getAsInt();
                break;
            case "SUPERLUCK":
                this.superluckLevel = value.getAsInt();
                break;
            case "TRANSFUSION":
                this.transfusionLevel = value.getAsInt();
                break;
            case "WINS":
                this.wins = value.getAsInt();
                break;
            case "WEEKLY_KILLS_B":
                this.weekly_kills_b = value.getAsInt();
                break;
            case "WEEKLY_KILLS_A":
                this.weekly_kills_a = value.getAsInt();
                break;
            case "MONTHLY_KILLS_A":
                this.monthly_kills_a = value.getAsInt();
                break;
            case "MONTHLY_KILLS_B":
                this.monthly_kills_b = value.getAsInt();
                break;
            case "FORCEFIELDTIME":
                this.forcefieldTime = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Misc stuff]">
            case "HAT":
                if(HAT.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedHat = HAT.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[HypixelAPI.Paintball.Hat] Unsupported Value: " + value.getAsString().toUpperCase());
                }
                break;
            //</editor-fold>

            //<editor-fold desc="[Outdated]">
            case "VOTES_JUICE":
                this.votes_Juice = value.getAsInt();
                break;
            case "VOTES_BABYLAND":
                this.votes_Babyland = value.getAsInt();
                return true;
            case "VOTES_VICTORIAN":
                this.votes_Victorian = value.getAsInt();
                return true;
            case "VOTES_COURTYARD":
                this.votes_Courtyard = value.getAsInt();
                return true;
            case "VOTES_OUTBACK":
                this.votes_Outback = value.getAsInt();
                return true;
            case "VOTES_HEROBRINE":
                this.votes_Herobrine = value.getAsInt();
                return true;
            case "VOTES_OCTAGON":
                this.votes_Octagon = value.getAsInt();
                return true;
            //</editor-fold>
            default:
                return false;
        }
        return true;
    }

    private boolean setSpecialValue(String key, JsonElement value){
        switch(key){
            case "PACKAGES":
                setPackageValues(value.getAsJsonArray());
                break;
            default:
                return false;
        }
        return true;
    }

    private void setPackageValues(JsonArray array){
        for(JsonElement element: array){
            String value = element.getAsString().toUpperCase();
            if(PERK.mapping.contains(value)){
                PERK item = PERK.valueOf(value);
                this.unlockedPerks.put(value, item);
                return;
            }else if(HAT.mapping.contains(value)){
                HAT item = HAT.valueOf(value);
                this.unlockedHats.put(value, item);
                return;
            }else if(KILLSTREAK.mapping.contains(value)){
                KILLSTREAK item = KILLSTREAK.valueOf(value);
                this.unlockedKillstreaks.put(value, item);
                return;
            }else {
                //guess it wasnt any of those. Print out the value it was trying to use?
                HypixelLib.logger.logWarn("[PlayerAPI.Paintball.package] Unknown value: " + value);
            }
        }
    }



    public int getCoins() {
        return coins;
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getWins() {
        return wins;
    }

    public int getShots() {
        return shots;
    }

    public int getKillstreaks() {
        return killstreaks;
    }

    public int getFortuneLevel() {
        if(fortuneLevel==0){
            return 0;
        }
        return fortuneLevel+1;
    }

    public int getEnduranceLevel() {
        if(enduranceLevel == 0){
            return 0;
        }
        return enduranceLevel+1;
    }

    public int getGodfatherLevel() {
        if(godfatherLevel == 0){
            return 0;
        }
        return godfatherLevel+1;
    }

    public int getSuperluckLevel() {
        if(superluckLevel == 0){
            return 0;
        }
        return superluckLevel+1;
    }

    public int getAdrenalineLevel() {
        if(adrenalineLevel == 0){
            return 0;
        }
        return adrenalineLevel+1;
    }

    public int getTransfusionLevel() {
        if(transfusionLevel == 0){
            return 0;
        }
        return transfusionLevel+1;
    }

    public int getHeadstartLevel() {
        if(headstartLevel == 0){
            return 0;
        }
        return headstartLevel;
    }

    public int getTeamDeaths() {
        return teamDeaths;
    }

    public int getForcefieldTime() {
        return forcefieldTime;
    }
    @OutDated
    public int getWeekly_kills_b() {
        return weekly_kills_b;
    }
    @OutDated
    public int getWeekly_kills_a() {
        return weekly_kills_a;
    }
    @OutDated
    public int getMonthly_kills_b() {
        return monthly_kills_b;
    }
    @OutDated
    public int getMonthly_kills_a() {
        return monthly_kills_a;
    }

    public HAT getSelectedHat() {
        return selectedHat;
    }

    public HashMap<String, HAT> getUnlockedHats() {
        return unlockedHats;
    }

    public HashMap<String, KILLSTREAK> getUnlockedKillstreaks() {
        return unlockedKillstreaks;
    }

    public HashMap<String, PERK> getUnlockedPerks() {
        return unlockedPerks;
    }

    @OutDated
    public int getVotes_Juice() {
        return votes_Juice;
    }
    @OutDated
    public int getVotes_Babyland() {
        return votes_Babyland;
    }
    @OutDated
    public int getVotes_Victorian() {
        return votes_Victorian;
    }
    @OutDated
    public int getVotes_Courtyard() {
        return votes_Courtyard;
    }
    @OutDated
    public int getVotes_Outback() {
        return votes_Outback;
    }
    @OutDated
    public int getVotes_Herobrine() {
        return votes_Herobrine;
    }
    @OutDated
    public int getVotes_Octagon() {
        return votes_Octagon;
    }


}
