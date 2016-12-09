package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.util.games.tntgames.DEATHEFFECT;
import com.skyerzz.hypixellib.util.games.tntgames.HAT;
import com.skyerzz.hypixellib.util.games.tntgames.PARTICLEEFFECT;
import com.skyerzz.hypixellib.util.games.tntgames.WIZARD;

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


    protected PlayerTNTGamesStats(JsonObject json) {
        super(json);
        initialize();
    }

    private void initialize(){
        initWizards();
        initTag();
        initRuns();
        initSpleef();
        initSelectedItems();
        initOthers();
    }

    private void initWizards(){
        this.wizards_fire_explode = getJsonInt("firewizard_explode")+1;
        this.wizards_fire_regen = getJsonInt("firewizard_regen")+1;

        this.wizards_kinetic_explode = getJsonInt("kineticwizard_explode")+1;
        this.wizards_kinetic_regen = getJsonInt("kineticwizard_regen")+1;

        this.wizards_ice_explode = getJsonInt("icewizard_explode")+1;
        this.wizards_ice_regen = getJsonInt("icewizard_regen")+1;

        this.wizards_wither_explode = getJsonInt("witherwizard_explode")+1;
        this.wizards_wither_regen = getJsonInt("witherwizard_regen")+1;

        this.wizards_blood_explode = getJsonInt("bloodwizard_explode")+1;
        this.wizards_blood_regen = getJsonInt("bloodwizard_regen")+1;

        this.wizards_assists = getJsonInt("assists_capture");
        this.wizards_wins = getJsonInt("wins_capture");
        this.wizards_deaths = getJsonInt("deaths_capture");
        this.wizards_kills = getJsonInt("kills_capture");
    }

    private void initTag(){
        this.tag_speedy = getJsonInt("tag_speed")+1;
        this.tag_kills = getJsonInt("kills_tntag");
        this.tag_wins = getJsonInt("wins_tntag");
    }

    private void initRuns(){
        this.run_wins = getJsonInt("wins_tntrun");
        this.run_record = getJsonInt("record_tntrun");
        this.run_doubleJump = getJsonInt("doublejump_tntrun")+2;    //+2 cause you get 1 for free

        this.pvprun_kills = getJsonInt("kills_pvprun");
        this.pvprun_wins = getJsonInt("wins_pvprun");
        this.pvprun_record = getJsonInt("record_pvprun");
    }

    private void initSpleef(){
        this.bowspleef_deaths = getJsonInt("deaths_bowspleef");
        //+2 cause you get one for free
        this.bowspleef_doubleJump = getJsonInt("spleef_doublejump")+2;
        this.bowspleef_repulsor = getJsonInt("spleef_repulse")+2;
        this.bowspleef_tripleShot = getJsonInt("spleef_triple")+2;

        this.bowspleef_shots = getJsonInt("tags_bowspleef");
        this.bowspleef_wins = getJsonInt("wins_bowspleef");
    }

    private void initSelectedItems(){
        String temp = getJsonString("selected_class").toUpperCase();
        if(WIZARD.mapping.contains(temp)){
            this.selectedWizard = WIZARD.valueOf(temp);
        }else if(!temp.equals("NULL")){
            Logger.logWarn("[PlayerAPI.TNTGames.SelectedClass] Value not found: " + temp);
        }

        temp = getJsonString("active_particle_effect");
        if(PARTICLEEFFECT.mapping.contains(temp)){
            this.selectedParticleEffect = PARTICLEEFFECT.valueOf(temp);
        }else if(!temp.equals("NULL")){
            Logger.logWarn("[PlayerAPI.TNTGames.ParticleEffect] Value not found: " + temp);
        }

        temp = getJsonString("selected_hat");
        if(HAT.mapping.contains(temp)){
            this.selectedHat = HAT.valueOf(temp);
        }else if(!temp.equals("NULL")){
            Logger.logWarn("[PlayerAPI.TNTGames.Hat] Value not found: " + temp);
        }

        temp = getJsonString("active_death_effect");
        if(DEATHEFFECT.mapping.contains(temp)){
            this.selectedDeathEffect = DEATHEFFECT.valueOf(temp);
        }else if(!temp.equals("NULL")){
            Logger.logWarn("[PlayerAPI.TNTGames.DeathEffect] Value not found: " + temp);
        }

    }

    private void initOthers(){
        this.coins = getJsonInt("coins");

        for(JsonElement s: getJsonArray("packages")){
            if(s.getAsString().equalsIgnoreCase("speed_potion")){
                this.speed_potion = true;
            }else if(s.getAsString().equalsIgnoreCase("slow_potion")){
                this.slow_potion = true;
            }else{
                Logger.logWarn("[PlayerAPI.TNTGames.package] Value not found: " + s.getAsString());
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
        return run_doubleJump;
    }

    public int getBowspleef_doubleJump() {
        return bowspleef_doubleJump;
    }

    public int getBowspleef_tripleShot() {
        return bowspleef_tripleShot;
    }

    public int getBowspleef_repulsor() {
        return bowspleef_repulsor;
    }

    public int getWizards_fire_explode() {
        return wizards_fire_explode;
    }

    public int getWizards_fire_regen() {
        return wizards_fire_regen;
    }

    public int getWizards_kinetic_explode() {
        return wizards_kinetic_explode;
    }

    public int getWizards_kinetic_regen() {
        return wizards_kinetic_regen;
    }

    public int getWizards_ice_explode() {
        return wizards_ice_explode;
    }

    public int getWizards_ice_regen() {
        return wizards_ice_regen;
    }

    public int getWizards_wither_explode() {
        return wizards_wither_explode;
    }

    public int getWizards_wither_regen() {
        return wizards_wither_regen;
    }

    public int getWizards_blood_explode() {
        return wizards_blood_explode;
    }

    public int getWizards_blood_regen() {
        return wizards_blood_regen;
    }

    public int getTag_speedy() {
        return tag_speedy;
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
}
