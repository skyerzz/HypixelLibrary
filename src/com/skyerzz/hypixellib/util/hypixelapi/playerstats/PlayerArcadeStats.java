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
    private boolean blood, hints, music, dtt_music, dtt_dropdown, xmas_music;
    private int coins;
    @OutDated
    private int monthly_coins_a, monthly_coins_b, weekly_coins_a, weekly_coins_b;

    private ArrayList<COSMETIC> unlockedCosmetics = new ArrayList<>();

    //BlockingDead
    private COSMETIC blockingDeadWeaponSkin;
    private int blockingDeadHeadShots, blockingDeadKills, blockingDeadWins;
    private boolean flash /* lightning flashes */;

    //Bounty Hunters
    private COSMETIC bountyHuntersTrail;
    private int bountyHunterBountyKills, bountyHunterDeaths, bountyHunterKills, bountyHunterWins;

    //Build Battle solo|team
    private int buildBattleWins, buildBattleTeamWins;
    private String language;

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

    //Splatoon
    @OutDated
    private int splatoonWins, splatoonKills, splatoonDeaths;
    @OutDated
    private boolean splatoonTutorial;

    //Star Wars
    private int starWarsShotsFired, starWarsDeaths, starWarsKills, starWarsRebelKills, starWarsEmpireKills, starWarsWins;
    @OutDated
    private int starWarsWeeklyKills_a, starWarsMonthlyKills_a, starWarsWeeklyKills_b, starWarsMonthlyKills_b;

    //Sumo
    @OutDated
    private int sumoWins;

    //ThrowOut
    private int throwOutDeaths, throwOutKills, throwOutWins;
    private COSMETIC throwOutDisguise;

    //grinchSim
    private int grinchWins;
    //</editor-fold>


    //UNKNOWN TODO IMPLEMENT/Find out!
    private int stamp_level, time_stamp;

    /* stamp_level = Amount of conversions done on that day.
     * time_stamp = time when arcade shop was last opened
     * on arcade shop open both get reset.
     * time_stamp + 24h is when you can convert again, unless stamp_level < 3 , then instant.
     */
    private int paintedBlocks;


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
            case "DTT_DROPDOWN":
                this.dtt_dropdown = value.getAsBoolean(); //todo what is dtt
                break;
            case "XMAS_MUSIC":
                this.xmas_music = value.getAsBoolean();
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

            //unknown
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
            case "FLASH":
                this.flash = value.getAsBoolean();
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
            case "WINS_ONEINTHEQUIVER":
                this.bountyHunterWins = value.getAsInt();
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
            case "WINS_BUILDBATTLE_TEAMS":
                this.buildBattleTeamWins = value.getAsInt();
                break;
            case "LANGUAGE":
            case "BUILDBATTLE_LANGUAGE":
            case "BB_LANGUAGE":
                //unsure which one is currently used.
                this.language = value.getAsString();
                return true;
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
            case "THROWOUT_DISGUISE":
                if(COSMETIC.mapping.contains(value.getAsString().toUpperCase() + "_DISGUISE")){
                    this.throwOutDisguise = COSMETIC.valueOf(value.getAsString().toUpperCase() + "_DISGUISE");
                }else{
                    Logger.logWarn("[PlayerAPI.Arcade.Throwout.Disguise] Couldnt find value: " + value.getAsString());
                }
                return true;
            //</editor-fold>

            //<editor-fold desc="[GRINCH SIM]">
            case "WINS_GRINCH":
                this.grinchWins = value.getAsInt();
                return true;
            //</editor-fold>

            //<editor-fold desc="[UNKNOWN]">
            case "PAINTEDBLOCKS":
                this.paintedBlocks = value.getAsInt();
                return true;
            //</editor-fold>

            //<editor-fold desc="[UNUSED - NEVER EXISTED]">
            case "DEATHS_GRIND":
            case "DEATHS_VOLLEYBALL":
            case "KILLS_GRIND":
            case "KILLS_SPACERAIDERS":
            case "KILLS_VOLLEYBALL":
            case "WINS_GRIND":
            case "WINS_PSPLEEF":
            case "WINS_SPACERAIDERS":
            case "WINS_VOLLEYBALL":
                //these games never existed
                return true;
            case "WINS_SPLATOON":
                this.splatoonWins = value.getAsInt();
                return true;
            case "KILLS_SPLATOON":
                this.splatoonKills = value.getAsInt();
                return true;
            case "DEATHS_SPLATOON":
                this.splatoonDeaths = value.getAsInt();
                return true;
            case "WINS_SUMO":
                this.sumoWins = value.getAsInt();
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
            String value = element.getAsString().toUpperCase().trim();
            if(COSMETIC.mapping.contains(value)){
                this.unlockedCosmetics.add(COSMETIC.valueOf(value));
            }else if(value.equals("TUTORIAL_SPLATOON")){
                this.splatoonTutorial = true;
            }else{
                Logger.logWarn("[PlayerAPI.Arcade.packages] Unknown Value: " + element.getAsString().toUpperCase());
            }
        }
    }

    private void setBuildBattleLoadOut(JsonArray array){
        //todo make inventory object + this
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

    public boolean isBlood() {
        return blood;
    }

    public boolean isHints() {
        return hints;
    }

    public boolean isMusic() {
        return music;
    }

    public boolean isDtt_music() {
        return dtt_music;
    }

    public int getCoins() {
        return coins;
    }

    @OutDated
    public int getMonthly_coins_a() {
        return monthly_coins_a;
    }
    @OutDated
    public int getMonthly_coins_b() {
        return monthly_coins_b;
    }
    @OutDated
    public int getWeekly_coins_a() {
        return weekly_coins_a;
    }
    @OutDated
    public int getWeekly_coins_b() {
        return weekly_coins_b;
    }

    public ArrayList<COSMETIC> getUnlockedCosmetics() {
        return unlockedCosmetics;
    }

    public COSMETIC getBlockingDeadWeaponSkin() {
        return blockingDeadWeaponSkin;
    }

    public int getBlockingDeadHeadShots() {
        return blockingDeadHeadShots;
    }

    public int getBlockingDeadKills() {
        return blockingDeadKills;
    }

    public int getBlockingDeadWins() {
        return blockingDeadWins;
    }

    public boolean isFlash() {
        return flash;
    }

    public COSMETIC getBountyHuntersTrail() {
        return bountyHuntersTrail;
    }

    public int getBountyHunterBountyKills() {
        return bountyHunterBountyKills;
    }

    public int getBountyHunterDeaths() {
        return bountyHunterDeaths;
    }

    public int getBountyHunterKills() {
        return bountyHunterKills;
    }

    public int getBountyHunterWins() {
        return bountyHunterWins;
    }

    public int getBuildBattleWins() {
        return buildBattleWins;
    }

    public int getBuildBattleTeamWins() {
        return buildBattleTeamWins;
    }

    public ArrayList<ItemStack> getBuildBattleLoadOut() {
        return buildBattleLoadOut;
    }

    public int getCreeperAttackMaxWave() {
        return creeperAttackMaxWave;
    }

    public int getDragonWarsKills() {
        return dragonWarsKills;
    }

    public int getDragonWarsWins() {
        return dragonWarsWins;
    }

    public COSMETIC getEnderSpleefTrail() {
        return enderSpleefTrail;
    }

    public int getEnderSpleefWins() {
        return enderSpleefWins;
    }

    public int getFarmHuntPoopCollected() {
        return farmHuntPoopCollected;
    }

    public int getFarmHuntWins() {
        return farmHuntWins;
    }

    public int getHoleInTheWallWins() {
        return holeInTheWallWins;
    }

    public int getHoleInTheWallRounds() {
        return holeInTheWallRounds;
    }

    public int getHoleInTheWallMaxQualifierScore() {
        return holeInTheWallMaxQualifierScore;
    }

    public int getHoleInTheWallMaxFinaleScore() {
        return holeInTheWallMaxFinaleScore;
    }

    public int getHypixelSaysRounds() {
        return hypixelSaysRounds;
    }

    public int getHypixelSaysWins() {
        return hypixelSaysWins;
    }

    public KIT getMiniWallsActiveKit() {
        return miniWallsActiveKit;
    }

    public int getMiniWallsKills() {
        return miniWallsKills;
    }

    public int getMiniWallsDeaths() {
        return miniWallsDeaths;
    }

    public int getMiniWallsWins() {
        return miniWallsWins;
    }

    public int getMiniWallsFinalKills() {
        return miniWallsFinalKills;
    }

    public int getMiniWallsWitherKills() {
        return miniWallsWitherKills;
    }

    public int getMiniWallsArrowsShot() {
        return miniWallsArrowsShot;
    }

    public int getMiniWallsArrowsHit() {
        return miniWallsArrowsHit;
    }

    public int getMiniWallsWitherDamage() {
        return miniWallsWitherDamage;
    }

    public int getPartyGamesOneWins() {
        return partyGamesOneWins;
    }

    public int getPartyGamesTwoWins() {
        return partyGamesTwoWins;
    }

    public int getPartyGamesThreeWins() {
        return partyGamesThreeWins;
    }

    public int getPixelPainterWins() {
        return pixelPainterWins;
    }
    @OutDated
    public int getSantaSaysRounds() {
        return santaSaysRounds;
    }
    @OutDated
    public int getSantaSaysWins() {
        return santaSaysWins;
    }

    public int getSoccerPowerKicks() {
        return soccerPowerKicks;
    }

    public int getSoccerGoals() {
        return soccerGoals;
    }

    public int getSoccerWins() {
        return soccerWins;
    }

    public int getStarWarsShotsFired() {
        return starWarsShotsFired;
    }

    public int getStarWarsDeaths() {
        return starWarsDeaths;
    }

    public int getStarWarsKills() {
        return starWarsKills;
    }

    public int getStarWarsRebelKills() {
        return starWarsRebelKills;
    }

    public int getStarWarsEmpireKills() {
        return starWarsEmpireKills;
    }

    public int getStarWarsWins() {
        return starWarsWins;
    }
    @OutDated
    public int getStarWarsWeeklyKills_a() {
        return starWarsWeeklyKills_a;
    }
    @OutDated
    public int getStarWarsMonthlyKills_a() {
        return starWarsMonthlyKills_a;
    }
    @OutDated
    public int getStarWarsWeeklyKills_b() {
        return starWarsWeeklyKills_b;
    }
    @OutDated
    public int getStarWarsMonthlyKills_b() {
        return starWarsMonthlyKills_b;
    }

    public int getThrowOutDeaths() {
        return throwOutDeaths;
    }

    public int getThrowOutKills() {
        return throwOutKills;
    }

    public int getThrowOutWins() {
        return throwOutWins;
    }

    public int getGrinchWins() {
        return grinchWins;
    }

    public int getStamp_level() {
        return stamp_level;
    }

    public int getTime_stamp() {
        return time_stamp;
    }
}
