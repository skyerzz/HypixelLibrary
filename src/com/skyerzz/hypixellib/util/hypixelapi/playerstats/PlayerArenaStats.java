package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.games.arena.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sky on 5-3-2017.
 */
public class PlayerArenaStats extends PlayerGameStats {

    //todo make sure everything is free of rhunes

    //<editor-fold desc="[FIELDS]

    private Rune selectedRune;
    private Sword selectedSword;
    private Skill selectedOffensiveSkill, selectedSupportSkill, selectedUltimateSkill, selectedUtilitySkill;
    private Hat selectedHat;
    private HashMap<Rune, Integer> unlockedRunes = new HashMap<>();
    private HashMap<CombatUpgrade, Integer> unlockedCombatUpgrades = new HashMap<>();
    private ArrayList<Hat> unlockedHats = new ArrayList<>();
    private ArrayList<Skill> unlockedSkills = new ArrayList<>();
    private ArrayList<Sword> unlockedSwords = new ArrayList<>();
    
    private int coins, coinsSpent, keys, magicalChestOpenings;
    
    private int damage2v2, deaths2v2, games2v2, healed2v2, kills2v2, losses2v2, winStreaks2v2, wins2v2;
    private int damage4v4, deaths4v4, games4v4, healed4v4, kills4v4, losses4v4, winStreaks4v4, wins4v4;
    private int damage1v1, deaths1v1, games1v1, healed1v1, kills1v1, losses1v1, winStreaks1v1, wins1v1;
    private int damageFFA, deathsFFA, gamesFFA, healedFFA, killsFFA, lossesFFA, winStreaksFFA, winsFFA;

    //outdated?
    private int rating,penalty;

    @OutDated
    private int deaths, healed, damage, chest_opens, kills;

    //</editor-fold>

    public PlayerArenaStats(JsonObject json) {
        super(json);
        initialize();
    }

    private void initialize() {
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase().trim();
            if (setValue(key, e.getValue())) {
                continue;
            } else if (setSpecialValue(key, e.getValue())) {
                continue;
            }

            Logger.logWarn("[PlayerAPI.Arena.initialize] Unknown value: " + key);
        }
    }

    private boolean setValue(String key, JsonElement value){
        switch(key){
            case "COINS":
                this.coins = value.getAsInt();
                return true;
            case "COINS_SPENT":
                this.coinsSpent = value.getAsInt();
                return true;
            case "KEYS":
                this.keys = value.getAsInt();
                return true;
            case "MAGICAL_CHEST":
                this.magicalChestOpenings = value.getAsInt();
                return true;

            case "DAMAGE_2V2":
                this.damage2v2 = value.getAsInt();
                return true;
            case "DEATHS_2V2":
                this.deaths2v2 = value.getAsInt();
                return true;
            case "GAMES_2V2":
                this.games2v2 = value.getAsInt();
                return true;
            case "HEALED_2V2":
                this.healed2v2 = value.getAsInt();
                return true;
            case "KILLS_2V2":
                this.kills2v2 = value.getAsInt();
                return true;
            case "LOSSES_2V2":
                this.losses2v2 = value.getAsInt();
                return true;
            case "WIN_STREAKS_2V2":
                this.winStreaks2v2 = value.getAsInt();
                return true;
            case "WINS_2V2":
                this.wins2v2 = value.getAsInt();
                return true;

            case "DAMAGE_4V4":
                this.damage4v4 = value.getAsInt();
                return true;
            case "DEATHS_4V4":
                this.deaths4v4 = value.getAsInt();
                return true;
            case "GAMES_4V4":
                this.games4v4 = value.getAsInt();
                return true;
            case "HEALED_4V4":
                this.healed4v4 = value.getAsInt();
                return true;
            case "KILLS_4V4":
                this.kills4v4 = value.getAsInt();
                return true;
            case "LOSSES_4V4":
                this.losses4v4 = value.getAsInt();
                return true;
            case "WIN_STREAKS_4V4":
                this.winStreaks4v4 = value.getAsInt();
                return true;
            case "WINS_4V4":
                this.wins4v4 = value.getAsInt();
                return true;

            case "DAMAGE_1V1":
                this.damage1v1 = value.getAsInt();
                return true;
            case "DEATHS_1V1":
                this.deaths1v1 = value.getAsInt();
                return true;
            case "GAMES_1V1":
                this.games1v1 = value.getAsInt();
                return true;
            case "HEALED_1V1":
                this.healed1v1 = value.getAsInt();
                return true;
            case "KILLS_1V1":
                this.kills1v1 = value.getAsInt();
                return true;
            case "LOSSES_1V1":
                this.losses1v1 = value.getAsInt();
                return true;
            case "WIN_STREAKS_1V1":
                this.winStreaks1v1 = value.getAsInt();
                return true;
            case "WINS_1V1":
                this.wins1v1 = value.getAsInt();
                return true;

            case "DAMAGE_FFA":
                this.damageFFA = value.getAsInt();
                return true;
            case "DEATHS_FFA":
                this.deathsFFA = value.getAsInt();
                return true;
            case "GAMES_FFA":
                this.gamesFFA = value.getAsInt();
                return true;
            case "HEALED_FFA":
                this.healedFFA = value.getAsInt();
                return true;
            case "KILLS_FFA":
                this.killsFFA = value.getAsInt();
                return true;
            case "LOSSES_FFA":
                this.lossesFFA = value.getAsInt();
                return true;
            case "WIN_STREAKS_FFA":
                this.winStreaksFFA = value.getAsInt();
                return true;
            case "WINS_FFA":
                this.winsFFA = value.getAsInt();
                return true;

            //outdated
            case "PENALTY":
                this.penalty = value.getAsInt();
                return true;
            case "RATING":
                this.rating = value.getAsInt();
                return true;
            case "DEATHS":
                this.deaths = value.getAsInt();
                return true;
            case "HEALED":
                this.healed = value.getAsInt();
                return true;
            case "DAMAGE":
                this.damage = value.getAsInt();
                return true;
            case "CHEST_OPENS":
                this.chest_opens = value.getAsInt();
                return true;
            case "KILLS":
                this.kills = value.getAsInt();
                return true;

        }
        return false;
    }

    private boolean setSpecialValue(String key, JsonElement value){
        switch(key){
            case "ACTIVE_RUNE":
                String rune = value.getAsString().toUpperCase();
                if(Rune.mapping.contains(rune)){
                    this.selectedRune = Rune.valueOf(rune);
                }else{
                    Logger.logWarn("[PlayerAPI.Arena.initialize] Unknown Rune value: " + rune);
                }
                return true;
            case "SELECTED_SWORD":
                String sword = value.getAsString().toUpperCase().replace("SWORD_", ""); //sometimes they do have sword_ , sometimes they dont. fixing this here.
                if(Sword.mapping.contains(sword)){
                    this.selectedSword = Sword.valueOf(sword);
                }else{
                    Logger.logWarn("[PlayerAPI.Arena.initialize] Unknown Sword value: " + sword);
                }
                return true;
            case "ULTIMATE":
                String ultimate = value.getAsString().toUpperCase();
                if(Skill.mapping.contains(ultimate)){
                    this.selectedUltimateSkill = Skill.valueOf(ultimate);
                }else{
                    Logger.logWarn("[PlayerAPI.Arena.initialize] Unknown Skill(ultimate) value: " + ultimate);
                }
                return true;
            case "SUPPORT":
                String support = value.getAsString().toUpperCase();
                if(Skill.mapping.contains(support)){
                    this.selectedSupportSkill = Skill.valueOf(support);
                }else{
                    Logger.logWarn("[PlayerAPI.Arena.initialize] Unknown Skill(support) value: " + support);
                }
                return true;
            case "UTILITY":
                String utility = value.getAsString().toUpperCase();
                if(Skill.mapping.contains(utility)){
                    this.selectedUtilitySkill = Skill.valueOf(utility);
                }else{
                    Logger.logWarn("[PlayerAPI.Arena.initialize] Unknown Skill(utility) value: " + utility);
                }
                return true;
            case "OFFENSIVE":
                String offensive = value.getAsString().toUpperCase();
                if(Skill.mapping.contains(offensive)){
                    this.selectedOffensiveSkill = Skill.valueOf(offensive);
                }else{
                    Logger.logWarn("[PlayerAPI.Arena.initialize] Unknown Skill(offensive) value: " + offensive);
                }
                return true;
            case "Hat":
                String hat = value.getAsString().toUpperCase();
                if(Hat.mapping.contains(hat)){
                    this.selectedHat = Hat.valueOf(hat);
                }else{
                    Logger.logWarn("[PlayerAPI.Arena.initialize] Unknown Hat value: " + hat);
                }
                return true;
            case "PACKAGES":
                this.setPackages(value.getAsJsonArray());
                return true;
        }
        if(key.contains("LVL_")){
            String skill = key.replace("LVL_", "");
            if(CombatUpgrade.mapping.contains(skill)){
                this.unlockedCombatUpgrades.put(CombatUpgrade.valueOf(skill), value.getAsInt());
            }else{
                Logger.logWarn("[PlayerAPI.Arena.initialize.unlock] Unknown CombatUpgrade value: " + skill);
            }
            return true;
        }
        if(key.contains("RUNE_")){
            String rune = key.replace("RUNE_LEVEL_", "");
            if(Rune.mapping.contains(rune)){
                this.unlockedRunes.put(Rune.valueOf(rune), value.getAsInt());
            }else{
                Logger.logWarn("[PlayerAPI.Arena.initialize.unlock] Unknown Rune value: " + rune);
            }
            return true;
        }
        if(key.contains("MAGE_") || key.contains("PALADIN_") || key.contains("_SPEC") || key.contains("WARRIOR_") || key.contains("_ERROR")){
            //somehow, warlords values ended up in this api section? I blame noxy.
            //removing all "_ERROR" stats, dont seem important.
            return true;
        }
        return false;
    }

    private void setPackages(JsonArray array){
        for(JsonElement element: array){
            String value = element.getAsString().toUpperCase().trim().replace("SWORD_", "").replace(" ", "_"); //fixing sword values & spaces>_ (cmon jamie)
            if(Hat.mapping.contains(value)){
                this.unlockedHats.add(Hat.valueOf(value));
            }else if(Skill.mapping.contains(value)){
                this.unlockedSkills.add(Skill.valueOf(value));
            }else if(Sword.mapping.contains(value)){
                this.unlockedSwords.add(Sword.valueOf(value));
            }else if(value.contains("Rune") || value.contains("PACKAGEARENA_ARENA_RATING_") || value.contains("_SPEC")){
                //we already are handling unlocked runes by their levels, no need to add them here.
                //packageArena_Arena_Rating_2 / 6_16 are dummy values and do not have to be stored.
                //how on earth did warlords values end up here? removing them through this.
                continue;
            }else{
                Logger.logWarn("[PlayerAPI.Arena.packages] Unknown Value: " + element.getAsString().toUpperCase());
            }
        }
    }

    public HashMap<Rune, Integer> getUnlockedRunes() {
        return unlockedRunes;
    }

    public Rune getSelectedRune() {
        return selectedRune;
    }

    public Sword getSelectedSword() {
        return selectedSword;
    }

    public Skill getSelectedOffensiveSkill() {
        return selectedOffensiveSkill;
    }

    public Skill getSelectedSupportSkill() {
        return selectedSupportSkill;
    }

    public Skill getSelectedUltimateSkill() {
        return selectedUltimateSkill;
    }

    public Skill getSelectedUtilitySkill() {
        return selectedUtilitySkill;
    }

    public Hat getSelectedHat() {
        return selectedHat;
    }

    public HashMap<CombatUpgrade, Integer> getUnlockedCombatUpgrades() {
        return unlockedCombatUpgrades;
    }

    public ArrayList<Hat> getUnlockedHats() {
        return unlockedHats;
    }

    public ArrayList<Skill> getUnlockedSkills() {
        return unlockedSkills;
    }

    public ArrayList<Sword> getUnlockedSwords() {
        return unlockedSwords;
    }

    public int getCoins() {
        return coins;
    }

    public int getCoinsSpent() {
        return coinsSpent;
    }

    public int getKeys() {
        return keys;
    }

    public int getMagicalChestOpenings() {
        return magicalChestOpenings;
    }

    public int getDamage2v2() {
        return damage2v2;
    }

    public int getDeaths2v2() {
        return deaths2v2;
    }

    public int getGames2v2() {
        return games2v2;
    }

    public int getHealed2v2() {
        return healed2v2;
    }

    public int getKills2v2() {
        return kills2v2;
    }

    public int getLosses2v2() {
        return losses2v2;
    }

    public int getWinStreaks2v2() {
        return winStreaks2v2;
    }

    public int getWins2v2() {
        return wins2v2;
    }

    public int getDamage4v4() {
        return damage4v4;
    }

    public int getDeaths4v4() {
        return deaths4v4;
    }

    public int getGames4v4() {
        return games4v4;
    }

    public int getHealed4v4() {
        return healed4v4;
    }

    public int getKills4v4() {
        return kills4v4;
    }

    public int getLosses4v4() {
        return losses4v4;
    }

    public int getWinStreaks4v4() {
        return winStreaks4v4;
    }

    public int getWins4v4() {
        return wins4v4;
    }

    public int getDamage1v1() {
        return damage1v1;
    }

    public int getDeaths1v1() {
        return deaths1v1;
    }

    public int getGames1v1() {
        return games1v1;
    }

    public int getHealed1v1() {
        return healed1v1;
    }

    public int getKills1v1() {
        return kills1v1;
    }

    public int getLosses1v1() {
        return losses1v1;
    }

    public int getWinStreaks1v1() {
        return winStreaks1v1;
    }

    public int getWins1v1() {
        return wins1v1;
    }

    public int getDamageFFA() {
        return damageFFA;
    }

    public int getDeathsFFA() {
        return deathsFFA;
    }

    public int getGamesFFA() {
        return gamesFFA;
    }

    public int getHealedFFA() {
        return healedFFA;
    }

    public int getKillsFFA() {
        return killsFFA;
    }

    public int getLossesFFA() {
        return lossesFFA;
    }

    public int getWinStreaksFFA() {
        return winStreaksFFA;
    }

    public int getWinsFFA() {
        return winsFFA;
    }

    public int getRating() {
        return rating;
    }

    public int getPenalty() {
        return penalty;
    }

    @OutDated
    public int getDeaths() {
        return deaths;
    }

    @OutDated
    public int getHealed() {
        return healed;
    }

    @OutDated
    public int getDamage() {
        return damage;
    }

    @OutDated
    public int getChest_opens() {
        return chest_opens;
    }

    @OutDated
    public int getKills() {
        return kills;
    }
}
