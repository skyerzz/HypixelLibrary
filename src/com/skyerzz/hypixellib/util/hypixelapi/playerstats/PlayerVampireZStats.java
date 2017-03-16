package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.games.vampirez.Disguise;
import com.skyerzz.hypixellib.util.games.vampirez.HumanPerk;
import com.skyerzz.hypixellib.util.games.vampirez.VampirePerk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sky on 22-7-2016.
 */
public class PlayerVampireZStats extends PlayerGameStats {


    //<editor-fold desc="[Variables]">
    private boolean combatTracker, blood;

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
    @OutDated
    private int monthly_human_wins_b, weekly_human_wins_b, monthly_human_wins_a, weekly_human_wins_a, monthly_vampire_wins_b, weekly_vampire_wins_b, monthly_vampire_wins_a, weekly_vampire_wins_a;

    @OutDated
    private int votes_Plundered, votes_Church, votes_DarkValley, votes_Pyramids, votes_Overhill, votes_Erias;

    private HashMap<HumanPerk, Integer> humanPerk = new HashMap<HumanPerk, Integer>();
    private HashMap<VampirePerk, Integer> vampirePerk = new HashMap<VampirePerk, Integer>();
    private ArrayList<Disguise> unlockedDisguises = new ArrayList<Disguise>();

    private Disguise selectedDisguise;
    //</editor-fold>

    public PlayerVampireZStats(JsonObject json) {
        super(json);
        initialize();
    }

    private void initialize(){
        for(Map.Entry<String, JsonElement> e : json.entrySet()){

            String key = e.getKey().toUpperCase();

            if(HumanPerk.mapping.contains(key)){
                humanPerk.put(HumanPerk.valueOf(key), e.getValue().getAsInt()+1);
                continue;
            }
            if(VampirePerk.mapping.contains(key)){
                vampirePerk.put(VampirePerk.valueOf(key), e.getValue().getAsInt()+1);
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
            case "Disguise":
                return setDisguiseValue(value.getAsString());
            case "COMBATTRACKER":
                this.combatTracker = value.getAsBoolean();
                return true;
            case "BLOOD":
                this.blood = value.getAsBoolean();
                return true;
            default:
                return setStatValue(JSONkey, value);
        }

    }

    private boolean setStatValue(String key, JsonElement value){

        switch(key.toLowerCase()){
            //<editor-fold desc="[General]">
            case "coins":
                this.coins = value.getAsInt();
                return true;
            case "gold_bought":
                this.gold_bought = value.getAsInt();
                return true;

            case "human_deaths":
                this.human_deaths = value.getAsInt();
                return true;
            case "human_kills":
                this.human_kills = value.getAsInt();
                return true;
            case "human_wins":
                this.human_wins = value.getAsInt();
                return true;
            case "zombie_kills":
                this.zombie_kills = value.getAsInt();
                return true;

            case "most_vampire_kills":
                this.most_vampire_kills = value.getAsInt();
                return true;

            case "vampire_deaths":
                this.vampire_deaths = value.getAsInt();
                return true;
            case "vampire_kills":
                this.vampire_kills = value.getAsInt();
                return true;
            case "vampire_wins":
                this.vampire_wins = value.getAsInt();
                return true;

            case "loot_drops":
                this.loot_drops = value.getAsInt();
                return true;
            //</editor-fold>

            //<editor-fold desc="[Outdated]">
            case "monthly_human_wins_b":
                this.monthly_human_wins_b = value.getAsInt();
                return true;
            case "monthly_human_wins_a":
                this.monthly_human_wins_a = value.getAsInt();
                return true;
            case "weekly_human_wins_b":
                this.weekly_human_wins_b = value.getAsInt();
                return true;
            case "weekly_human_wins_a":
                this.weekly_human_wins_a = value.getAsInt();
                return true;
            case "monthly_vampire_wins_b":
                this.monthly_vampire_wins_b = value.getAsInt();
                return true;
            case "monthly_vampire_wins_a":
                this.monthly_vampire_wins_a = value.getAsInt();
                return true;
            case "weekly_vampire_wins_b":
                this.weekly_vampire_wins_b = value.getAsInt();
                return true;
            case "weekly_vampire_wins_a":
                this.weekly_vampire_wins_a = value.getAsInt();
                return true;

            case "votes_plundered":
                this.votes_Plundered = value.getAsInt();
                return true;
            case "votes_church":
                this.votes_Church = value.getAsInt();
                return true;
            case "votes_dark valley":
                this.votes_DarkValley = value.getAsInt();
                return true;
            case "votes_pyramids":
                this.votes_Pyramids = value.getAsInt();
                return true;
            case "votes_overhill":
                this.votes_Overhill = value.getAsInt();
                return true;
            case "votes_erias":
                this.votes_Erias = value.getAsInt();
                return true;
            //</editor-fold>
            
            default:
                return false;
        }
    }

    private void setPackages(){
        for(JsonElement s: getJsonArray("packages")){
            String value = s.getAsString().toUpperCase();
            if(Disguise.mapping.contains(value)){
                unlockedDisguises.add(Disguise.valueOf(value));
                continue;
            }
            //vampireZ doesnt have anything other than disguises in packages. This should never trigger, if it does, something changed!
            Logger.logWarn("[PlayerAPI.VampireZ.package] Unknown value: " + value);
        }
    }

    private boolean setDisguiseValue(String value){
        switch(value){
            case "ENDERMAN":
                this.selectedDisguise = Disguise.ATTRACTIVE_ENDERMAN;
                return true;
            case "SKELETON":
                this.selectedDisguise = Disguise.ATTRACTIVE_SKELETON;
                return true;
            case "HEROBRINE":
                this.selectedDisguise = Disguise.ATTRACTIVE;
                return true;
            default:
                return false;
        }
    }

    public boolean isCombatTracker() {
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
    @OutDated
    public int getMonthly_human_wins_b() {
        return monthly_human_wins_b;
    }
    @OutDated
    public int getWeekly_human_wins_b() {
        return weekly_human_wins_b;
    }
    @OutDated
    public int getMonthly_human_wins_a() {
        return monthly_human_wins_a;
    }
    @OutDated
    public int getWeekly_human_wins_a() {
        return weekly_human_wins_a;
    }
    @OutDated
    public int getMonthly_vampire_wins_b() {
        return monthly_vampire_wins_b;
    }
    @OutDated
    public int getWeekly_vampire_wins_b() {
        return weekly_vampire_wins_b;
    }
    @OutDated
    public int getMonthly_vampire_wins_a() {
        return monthly_vampire_wins_a;
    }
    @OutDated
    public int getWeekly_vampire_wins_a() {
        return weekly_vampire_wins_a;
    }

    public HashMap<HumanPerk, Integer> getHumanPerks() {
        return humanPerk;
    }

    public HashMap<VampirePerk, Integer> getVampirePerks() {
        return vampirePerk;
    }

    public ArrayList<Disguise> getUnlockedDisguises() {
        return unlockedDisguises;
    }

    public Disguise getSelectedDisguise() {
        return selectedDisguise;
    }

    public boolean isBlood() {
        return blood;
    }
    @OutDated
    public int getVotes_Plundered() {
        return votes_Plundered;
    }
    @OutDated
    public int getVotes_Church() {
        return votes_Church;
    }
    @OutDated
    public int getVotes_DarkValley() {
        return votes_DarkValley;
    }
    @OutDated
    public int getVotes_Pyramids() {
        return votes_Pyramids;
    }
    @OutDated
    public int getVotes_Overhill() {
        return votes_Overhill;
    }
    @OutDated
    public int getVotes_Erias() {
        return votes_Erias;
    }

    public HashMap<HumanPerk, Integer> getHumanPerk() {
        return humanPerk;
    }

    public HashMap<VampirePerk, Integer> getVampirePerk() {
        return vampirePerk;
    }
}
