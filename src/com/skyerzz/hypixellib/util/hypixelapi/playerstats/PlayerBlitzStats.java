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
    private HashMap<BasicKit, Integer> basicKits = new HashMap<>();
    private HashMap<AdvancedKit, Integer> advancedKits = new HashMap<>();

    @OutDated /*Permutations are the old kit inventories*/
    private HashMap<BasicKit, Integer> basicKitPermutations = new HashMap<>();
    private HashMap<AdvancedKit, Integer> advancedKitPermutations = new HashMap<>();

    private HashMap<String, String> renamedItems = new HashMap<>();

    private ArrayList<Powerup> unlockedPowerups = new ArrayList<>();
    private ArrayList<KillEffect> unlockedKillEffects = new ArrayList<>();
    private ArrayList<Finisher> unlockedFinishers = new ArrayList<>();

    private Aura selectedAura;
    private Taunt selectedTaunt;
    private VictoryDance selectedVictoryDance;
    private Finisher selectedFinisher;
    private KillEffect selectedKillEffect;
    private BasicKit selectedBasicKit;
    private AdvancedKit selectedAdvancedKit;

    private boolean blood, fancyMode /* killcounter */, tauntAbility, toggled /*killcounter*/, autoArmor, combatTracker /*/trackcombat?*/, aura;

    private int kills, deaths, wins, teamWins, coins, ramboWins;

    @OutDated
    private int monthly_kills_b, monthly_kills_a, weekly_kills_a, weekly_kills_b;
    private int votes_Caelum_v2, votes_Winter, votes_Cattle_Drive, votes_Valley, votes_Stoneguard, votes_Peaks, votes_Citadel, votes_Aelin_Tower, votes_Pixelville, votes_MiradorBasin, votes_Egypt, votes_MithrilRevived, votes_Thorin, votes_Despairv1, votes_Greece, votes_City;
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
            case "Aura":
                if(Aura.mapping.contains(element.getAsString().toUpperCase().replace("_PARTICLE", ""))){
                    this.selectedAura = Aura.valueOf(element.getAsString().toUpperCase().replace("_PARTICLE", ""));
                }else{
                    Logger.logError("[PlayerAPI.Blitz.Aura] Unknown aura: " + element.getAsString().toUpperCase());
                }
                return true;
            case "CHOSEN_TAUNT":
                if(Taunt.mapping.contains(element.getAsString().toUpperCase())){
                    this.selectedTaunt = Taunt.valueOf(element.getAsString().toUpperCase());
                }else{
                    Logger.logError("[PlayerAPI.Blitz.Taunt] Unknown taunt: " + element.getAsString().toUpperCase());
                }
                return true;
            case "CHOSEN_VICTORYDANCE":
                if(VictoryDance.mapping.contains(element.getAsString().toUpperCase())){
                    this.selectedVictoryDance = VictoryDance.valueOf(element.getAsString().toUpperCase());
                }else{
                    Logger.logError("[PlayerAPI.Blitz.VictoryDance] Unknown dance: " + element.getAsString().toUpperCase());
                }
                return true;
            case "CHOSEN_FINISHER":
                if(Finisher.mapping.contains(element.getAsString().toUpperCase())){
                    this.selectedFinisher = Finisher.valueOf(element.getAsString().toUpperCase());
                }else{
                    Logger.logError("[PlayerAPI.Blitz.Finisher] Unknown finisher: " + element.getAsString().toUpperCase());
                }
                return true;
            case "AFTERKILL":
                if(KillEffect.mapping.contains(element.getAsString().toUpperCase())){
                    this.selectedKillEffect = KillEffect.valueOf(element.getAsString().toUpperCase());
                }else{
                    Logger.logError("[PlayerAPI.Blitz.KillEffect] Unknown kill effect: " + element.getAsString().toUpperCase());
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
            case "VOTES_DESPAIR V1":
                this.votes_Despairv1 = element.getAsInt();
                return true;
            case "VOTES_GREECE":
                this.votes_Greece = element.getAsInt();
                return true;
            case "VOTES_CITY":
                this.votes_City = element.getAsInt();
                return true;
            //</editor-fold>
        }
        return false;
    }

    private boolean setSpecialValue(String key, JsonElement element){
        key = key.replace(" ", "_");
        if(BasicKit.mapping.contains(key.toUpperCase())){
            basicKits.put(BasicKit.valueOf(key.toUpperCase()), element.getAsInt());
            return true;
        }
        if(AdvancedKit.mapping.contains(key.toUpperCase())){
            advancedKits.put(AdvancedKit.valueOf(key.toUpperCase()), element.getAsInt());
            return true;
        }
        if(key.equals("DEFAULTKIT")){
            String kit = element.getAsString().toUpperCase().replace(" ", "_");
            if(BasicKit.mapping.contains(kit)){
                selectedBasicKit = BasicKit.valueOf(kit);
                return true;
            }
            if(AdvancedKit.mapping.contains(kit)){
                selectedAdvancedKit = AdvancedKit.valueOf(kit);
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
            if(BasicKit.mapping.contains(kit)){
                basicKitPermutations.put(BasicKit.valueOf(kit), element.getAsInt());
            }
            else if(AdvancedKit.mapping.contains(kit)){
                advancedKitPermutations.put(AdvancedKit.valueOf(kit), element.getAsInt());
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
            if (Powerup.mapping.contains(name)) {
                this.unlockedPowerups.add(Powerup.valueOf(name));
            } else if(KillEffect.mapping.contains(name)){
                this.unlockedKillEffects.add(KillEffect.valueOf(name));
            }else if(Finisher.mapping.contains(name)){
                this.unlockedFinishers.add(Finisher.valueOf(name));
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
    public HashMap<BasicKit, Integer> getBasicKits() {
        return basicKits;
    }

    public HashMap<AdvancedKit, Integer> getAdvancedKits() {
        return advancedKits;
    }

    public HashMap<BasicKit, Integer> getBasicKitPermutations() {
        return basicKitPermutations;
    }

    public HashMap<AdvancedKit, Integer> getAdvancedKitPermutations() {
        return advancedKitPermutations;
    }

    public HashMap<String, String> getRenamedItems() {
        return renamedItems;
    }

    public ArrayList<Powerup> getUnlockedPowerups() {
        return unlockedPowerups;
    }

    public ArrayList<KillEffect> getUnlockedKillEffects() {
        return unlockedKillEffects;
    }

    public ArrayList<Finisher> getUnlockedFinishers() {
        return unlockedFinishers;
    }

    public Aura getSelectedAura() {
        return selectedAura;
    }

    public Taunt getSelectedTaunt() {
        return selectedTaunt;
    }

    public VictoryDance getSelectedVictoryDance() {
        return selectedVictoryDance;
    }

    public Finisher getSelectedFinisher() {
        return selectedFinisher;
    }

    public KillEffect getSelectedKillEffect() {
        return selectedKillEffect;
    }

    public BasicKit getSelectedBasicKit() {
        return selectedBasicKit;
    }

    public AdvancedKit getSelectedAdvancedKit() {
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

    public int getRamboWins() {
        return ramboWins;
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
    @OutDated
    public int getVotes_Egypt() {
        return votes_Egypt;
    }
    @OutDated
    public int getVotes_MithrilRevived() {
        return votes_MithrilRevived;
    }
    @OutDated
    public int getVotes_Thorin() {
        return votes_Thorin;
    }
    @OutDated
    public int getVotes_Despairv1() {
        return votes_Despairv1;
    }
//</editor-fold>
}
