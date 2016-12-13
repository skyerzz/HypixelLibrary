package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.games.quake.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sky on 7-7-2016.
 * Class will read all information for QUAKE from sent json object
 * Can be used to get all stats
 */
public class PlayerQuakeStats extends PlayerGameStats {

    //<editor-fold desc="[Global Variables]">
    private int coins;
    private int soloDeaths;
    private int soloKills;
    private int soloKillstreaks;
    private int soloWins;

    private int teamDeaths;
    private int teamKills;
    private int teamKillstreaks;
    private int teamWins;

    private int weekly_kills_a;
    private int monthly_kills_a;
    private int weekly_kills_b;
    private int monthly_kills_b;

    private boolean instantRespawn;

    private Gun selectedGun;
    private BARREL selectedBarrel;
    private CASE selectedCase;
    private KILLSOUND selectedKillSound;
    private MUZZLE selectedMuzzle;
    private SIGHT selectedSight;
    private TRIGGER selectedTrigger;
    private KIT selectedKit;
    private HAT selectedHat;

    private ArrayList<BARREL> unlockedBarrels = new ArrayList<>();
    private ArrayList<CASE> unlockedCases = new ArrayList<>();
    private ArrayList<KILLSOUND> unlockedKillSounds = new ArrayList<>();
    private ArrayList<MUZZLE> unlockedMuzzles = new ArrayList<>();
    private ArrayList<SIGHT> unlockedSights = new ArrayList<>();
    private ArrayList<TRIGGER> unlockedTriggers = new ArrayList<>();
    private ArrayList<KIT> unlockedKits = new ArrayList<>();
    private ArrayList<HAT> unlockedHats = new ArrayList<>();
    private ArrayList<TRINKET> unlockedTrinkets = new ArrayList<>();

    @OutDated
    private boolean achievement_flag_1;
    //</editor-fold>

    public PlayerQuakeStats(JsonObject json) {
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

            Logger.logWarn("[PlayerAPI.Quake.initialize] Unknown value: " + key);
        }
    }

    private boolean setValue(String key, JsonElement value) {
        switch (key) {
            //<editor-fold desc="[Values]">
            case "COINS":
                this.coins = value.getAsInt();
                break;
            case "DEATHS":
                this.soloDeaths = value.getAsInt();
                break;
            case "KILLS":
                this.soloKills = value.getAsInt();
                break;
            case "KILLSTREAKS":
                this.soloKillstreaks = value.getAsInt();
                break;
            case "WINS":
                this.soloWins = value.getAsInt();
                break;
            case "KILLS_TEAMS":
                this.teamKills = value.getAsInt();
                break;
            case "DEATHS_TEAMS":
                this.teamDeaths = value.getAsInt();
                break;
            case "WINS_TEAMS":
                this.teamWins = value.getAsInt();
                break;
            case "KILLSTREAKS_TEAMS":
                this.teamKillstreaks = value.getAsInt();
                break;
            case "MONTHLY_KILLS_B":
                this.monthly_kills_b = value.getAsInt();
                break;
            case "MONTHLY_KILLS_A":
                this.monthly_kills_a = value.getAsInt();
                break;
            case "WEEKLY_KILLS_A":
                this.weekly_kills_a = value.getAsInt();
                break;
            case "WEEKLY_KILLS_B":
                this.weekly_kills_b = value.getAsInt();
                break;
            case "INSTANTRESPAWN":
                this.instantRespawn = value.getAsBoolean();
                return true;

            //outdated
            case "TEAM_WINS":
            case "WINS_TEAM":
            case "WINS_DM":
            case "WINS_TIMEATTACK":
            case "WINS_DM_TEAM":
                return true;

            //</editor-fold>

            //<editor-fold desc="[Settings]">
            case "BARREL":
                if(BARREL.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedBarrel = BARREL.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.Barrel] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "CASE":
                if(CASE.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedCase = CASE.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.Case] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "KILLSOUND":
                if(KILLSOUND.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedKillSound = KILLSOUND.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.KillSound] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "MUZZLE":
                if(MUZZLE.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedMuzzle = MUZZLE.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.Muzzle] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "SIGHT":
                if(SIGHT.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedSight = SIGHT.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.Sight] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "TRIGGER":
                if(TRIGGER.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedTrigger = TRIGGER.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.Trigger] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "HAT":
                if(HAT.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedHat = HAT.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.Hat] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "ARMOR":
                if(KIT.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedKit = KIT.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.Kit] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "NULL":
                //todo wth is this
                break;
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
        for(JsonElement value: array){
            String name = value.getAsString().toUpperCase();
            name = name.replaceAll("[A-Z]+\\.", "");
            if(name.equals("INSTANT_RESPAWN")){
                this.instantRespawn = true;
            }else if(name.equals("ACHIEVEMENT_FLAG_1") || name.equals("FLAG_1")){
                this.achievement_flag_1 = true;
            }else if(KILLSOUND.mapping.contains(name)){
                this.unlockedKillSounds.add(KILLSOUND.valueOf(name));
            }else if(KIT.mapping.contains(name)){
                this.unlockedKits.add(KIT.valueOf(name));
            }else if(HAT.mapping.contains(name)){
                this.unlockedHats.add(HAT.valueOf(name));
            }else if(BARREL.mapping.contains(name)){
                this.unlockedBarrels.add(BARREL.valueOf(name));
            }else if(CASE.mapping.contains(name)){
                this.unlockedCases.add(CASE.valueOf(name));
            }else if(MUZZLE.mapping.contains(name)){
                this.unlockedMuzzles.add(MUZZLE.valueOf(name));
            }else if(SIGHT.mapping.contains(name)){
                this.unlockedSights.add(SIGHT.valueOf(name));
            }else if(TRIGGER.mapping.contains(name)){
                this.unlockedTriggers.add(TRIGGER.valueOf(name));
            }else if(TRINKET.mapping.contains(name)){
                this.unlockedTrinkets.add(TRINKET.valueOf(name));
            }else{
                Logger.logWarn("[PlayerAPI.Quake.packages] Unknown Value: " + value.getAsString().toUpperCase());
            }
        }
    }

    //<editor-fold desc="[GETTERS]">
    public int getCoins() {
        return coins;
    }

    public int getSoloDeaths() {
        return soloDeaths;
    }

    public int getSoloKills() {
        return soloKills;
    }

    public int getSoloKillstreaks() {
        return soloKillstreaks;
    }

    public int getSoloWins() {
        return soloWins;
    }

    public int getTeamDeaths() {
        return teamDeaths;
    }

    public int getTeamKills() {
        return teamKills;
    }

    public int getTeamKillstreaks() {
        return teamKillstreaks;
    }

    public int getTeamWins() {
        return teamWins;
    }
    @OutDated
    public int getWeekly_kills_a() {
        return weekly_kills_a;
    }
    @OutDated
    public int getMonthly_kills_a() {
        return monthly_kills_a;
    }
    @OutDated
    public int getWeekly_kills_b() {
        return weekly_kills_b;
    }
    @OutDated
    public int getMonthly_kills_b() {
        return monthly_kills_b;
    }

    public boolean isInstantRespawn() {
        return instantRespawn;
    }

    public KILLSOUND getSelectedKillSound() {
        return selectedKillSound;
    }

    public KIT getSelectedKit() {
        return selectedKit;
    }

    public HAT getSelectedHat() {
        return selectedHat;
    }

    public Gun getSelectedGun() {
        if(this.selectedGun==null){
            this.selectedGun = new Gun(this.selectedBarrel, this.selectedCase, this.selectedMuzzle, this.selectedSight, this.selectedTrigger);
        }
        return selectedGun;
    }

    public ArrayList<BARREL> getUnlockedBarrels() {
        return unlockedBarrels;
    }

    public ArrayList<CASE> getUnlockedCases() {
        return unlockedCases;
    }

    public ArrayList<KILLSOUND> getUnlockedKillSounds() {
        return unlockedKillSounds;
    }

    public ArrayList<MUZZLE> getUnlockedMuzzles() {
        return unlockedMuzzles;
    }

    public ArrayList<SIGHT> getUnlockedSights() {
        return unlockedSights;
    }

    public ArrayList<TRIGGER> getUnlockedTriggers() {
        return unlockedTriggers;
    }

    public ArrayList<KIT> getUnlockedKits() {
        return unlockedKits;
    }

    public ArrayList<HAT> getUnlockedHats() {
        return unlockedHats;
    }

    public ArrayList<TRINKET> getUnlockedTrinkets() {
        return unlockedTrinkets;
    }

    public BARREL getSelectedBarrel() {
        return selectedBarrel;
    }

    public CASE getSelectedCase() {
        return selectedCase;
    }

    public MUZZLE getSelectedMuzzle() {
        return selectedMuzzle;
    }

    public SIGHT getSelectedSight() {
        return selectedSight;
    }

    public TRIGGER getSelectedTrigger() {
        return selectedTrigger;
    }

    @OutDated
    public boolean isAchievement_flag_1() {
        return achievement_flag_1;
    }
    //</editor-fold>
}