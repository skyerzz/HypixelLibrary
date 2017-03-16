package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.games.copsandcrims.*;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Ruben on 11/09/2016.
 */
public class PlayerCopsAndCrimsStats extends PlayerGameStats {

    //<editor-fold desc="[GLOBAL VARIABLES]">
    private ArrayList<RadioCommand> unlockedRadioCommands = new ArrayList<>();
    private ArrayList<ArmorSkin> unlockedArmorSkins = new ArrayList<>();
    private ArrayList<KnifeSkin> unlockedKnifeSkins = new ArrayList<>();
    private ArrayList<GunSkin> unlockedGunSkins = new ArrayList<>();
    private ArrayList<Spray> unlockedSprays = new ArrayList<>();

    //game
    private int bombsDefused, bombsPlanted;
    private int coins, copKills, crimKills, deaths, wins, headshotKills, kills;
    private int pocketChange, roundWins;
    private int shotsFired, deathmatchDeaths, deathmatchKills;
    @OutDated
    private int weekly_kills_b, weekly_kills_a, monthly_kills_b, monthly_kills_a;
    private int gameWinsCarrier, gameWinsOvergrown, gameWinsAlleyway, deathmatchWins, gameWinsTemple, gameWinsSandstorm, gameWinsAtomic;
    private int crimKillsDeathmatch, copKillsDeathmatch;

    //gun
    private GunSkin selectedCarbineSkin, selectedMagnumSkin;
    private KnifeSkin selectedKnifeSkin;

    //body armor
    private ArmorSkin copsHelmetSkin, crimsHelmetSkin, copsBodyArmorSkin, crimsBodyArmorSkin;

    //knife
    private int knifeAttackDelay, knifeDamageIncrease;

    //carbine
    private int carbineDamageIncrease, carbineCostReduction, carbineRecoilReduction, carbineReloadSpeedReduction;

    //pistol
    private int pistolDamageIncrease, pistolRecoilReduction, pistolReloadSpeedReduction;

    //SMG
    private int smgCostReduction, smgDamageIncrease, smgRecoilReduction, smgReloadSpeedReduction;

    //rifle
    private int rifleCostReduction, rifleDamageIncrease, rifleRecoilReduction, rifleReloadSpeedReduction;

    //magnum
    private int magnumCostReduction, magnumDamageIncrease, magnumRecoilReduction, magnumReloadSpeedReduction;

    //todo find out these
    private int bodyArmorCost, bountyHunter, strengthTraining;
    @OutDated
    private int killsNew, killsNew_10_2014, killsNew_11_2014, killsNew_1_11_2014, killsNew_2_11_2014, killsNew_3_11_2014, killsNew_4_10_2014, killsNew_5_10_2014, kills_10_2014, kills_11_2014, kills_1_11_2014, kills_2_11_2014, kills_3_11_2014, kills_4_10_2014, kills_5_10_2014;
    //mcgo.getAsJsonOpject (points:0) ???


    //</editor-fold>

    public PlayerCopsAndCrimsStats(JsonObject json) {
        super(json);
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

    private boolean setValue(String key, JsonElement value) {
        switch (key) {
            //<editor-fold desc="[All]">
            case "BOMBS_DEFUSED":
                this.bombsDefused = value.getAsInt();
                break;
            case "BOMBS_PLANTED":
                this.bombsPlanted = value.getAsInt();
                break;
            case "COINS":
                this.coins = value.getAsInt();
                break;
            case "COP_KILLS":
                this.copKills = value.getAsInt();
                break;
            case "CRIMINAL_KILLS":
                this.crimKills = value.getAsInt();
                break;
            case "DEATHS":
                this.deaths = value.getAsInt();
                break;
            case "GAME_WINS":
                this.wins = value.getAsInt();
                break;
            case "HEADSHOT_KILLS":
                this.headshotKills = value.getAsInt();
                break;
            case "KILLS":
                this.kills = value.getAsInt();
                break;
            case "SHOTS_FIRED":
                this.shotsFired = value.getAsInt();
                break;
            case "ROUND_WINS":
                this.roundWins = value.getAsInt();
                break;
            case "DEATHS_DEATHMATCH":
                this.deathmatchDeaths = value.getAsInt();
                break;
            case "KILLS_DEATHMATCH":
                this.deathmatchKills = value.getAsInt();
                break;
            case "CRIMINAL_KILLS_DEATHMATCH":
                this.crimKillsDeathmatch = value.getAsInt();
                break;
            case "COP_KILLS_DEATHMATCH":
                this.copKillsDeathmatch = value.getAsInt();

            case "WEEKLY_KILLS_B":
                this.weekly_kills_b = value.getAsInt();
                break;
            case "WEEKLY_KILLS_A":
                this.weekly_kills_a = value.getAsInt();
                break;
            case "MONTHLY_KILLS_A":
                this.monthly_kills_a = value.getAsInt();
                break;
            case "MONTHLY_KILLS_B":
                this.monthly_kills_b = value.getAsInt();
                break;

            case "GAME_WINS_CARRIER":
                this.gameWinsCarrier = value.getAsInt();
                break;
            case "GAME_WINS_OVERGROWN":
                this.gameWinsOvergrown = value.getAsInt();
                break;
            case "GAME_WINS_ALLEYWAY":
                this.gameWinsAlleyway = value.getAsInt();
                break;
            case "GAME_WINS_DEATHMATCH":
                this.deathmatchWins = value.getAsInt();
                break;
            case "GAME_WINS_TEMPLE":
                this.gameWinsTemple = value.getAsInt();
                break;
            case "GAME_WINS_SANDSTORM":
                this.gameWinsSandstorm = value.getAsInt();
                break;
            case "GAME_WINS_ATOMIC":
                this.gameWinsAtomic = value.getAsInt();
                break;
            //</editor-fold>

            //<editor-fold desc="[Guns]">

            //carbine
            case "CARBINE_DAMAGE_INCREASE":
                this.carbineDamageIncrease = value.getAsInt();
                break;
            case "CARBINE_RECOIL_REDUCTION":
                this.carbineRecoilReduction = value.getAsInt();
                break;
            case "CARBINE_RELOAD_SPEED_REDUCTION":
                this.carbineReloadSpeedReduction = value.getAsInt();
                break;
            case "CARBINE_COST_REDUCTION":
                this.carbineCostReduction = value.getAsInt();
                break;
            case "SELECTEDCARBINEDEV":
                if(GunSkin.mapping.contains(value.getAsString().toUpperCase())){
                    GunSkin gunSkin = GunSkin.valueOf(value.getAsString().toUpperCase());
                    if(gunSkin.getGunType() != Gun.GUNTYPE.CARBINE){
                        Logger.logError("[PlayerAPI.CopsandCrims.CarbineSkin] Unsupported Carbine Skin: " + value.getAsString().toUpperCase());
                    }else{
                        this.selectedCarbineSkin = gunSkin;
                    }
                }else{
                    Logger.logWarn("[PlayerAPI.CopsandCrims.CarbineSkin] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;

            //rifle
            case "RIFLE_COST_REDUCTION":
                this.rifleCostReduction = value.getAsInt();
                break;
            case "RIFLE_DAMAGE_INCREASE":
                this.rifleDamageIncrease = value.getAsInt();
                break;
            case "RIFLE_RECOIL_REDUCTION":
                this.rifleRecoilReduction = value.getAsInt();
                break;
            case "RIFLE_RELOAD_SPEED_REDUCTION":
                this.rifleReloadSpeedReduction = value.getAsInt();
                break;

            //smg
            case "SMG_COST_REDUCTION":
                this.smgCostReduction = value.getAsInt();
                break;
            case "SMG_DAMAGE_INCREASE":
                this.smgDamageIncrease = value.getAsInt();
                break;
            case "SMG_RECOIL_REDUCTION":
                this.smgRecoilReduction = value.getAsInt();
                break;
            case "SMG_RELOAD_SPEED_REDUCTION":
                this.smgReloadSpeedReduction = value.getAsInt();
                break;

            //pistol
            case "PISTOL_DAMAGE_INCREASE":
                this.pistolDamageIncrease = value.getAsInt();
                break;
            case "PISTOL_RECOIL_REDUCTION":
                this.pistolRecoilReduction = value.getAsInt();
                break;
            case "PISTOL_RELOAD_SPEED_REDUCTION":
                this.pistolReloadSpeedReduction = value.getAsInt();
                break;

            //magnum
            case "MAGNUM_COST_REDUCTION":
                this.magnumCostReduction = value.getAsInt();
                break;
            case "MAGNUM_DAMAGE_INCREASE":
                this.magnumDamageIncrease = value.getAsInt();
                break;
            case "MAGNUM_RECOIL_REDUCTION":
                this.magnumRecoilReduction = value.getAsInt();
                break;
            case "MAGNUM_RELOAD_SPEED_REDUCTION":
                this.magnumReloadSpeedReduction = value.getAsInt();
                break;
            case "SELECTEDMAGNUMDEV":
                if(GunSkin.mapping.contains(value.getAsString().toUpperCase())){
                    GunSkin gunSkin = GunSkin.valueOf(value.getAsString().toUpperCase());
                    if(gunSkin.getGunType() != Gun.GUNTYPE.MAGNUM){
                        Logger.logError("[PlayerAPI.CopsandCrims.MagnumSkin] Unsupported Magnum Skin: " + value.getAsString().toUpperCase());
                    }else{
                        this.selectedMagnumSkin = gunSkin;
                    }
                }else{
                    Logger.logWarn("[PlayerAPI.CopsandCrims.MagnumSkin] Unknown Value: " + value.getAsString().toUpperCase());
                }
                break;

            //</editor-fold>

            //<editor-fold desc="[Armor & Knife]">
            case "BODY_ARMOR_COST":
                this.bodyArmorCost = value.getAsInt();
                break;
            case "KNIFE_ATTACK_DELAY":
                this.knifeAttackDelay = value.getAsInt();
                break;
            case "KNIFE_DAMAGE_INCREASE":
                this.knifeDamageIncrease = value.getAsInt();
                break;
            case "SELECTEDKNIFEDEV":
                if(KnifeSkin.mapping.contains(value.getAsString().toUpperCase())){
                    this.selectedKnifeSkin = KnifeSkin.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.CopsandCrims.KnifeSkin] Unknown value: " + value.getAsString().toUpperCase());
                }
                break;

            case "SELECTEDOCELOTHELMETDEV":
                if(ArmorSkin.mapping.contains(value.getAsString().toUpperCase())){
                    this.copsHelmetSkin = ArmorSkin.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.CopsandCrims.OcelotHelmet] Unknown value: " + value.getAsString().toUpperCase());
                }
                break;
            case "SELECTEDOCELOTCHESTPLATEDEV":
                if(ArmorSkin.mapping.contains(value.getAsString().toUpperCase())){
                    this.copsBodyArmorSkin = ArmorSkin.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.CopsandCrims.OcelotArmor] Unknown value: " + value.getAsString().toUpperCase());
                }
                break;
            case "SELECTEDCREEPERHELMETDEV":
                if(ArmorSkin.mapping.contains(value.getAsString().toUpperCase())){
                    this.crimsHelmetSkin = ArmorSkin.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.CopsandCrims.CreeperHelmet] Unknown value: " + value.getAsString().toUpperCase());
                }
                break;
            case "SELECTEDCREEPERCHESTPLATEDEV":
                if(ArmorSkin.mapping.contains(value.getAsString().toUpperCase())){
                    this.crimsBodyArmorSkin = ArmorSkin.valueOf(value.getAsString().toUpperCase());
                }else{
                    Logger.logWarn("[PlayerAPI.CopsandCrims.CreeperArmor] Unknown value: " + value.getAsString().toUpperCase());
                }
                break;

            //</editor-fold>

            //<editor-fold desc="[todo find out]">
            case "BOUNTY_HUNTER":
                this.bountyHunter = value.getAsInt();
                break;
            case "POCKET_CHANGE":
                this.pocketChange = value.getAsInt();
                break;
            case "STRENGTH_TRAINING":
                this.strengthTraining = value.getAsInt();
                break;

            case "KILLSNEW":
                this.killsNew = value.getAsInt();
                break;
            case "KILLSNEW_10_2014":
                this.killsNew_10_2014 = value.getAsInt();
                break;
            case "KILLSNEW_11_2014":
                this.killsNew_11_2014 = value.getAsInt();
                break;
            case "KILLSNEW_1_11_2014":
                this.killsNew_1_11_2014 = value.getAsInt();
                break;
            case "KILLSNEW_2_11_2014":
                this.killsNew_2_11_2014 = value.getAsInt();
                break;
            case "KILLSNEW_3_11_2014":
                this.killsNew_3_11_2014 = value.getAsInt();
                break;
            case "KILLSNEW_4_11_2014":
                this.killsNew_4_10_2014 = value.getAsInt();
                break;
            case "KILLSNEW_5_11_2014":
                this.killsNew_5_10_2014 = value.getAsInt();
                break;
            case "KILLS_10_2014":
                this.kills_10_2014 = value.getAsInt();
                break;
            case "KILLS_11_2014":
                this.kills_11_2014 = value.getAsInt();
                break;
            case "KILLS_1_11_2014":
                this.kills_1_11_2014 = value.getAsInt();
                break;
            case "KILLS_2_11_2014":
                this.kills_2_11_2014 = value.getAsInt();
                break;
            case "KILLS_3_11_2014":
                this.kills_3_11_2014 = value.getAsInt();
                break;
            case "KILLS_4_10_2014":
                this.kills_4_10_2014 = value.getAsInt();
                break;
            case "KILLS_5_10_2014":
                this.kills_5_10_2014 = value.getAsInt();
                break;
            //</editor-fold>

            default:
                return false;
        }
        return true;
    }

    private boolean setSpecialValue(String key, JsonElement value){
        switch(key){
            case"PACKAGES":
                setPackageValues(value.getAsJsonArray());
                break;
            default:
                return false;
        }
        return true;
    }

    private void setPackageValues(JsonArray array){
        for(JsonElement element: array){
            String name = element.getAsString().toUpperCase();
            if(ArmorSkin.mapping.contains(name)){
                this.unlockedArmorSkins.add(ArmorSkin.valueOf(name));
            }else if(KnifeSkin.mapping.contains(name)){
                this.unlockedKnifeSkins.add(KnifeSkin.valueOf(name));
            }else if(RadioCommand.mapping.contains(name)){
                this.unlockedRadioCommands.add(RadioCommand.valueOf(name));
            }else if(Spray.mapping.contains(name)){
                this.unlockedSprays.add(Spray.valueOf(name));
            }else if(GunSkin.mapping.contains(name)){
                this.unlockedGunSkins.add(GunSkin.valueOf(name));
            }else{
                Logger.logWarn("[PlayerAPI.CopsandCrims.Packages] Unknown Value: " + name);
            }
        }
    }

    public ArrayList<RadioCommand> getUnlockedRadioCommands() {
        return unlockedRadioCommands;
    }

    public ArrayList<ArmorSkin> getUnlockedArmorSkins() {
        return unlockedArmorSkins;
    }

    public ArrayList<KnifeSkin> getUnlockedKnifeSkins() {
        return unlockedKnifeSkins;
    }

    public ArrayList<GunSkin> getUnlockedGunSkins() {
        return unlockedGunSkins;
    }

    public ArrayList<Spray> getUnlockedSprays() {
        return unlockedSprays;
    }

    public int getBombsDefused() {
        return bombsDefused;
    }

    public int getBombsPlanted() {
        return bombsPlanted;
    }

    public int getCoins() {
        return coins;
    }

    public int getCopKills() {
        return copKills;
    }

    public int getCrimKills() {
        return crimKills;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getWins() {
        return wins;
    }

    public int getHeadshotKills() {
        return headshotKills;
    }

    public int getKills() {
        return kills;
    }

    public int getPocketChange() {
        return pocketChange;
    }

    public int getRoundWins() {
        return roundWins;
    }

    public int getShotsFired() {
        return shotsFired;
    }

    public int getDeathmatchDeaths() {
        return deathmatchDeaths;
    }

    public int getDeathmatchKills() {
        return deathmatchKills;
    }
    @OutDated
    public int getWeekly_kills_b() {
        return weekly_kills_b;
    }
    @OutDated
    public int getWeekly_kills_a() {
        return weekly_kills_a;
    }
    @OutDated
    public int getMonthly_kills_b() {
        return monthly_kills_b;
    }
    @OutDated
    public int getMonthly_kills_a() {
        return monthly_kills_a;
    }

    public int getGameWinsCarrier() {
        return gameWinsCarrier;
    }

    public int getGameWinsOvergrown() {
        return gameWinsOvergrown;
    }

    public int getGameWinsAlleyway() {
        return gameWinsAlleyway;
    }

    public int getDeathmatchWins() {
        return deathmatchWins;
    }

    public int getGameWinsTemple() {
        return gameWinsTemple;
    }

    public int getGameWinsSandstorm() {
        return gameWinsSandstorm;
    }

    public int getGameWinsAtomic() {
        return gameWinsAtomic;
    }

    public int getCrimKillsDeathmatch() {
        return crimKillsDeathmatch;
    }

    public int getCopKillsDeathmatch() {
        return copKillsDeathmatch;
    }

    public GunSkin getSelectedCarbineSkin() {
        return selectedCarbineSkin;
    }

    public GunSkin getSelectedMagnumSkin() {
        return selectedMagnumSkin;
    }

    public KnifeSkin getSelectedKnifeSkin() {
        return selectedKnifeSkin;
    }

    public ArmorSkin getCopsHelmetSkin() {
        return copsHelmetSkin;
    }

    public ArmorSkin getCrimsHelmetSkin() {
        return crimsHelmetSkin;
    }

    public ArmorSkin getCopsBodyArmorSkin() {
        return copsBodyArmorSkin;
    }

    public ArmorSkin getCrimsBodyArmorSkin() {
        return crimsBodyArmorSkin;
    }

    public int getKnifeAttackDelay() {
        return knifeAttackDelay;
    }

    public int getKnifeDamageIncrease() {
        return knifeDamageIncrease;
    }

    public int getCarbineDamageIncrease() {
        return carbineDamageIncrease;
    }

    public int getCarbineCostReduction() {
        return carbineCostReduction;
    }

    public int getCarbineRecoilReduction() {
        return carbineRecoilReduction;
    }

    public int getCarbineReloadSpeedReduction() {
        return carbineReloadSpeedReduction;
    }

    public int getPistolDamageIncrease() {
        return pistolDamageIncrease;
    }

    public int getPistolRecoilReduction() {
        return pistolRecoilReduction;
    }

    public int getPistolReloadSpeedReduction() {
        return pistolReloadSpeedReduction;
    }

    public int getSmgCostReduction() {
        return smgCostReduction;
    }

    public int getSmgDamageIncrease() {
        return smgDamageIncrease;
    }

    public int getSmgRecoilReduction() {
        return smgRecoilReduction;
    }

    public int getSmgReloadSpeedReduction() {
        return smgReloadSpeedReduction;
    }

    public int getRifleCostReduction() {
        return rifleCostReduction;
    }

    public int getRifleDamageIncrease() {
        return rifleDamageIncrease;
    }

    public int getRifleRecoilReduction() {
        return rifleRecoilReduction;
    }

    public int getRifleReloadSpeedReduction() {
        return rifleReloadSpeedReduction;
    }

    public int getMagnumCostReduction() {
        return magnumCostReduction;
    }

    public int getMagnumDamageIncrease() {
        return magnumDamageIncrease;
    }

    public int getMagnumRecoilReduction() {
        return magnumRecoilReduction;
    }

    public int getMagnumReloadSpeedReduction() {
        return magnumReloadSpeedReduction;
    }

    public int getBodyArmorCost() {
        return bodyArmorCost;
    }

    public int getBountyHunter() {
        return bountyHunter;
    }

    public int getStrengthTraining() {
        return strengthTraining;
    }

    public int getKillsNew() {
        return killsNew;
    }
    @OutDated
    public int getKillsNew_10_2014() {
        return killsNew_10_2014;
    }
    @OutDated
    public int getKillsNew_11_2014() {
        return killsNew_11_2014;
    }
    @OutDated
    public int getKillsNew_1_11_2014() {
        return killsNew_1_11_2014;
    }
    @OutDated
    public int getKillsNew_2_11_2014() {
        return killsNew_2_11_2014;
    }
    @OutDated
    public int getKillsNew_3_11_2014() {
        return killsNew_3_11_2014;
    }
    @OutDated
    public int getKillsNew_4_10_2014() {
        return killsNew_4_10_2014;
    }
    @OutDated
    public int getKillsNew_5_10_2014() {
        return killsNew_5_10_2014;
    }
    @OutDated
    public int getKills_10_2014() {
        return kills_10_2014;
    }
    @OutDated
    public int getKills_11_2014() {
        return kills_11_2014;
    }
    @OutDated
    public int getKills_1_11_2014() {
        return kills_1_11_2014;
    }
    @OutDated
    public int getKills_2_11_2014() {
        return kills_2_11_2014;
    }
    @OutDated
    public int getKills_3_11_2014() {
        return kills_3_11_2014;
    }
    @OutDated
    public int getKills_4_10_2014() {
        return kills_4_10_2014;
    }
    @OutDated
    public int getKills_5_10_2014() {
        return kills_5_10_2014;
    }
}
