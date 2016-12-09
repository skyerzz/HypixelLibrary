package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.util.games.vampirez.DISGUISE;
import com.skyerzz.hypixellib.util.games.vampirez.HUMANPERK;
import com.skyerzz.hypixellib.util.games.vampirez.VAMPIREPERK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sky on 22-7-2016.
 */
public class PlayerVampireZStats extends PlayerGameStats {


    //<editor-fold desc="[Variables]>
    private boolean combatTracker;

    private int coins;
    private int gold_bought;

    private int human_wins;
    private int human_kills; //how many HUMANS you have killed AS VAMPIRE.
    private int human_deaths;

    private int zombie_kills;
    private int loot_drops;

    private int vampire_wins;
    private int vampire_deaths;
    private int vampire_kills; //how many VAMPIRES you have killed AS HUMAN.

    private int most_vampire_kills; //most vampire kills as human

    //weekly&monthly wins no longer used
    private int monthly_human_wins_b;
    private int weekly_human_wins_b;
    private int monthly_human_wins_a;
    private int weekly_human_wins_a;
    private int monthly_vampire_wins_b;
    private int weekly_vampire_wins_b;
    private int monthly_vampire_wins_a;
    private int weekly_vampire_wins_a;


    private HashMap<HUMANPERK, Integer> humanPerk = new HashMap<HUMANPERK, Integer>();
    private HashMap<VAMPIREPERK, Integer> vampirePerk = new HashMap<VAMPIREPERK, Integer>();
    private ArrayList<DISGUISE> unlockedDisguises = new ArrayList<DISGUISE>();

    private DISGUISE selectedDisguise;
    //</editor-fold>

    public PlayerVampireZStats(JsonObject json) {
        super(json);
        initialize();
    }

    private void initialize(){
        for(Map.Entry<String, JsonElement> e : json.entrySet()){

            String key = e.getKey().toUpperCase();

            if(HUMANPERK.mapping.contains(key)){
                humanPerk.put(HUMANPERK.valueOf(key), e.getValue().getAsInt()+1);
                continue;
            }
            if(VAMPIREPERK.mapping.contains(key)){
                vampirePerk.put(VAMPIREPERK.valueOf(key), e.getValue().getAsInt()+1);
                continue;
            }

            if(setValue(key, e.getValue())){
                continue;
            }

            Logger.logWarn("[PlayerAPI.VampireZ.initialize] Unknown value: " + key);
        }
    }

    private boolean setValue(String JSONkey, JsonElement value){
        switch(JSONkey){
            case "PACKAGES":
                setPackages();
                return true;
            case "DISGUISE":
                return setDisguiseValue(value.getAsString());
            case "COMBATTRACKER":
                this.combatTracker = value.getAsBoolean();
                return true;
            default:
                return setStatValue(JSONkey, value);
        }

    }

    private boolean setStatValue(String key, JsonElement value){
        int v;
        try{
            v = value.getAsInt();
        }catch(UnsupportedOperationException | NumberFormatException e){
            //should never trigger, still catching as a future safe-guard.
            Logger.logWarn("[PlayerAPI.VampireZ.setStatValue] No Integer!  " + key + " : " + value.toString());
            return false;
        }

        switch(key.toLowerCase()){
            case "coins":
                this.coins = v;
                return true;
            case "gold_bought":
                this.gold_bought = v;
                return true;

            case "human_deaths":
                this.human_deaths = v;
                return true;
            case "human_kills":
                this.human_kills = v;
                return true;
            case "human_wins":
                this.human_wins = v;
                return true;
            case "zombie_kills":
                this.zombie_kills = v;
                return true;

            case "most_vampire_kills":
                this.most_vampire_kills = v;
                return true;

            case "vampire_deaths":
                this.vampire_deaths = v;
                return true;
            case "vampire_kills":
                this.vampire_kills = v;
                return true;
            case "vampire_wins":
                this.vampire_wins = v;
                return true;

            case "loot_drops":
                this.loot_drops = v;
                return true;

            case "monthly_human_wins_b":
                this.monthly_human_wins_b = v;
                return true;
            case "monthly_human_wins_a":
                this.monthly_human_wins_a = v;
                return true;
            case "weekly_human_wins_b":
                this.weekly_human_wins_b = v;
                return true;
            case "weekly_human_wins_a":
                this.weekly_human_wins_a = v;
                return true;
            case "monthly_vampire_wins_b":
                this.monthly_vampire_wins_b = v;
                return true;
            case "monthly_vampire_wins_a":
                this.monthly_vampire_wins_a = v;
                return true;
            case "weekly_vampire_wins_b":
                this.weekly_vampire_wins_b = v;
                return true;
            case "weekly_vampire_wins_a":
                this.weekly_vampire_wins_a = v;
                return true;

            default:
                return false;
        }
    }

    private void setPackages(){
        for(JsonElement s: getJsonArray("packages")){
            String value = s.getAsString().toUpperCase();
            if(DISGUISE.mapping.contains(value)){
                unlockedDisguises.add(DISGUISE.valueOf(value));
                continue;
            }
            //vampireZ doesnt have anything other than disguises in packages. This should never trigger, if it does, something changed!
            Logger.logWarn("[PlayerAPI.VampireZ.package] Unknown value: " + value);
        }
    }

    private boolean setDisguiseValue(String value){
        switch(value){
            case "ENDERMAN":
                this.selectedDisguise = DISGUISE.ATTRACTIVE_ENDERMAN;
                return true;
            case "SKELETON":
                this.selectedDisguise = DISGUISE.ATTRACTIVE_SKELETON;
                return true;
            case "HEROBRINE":
                this.selectedDisguise = DISGUISE.ATTRACTIVE;
                return true;
            default:
                return false;
        }
    }

    public boolean hasCombatTracker() {
        return combatTracker;
    }

    public int getCoins() {
        return coins;
    }

    public int getGold_bought() {
        return gold_bought;
    }

    public int getHuman_wins() {
        return human_wins;
    }

    public int getHuman_kills() {
        return human_kills;
    }

    public int getHuman_deaths() {
        return human_deaths;
    }

    public int getZombie_kills() {
        return zombie_kills;
    }

    public int getLoot_drops() {
        return loot_drops;
    }

    public int getVampire_wins() {
        return vampire_wins;
    }

    public int getVampire_deaths() {
        return vampire_deaths;
    }

    public int getVampire_kills() {
        return vampire_kills;
    }

    public int getMost_vampire_kills() {
        return most_vampire_kills;
    }

    public int getMonthly_human_wins_b() {
        return monthly_human_wins_b;
    }

    public int getWeekly_human_wins_b() {
        return weekly_human_wins_b;
    }

    public int getMonthly_human_wins_a() {
        return monthly_human_wins_a;
    }

    public int getWeekly_human_wins_a() {
        return weekly_human_wins_a;
    }

    public int getMonthly_vampire_wins_b() {
        return monthly_vampire_wins_b;
    }

    public int getWeekly_vampire_wins_b() {
        return weekly_vampire_wins_b;
    }

    public int getMonthly_vampire_wins_a() {
        return monthly_vampire_wins_a;
    }

    public int getWeekly_vampire_wins_a() {
        return weekly_vampire_wins_a;
    }

    public HashMap<HUMANPERK, Integer> getHumanPerks() {
        return humanPerk;
    }

    public HashMap<VAMPIREPERK, Integer> getVampirePerks() {
        return vampirePerk;
    }

    public ArrayList<DISGUISE> getUnlockedDisguises() {
        return unlockedDisguises;
    }

    public DISGUISE getSelectedDisguise() {
        return selectedDisguise;
    }
}
