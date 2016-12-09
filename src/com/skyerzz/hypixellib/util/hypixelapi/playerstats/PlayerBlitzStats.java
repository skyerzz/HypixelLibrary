package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.games.blitz.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sky on 23/11/2016.
 */
public class PlayerBlitzStats extends PlayerGameStats {

    public PlayerBlitzStats(JsonObject json) {
        super(json);
        initialize();
    }

    //<editor-fold desc="[PRIVATES INDEX]"
    private HashMap<BASIC_KIT, Integer> basicKits = new HashMap<>();
    private HashMap<ADVANCED_KIT, Integer> advancedKits = new HashMap<>();

    @OutDated /*Permutations are the old kit inventories*/
    private HashMap<BASIC_KIT, Integer> basicKitPermutations = new HashMap<>();
    private HashMap<ADVANCED_KIT, Integer> advancedKitPermutations = new HashMap<>();

    private HashMap<String, String> renamedItems = new HashMap<>();

    private ArrayList<BLITZ_POWERUP> unlockedPowerups = new ArrayList<>();

    private AURA selectedAura;
    private TAUNT selectedTaunt;
    private VICTORY_DANCE selectedVictoryDance;
    private FINISHER selectedFinisher;
    private KILL_EFFECT selectedKillEffect;
    private BASIC_KIT selectedBasicKit;
    private ADVANCED_KIT selectedAdvancedKit;

    private boolean blood, fancyMode /* killcounter */, tauntAbility, toggled /*killcounter*/, autoArmor;

    private int kills, deaths, wins, teamWins, coins;

    @OutDated
    public int monthly_kills_b, monthly_kills_a, weekly_kills_a, weekly_kills_b;
    public int votes_Caelum_v2, votes_Winter, votes_Cattle_Drive, votes_Valley, votes_Stoneguard, votes_Peaks, votes_Citadel, votes_Aelin_Tower, votes_Pixelville;
    //</editor-fold>

    private void initialize() {
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase();
            if (setValue(key, e.getValue())) {
                continue;
            } else if (setSpecialValue(key, e.getValue())) {
                continue;
            }

            Logger.logWarn("[PlayerAPI.Blitz.initialize] Unknown value: " + key);
        }
    }

    private boolean setValue(String key, JsonElement element){
        switch(key.toUpperCase()){
            //<editor-fold desc="[Selected Items]">
            case "AURA":
                if(AURA.mapping.contains(element.getAsString().toUpperCase())){
                    this.selectedAura = AURA.valueOf(element.getAsString().toUpperCase());
                }else{
                    Logger.logError("[PlayerAPI.Blitz.AURA] Unknown aura: " + element.getAsString().toUpperCase());
                }
                return true;
            case "CHOSEN_TAUNT":
                if(TAUNT.mapping.contains(element.getAsString().toUpperCase())){
                    this.selectedTaunt = TAUNT.valueOf(element.getAsString().toUpperCase());
                }else{
                    Logger.logError("[PlayerAPI.Blitz.TAUNT] Unknown taunt: " + element.getAsString().toUpperCase());
                }
                return true;
            case "CHOSEN_VICTORYDANCE":
                if(VICTORY_DANCE.mapping.contains(element.getAsString().toUpperCase())){
                    this.selectedVictoryDance = VICTORY_DANCE.valueOf(element.getAsString().toUpperCase());
                }else{
                    Logger.logError("[PlayerAPI.Blitz.VICTORY_DANCE] Unknown dance: " + element.getAsString().toUpperCase());
                }
                return true;
            case "CHOSEN_FINISHER":
                if(FINISHER.mapping.contains(element.getAsString().toUpperCase())){
                    this.selectedFinisher = FINISHER.valueOf(element.getAsString().toUpperCase());
                }else{
                    Logger.logError("[PlayerAPI.Blitz.FINISHER] Unknown finisher: " + element.getAsString().toUpperCase());
                }
                return true;
            case "AFTERKILL":
                if(KILL_EFFECT.mapping.contains(element.getAsString().toUpperCase())){
                    this.selectedKillEffect = KILL_EFFECT.valueOf(element.getAsString().toUpperCase());
                }else{
                    Logger.logError("[PlayerAPI.Blitz.KILL_EFFECT] Unknown kill effect: " + element.getAsString().toUpperCase());
                }
                return true;
            //</editor-fold>

            //<editor-fold desc="[Standards]">
            case "COINS":
                this.coins = element.getAsInt();
                return true;
            case "WINS":
                this.wins = element.getAsInt();
                return true;
            case "DEATHS":
                this.deaths = element.getAsInt();
                return true;
            case "WINS_TEAMS":
                this.teamWins = element.getAsInt();
                return true;
            case "KILLS":
                this.kills = element.getAsInt();
                return true;
            case "BLOOD":
                this.blood = element.getAsBoolean();
                return true;
            case "FANCYMODE":
                this.fancyMode = element.getAsBoolean();
                return true;
            case "TOGGLED":
                this.toggled = element.getAsBoolean();
                return true;
            case "AUTOARMOR":
                this.autoArmor = element.getAsBoolean();
                return true;
            //</editor-fold>

            //<editor-fold desc="[Outdated]">
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
            case "VOTES_CAELUM V2":
                this.votes_Caelum_v2 = element.getAsInt();
                return true;
            case "VOTES_WINTER":
                this.votes_Winter = element.getAsInt();
                return true;
            case "VOTES_VALLEY":
                this.votes_Valley = element.getAsInt();
                return true;
            case "VOTES_CATTLE_DRIVE":
                this.votes_Cattle_Drive = element.getAsInt();
                return true;
            case "VOTES_STONEGUARD":
                this.votes_Stoneguard = element.getAsInt();
                return true;
            case "VOTES_PEAKS":
                this.votes_Peaks = element.getAsInt();
                return true;
            case "VOTES_AELIN\\U0027S TOWER":
                this.votes_Aelin_Tower = element.getAsInt();
                return true;
            case "VOTES_PIXELVILLE":
                this.votes_Pixelville = element.getAsInt();
                return true;
            case "VOTES_CITADEL":
                this.votes_Citadel = element.getAsInt();
                return true;
            //</editor-fold>
        }
        return false;
    }

    private boolean setSpecialValue(String key, JsonElement element){
        if(BASIC_KIT.mapping.contains(key.toUpperCase())){
            basicKits.put(BASIC_KIT.valueOf(key.toUpperCase()), element.getAsInt());
            return true;
        }
        if(ADVANCED_KIT.mapping.contains(key.toUpperCase())){
            advancedKits.put(ADVANCED_KIT.valueOf(key.toUpperCase()), element.getAsInt());
            return true;
        }
        if(key.contains("INVENTORY")){
            Logger.logInfo("[Blitz.kitInventory] Kit inventories not (yet) supported, skipping " + key);
            return true;
        }
        if(key.contains("PERMUTATION")){
            String kit = key.replace("KIT_PERMUTATIONS_", "").toUpperCase();
            if(BASIC_KIT.mapping.contains(kit)){
                basicKitPermutations.put(BASIC_KIT.valueOf(kit), element.getAsInt());
            }
            else if(ADVANCED_KIT.mapping.contains(kit)){
                advancedKitPermutations.put(ADVANCED_KIT.valueOf(kit), element.getAsInt());
            }else{
                Logger.logError("[PlayerAPI.Blitz.kitPermutations] Could not find kit " + kit);
            }
            return true;
        }
        if(key.contains("kit_item_rename")){
            String kit = key.replace("KIT_ITEM_RENAME_", "");
            this.renamedItems.put(kit.toUpperCase(), element.getAsString());
            return true;
        }
        if(key.equals("PACKAGES")){
            setPackageValues(element.getAsJsonArray());
            return true;
        }
        return false;
    }



    private void setPackageValues(JsonArray array){
        for(JsonElement element: array) {
            String name = element.getAsString().toUpperCase();
            if (BLITZ_POWERUP.mapping.contains(name)) {
                this.unlockedPowerups.add(BLITZ_POWERUP.valueOf(name));
            } else if (name.equals("PACKAGE_TAUNT")) {
                this.tauntAbility = true;
            } else if(name.equals("DEFAULT_TAUNT")){
                    //todo find out which this is
            } else{
                Logger.logWarn("[PlayerAPI.Blitz.Packages] Unknown Value: " + name);
            }
        }
    }





}
