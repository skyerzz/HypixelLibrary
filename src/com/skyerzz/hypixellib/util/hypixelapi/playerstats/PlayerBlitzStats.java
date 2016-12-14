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
    private ArrayList<KILL_EFFECT> unlockedKillEffects = new ArrayList<>();
    private ArrayList<FINISHER> unlockedFinishers = new ArrayList<>();

    private AURA selectedAura;
    private TAUNT selectedTaunt;
    private VICTORY_DANCE selectedVictoryDance;
    private FINISHER selectedFinisher;
    private KILL_EFFECT selectedKillEffect;
    private BASIC_KIT selectedBasicKit;
    private ADVANCED_KIT selectedAdvancedKit;

    private boolean blood, fancyMode /* killcounter */, tauntAbility, toggled /*killcounter*/, autoArmor, combatTracker /*/trackcombat?*/, aura;

    private int kills, deaths, wins, teamWins, coins, ramboWins;

    @OutDated
    private int monthly_kills_b, monthly_kills_a, weekly_kills_a, weekly_kills_b;
    private int votes_Caelum_v2, votes_Winter, votes_Cattle_Drive, votes_Valley, votes_Stoneguard, votes_Peaks, votes_Citadel, votes_Aelin_Tower, votes_Pixelville, votes_MiradorBasin, votes_Egypt, votes_MithrilRevived, votes_Thorin;
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
        switch(key.toUpperCase().trim()){
            //<editor-fold desc="[Selected Items]">
            case "AURA":
                if(AURA.mapping.contains(element.getAsString().toUpperCase().replace("_PARTICLE", ""))){
                    this.selectedAura = AURA.valueOf(element.getAsString().toUpperCase().replace("_PARTICLE", ""));
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
            case "TOGGLEKILLCOUNTER":
                this.toggled = element.getAsBoolean();
                return true;
            case "AUTOARMOR":
                this.autoArmor = element.getAsBoolean();
                return true;
            case "COMBATTRACKER":
                this.combatTracker = element.getAsBoolean();
                return true;
            case "AURATOGGLE":
                this.aura = element.getAsBoolean();
                return true;
            case "RAMBO_WINS":
                this.ramboWins = element.getAsInt();
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
            case "VOTES_CATTLE DRIVE":
                this.votes_Cattle_Drive = element.getAsInt();
                return true;
            case "VOTES_STONEGUARD":
                this.votes_Stoneguard = element.getAsInt();
                return true;
            case "VOTES_PEAKS":
                this.votes_Peaks = element.getAsInt();
                return true;
            case "VOTES_AELIN'S TOWER":
                this.votes_Aelin_Tower = element.getAsInt();
                return true;
            case "VOTES_PIXELVILLE":
                this.votes_Pixelville = element.getAsInt();
                return true;
            case "VOTES_CITADEL":
                this.votes_Citadel = element.getAsInt();
                return true;
            case "VOTES_MIRADOR BASIN":
                this.votes_MiradorBasin = element.getAsInt();
                return true;
            case "VOTES_EGYPT":
                this.votes_Egypt = element.getAsInt();
                return true;
            case "VOTES_MITHRIL REVIVED":
                this.votes_MithrilRevived = element.getAsInt();
                return true;
            case "VOTES_THORIN":
                this.votes_Thorin = element.getAsInt();
                return true;
            //</editor-fold>
        }
        return false;
    }

    private boolean setSpecialValue(String key, JsonElement element){
        key = key.replace(" ", "_");
        if(BASIC_KIT.mapping.contains(key.toUpperCase())){
            basicKits.put(BASIC_KIT.valueOf(key.toUpperCase()), element.getAsInt());
            return true;
        }
        if(ADVANCED_KIT.mapping.contains(key.toUpperCase())){
            advancedKits.put(ADVANCED_KIT.valueOf(key.toUpperCase()), element.getAsInt());
            return true;
        }
        if(key.equals("DEFAULTKIT")){
            String kit = element.getAsString().toUpperCase().replace(" ", "_");
            if(BASIC_KIT.mapping.contains(kit)){
                selectedBasicKit = BASIC_KIT.valueOf(kit);
                return true;
            }
            if(ADVANCED_KIT.mapping.contains(kit)){
                selectedAdvancedKit = ADVANCED_KIT.valueOf(kit);
                return true;
            }
            Logger.logInfo("[PlayerAPI.Blitz.DefaultKit] Could not find kit: " + element.getAsString());
            return true;
        }
        if(key.contains("INVENTORY")){
            Logger.logInfo("[PlayerAPI.Blitz.kitInventory] Kit inventories not (yet) supported, skipping " + key);
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
                Logger.logError("[PlayerAPI.Blitz.kitPermutations] Could not find kit: " + kit);
            }
            return true;
        }
        if(key.contains("KIT_ITEM_RENAME")){
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
            String name = element.getAsString().toUpperCase().replace("FINISHER_", "").replace("_FINISHER", "");
            if (BLITZ_POWERUP.mapping.contains(name)) {
                this.unlockedPowerups.add(BLITZ_POWERUP.valueOf(name));
            } else if(KILL_EFFECT.mapping.contains(name)){
                this.unlockedKillEffects.add(KILL_EFFECT.valueOf(name));
            }else if(FINISHER.mapping.contains(name)){
                this.unlockedFinishers.add(FINISHER.valueOf(name));
            }else if (name.equals("PACKAGE_TAUNT")) {
                this.tauntAbility = true;
            } else if(name.equals("DEFAULT_TAUNT")){
                    //todo find out which this is
            } else{
                Logger.logWarn("[PlayerAPI.Blitz.Packages] Unknown Value: " + name);
            }
        }
    }

    //<editor-fold desc="[GETTERS]">
    public HashMap<BASIC_KIT, Integer> getBasicKits() {
        return basicKits;
    }

    public HashMap<ADVANCED_KIT, Integer> getAdvancedKits() {
        return advancedKits;
    }

    public HashMap<BASIC_KIT, Integer> getBasicKitPermutations() {
        return basicKitPermutations;
    }

    public HashMap<ADVANCED_KIT, Integer> getAdvancedKitPermutations() {
        return advancedKitPermutations;
    }

    public HashMap<String, String> getRenamedItems() {
        return renamedItems;
    }

    public ArrayList<BLITZ_POWERUP> getUnlockedPowerups() {
        return unlockedPowerups;
    }

    public ArrayList<KILL_EFFECT> getUnlockedKillEffects() {
        return unlockedKillEffects;
    }

    public ArrayList<FINISHER> getUnlockedFinishers() {
        return unlockedFinishers;
    }

    public AURA getSelectedAura() {
        return selectedAura;
    }

    public TAUNT getSelectedTaunt() {
        return selectedTaunt;
    }

    public VICTORY_DANCE getSelectedVictoryDance() {
        return selectedVictoryDance;
    }

    public FINISHER getSelectedFinisher() {
        return selectedFinisher;
    }

    public KILL_EFFECT getSelectedKillEffect() {
        return selectedKillEffect;
    }

    public BASIC_KIT getSelectedBasicKit() {
        return selectedBasicKit;
    }

    public ADVANCED_KIT getSelectedAdvancedKit() {
        return selectedAdvancedKit;
    }

    public boolean isBlood() {
        return blood;
    }

    public boolean isFancyMode() {
        return fancyMode;
    }

    public boolean isTauntAbility() {
        return tauntAbility;
    }

    public boolean isToggled() {
        return toggled;
    }

    public boolean isAutoArmor() {
        return autoArmor;
    }

    public boolean isCombatTracker() {
        return combatTracker;
    }

    public boolean isAura() { return aura; }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getWins() {
        return wins;
    }

    public int getTeamWins() {
        return teamWins;
    }

    public int getCoins() {
        return coins;
    }
    @OutDated
    public int getMonthly_kills_b() {
        return monthly_kills_b;
    }
    @OutDated
    public int getMonthly_kills_a() {
        return monthly_kills_a;
    }
    @OutDated
    public int getWeekly_kills_a() {
        return weekly_kills_a;
    }
    @OutDated
    public int getWeekly_kills_b() {
        return weekly_kills_b;
    }
    @OutDated
    public int getVotes_Caelum_v2() {
        return votes_Caelum_v2;
    }
    @OutDated
    public int getVotes_Winter() {
        return votes_Winter;
    }
    @OutDated
    public int getVotes_Cattle_Drive() {
        return votes_Cattle_Drive;
    }
    @OutDated
    public int getVotes_Valley() {
        return votes_Valley;
    }
    @OutDated
    public int getVotes_Stoneguard() {
        return votes_Stoneguard;
    }
    @OutDated
    public int getVotes_Peaks() {
        return votes_Peaks;
    }
    @OutDated
    public int getVotes_Citadel() {
        return votes_Citadel;
    }
    @OutDated
    public int getVotes_Aelin_Tower() {
        return votes_Aelin_Tower;
    }
    @OutDated
    public int getVotes_Pixelville() {
        return votes_Pixelville;
    }
    @OutDated
    public int getVotes_MiradorBasin() { return votes_MiradorBasin; }

    //</editor-fold>
}
