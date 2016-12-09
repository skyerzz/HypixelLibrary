package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.games.arcade.COSMETIC;
import com.skyerzz.hypixellib.util.games.arcade.miniwalls.KIT;
import com.skyerzz.hypixellib.util.items.all.Item;
import com.skyerzz.hypixellib.util.items.all.ItemStack;
import com.skyerzz.hypixellib.util.items.all.Material;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by sky on 5-9-2016.
 */
public class PlayerArcadeStats extends PlayerGameStats{

    //<editor-fold desc="[PRIVATES INDEX]"
    //all
    private boolean blood, hints, music, dtt_music;
    private int coins;
    private int monthly_coins_a, monthly_coins_b, weekly_coins_a, weekly_coins_b;

    private ArrayList<COSMETIC> unlockedCosmetics = new ArrayList<>();

    //BlockingDead
    private COSMETIC blockingDeadWeaponSkin;
    private int blockingDeadHeadShots, blockingDeadKills, blockingDeadWins;

    //Bounty Hunters
    private COSMETIC bountyHuntersTrail;
    private int bountyHunterBountyKills, bountyHunterDeaths, bountyHunterKills;

    //Build Battle solo|team
    private int buildBattleWins;

    private ArrayList<ItemStack> buildBattleLoadOut = new ArrayList<>();

    //Creeper Attack
    private int creeperAttackMaxWave;

    //Dragon Wars
    private int dragonWarsKills, dragonWarsWins;

    //Ender Spleef
    private COSMETIC enderSpleefTrail;
    private int enderSpleefWins;

    //Farm Hunt
    private int farmHuntPoopCollected, farmHuntWins;

    //Hole in the wall
    private int holeInTheWallWins, holeInTheWallRounds, holeInTheWallMaxQualifierScore, holeInTheWallMaxFinaleScore;

    //Hypixel Says
    private int hypixelSaysRounds, hypixelSaysWins;

    //Mini Walls
    private KIT miniWallsActiveKit;
    private int miniWallsKills, miniWallsDeaths, miniWallsWins, miniWallsFinalKills, miniWallsWitherKills, miniWallsArrowsShot, miniWallsArrowsHit, miniWallsWitherDamage;

    //PartyGames 1|2|3
    private int partyGamesOneWins;
    private int partyGamesTwoWins;
    private int partyGamesThreeWins;

    //PixelPainters
    private int pixelPainterWins;

    //Santa Says
    @OutDated
    private int santaSaysRounds, santaSaysWins;

    //Soccer
    private int soccerPowerKicks, soccerGoals, soccerWins;

    //Star Wars
    private int starWarsShotsFired, starWarsDeaths, starWarsKills, starWarsRebelKills, starWarsEmpireKills, starWarsWins;
    private int starWarsWeeklyKills_a, starWarsMonthlyKills_a, starWarsWeeklyKills_b, starWarsMonthlyKills_b;

    //ThrowOut
    private int throwOutDeaths, throwOutKills, throwOutWins;

    //grinchSim
    private int grinchWins;
    //</editor-fold>


    //UNKNOWN TODO FIND OUT
    private int stamp_level, time_stamp;
    /* stamp_level = Amount of conversions done on that day.
     * time_stamp = time when arcade shop was last opened
     * on arcade shop open both get reset.
     * time_stamp + 24h is when you can convert again, unless stamp_level < 3 , then instant.
     */


    public PlayerArcadeStats(JsonObject json) {
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

            Logger.logWarn("[PlayerAPI.Arcade.initialize] Unknown value: " + key);
        }
    }

    private boolean setValue(String key, JsonElement value){
        switch(key){
            //<editor-fold desc="[All]">
            case "BLOOD":
                this.blood = value.getAsBoolean();
                break;
            case "COINS":
                this.coins = value.getAsInt();
                break;
            case "HINTS":
                this.hints = value.getAsBoolean();
                break;
            case "MUSIC":
                this.music = value.getAsBoolean(); //todo what music?
                break;
            case "DTT_MUSIC":
                this.dtt_music = value.getAsBoolean(); //todo what music?
                break;
            case "MONTHLY_COINS_A":
                this.monthly_coins_a = value.getAsInt();
                break;
            case "MONTHLY_COINS_B":
                this.monthly_coins_b = value.getAsInt();
                break;
            case "WEEKLY_COINS_A":
                this.weekly_coins_a = value.getAsInt();
                break;
            case "WEEKLY_COINS_B":
                this.weekly_coins_b = value.getAsInt();
                break;
            case "STAMP_LEVEL":
                this.stamp_level = value.getAsInt();
                break;
            case "TIME_STAMP":
                this.time_stamp = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Blocking Dead]">
            case "HEADSHOTS_DAYONE":
                this.blockingDeadHeadShots = value.getAsInt();
                break;
            case "KILLS_DAYONE":
                this.blockingDeadKills = value.getAsInt();
                break;
            case "WINS_DAYONE":
                this.blockingDeadWins = value.getAsInt();
                break;
            case "MELEE_WEAPON":
                if(COSMETIC.mapping.contains(value.getAsString().toUpperCase() + "_MELEE")){
                    this.blockingDeadWeaponSkin = COSMETIC.valueOf(value.getAsString().toUpperCase() + "_MELEE");
                    break;
                }
                Logger.logError("[PlayerAPI.Arcade.BlockingDead.MELEE_WEAPON] Unknown Value: " + value.getAsString().toUpperCase());
                break; //not return false as we DID find the key
            //</editor-fold>

            //<editor-fold desc="[Bounty Hunters]">
            case "BOUNTY_KILLS_ONEINTHEQUIVER":
                this.bountyHunterBountyKills = value.getAsInt();
                break;
            case "DEATHS_ONEINTHEQUIVER":
                this.bountyHunterDeaths = value.getAsInt();
                break;
            case "KILLS_ONEINTHEQUIVER":
                this.bountyHunterKills = value.getAsInt();
                break;
            case "BOUNTY_HEAD":
                if(value.getAsString().toUpperCase().equals("DEFAULT")){
                    this.bountyHuntersTrail = COSMETIC.BOUNTY_HUNTERS_DEFAULT_TRAIL;
                    break;
                }
                if(COSMETIC.mapping.contains(value.getAsString().toUpperCase() + "_TRAIL")){
                    this.bountyHuntersTrail = COSMETIC.valueOf(value.getAsString().toUpperCase() + "_TRAIL");
                    break;
                }
                Logger.logError("[PlayerAPI.Arcade.BountyHunters.bounty_head] Unknown Value: " + value.getAsString().toUpperCase());
                break; //not return false as we DID find the key
            //</editor-fold>

            //<editor-fold desc="[Build Battle]">
            case "WINS_BUILDBATTLE":
                this.buildBattleWins = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Creeper Attack]">
            case "MAX_WAVE":
                this.creeperAttackMaxWave = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Dragon Wars]">
            case "KILLS_DRAGONWARS2":
                this.dragonWarsKills = value.getAsInt();
                break;
            case "WINS_DRAGONWARS2":
                this.dragonWarsWins = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Ender Spleef]">
            case "WINS_ENDER":
                this.enderSpleefWins = value.getAsInt();
                break;
            case "ENDERSPLEEF_TRAIL":
                if(value.getAsString().toUpperCase().equals("DEFAULT")){
                    this.enderSpleefTrail = COSMETIC.ENDER_SPLEEF_DEFAULT_TRAIL;
                    break;
                }
                if(COSMETIC.mapping.contains(value.getAsString().toUpperCase() + "_TRAIL")){
                    this.enderSpleefTrail = COSMETIC.valueOf(value.getAsString().toUpperCase() + "_TRAIL");
                    break;
                }
                Logger.logError("[PlayerAPI.Arcade.EnderSpleef.enderspleef_trail] Unknown Value: " + value.getAsString().toUpperCase());
                break; //not return false as we DID find the key
            //</editor-fold>

            //<editor-fold desc="[Farm Hunt]">
            case "POOP_COLLECTED":
                this.farmHuntPoopCollected = value.getAsInt();
                break;
            case "WINS_FARM_HUNT":
                this.farmHuntWins = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Hole in the wall]">
            case "ROUNDS_HOLE_IN_THE_WALL":
                this.holeInTheWallRounds = value.getAsInt();
                break;
            case "WINS_HOLE_IN_THE_WALL":
                this.holeInTheWallWins = value.getAsInt();
                break;
            case "HITW_RECORD_Q":
                this.holeInTheWallMaxQualifierScore = value.getAsInt();
                break;
            case "HITW_RECORD_F":
                this.holeInTheWallMaxFinaleScore = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Hypixel Says]">
            case "ROUNDS_SIMON_SAYS":
                this.hypixelSaysRounds = value.getAsInt();
                break;
            case "WINS_SIMON_SAYS":
                this.hypixelSaysWins = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Mini Walls]">
            case "MINIWALLS_ACTIVEKIT":
                if(KIT.mapping.contains(value.getAsString().toUpperCase())){
                    this.miniWallsActiveKit = KIT.valueOf(value.getAsString().toUpperCase());
                    break;
                }
                Logger.logError("[PlayerAPI.Arcade.Miniwalls.Kit] Unknown value: " + value.getAsString());
                break; //not return false, since we DID find the correct key
            case "KILLS_MINI_WALLS":
                this.miniWallsKills = value.getAsInt();
                break;
            case "DEATHS_MINI_WALLS":
                this.miniWallsDeaths = value.getAsInt();
                break;
            case "WINS_MINI_WALLS":
                this.miniWallsWins = value.getAsInt();
                break;
            case "FINAL_KILLS_MINI_WALLS":
                this.miniWallsFinalKills = value.getAsInt();
                break;
            case "WITHER_KILLS_MINI_WALLS":
                this.miniWallsWitherKills = value.getAsInt();
                break;
            case "ARROWS_HIT_MINI_WALLS":
                this.miniWallsArrowsHit = value.getAsInt();
                break;
            case "ARROWS_SHOT_MINI_WALLS":
                this.miniWallsArrowsShot = value.getAsInt();
                break;
            case "WITHER_DAMAGE_MINI_WALLS":
                this.miniWallsWitherDamage = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Party Games]">
            case "WINS_PARTY":
                this.partyGamesOneWins = value.getAsInt();
                break;

            case "WINS_PARTY_2":
                this.partyGamesTwoWins = value.getAsInt();
                break;

            case "WINS_PARTY_3":
                this.partyGamesThreeWins = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Pixel Painters]">
            case "WINS_DRAW_THEIR_THING":
                this.pixelPainterWins = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Santa Says]">
            case "ROUNDS_SANTA_SAYS":
                this.santaSaysRounds = value.getAsInt();
                break;
            case "WINS_SANTA_SAYS":
                this.santaSaysWins = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Soccer]">
            case "POWERKICKS_SOCCER":
                this.soccerPowerKicks = value.getAsInt();
                break;
            case "GOALS_SOCCER":
                this.soccerGoals = value.getAsInt();
                break;
            case "WINS_SOCCER":
                this.soccerWins = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Star Wars]">
            case "SW_SHOTS_FIRED":
                this.starWarsShotsFired = value.getAsInt();
                break;
            case "SW_DEATHS":
                this.starWarsDeaths = value.getAsInt();
                break;
            case "SW_KILLS":
                this.starWarsKills = value.getAsInt();
                break;
            case "SW_REBEL_KILLS":
                this.starWarsRebelKills = value.getAsInt();
                break;
            case "SW_EMPIRE_KILLS":
                this.starWarsEmpireKills = value.getAsInt();
                break;
            case "SW_GAME_WINS":
                this.starWarsWins = value.getAsInt();
                break;
            case "SW_WEEKLY_KILLS_A":
                this.starWarsWeeklyKills_a = value.getAsInt();
                break;
            case "SW_MONTHLY_KILLS_A":
                this.starWarsMonthlyKills_a = value.getAsInt();
                break;
            case "SW_WEEKLY_KILLS_B":
                this.starWarsWeeklyKills_b = value.getAsInt();
                break;
            case "SW_MONTHLY_KILLS_B":
                this.starWarsMonthlyKills_b = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Throw Out]">
            case "DEATHS_THROW_OUT":
                this.throwOutDeaths = value.getAsInt();
                break;
            case "KILLS_THROW_OUT":
                this.throwOutKills = value.getAsInt();
                break;
            case "WINS_THROW_OUT":
                this.throwOutWins = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[GRINCH SIM]">
            case "WINS_GRINCH":
                this.grinchWins = value.getAsInt();
                return true;
            //</editor-fold>

            default:
                return false;
        }
        return true;
    }

    private boolean setSpecialValue(String key, JsonElement value){
        switch(key){
            case "PACKAGES":
                setPackages(value.getAsJsonArray());
                return true;
            case "BUILDBATTLE_LOADOUT":
                setBuildBattleLoadOut(value.getAsJsonArray());
                return true;
        }
        if(key.contains("WITCH_HUNT")){
            //you did not see this.
            return true;
        }
        return false;
    }

    private void setPackages(JsonArray array){
        for(JsonElement element: array){
            if(COSMETIC.mapping.contains(element.getAsString().toUpperCase())){
                this.unlockedCosmetics.add(COSMETIC.valueOf(element.getAsString().toUpperCase()));
            }else{
                Logger.logWarn("[PlayerAPI.Arcade.packages] Unknown Value: " + element.getAsString().toUpperCase());
            }
        }
    }

    private void setBuildBattleLoadOut(JsonArray array){
        for(JsonElement element: array){
            String name = element.getAsString().split(":")[0].toUpperCase();
            int durability = 0;
            try {
                durability = Integer.parseInt(element.getAsString().split(":")[1]);
            }catch(NumberFormatException e){
                Logger.logError("[PlayerAPI.Arcade.buildBattle.loadout] No Integer Value: " + element.getAsString().split(":")[1]);
            }
            if(Material.mapping.contains(name)){
                this.buildBattleLoadOut.add(new ItemStack(new Item(Material.valueOf(name), durability)));
            }else{
                Logger.logWarn("[PlayerAPI.Arcade.buildBattle.loadout] Unknown ItemValue: " + element.getAsString().toUpperCase());
            }
        }
    }
}
