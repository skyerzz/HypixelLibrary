package com.skyerzz.hypixellib.util.games.smashheroes;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;

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

    //Kill stats are kills gotten by voidkills/leaves and registered to your last used ability (probably)
    private HashMap<SmashAbility, Integer> OWNKills2v2 = new HashMap<>(), OWNkills = new HashMap<>(), OWNkillsNormal = new HashMap<>(), OWNKillsTeams = new HashMap<>();
    private HashMap<SmashAbility, Integer> OWNdamageDealth = new HashMap<>(), OWNdamageDealthTeams = new HashMap<>(), OWNdamageDealthNormal = new HashMap<>(), OWNdamageDealth2v2 = new HashMap<>();
    //smasher seem to not include voidkills/leaves
    private HashMap<SmashAbility, Integer> OWNsmasher = new HashMap<>(), OWNsmasherNormal = new HashMap<>(), OWNsmasherTeams = new HashMap<>(), OWNsmasher2v2 = new HashMap<>();


    public SmashClass(HERO hero, int level, int exp, int prestigeLevel, boolean hasClassUnlocked, boolean hasMasterSkinUnlocked, JsonObject classJson) {
        this.hero = hero;
        this.level = level;
        this.exp = exp;
        this.prestigeLevel = prestigeLevel;
        this.hasClassUnlocked = hasClassUnlocked;
        this.hasMasterSkinUnlocked = hasMasterSkinUnlocked;

        runJsonInitialisation(classJson);
    }

    private void runJsonInitialisation(JsonObject json){
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase();
            if(e.getValue().isJsonObject()){
                runMoveStatsInitialisation(key, e.getValue().getAsJsonObject());
                continue;
            }

            Logger.logWarn("[PlayerAPI.Smash.initializeJson] Unknown value: " + key + " in Hero: " + hero.getDisplayName());
        }
    }

    private void runMoveStatsInitialisation(String move, JsonObject moveJson){
        SmashAbility smashAbility = getMoveByName(move);
        if(smashAbility==null){
            return;
        }
        if(hasMove(move) || move.equals("MELEE")){
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
                    case "KILLS":
                        this.OWNkills.put(smashAbility, value.getAsInt());
                        continue;
                    case "DAMAGE_DEALTH_TEAMS":
                        this.OWNdamageDealthTeams.put(smashAbility, value.getAsInt());
                        continue;
                    case "DAMAGE_DEALTH_NORMAL":
                        this.OWNdamageDealthNormal.put(smashAbility, value.getAsInt());
                        continue;
                    case "DAMAGE_DEALTH_2V2":
                        this.OWNdamageDealth2v2.put(smashAbility, value.getAsInt());
                        continue;
                    case "DAMAGE_DEALTH":
                        this.OWNdamageDealth.put(smashAbility, value.getAsInt());
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
                    case "SMASHED":
                        this.smashedByMove.put(smashAbility, value.getAsInt());
                        continue;

                    default:
                        Logger.logWarn("[PlayerAPI.Smash.initializeOwnMoveJson] Unknown value: " + key + " in Hero: " + hero.getDisplayName() + " and Move: " + move);
                }

            }
        }else{
            for (Map.Entry<String, JsonElement> e : moveJson.entrySet()) {

                JsonElement value = e.getValue();
                String key = e.getKey().toUpperCase();
                switch(key){
                    case "SMASHED_TEAMS":
                        this.smashedByMoveteam.put(smashAbility, value.getAsInt());
                        continue;
                    case "SMASHED_NORMAL":
                        this.smashedByMovenormal.put(smashAbility, value.getAsInt());
                        continue;
                    case "SMASHED_2V2":
                        this.smashedByMove2v2.put(smashAbility, value.getAsInt());
                        continue;
                    case "SMASHED":
                        this.smashedByMove.put(smashAbility, value.getAsInt());
                        continue;
                    default:
                        Logger.logWarn("[PlayerAPI.Smash.initializeMoveJson] Unknown value: " + key + " in Hero: " + hero.getDisplayName() + " and Move: " + move);
                }

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
        Logger.logError("[PlayerAPI.Smash.getMove] Could not find move: " + move);
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
}
