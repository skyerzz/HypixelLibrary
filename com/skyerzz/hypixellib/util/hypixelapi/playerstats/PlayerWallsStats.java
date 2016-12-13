package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.games.walls.ADVCANCEDSTARTER;
import com.skyerzz.hypixellib.util.games.walls.BASICSTARTER;
import com.skyerzz.hypixellib.util.games.walls.PERK;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Skyerzz-LAPOTOP on 13/12/2016.
 */
public class PlayerWallsStats extends PlayerGameStats {

    public PlayerWallsStats(JsonObject json) {
        super(json);
    }

    //<editor-fold desc="[Globals]">
    private boolean blood;

    private int coins, wins, deaths, kills, losses;

    private HashMap<ADVCANCEDSTARTER, Integer> advancedStarters = new HashMap<>();
    private HashMap<PERK, Integer> perks = new HashMap<>();
    private HashMap<BASICSTARTER, Integer> basicStarters = new HashMap<>();

    @OutDated
    private int monthly_wins_a, monthly_wins_b, weekly_wins_a, weekly_wins_b, monthly_kills_a, monthly_kills_b, weekly_kills_a, weekly_kills_b;
    //</editor-fold>

    private void initialize() {
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase();
            if (setValue(key, e.getValue())) {
                continue;
            } else if (setSpecialValue(key, e.getValue())) {
                continue;
            }

            Logger.logWarn("[PlayerAPI.Walls.initialize] Unknown value: " + key);
        }
    }

    private boolean setValue(String key, JsonElement element) {
        switch (key.trim()) {
            //<editor-fold desc="[standards]">
            case "COINS":
                this.coins = element.getAsInt();
                return true;
            case "WINS":
                this.wins = element.getAsInt();
                return true;
            case "LOSSES":
                this.losses = element.getAsInt();
                return true;
            case "KILLS":
                this.kills = element.getAsInt();
                return true;
            case "DEATHS":
                this.deaths = element.getAsInt();
                return true;
            //</editor-fold>


            //<editor-fold desc="[Outdated Items]">
            case "WEEKLY_KILLS_A":
                this.weekly_kills_a = element.getAsInt();
                return true;
            case "WEEKLY_KILLS_B":
                this.weekly_kills_b = element.getAsInt();
                return true;
            case "MONTHLY_KILLS_A":
                this.monthly_kills_a = element.getAsInt();
                return true;
            case "MONTHLY_KILLS_B":
                this.monthly_kills_b = element.getAsInt();
                return true;
            case "WEEKLY_WINS_A":
                this.weekly_wins_a = element.getAsInt();
                return true;
            case "WEEKLY_WINS_B":
                this.weekly_wins_b = element.getAsInt();
                return true;
            case "MONTHLY_WINS_A":
                this.monthly_wins_a = element.getAsInt();
                return true;
            case "MONTHLY_WINS_B":
                this.monthly_wins_b = element.getAsInt();
                return true;
            //</editor-fold>
        }
        return false;
    }

    private boolean setSpecialValue(String key, JsonElement element){
        if(key.equals("PACKAGES")){
            setPackageValues(element.getAsJsonArray());
            return true;
        }
        if(ADVCANCEDSTARTER.mapping.contains(key)){
            advancedStarters.put(ADVCANCEDSTARTER.valueOf(key), element.getAsInt());
            return true;
        }
        if(BASICSTARTER.mapping.contains(key)){
            basicStarters.put(BASICSTARTER.valueOf(key), element.getAsInt());
            return true;
        }
        if(PERK.mapping.contains(key)){
            perks.put(PERK.valueOf(key), element.getAsInt());
        }
        return false;
    }

    private void setPackageValues(JsonArray array){

    }
}
