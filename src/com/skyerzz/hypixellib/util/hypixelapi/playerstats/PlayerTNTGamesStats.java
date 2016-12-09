package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.games.tntgames.DEATHEFFECT;
import com.skyerzz.hypixellib.util.games.tntgames.HAT;
import com.skyerzz.hypixellib.util.games.tntgames.PARTICLEEFFECT;
import com.skyerzz.hypixellib.util.games.tntgames.WIZARD;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by sky on 21-7-2016.
 */
public class PlayerTNTGamesStats extends PlayerGameStats {
    //stats
    private int coins;

    private int bowspleef_deaths;
    private int bowspleef_wins;
    private int bowspleef_shots; //unconfirmed if tags_bowspleef == shots.

    private int wizards_deaths;
    private int wizards_kills;
    private int wizards_wins;
    private int wizards_assists;

    private int tag_wins;
    private int tag_kills;

    private int run_wins;
    private int run_record; //max time alive from one game?

    private int pvprun_wins;
    private int pvprun_kills;
    private int pvprun_record;

    //shop
    private int run_doubleJump;
    private boolean speed_potion;
    private boolean slow_potion;

    private int bowspleef_doubleJump;
    private int bowspleef_tripleShot;
    private int bowspleef_repulsor;

    private int wizards_fire_explode;
    private int wizards_fire_regen;
    private int wizards_kinetic_explode;
    private int wizards_kinetic_regen;
    private int wizards_ice_explode;
    private int wizards_ice_regen;
    private int wizards_wither_explode;
    private int wizards_wither_regen;
    private int wizards_blood_explode;
    private int wizards_blood_regen;

    private int tag_speedy;


    private DEATHEFFECT selectedDeathEffect;
    private PARTICLEEFFECT selectedParticleEffect;
    private HAT selectedHat;
    private WIZARD selectedWizard;

    private ArrayList<HAT> unlockedHats = new ArrayList<>();

    @OutDated
    private int votes_Quadral, votes_ForgottenPlanet, votes_Atior, votes_Node, votes_TallGate, votes_GreenBelt, votes_TwinSpire, votes_TheVale, votes_Totum, votes_FireFall, votes_Blossom, votes_Gladius, votes_Crucible;

    public PlayerTNTGamesStats(JsonObject json) {
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

            Logger.logWarn("[PlayerAPI.TNTGames.initialize] Unknown value: " + key);
        }
    }

    private boolean setValue(String key, JsonElement element){
        switch(key){
            //<editor-fold desc="[Wizards]">
            case "FIREWIZARD_EXPLODE":
                this.wizards_fire_explode = element.getAsInt();
                return true;
            case "FIREWIZARD_REGEN":
                this.wizards_fire_regen = element.getAsInt();
                return true;
            case "KINETICWIZARD_EXPLODE":
                this.wizards_kinetic_explode = element.getAsInt();
                return true;
            case "KINETICWIZARD_REGEN":
                this.wizards_kinetic_regen = element.getAsInt();
                return true;
            case "ICEWIZARD_EXPLODE":
                this.wizards_ice_explode = element.getAsInt();
                return true;
            case "ICEWIZARD_REGEN":
                this.wizards_ice_regen = element.getAsInt();
                return true;
            case "WITHERWIZARD_EXPLODE":
                this.wizards_wither_explode = element.getAsInt();
                return true;
            case "WITHERWIZARD_REGEN":
                this.wizards_wither_regen = element.getAsInt();
                return true;
            case "BLOODWIZARD_EXPLODE":
                this.wizards_blood_explode = element.getAsInt();
                return true;
            case "BLOODWIZARD_REGEN":
                this.wizards_blood_regen = element.getAsInt();
                return true;
            case "ASSISTS_CAPTURE":
                this.wizards_assists = element.getAsInt();
                return true;
            case "WINS_CAPTURE":
                this.wizards_wins = element.getAsInt();
                return true;
            case "DEATHS_CAPTURE":
                this.wizards_deaths = element.getAsInt();
                return true;
            case "KILLS_CAPTURE":
                this.wizards_kills = element.getAsInt();
                return true;
            //</editor-fold>

            //<editor-fold desc="[TAG]">
            case "TAG_SPEED":
                this.tag_speedy = element.getAsInt();
                return true;
            case "KILLS_TNTAG":
                this.tag_kills = element.getAsInt();
                return true;
            case "WINS_TNTAG":
                this.tag_wins = element.getAsInt();
                return true;
            //</editor-fold>

            //<editor-fold desc="[RUN]">
            case "WINS_TNTRUN":
                this.run_wins = element.getAsInt();
                return true;
            case "RECORD_TNTRUN":
                this.run_record = element.getAsInt();
                return true;
            case "DOUBLEJUMP_TNTRUN":
                this.run_doubleJump = element.getAsInt();
                return true;
            case "KILLS_PVPRUN":
                this.pvprun_kills = element.getAsInt();
                return true;
            case "WINS_PVPRUN":
                this.pvprun_wins = element.getAsInt();
                return true;
            case "RECORD_PVPRUN":
                this.pvprun_record = element.getAsInt();
                return true;
            //</editor-fold>

            //<editor-fold desc="[SPLEEF]">
            case "DEATHS_BOWSPLEEF":
                this.bowspleef_deaths = element.getAsInt();
                return true;
            case "SPLEEF_DOUBLEJUMP":
                this.bowspleef_doubleJump = element.getAsInt();
                return true;
            case "SPLEEF_REPULSE":
                this.bowspleef_repulsor = element.getAsInt();
                return true;
            case "SPLEEF_TRIPLE":
                this.bowspleef_tripleShot = element.getAsInt();
                return true;
            case "TAGS_BOWSPLEEF":
                this.bowspleef_shots = element.getAsInt();
                return true;
            case "WINS_BOWSPLEEF":
                this.bowspleef_wins = element.getAsInt();
                return true;
            //</editor-fold>

            case "COINS":
                this.coins = element.getAsInt();
                return true;

            //<editor-fold desc="[Outdated]">
            case "VOTES_QUADRAL":
                this.votes_Quadral = element.getAsInt();
                return true;
            case "VOTES_FORGOTTEN PLANET":
                this.votes_ForgottenPlanet = element.getAsInt();
                return true;
            case "VOTES_ATIOR":
                this.votes_Atior = element.getAsInt();
                return true;
            case "VOTES_NODE":
                this.votes_Node = element.getAsInt();
                return true;
            case "VOTES_TALLGATE":
                this.votes_TallGate = element.getAsInt();
                return true;
            case "VOTES_GREENBELT":
                this.votes_GreenBelt = element.getAsInt();
                return true;
            case "VOTES_TWINSPIRE":
                this.votes_TwinSpire = element.getAsInt();
                return true;
            case "VOTES_THE VALE":
                this.votes_TheVale = element.getAsInt();
                return true;
            case "VOTES_TOTUM":
                this.votes_Totum = element.getAsInt();
                return true;
            case "VOTES_FIREFALL":
                this.votes_FireFall = element.getAsInt();
                return true;
            case "VOTES_BLOSSOM":
                this.votes_Blossom = element.getAsInt();
                return true;
            case "VOTES_CRUCIBLE":
                this.votes_Crucible = element.getAsInt();
                return true;
            case "VOTES_GLADIUS":
                this.votes_Gladius = element.getAsInt();
                return true;

            //</editor-fold>
        }
        return false;
    }

    private boolean setSpecialValue(String key, JsonElement element){
        switch(key){
            case "CAPTURE_CLASS":
                String value = element.getAsString().toUpperCase().replace(" WIZARD", "");
                if(WIZARD.mapping.contains(value)){
                    this.selectedWizard = WIZARD.valueOf(value);
                }else{
                    Logger.logWarn("[PlayerAPI.TNTGames.CaptureClass] Value not found: " + value);
                }
                return true;
            case "ACTIVE_PARTICLE_EFFECT":
                value = element.getAsString().toUpperCase();
                if(PARTICLEEFFECT.mapping.contains(value)){
                    this.selectedParticleEffect = PARTICLEEFFECT.valueOf(value);
                }else{
                    Logger.logWarn("[PlayerAPI.TNTGames.ParticleEffect] Value not found: " + value);
                }
                return true;
            case "SELECTED_HAT":
                value = element.getAsString().toUpperCase();
                if(HAT.mapping.contains(value)){
                    this.selectedHat = HAT.valueOf(value);
                }else{
                    Logger.logWarn("[PlayerAPI.TNTGames.Hat] Value not found: " + value);
                }
                return true;
            case "ACTIVE_DEATH_EFFECT":
                value = element.getAsString().toUpperCase();
                if(DEATHEFFECT.mapping.contains(value)){
                    this.selectedDeathEffect = DEATHEFFECT.valueOf(value);
                }else{
                    Logger.logWarn("[PlayerAPI.TNTGames.DeathEffect] Value not found: " + value);
                }
                return true;
            case "PACKAGES":
                setPackageValues(element.getAsJsonArray());
                return true;
        }
        return false;
    }

    private void setPackageValues(JsonArray array){
        for(JsonElement element: array){
            String value = element.getAsString().toUpperCase();
            if(value.equals("SPEED_POTION")){
                this.speed_potion = true;
                return;
            }else if(value.equals("SLOW_POTION")){
                this.slow_potion = true;
                return;
            }else if(HAT.mapping.contains(value)){
                this.unlockedHats.add(HAT.valueOf(value));
                return;
            }else {
                //guess it wasnt any of those. Print out the value it was trying to use?
                Logger.logWarn("[PlayerAPI.TNTGames.package] Unknown value: " + value);
            }
        }
    }

    public int getCoins() {
        return coins;
    }

    public int getBowspleef_deaths() {
        return bowspleef_deaths;
    }

    public int getBowspleef_wins() {
        return bowspleef_wins;
    }

    public int getBowspleef_shots() {
        return bowspleef_shots;
    }

    public int getWizards_deaths() {
        return wizards_deaths;
    }

    public int getWizards_kills() {
        return wizards_kills;
    }

    public int getWizards_wins() {
        return wizards_wins;
    }

    public int getWizards_assists() {
        return wizards_assists;
    }

    public int getTag_wins() {
        return tag_wins;
    }

    public int getTag_kills() {
        return tag_kills;
    }

    public int getRun_wins() {
        return run_wins;
    }

    public int getRun_record() {
        return run_record;
    }

    public int getPvprun_wins() {
        return pvprun_wins;
    }

    public int getPvprun_kills() {
        return pvprun_kills;
    }

    public int getPvprun_record() {
        return pvprun_record;
    }

    public int getRun_doubleJump() {
        return run_doubleJump+2;
    }

    public int getBowspleef_doubleJump() {
        return bowspleef_doubleJump+2;
    }

    public int getBowspleef_tripleShot() {
        return bowspleef_tripleShot+2;
    }

    public int getBowspleef_repulsor() {
        return bowspleef_repulsor+2;
    }

    public int getWizards_fire_explode() {
        return wizards_fire_explode+1;
    }

    public int getWizards_fire_regen() {
        return wizards_fire_regen+1;
    }

    public int getWizards_kinetic_explode() {
        return wizards_kinetic_explode+1;
    }

    public int getWizards_kinetic_regen() {
        return wizards_kinetic_regen+1;
    }

    public int getWizards_ice_explode() {
        return wizards_ice_explode+1;
    }

    public int getWizards_ice_regen() {
        return wizards_ice_regen+1;
    }

    public int getWizards_wither_explode() {
        return wizards_wither_explode+1;
    }

    public int getWizards_wither_regen() {
        return wizards_wither_regen+1;
    }

    public int getWizards_blood_explode() {
        return wizards_blood_explode+1;
    }

    public int getWizards_blood_regen() {
        return wizards_blood_regen+1;
    }

    public int getTag_speedy() {
        return tag_speedy+1;
    }

    public DEATHEFFECT getSelectedDeathEffect() {
        return selectedDeathEffect;
    }

    public PARTICLEEFFECT getSelectedParticleEffect() {
        return selectedParticleEffect;
    }

    public HAT getSelectedHat() {
        return selectedHat;
    }

    public WIZARD getSelectedWizard() {
        return selectedWizard;
    }

    public boolean isSpeed_potion() {
        return speed_potion;
    }

    public boolean isSlow_potion() {
        return slow_potion;
    }

    public ArrayList<HAT> getUnlockedHats() {
        return unlockedHats;
    }
    @OutDated
    public int getVotes_Quadral() {
        return votes_Quadral;
    }
    @OutDated
    public int getVotes_ForgottenPlanet() {
        return votes_ForgottenPlanet;
    }
    @OutDated
    public int getVotes_Atior() {
        return votes_Atior;
    }
    @OutDated
    public int getVotes_Node() {
        return votes_Node;
    }
    @OutDated
    public int getVotes_TallGate() {
        return votes_TallGate;
    }
    @OutDated
    public int getVotes_GreenBelt() {
        return votes_GreenBelt;
    }
    @OutDated
    public int getVotes_TwinSpire() {
        return votes_TwinSpire;
    }
    @OutDated
    public int getVotes_TheVale() {
        return votes_TheVale;
    }
    @OutDated
    public int getVotes_Totum() {
        return votes_Totum;
    }
    @OutDated
    public int getVotes_FireFall() {
        return votes_FireFall;
    }
    @OutDated
    public int getVotes_Blossom() {
        return votes_Blossom;
    }
    @OutDated
    public int getVotes_Gladius() {
        return votes_Gladius;
    }
    @OutDated
    public int getVotes_Crucible() {
        return votes_Crucible;
    }
}
