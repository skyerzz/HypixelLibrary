package com.skyerzz.hypixellib.util.games.smashheroes;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sky on 7-1-2017.
 */
public class SmashClass {

    /*
     * IMPORTANT NOTE:
     * "Smashed" and "Smasher" values are when a person is knocked out of the arena, being from a kill when on 0 health.
     * Does not include void kills or leaves.
     */

    private int level = 0, exp = 0, prestigeLevel = 0;
    private boolean hasClassUnlocked = false, hasMasterSkinUnlocked = false;
    private HERO hero;

    private HashMap<SmashAbility, Integer> smashedByMove = new HashMap<>();
    private HashMap<SmashAbility, Integer> smashedByMoveteam = new HashMap<>();
    private HashMap<SmashAbility, Integer> smashedByMovenormal = new HashMap<>();
    private HashMap<SmashAbility, Integer> smashedByMove2v2 = new HashMap<>();
    private HashMap<SmashAbility, Integer> smashedByMove3v3 = new HashMap<>();

    private HashMap<SmashAbility, Integer> OWNKills2v2 = new HashMap<>(), OWNkills = new HashMap<>(), OWNkillsNormal = new HashMap<>(), OWNKillsTeams = new HashMap<>();
    private HashMap<SmashAbility, Integer> OWNdamagedealt = new HashMap<>(), OWNdamagedealtTeams = new HashMap<>(), OWNdamagedealtNormal = new HashMap<>(), OWNdamagedealt2v2 = new HashMap<>();
    //smasher seem to not include voidkills/leaves
    private HashMap<SmashAbility, Integer> OWNsmasher = new HashMap<>(), OWNsmasherNormal = new HashMap<>(), OWNsmasherTeams = new HashMap<>(), OWNsmasher2v2 = new HashMap<>();
    
    private int deathsNormal, gamesNormal, damageDealtNormal, lossesNormal, killsNormal, winsNormal, smasherNormal, smashedNormal, assistsNormal, winStreakNormal;
    private int deathsTeams, gamesTeams, damageDealtTeams, lossesTeams, killsTeams, winsTeams, smasherTeams, smashedTeams, assistsTeams, winStreakTeams;
    private int deathsFriends, gamesFriends, damageDealtFriends, lossesFriends, killsFriends, winsFriends, smasherFriends, smashedFriends, assistsFriends, winStreakFriends;
    private int deaths2v2, games2v2, damageDealt2v2, losses2v2, kills2v2, wins2v2, smasher2v2, smashed2v2, assists2v2, winStreak2v2;
    private int deaths, games, damageDealt, losses, kills, wins, smasher, smashed, assists, winStreak;
    
    @OutDated
    private int deaths3v3, games3v3, damageDealt3v3, losses3v3, kills3v3, wins3v3, smasher3v3, smashed3v3, assists3v3, winStreak3v3;
    private HashMap<SmashAbility, Integer> OWNkills3v3 = new HashMap<>(), OWNdamagedealt3v3= new HashMap<>(), OWNsmasher3v3= new HashMap<>();


    public SmashClass(HERO hero) {
        this.hero = hero;
    }

    public void setClassJson(JsonObject classJson){
        runJsonInitialisation(classJson);
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setPrestigeLevel(int prestigeLevel) {
        this.prestigeLevel = prestigeLevel;
    }

    public void setHasClassUnlocked(boolean hasClassUnlocked) {
        this.hasClassUnlocked = hasClassUnlocked;
    }

    public void setHasMasterSkinUnlocked(boolean hasMasterSkinUnlocked) {
        this.hasMasterSkinUnlocked = hasMasterSkinUnlocked;
    }

    private void runJsonInitialisation(JsonObject json){
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase();
            if(e.getValue().isJsonObject()){
                runMoveStatsInitialisation(key, e.getValue().getAsJsonObject());
                continue;
            }else if(setValue(key, e.getValue())){
                continue;
            }

            Logger.logWarn("[PlayerAPI.SmashHeroes.initializeJson] Unknown value: " + key + " in Hero: " + hero.getDisplayName());
        }
    }

    private boolean setValue(String key, JsonElement value){
        if(key.contains("FRIEND") && key.contains("NORMAL")){
            Logger.logInfo("Skipping value " + key + " , not known what it is.");
            return true;
        }
        switch(key){
            //<editor-fold desc="[Values]">
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
            case "WIN_STREAK_NORMAL":
                this.winStreakNormal = value.getAsInt();
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
            case "WIN_STREAK_TEAMS":
                this.winStreakTeams = value.getAsInt();
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
            case "FRIEND_WIN_STREAK":
                this.winStreakFriends = value.getAsInt();
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
            case "WIN_STREAK_2V2":
                this.winStreak2v2 = value.getAsInt();
                return true;
            case "DEATHS_3V3":
            case "DEATHS3V3":
                this.deaths3v3 = value.getAsInt();
                return true;
            case "GAMES_3V3":
            case "GAMES3V3":
                this.games3v3 = value.getAsInt();
                return true;
            case "LOSSES_3V3":
            case "LOSSES3V3":
                this.losses3v3 = value.getAsInt();
                return true;
            case "KILLS_3V3":
            case "KILLS3V3":
                this.kills3v3 = value.getAsInt();
                return true;
            case "DAMAGE_DEALT3V3":
            case "DAMAGE_DEALT_3V3":
            case "DAMAGEDEALT3V3":
            case "DAMAGEDEALT_3V3":
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
            case "WIN_STREAK_3V3":
            case "WIN_STREAK3V3":
            case "WINSTREAK3V3":
            case "WINSTREAK_3V3":
                this.winStreak3v3 = value.getAsInt();
                return true;
            case "DEATHS":
                this.deaths = value.getAsInt();
                return true;
            case "GAMES":
                this.games = value.getAsInt();
                return true;
            case "LOSSES":
                this.losses = value.getAsInt();
                return true;
            case "KILLS":
                this.kills = value.getAsInt();
                return true;
            case "DAMAGE_DEALT":
                this.damageDealt = value.getAsInt();
                return true;
            case "SMASHER":
                this.smasher = value.getAsInt();
                return true;
            case "SMASHED":
                this.smashed = value.getAsInt();
                return true;
            case "WINS":
                this.wins = value.getAsInt();
                return true;
            case "ASSISTS":
                this.assists = value.getAsInt();
                return true;
            case "WIN_STREAK":
                this.winStreak = value.getAsInt();
                return true;

            //</editor-fold>
        }
        return false;
    }

    private void runMoveStatsInitialisation(String move, JsonObject moveJson){
        SmashAbility smashAbility = getMoveByName(move);
        if(smashAbility==null){
            return;
        }
        for (Map.Entry<String, JsonElement> e : moveJson.entrySet()) {

            JsonElement value = e.getValue();
            String key = e.getKey().toUpperCase();
            switch(key){
                case "SMASHER_TEAMS":
                    this.OWNsmasherTeams.put(smashAbility, value.getAsInt());
                    continue;
                case "SMASHER_NORMAL":
                    this.OWNsmasherNormal.put(smashAbility, value.getAsInt());
                    continue;
                case "SMASHER_2V2":
                    this.OWNsmasher2v2.put(smashAbility, value.getAsInt());
                    continue;
                case "SMASHER_3V3":
                case "SMASHER3V3":
                    this.OWNsmasher3v3.put(smashAbility, value.getAsInt());
                    continue;
                case "SMASHER":
                    this.OWNsmasher.put(smashAbility, value.getAsInt());
                    continue;
                case "KILLS_TEAMS":
                    this.OWNKillsTeams.put(smashAbility, value.getAsInt());
                    continue;
                case "KILLS_NORMAL":
                    this.OWNkillsNormal.put(smashAbility, value.getAsInt());
                    continue;
                case "KILLS_2V2":
                    this.OWNKills2v2.put(smashAbility, value.getAsInt());
                    continue;
                case "KILLS_3V3":
                case "KILLS3V3":
                    this.OWNkills3v3.put(smashAbility, value.getAsInt());
                    continue;
                case "KILLS":
                    this.OWNkills.put(smashAbility, value.getAsInt());
                    continue;
                case "DAMAGE_DEALT_TEAMS":
                    this.OWNdamagedealtTeams.put(smashAbility, value.getAsInt());
                    continue;
                case "DAMAGE_DEALT_NORMAL":
                    this.OWNdamagedealtNormal.put(smashAbility, value.getAsInt());
                    continue;
                case "DAMAGE_DEALT_2V2":
                    this.OWNdamagedealt2v2.put(smashAbility, value.getAsInt());
                    continue;
                case "DAMAGE_DEALT_3V3":
                case "DAMAGE_DEALT3V3":
                    this.OWNdamagedealt3v3.put(smashAbility, value.getAsInt());
                    continue;
                case "DAMAGE_DEALT":
                    this.OWNdamagedealt.put(smashAbility, value.getAsInt());
                    continue;

                //deaths by others with the same class, therefore moves
                case "SMASHED_TEAMS":
                    this.smashedByMoveteam.put(smashAbility, value.getAsInt());
                    continue;
                case "SMASHED_NORMAL":
                    this.smashedByMovenormal.put(smashAbility, value.getAsInt());
                    continue;
                case "SMASHED_2V2":
                    this.smashedByMove2v2.put(smashAbility, value.getAsInt());
                    continue;
                case "SMASHED_3V3":
                case "SMASHED3V3":
                    this.smashedByMove3v3.put(smashAbility, value.getAsInt());
                    continue;
                case "SMASHED":
                    this.smashedByMove.put(smashAbility, value.getAsInt());
                    continue;

                default:
                    Logger.logWarn("[PlayerAPI.SmashHeroes.initializeMove] Unknown value: " + key + " in Hero: " + hero.getDisplayName() + " and Move: " + move);
            }

        }
    }

    private SmashAbility getMoveByName(String move){
        //exception for Melee
        if(move.equals("MELEE")){
            return new SmashAbility("MELEE", "Melee", "Hitting your opponent by left-click");
        }
        for(String string: HERO.mapping){
            HERO hero = HERO.valueOf(string);
            if(hero.getQuickMove().getAPIName().equals(move)){
                return hero.getQuickMove();
            }
            if(hero.getChargeMove().getAPIName().equals(move)){
                return hero.getChargeMove();
            }
            if(hero.getSmashMove().getAPIName().equals(move)){
                return hero.getSmashMove();
            }
            if(hero.getPassive().getAPIName().equals(move)){
                return hero.getPassive();
            }
        }
        //ROGUE PLS WHY U BREAK MY STUFF WITH OUTDATED VALUES #blamerogue
        if(move.equals("SHIELD")){
            return HERO.SERGEANT_SHIELD.getQuickMove();
        }
        if(move.equals("ARROW_STORM")){
            return HERO.GREEN_HOOD.getSmashMove();
        }
        if(move.equals("SANIC_BOOM")){
            return HERO.SANIC.getChargeMove();
        }
        if(move.equals("SPIN_DASH")){
            return HERO.SANIC.getQuickMove();
        }
        if(move.equals("BOUNCE")){
            return HERO.PUG.getPassive();
        }
        if(move.equals("ANGRY_CUB")){
            return HERO.PUG.getSmashMove();
        }
        Logger.logError("[PlayerAPI.SmashHeroes.getMove] Could not find move: " + move);
        return null;
    }

    private boolean hasMove(String move){
        return hero.getQuickMove().getAPIName().equals(move) || hero.getChargeMove().getAPIName().equals(move) || hero.getPassive().getAPIName().equals(move) || hero.getSmashMove().getAPIName().equals(move);
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public int getPrestigeLevel() {
        return prestigeLevel;
    }

    public boolean isHasClassUnlocked() {
        return hasClassUnlocked;
    }

    public boolean isHasMasterSkinUnlocked() {
        return hasMasterSkinUnlocked;
    }

    public HERO getHero() {
        return hero;
    }

    public HashMap<SmashAbility, Integer> getSmashedByMove() {
        return smashedByMove;
    }

    public HashMap<SmashAbility, Integer> getSmashedByMoveteam() {
        return smashedByMoveteam;
    }

    public HashMap<SmashAbility, Integer> getSmashedByMovenormal() {
        return smashedByMovenormal;
    }

    public HashMap<SmashAbility, Integer> getSmashedByMove2v2() {
        return smashedByMove2v2;
    }

    public HashMap<SmashAbility, Integer> getOWNKills2v2() {
        return OWNKills2v2;
    }

    public HashMap<SmashAbility, Integer> getOWNkills() {
        return OWNkills;
    }

    public HashMap<SmashAbility, Integer> getOWNkillsNormal() {
        return OWNkillsNormal;
    }

    public HashMap<SmashAbility, Integer> getOWNKillsTeams() {
        return OWNKillsTeams;
    }

    public HashMap<SmashAbility, Integer> getOWNdamagedealt() {
        return OWNdamagedealt;
    }

    public HashMap<SmashAbility, Integer> getOWNdamagedealtTeams() {
        return OWNdamagedealtTeams;
    }

    public HashMap<SmashAbility, Integer> getOWNdamagedealtNormal() {
        return OWNdamagedealtNormal;
    }

    public HashMap<SmashAbility, Integer> getOWNdamagedealt2v2() {
        return OWNdamagedealt2v2;
    }

    public HashMap<SmashAbility, Integer> getOWNsmasher() {
        return OWNsmasher;
    }

    public HashMap<SmashAbility, Integer> getOWNsmasherNormal() {
        return OWNsmasherNormal;
    }

    public HashMap<SmashAbility, Integer> getOWNsmasherTeams() {
        return OWNsmasherTeams;
    }

    public HashMap<SmashAbility, Integer> getOWNsmasher2v2() {
        return OWNsmasher2v2;
    }

    public int getDeathsNormal() {
        return deathsNormal;
    }

    public int getGamesNormal() {
        return gamesNormal;
    }

    public int getDamageDealtNormal() {
        return damageDealtNormal;
    }

    public int getLossesNormal() {
        return lossesNormal;
    }

    public int getKillsNormal() {
        return killsNormal;
    }

    public int getWinsNormal() {
        return winsNormal;
    }

    public int getSmasherNormal() {
        return smasherNormal;
    }

    public int getSmashedNormal() {
        return smashedNormal;
    }

    public int getAssistsNormal() {
        return assistsNormal;
    }

    public int getDeathsTeams() {
        return deathsTeams;
    }

    public int getGamesTeams() {
        return gamesTeams;
    }

    public int getDamageDealtTeams() {
        return damageDealtTeams;
    }

    public int getLossesTeams() {
        return lossesTeams;
    }

    public int getKillsTeams() {
        return killsTeams;
    }

    public int getWinsTeams() {
        return winsTeams;
    }

    public int getSmasherTeams() {
        return smasherTeams;
    }

    public int getSmashedTeams() {
        return smashedTeams;
    }

    public int getAssistsTeams() {
        return assistsTeams;
    }

    public int getDeathsFriends() {
        return deathsFriends;
    }

    public int getGamesFriends() {
        return gamesFriends;
    }

    public int getDamageDealtFriends() {
        return damageDealtFriends;
    }

    public int getLossesFriends() {
        return lossesFriends;
    }

    public int getKillsFriends() {
        return killsFriends;
    }

    public int getWinsFriends() {
        return winsFriends;
    }

    public int getSmasherFriends() {
        return smasherFriends;
    }

    public int getSmashedFriends() {
        return smashedFriends;
    }

    public int getAssistsFriends() {
        return assistsFriends;
    }

    public int getDeaths2v2() {
        return deaths2v2;
    }

    public int getGames2v2() {
        return games2v2;
    }

    public int getDamageDealt2v2() {
        return damageDealt2v2;
    }

    public int getLosses2v2() {
        return losses2v2;
    }

    public int getKills2v2() {
        return kills2v2;
    }

    public int getWins2v2() {
        return wins2v2;
    }

    public int getSmasher2v2() {
        return smasher2v2;
    }

    public int getSmashed2v2() {
        return smashed2v2;
    }

    public int getAssists2v2() {
        return assists2v2;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getGames() {
        return games;
    }

    public int getDamageDealt() {
        return damageDealt;
    }

    public int getLosses() {
        return losses;
    }

    public int getKills() {
        return kills;
    }

    public int getWins() {
        return wins;
    }

    public int getSmasher() {
        return smasher;
    }

    public int getSmashed() {
        return smashed;
    }

    public int getAssists() {
        return assists;
    }
}
