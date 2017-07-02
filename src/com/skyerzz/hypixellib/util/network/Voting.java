package com.skyerzz.hypixellib.util.network;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;

import java.util.Map;

/**
 * Created by sky on 1-7-2017.
 */
public class Voting {

    private long lastPMC, lastMCSL, lastMCSORG, lastMCMP, lastTOPG, lastMINESTATUS, lastMCIPL, lastMCF;
    private int totalPMC, totalMCSL, totalMCSORG, totalMCMP, totalTOPG, totalMINESTATUS, totalMCIPL, totalMCF;

    private int totalVotes, votesToday;
    private long lastVote;

    public Voting(JsonObject json){
        initialize(json);
    }

    private void initialize(JsonObject json) {
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase();
            if (setValue(key, e.getValue())) {
                continue;
            }

            Logger.logWarn("[PlayerAPI.Common.Voting] Unknown value: " + key);
        }
    }

    public boolean setValue(String key, JsonElement value){
        if(key.contains("SECONDARY")){
            //note secondary is the exact same value as total, internal counter for the system. meaningless, according to plancke
            return true;
        }
        switch(key){
            case "TOTAL_MCSORG":
                this.totalMCSORG = value.getAsInt();
                return true;
            case "TOTAL_PMC":
                this.totalPMC = value.getAsInt();
                return true;
            case "TOTAL_MCSL":
                this.totalMCSL = value.getAsInt();
                return true;
            case "TOTAL_MCMP":
                this.totalMCMP = value.getAsInt();
                return true;
            case "TOTAL_TOPG":
                this.totalTOPG = value.getAsInt();
                return true;
            case "TOTAL_MINESTATUS":
                this.totalMINESTATUS = value.getAsInt();
                return true;
            case "TOTAL_MCIPL":
                this.totalMCIPL = value.getAsInt();
                return true;
            case "TOTAL_MCF":
                this.totalMCF = value.getAsInt();
                return true;
            
            
            case "LAST_MCSORG":
                this.lastMCSORG = value.getAsLong();
                return true;
            case "LAST_PMC":
                this.lastPMC = value.getAsLong();
                return true;
            case "LAST_MCSL":
                this.lastMCSL = value.getAsLong();
                return true;
            case "LAST_MCMP":
                this.lastMCMP = value.getAsLong();
                return true;
            case "LAST_TOPG":
                this.lastTOPG = value.getAsLong();
                return true;
            case "LAST_MINESTATUS":
                this.lastMINESTATUS = value.getAsLong();
                return true;
            case "LAST_MCIPL":
                this.lastMCIPL = value.getAsLong();
                return true;
            case "LAST_MCF":
                this.lastMCF = value.getAsLong();
                return true;

            case "TOTAL":
                this.totalVotes = value.getAsInt();
                return true;
            case "VOTESTODAY":
                this.votesToday = value.getAsInt();
                return true;
            case "LAST_VOTE":
                this.lastVote = value.getAsLong();
                return true;
            
        }
        return false;
    }
}
