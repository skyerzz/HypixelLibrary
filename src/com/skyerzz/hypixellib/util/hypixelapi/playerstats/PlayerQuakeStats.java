package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.games.quake.*;

import java.util.ArrayList;
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


    private boolean instantRespawn;

    private Gun selectedGun;
    private Barrel selectedBarrel;
    private Case selectedCase;
    private Killsound selectedKillSound;
    private Muzzle selectedMuzzle;
    private Sight selectedSight;
    private Trigger selectedTrigger;
    private Kit selectedKit;
    private Hat selectedHat;

    private ArrayList<Barrel> unlockedBarrels = new ArrayList<>();
    private ArrayList<Case> unlockedCases = new ArrayList<>();
    private ArrayList<Killsound> unlockedKillSounds = new ArrayList<>();
    private ArrayList<Muzzle> unlockedMuzzles = new ArrayList<>();
    private ArrayList<Sight> unlockedSights = new ArrayList<>();
    private ArrayList<Trigger> unlockedTriggers = new ArrayList<>();
    private ArrayList<Kit> unlockedKits = new ArrayList<>();
    private ArrayList<Hat> unlockedHats = new ArrayList<>();
    private ArrayList<Trinket> unlockedTrinkets = new ArrayList<>();

    @OutDated
    private boolean achievement_flag_1, achievement_flag_3;
    @OutDated
    private int dailyKills, weeklyKills, weekly_kills_a, monthly_kills_a, weekly_kills_b, monthly_kills_b, wins_DM, wins_timeAttack, wins_dmTeam, wins_team, team_wins;
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
        if(value.isJsonNull()){
            Logger.logInfo("[PlayerAPI.Quake.initialize] Found JsonNull for key:" + key);
            return true;
        }
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
                this.team_wins = value.getAsInt();
                return true;
            case "WINS_TEAM":
                this.wins_team = value.getAsInt();
                return true;
            case "WINS_DM":
                this.wins_DM = value.getAsInt();
                return true;
            case "WINS_TIMEATTACK":
                this.wins_timeAttack = value.getAsInt();
                return true;
            case "WINS_DM_TEAM":
                this.wins_dmTeam = value.getAsInt();
                return true;
            case "DAILY_KILLS":
                this.dailyKills = value.getAsInt();
                return true;
            case "WEEKLY_KILLS":
                this.weeklyKills = value.getAsInt();
                return true;

            //</editor-fold>

            //<editor-fold desc="[Settings]">
            case "BARREL":
                if(Barrel.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedBarrel = Barrel.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.Barrel] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "CASE":
                if(Case.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedCase = Case.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.Case] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "KILLSOUND":
                if(Killsound.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedKillSound = Killsound.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.KillSound] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "MUZZLE":
                if(Muzzle.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedMuzzle = Muzzle.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.Muzzle] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "SIGHT":
                if(Sight.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedSight = Sight.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.Sight] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "TRIGGER":
                if(Trigger.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedTrigger = Trigger.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.Trigger] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "HAT":
                if(Hat.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedHat = Hat.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.Quake.Hat] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;
            case "ARMOR":
                if(Kit.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedKit = Kit.valueOf(value.getAsString().toUpperCase());
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
            }else if(name.equals("ACHIEVEMENT_FLAG_3")){
                this.achievement_flag_3 = true;
            }else if(Killsound.mapping.contains(name)){
                this.unlockedKillSounds.add(Killsound.valueOf(name));
            }else if(Kit.mapping.contains(name)){
                this.unlockedKits.add(Kit.valueOf(name));
            }else if(Hat.mapping.contains(name)){
                this.unlockedHats.add(Hat.valueOf(name));
            }else if(Barrel.mapping.contains(name)){
                this.unlockedBarrels.add(Barrel.valueOf(name));
            }else if(Case.mapping.contains(name)){
                this.unlockedCases.add(Case.valueOf(name));
            }else if(Muzzle.mapping.contains(name)){
                this.unlockedMuzzles.add(Muzzle.valueOf(name));
            }else if(Sight.mapping.contains(name)){
                this.unlockedSights.add(Sight.valueOf(name));
            }else if(Trigger.mapping.contains(name)){
                this.unlockedTriggers.add(Trigger.valueOf(name));
            }else if(Trinket.mapping.contains(name)){
                this.unlockedTrinkets.add(Trinket.valueOf(name));
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

    public Killsound getSelectedKillSound() {
        return selectedKillSound;
    }

    public Kit getSelectedKit() {
        return selectedKit;
    }

    public Hat getSelectedHat() {
        return selectedHat;
    }

    public Gun getSelectedGun() {
        if(this.selectedGun==null){
            this.selectedGun = new Gun(this.selectedBarrel, this.selectedCase, this.selectedMuzzle, this.selectedSight, this.selectedTrigger);
        }
        return selectedGun;
    }

    public ArrayList<Barrel> getUnlockedBarrels() {
        return unlockedBarrels;
    }

    public ArrayList<Case> getUnlockedCases() {
        return unlockedCases;
    }

    public ArrayList<Killsound> getUnlockedKillSounds() {
        return unlockedKillSounds;
    }

    public ArrayList<Muzzle> getUnlockedMuzzles() {
        return unlockedMuzzles;
    }

    public ArrayList<Sight> getUnlockedSights() {
        return unlockedSights;
    }

    public ArrayList<Trigger> getUnlockedTriggers() {
        return unlockedTriggers;
    }

    public ArrayList<Kit> getUnlockedKits() {
        return unlockedKits;
    }

    public ArrayList<Hat> getUnlockedHats() {
        return unlockedHats;
    }

    public ArrayList<Trinket> getUnlockedTrinkets() {
        return unlockedTrinkets;
    }

    public Barrel getSelectedBarrel() {
        return selectedBarrel;
    }

    public Case getSelectedCase() {
        return selectedCase;
    }

    public Muzzle getSelectedMuzzle() {
        return selectedMuzzle;
    }

    public Sight getSelectedSight() {
        return selectedSight;
    }

    public Trigger getSelectedTrigger() {
        return selectedTrigger;
    }

    @OutDated
    public boolean isAchievement_flag_1() {
        return achievement_flag_1;
    }
    @OutDated
    public int getDailyKills() {
        return dailyKills;
    }
    @OutDated
    public int getWeeklyKills() {
        return weeklyKills;
    }
    @OutDated
    public int getWins_DM() {
        return wins_DM;
    }
    @OutDated
    public int getWins_timeAttack() {
        return wins_timeAttack;
    }
    @OutDated
    public int getWins_dmTeam() {
        return wins_dmTeam;
    }
    @OutDated
    public int getWins_team() {
        return wins_team;
    }
    @OutDated
    public int getTeam_wins() {
        return team_wins;
    }
    //</editor-fold>
}