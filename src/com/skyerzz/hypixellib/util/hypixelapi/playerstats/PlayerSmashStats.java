package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.games.smashheroes.HERO;
import com.skyerzz.hypixellib.util.games.smashheroes.MAP;
import com.skyerzz.hypixellib.util.games.smashheroes.SmashClass;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sky on 7-1-2017.
 */
public class PlayerSmashStats extends PlayerGameStats {

    //note: smashed = deaths by 0 hp, smasher = kills by 0 hp

    private int smashLevel, damageDealt, coins;
    
    private int deathsNormal, gamesNormal, lossesNormal, killsNormal, damageDealtNormal, smasherNormal, smashedNormal, winsNormal, assistsNormal;
    private int deathsTeams, gamesTeams, lossesTeams, killsTeams, damageDealtTeams, smasherTeams, smashedTeams, winsTeams, assistsTeams;
    private int deaths2v2, games2v2, losses2v2, kills2v2, damageDealt2v2, smasher2v2, smashed2v2, wins2v2, assists2v2;
    private int deathsFriends, gamesFriends, lossesFriends, killsFriends, damageDealtFriends, smasherFriends, smashedFriends, winsFriends, assistsFriends;
    private int firstFriendsGame, gamesDayFriends;

    private int losses, quits, kills, deaths, games, smashed, smasher, wins, assists;
    
    private int expBooster10Uses, expBooster30Uses, expBooster50Uses, expBooster100Uses;

    private boolean combatTracker;

    private HERO activeHero;

    private SmashClass  bulk = new SmashClass(HERO.THE_BULK), generalCluck = new SmashClass(HERO.GENERAL_CLUCK), cakeMonster = new SmashClass(HERO.CAKE_MONSTER), botmon = new SmashClass(HERO.BOTMUN),
                        tinman = new SmashClass(HERO.TINMAN), marauder = new SmashClass(HERO.MARAUDER), spooderman = new SmashClass(HERO.SPODERMAN), pug = new SmashClass(HERO.PUG),
                        cryomancer = new SmashClass(HERO.FROSTY), sgtShield = new SmashClass(HERO.SERGEANT_SHIELD), karakot = new SmashClass(HERO.GOKU), skullfire = new SmashClass(HERO.SKULLFIRE),
                        sanic = new SmashClass(HERO.SANIC), voidCrawler = new SmashClass(HERO.DUSK_CRAWLER), shoop = new SmashClass(HERO.SHOOP_DA_WHOOP), greenHood = new SmashClass(HERO.GREEN_HOOD);

    //fixonline BROKEN stat
    private int winStreak;

    //todo find out what these are for
    private boolean expiredBooster;

    @OutDated
    private int losses_weekly_b, losses_monthly_b, games_monthly_b, kills_monthly_b, games_weekly_b, kills_weekly_b, wins_weekly_b, wins_monthly_b;
    private int losses_weekly_a, losses_monthly_a, games_monthly_a, kills_monthly_a, games_weekly_a, kills_weekly_a, wins_weekly_a, wins_monthly_a;
    private HashMap<MAP, Integer> mapVotes = new HashMap<>();
    private SmashClass shaun = new SmashClass(HERO.SHAUN_SHEEP);
    private int deaths3v3, games3v3, losses3v3, kills3v3, damageDealt3v3, smasher3v3, smashed3v3, wins3v3, assists3v3;

    public PlayerSmashStats(JsonObject json) {
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

            Logger.logWarn("[PlayerAPI.SmashHeroes.initialize] Unknown value: " + key);
        }
    }

    private boolean setValue(String key, JsonElement value) {
        if(key.contains("FRIEND") && key.contains("NORMAL")){
            //todo finish these values, find out what they are
            return true;
        }
        switch (key) {
            //<editor-fold desc="[OutDated]">
            case "LOSSES_WEEKLY_B":
                this.losses_weekly_b = value.getAsInt();
                return true;
            case "LOSSES_MONTHLY_B":
                this.losses_monthly_b = value.getAsInt();
                return true;
            case "GAMES_MONTHLY_B":
                this.games_monthly_b = value.getAsInt();
                return true;
            case "KILLS_MONTHLY_B":
                this.kills_monthly_b = value.getAsInt();
                return true;
            case "GAMES_WEEKLY_B":
                this.games_weekly_b = value.getAsInt();
                return true;
            case "KILLS_WEEKLY_B":
                this.kills_weekly_b = value.getAsInt();
                return true;
            case "LOSSES_WEEKLY_A":
                this.losses_weekly_a = value.getAsInt();
                return true;
            case "LOSSES_MONTHLY_A":
                this.losses_monthly_a = value.getAsInt();
                return true;
            case "GAMES_MONTHLY_A":
                this.games_monthly_a = value.getAsInt();
                return true;
            case "KILLS_MONTHLY_A":
                this.kills_monthly_a = value.getAsInt();
                return true;
            case "GAMES_WEEKLY_A":
                this.games_weekly_a = value.getAsInt();
                return true;
            case "KILLS_WEEKLY_A":
                this.kills_weekly_a = value.getAsInt();
                return true;
            case "WINS_WEEKLY_B":
                this.wins_weekly_b = value.getAsInt();
                return true;
            case "WINS_WEEKLY_A":
                this.wins_weekly_a = value.getAsInt();
                return true;
            case "WINS_MONTHLY_A":
                this.wins_monthly_a = value.getAsInt();
                return true;
            case "WINS_MONTHLY_B":
                this.wins_monthly_b = value.getAsInt();
                return true;
            //</editor-fold>

            case "EXPIRED_BOOSTER":
                this.expiredBooster = value.getAsBoolean();
                return true;
            case "FRIENDS_FIRSTGAME":
                this.firstFriendsGame = value.getAsInt();
                return true;
            case "FRIENDS_GAMESDAY":
                this.gamesDayFriends = value.getAsInt();
                return true;
            case "COMBATTRACKER":
                this.combatTracker = value.getAsBoolean();
                return true;
            
            //<editor-fold desc="[Default stat values]">
            case "SMASHED":
                this.smashed = value.getAsInt();
                return true;
            case "SMASHER":
                this.smasher = value.getAsInt();
                return true;
            case "WINS":
                this.wins = value.getAsInt();
                return true;
            case "ASSISTS":
                this.assists = value.getAsInt();
                return true;
            case "SMASHLEVEL":
            case "SMASH_LEVEL_TOTAL": //same values, both updated.
                this.smashLevel = value.getAsInt();
                return true;
            case "WIN_STREAK":
                this.winStreak = value.getAsInt();
                return true;
            case "DAMAGE_DEALT":
                this.damageDealt = value.getAsInt();
                return true;
            case "COINS":
                this.coins = value.getAsInt();
                return true;
            case "LOSSES":
                this.losses = value.getAsInt();
                return true;
            case "QUITS":
                this.quits = value.getAsInt();
                return true;
            case "KILLS":
                this.kills = value.getAsInt();
                return true;
            case "DEATHS":
                this.deaths = value.getAsInt();
                return true;
            case "GAMES":
                this.games = value.getAsInt();
                return true;
            case "EXPBOOSTER_PURCHASES_10_PLAYS":
                this.expBooster10Uses = value.getAsInt();
                return true;
            case "EXPBOOSTER_PURCHASES_30_PLAYS":
                this.expBooster30Uses = value.getAsInt();
                return true;
            case "EXPBOOSTER_PURCHASES_50_PLAYS":
                this.expBooster50Uses = value.getAsInt();
                return true;
            case "EXPBOOSTER_PURCHASES_100_PLAYS":
                this.expBooster100Uses = value.getAsInt();
                return true;

            case "DEATHS_NORMAL":
                this.deathsNormal = value.getAsInt();
                return true;
            case "GAMES_NORMAL":
                this.gamesNormal = value.getAsInt();
                return true;
            case "LOSSES_NORMAL":
                this.lossesNormal = value.getAsInt();
                return true;
            case "KILLS_NORMAL":
                this.killsNormal = value.getAsInt();
                return true;
            case "DAMAGE_DEALT_NORMAL":
                this.damageDealtNormal = value.getAsInt();
                return true;
            case "SMASHER_NORMAL":
                this.smasherNormal = value.getAsInt();
                return true;
            case "SMASHED_NORMAL":
                this.smashedNormal = value.getAsInt();
                return true;
            case "WINS_NORMAL":
                this.winsNormal = value.getAsInt();
                return true;
            case "ASSISTS_NORMAL":
                this.assistsNormal = value.getAsInt();
                return true;
            case "DEATHS_TEAMS":
                this.deathsTeams = value.getAsInt();
                return true;
            case "GAMES_TEAMS":
                this.gamesTeams = value.getAsInt();
                return true;
            case "LOSSES_TEAMS":
                this.lossesTeams = value.getAsInt();
                return true;
            case "KILLS_TEAMS":
                this.killsTeams = value.getAsInt();
                return true;
            case "DAMAGE_DEALT_TEAMS":
                this.damageDealtTeams = value.getAsInt();
                return true;
            case "SMASHER_TEAMS":
                this.smasherTeams = value.getAsInt();
                return true;
            case "SMASHED_TEAMS":
                this.smashedTeams = value.getAsInt();
                return true;
            case "WINS_TEAMS":
                this.winsTeams = value.getAsInt();
                return true;
            case "ASSISTS_TEAMS":
                this.assistsTeams = value.getAsInt();
                return true;
            case "FRIEND_DEATHS":
                this.deathsFriends = value.getAsInt();
                return true;
            case "FRIEND_GAMES":
                this.gamesFriends = value.getAsInt();
                return true;
            case "FRIEND_LOSSES":
                this.lossesFriends = value.getAsInt();
                return true;
            case "FRIEND_KILLS":
                this.killsFriends = value.getAsInt();
                return true;
            case "FRIEND_DAMAGE_DEALT":
                this.damageDealtFriends = value.getAsInt();
                return true;
            case "FRIEND_SMASHER":
                this.smasherFriends = value.getAsInt();
                return true;
            case "FRIEND_SMASHED":
                this.smashedFriends = value.getAsInt();
                return true;
            case "FRIEND_WINS":
                this.winsFriends = value.getAsInt();
                return true;
            case "FRIEND_ASSISTS":
                this.assistsFriends = value.getAsInt();
                return true;
            case "DEATHS_2V2":
                this.deaths2v2 = value.getAsInt();
                return true;
            case "GAMES_2V2":
                this.games2v2 = value.getAsInt();
                return true;
            case "LOSSES_2V2":
                this.losses2v2 = value.getAsInt();
                return true;
            case "KILLS_2V2":
                this.kills2v2 = value.getAsInt();
                return true;
            case "DAMAGE_DEALT_2V2":
                this.damageDealt2v2 = value.getAsInt();
                return true;
            case "SMASHER_2V2":
                this.smasher2v2 = value.getAsInt();
                return true;
            case "SMASHED_2V2":
                this.smashed2v2 = value.getAsInt();
                return true;
            case "WINS_2V2":
                this.wins2v2 = value.getAsInt();
                return true;
            case "ASSISTS_2V2":
                this.assists2v2 = value.getAsInt();
                return true;

            //outdated
            case "DEATHS_3V3":
            case "DEATHS3V3":
                this.deaths3v3 = value.getAsInt();
                return true;
            case "GAMES3V3":
            case "GAMES_3V3":
                this.games3v3 = value.getAsInt();
                return true;
            case "LOSSES3V3":
            case "LOSSES_3V3":
                this.losses3v3 = value.getAsInt();
                return true;
            case "KILLS3V3":
            case "KILLS_3V3":
                this.kills3v3 = value.getAsInt();
                return true;
            case "DAMAGE_DEALT3V3":
            case "DAMAGE_DEALT_3V3":
                this.damageDealt3v3 = value.getAsInt();
                return true;
            case "SMASHER3V3":
            case "SMASHER_3V3":
                this.smasher3v3 = value.getAsInt();
                return true;
            case "SMASHED3V3":
            case "SMASHED_3V3":
                this.smashed3v3 = value.getAsInt();
                return true;
            case "WINS3V3":
            case "WINS_3V3":
                this.wins3v3 = value.getAsInt();
                return true;
            case "ASSISTS3V3":
            case "ASSISTS_3V3":
                this.assists3v3 = value.getAsInt();
                return true;
            //</editor-fold>
        }
        return false;
    }

    private boolean setSpecialValue(String key, JsonElement value){
        switch(key){
            case "CLASSES":
                setClasses(value.getAsJsonObject());
                return true;
            case "CLASS_STATS":
                setClassStats(value.getAsJsonObject());
                return true;
            case "PACKAGES":
                initPackages(value.getAsJsonArray());
                return true;
            case "ACTIVE_CLASS":
                if(HERO.mapping.contains(value.getAsString().toUpperCase())){
                    this.activeHero = HERO.valueOf(value.getAsString().toUpperCase());
                    return true;
                }
                Logger.logWarn("[PlayerAPI.SmashHeroes.activeClass] Unknown value: " + value.getAsString().toUpperCase());
                return true;
        }
        if(key.contains("XP_")){
            SmashClass smash = getClass(key.replace("XP_", ""));
            smash.setExp(value.getAsInt());
            return true;
        }
        if(key.contains("LASTLEVEL_")){
            SmashClass smash = getClass(key.replace("LASTLEVEL_", ""));
            smash.setLevel(value.getAsInt());
            return true;
        }
        if(key.contains("PG_")){
            SmashClass smash = getClass(key.replace("PG_", ""));
            smash.setPrestigeLevel(value.getAsInt());
            return true;
        }
        if(key.contains("MASTERARMOR_")){
            SmashClass smash = getClass(key.replace("MASTERARMOR_", ""));
            smash.setHasMasterSkinUnlocked(value.getAsBoolean());
            return true;
        }
        if(key.contains("VOTES_")){
            String map = key.replace("VOTES_", "").replace(" ", "_");
            if(!MAP.mapping.contains(map)){
                Logger.logWarn("[PlayerAPI.SmashHeroes.votes] Unknown map value: " + key);
                return true;
            }
            this.mapVotes.put(MAP.valueOf(map), value.getAsInt());
            return true;
        }
        return false;
    }

    private void setClassStats(JsonObject json){
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase().trim();
            if(!HERO.mapping.contains(key)){
                Logger.logWarn("[PlayerAPI.SmashHeroes.classStats] Unknown class: " + key);
                continue;
            }
            HERO hero = HERO.valueOf(key);
            SmashClass smash = getClass(hero);
            smash.setClassJson(e.getValue().getAsJsonObject());
        }
    }

    private void setClasses(JsonObject json){
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase().trim();
            if(!HERO.mapping.contains(key)){
                Logger.logWarn("[PlayerAPI.SmashHeroes.classes] Unknown value: " + key);
                continue;
            }
            HERO hero = HERO.valueOf(key);
            SmashClass smash = getClass(hero);
            smash.setHasClassUnlocked(e.getValue().getAsBoolean());
        }
    }

    private void initPackages(JsonArray array){
        for(JsonElement value: array){
            switch(value.getAsString().toUpperCase().trim()){
                default:
                    Logger.logWarn("[PlayerAPI.SmashHeroes.Packages] Unknown value: " + value);
            }
        }
    }

    public SmashClass getClass(String hero) {
        if(HERO.mapping.contains(hero)){
            return getClass(HERO.valueOf(hero));
        }
        Logger.logWarn("[PlayerAPI.SmashHeroes.getClass] Unknown class: " + hero);
        return null;
    }

    public SmashClass getClass(HERO hero){
        switch(hero){
            case THE_BULK: return bulk;
            case GENERAL_CLUCK: return generalCluck;
            case CAKE_MONSTER: return cakeMonster;
            case BOTMUN: return botmon;
            case TINMAN: return tinman;
            case MARAUDER: return marauder;
            case SPODERMAN: return spooderman;
            case PUG: return pug;
            case FROSTY: return cryomancer;
            case SERGEANT_SHIELD: return sgtShield;
            case GOKU: return karakot;
            case SKULLFIRE: return skullfire;
            case SANIC: return sanic;
            case DUSK_CRAWLER: return voidCrawler;
            case SHOOP_DA_WHOOP: return shoop;
            case GREEN_HOOD: return greenHood;

            //outdated
            case SHAUN_SHEEP: return shaun;
        }
        Logger.logError("[PlayerAPI.SmashHeroes.getClass] Unknown Class: " + hero + " | " + hero.getDisplayName());
        return null;
    }
}
