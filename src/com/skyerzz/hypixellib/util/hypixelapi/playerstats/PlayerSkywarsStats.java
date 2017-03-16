package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.games.skywars.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sky on 25-12-2016.
 */
public class PlayerSkywarsStats extends PlayerGameStats {

    //<editor-fold desc="[Global Variables]">
    private ArrayList<String> favoritedMaps = new ArrayList<>();
    private ArrayList<VictoryDance> unlockedVictoryDances = new ArrayList<>();
    private ArrayList<DeathCry> unlockedDeathCries = new ArrayList<>();
    private ArrayList<Cage> unlockedCages = new ArrayList<>();
    private ArrayList<ProjectileTrail> unlockedProjectileTrails = new ArrayList<>();
    private ArrayList<KillEffect> unlockedKillEffects = new ArrayList<>();
    private HashMap<Upgrade, Integer> unlockedUpgrades = new HashMap<>();

    private ArrayList<SoloKit> unlockedSoloKits = new ArrayList<>();
    private ArrayList<TeamKit> unlockedTeamKits = new ArrayList<>();
    private HashMap<RankedKit, Integer> unlockedRankedKits = new HashMap<>();
    private HashMap<MegaKit, Integer> unlockedMegaKits = new HashMap<>();

    private HashMap<SoloPerk, Integer> unlockedSoloPerks = new HashMap<>();
    private HashMap<TeamPerk, Integer> unlockedTeamPerks = new HashMap<>();
    private HashMap<RankedPerk, Integer> unlockedRankedPerks = new HashMap<>();
    private HashMap<MegaPerk, Integer> unlockedMegaPerks = new HashMap<>();

    private HashMap<SoloKit, Integer> survivedPlayersBySoloKit = new HashMap<>();
    private HashMap<TeamKit, Integer> survivedPlayersByTeamKit = new HashMap<>();
    private HashMap<RankedKit, Integer> survivedPlayersByRankedKit = new HashMap<>();
    private HashMap<MegaKit, Integer> survivedPlayersByMegaKit = new HashMap<>();
    private HashMap<SoloKit, Integer> lossesBySoloKit = new HashMap<>();
    private HashMap<TeamKit, Integer> lossesByTeamKit = new HashMap<>();
    private HashMap<RankedKit, Integer> lossesByRankedKit = new HashMap<>();
    private HashMap<MegaKit, Integer> lossesByMegaKit = new HashMap<>();
    private HashMap<SoloKit, Integer> winsBySoloKit = new HashMap<>();
    private HashMap<TeamKit, Integer> winsByTeamKit = new HashMap<>();
    private HashMap<RankedKit, Integer> winsByRankedKit = new HashMap<>();
    private HashMap<MegaKit, Integer> winsByMegaKit = new HashMap<>();
    private HashMap<SoloKit, Integer> gamesBySoloKit = new HashMap<>();
    private HashMap<TeamKit, Integer> gamesByTeamKit = new HashMap<>();
    private HashMap<RankedKit, Integer> gamesByRankedKit = new HashMap<>();
    private HashMap<MegaKit, Integer> gamesByMegaKit = new HashMap<>();
    private HashMap<SoloKit, Integer> assistsBySoloKit = new HashMap<>();
    private HashMap<TeamKit, Integer> assistsByTeamKit = new HashMap<>();
    private HashMap<RankedKit, Integer> assistsByRankedKit = new HashMap<>();
    private HashMap<MegaKit, Integer> assistsByMegaKit = new HashMap<>();
    private HashMap<SoloKit, Integer> killsBySoloKit = new HashMap<>();
    private HashMap<TeamKit, Integer> killsByTeamKit = new HashMap<>();
    private HashMap<RankedKit, Integer> killsByRankedKit = new HashMap<>();
    private HashMap<MegaKit, Integer> killsByMegaKit = new HashMap<>();
    private HashMap<SoloKit, Integer> deathsBySoloKit = new HashMap<>();
    private HashMap<TeamKit, Integer> deathsByTeamKit = new HashMap<>();
    private HashMap<RankedKit, Integer> deathsByRankedKit = new HashMap<>();
    private HashMap<MegaKit, Integer> deathsByMegaKit = new HashMap<>();
    private HashMap<SoloKit, Integer> arrowsHitBySoloKit = new HashMap<>();
    private HashMap<TeamKit, Integer> arrowsHitByTeamKit = new HashMap<>();
    private HashMap<RankedKit, Integer> arrowsHitByRankedKit = new HashMap<>();
    private HashMap<MegaKit, Integer> arrowsHitByMegaKit = new HashMap<>();
    private HashMap<SoloKit, Integer> chestsOpenedBySoloKit = new HashMap<>();
    private HashMap<TeamKit, Integer> chestsOpenedByTeamKit = new HashMap<>();
    private HashMap<RankedKit, Integer> chestsOpenedByRankedKit = new HashMap<>();
    private HashMap<MegaKit, Integer> chestsOpenedByMegaKit = new HashMap<>();
    private HashMap<SoloKit, Integer> timePlayedBySoloKit = new HashMap<>();
    private HashMap<TeamKit, Integer> timePlayedByTeamKit = new HashMap<>();
    private HashMap<RankedKit, Integer> timePlayedByRankedKit = new HashMap<>();
    private HashMap<MegaKit, Integer> timePlayedByMegaKit = new HashMap<>();
    private HashMap<SoloKit, Integer> fastestWinBySoloKit = new HashMap<>();
    private HashMap<TeamKit, Integer> fastestWinByTeamKit = new HashMap<>();
    private HashMap<RankedKit, Integer> fastestWinByRankedKit = new HashMap<>();
    private HashMap<MegaKit, Integer> fastestWinByMegaKit = new HashMap<>();
    private HashMap<SoloKit, Integer> arrowsShotBySoloKit = new HashMap<>();
    private HashMap<TeamKit, Integer> arrowsShotByTeamKit = new HashMap<>();
    private HashMap<RankedKit, Integer> arrowsShotByRankedKit = new HashMap<>();
    private HashMap<MegaKit, Integer> arrowsShotByMegaKit = new HashMap<>();
    private HashMap<SoloKit, Integer> longestBowShotBySoloKit = new HashMap<>();
    private HashMap<TeamKit, Integer> longestBowShotByTeamKit = new HashMap<>();
    private HashMap<RankedKit, Integer> longestBowShotByRankedKit = new HashMap<>();
    private HashMap<MegaKit, Integer> longestBowShotByMegaKit = new HashMap<>();

    private HashMap<String, Integer> mapVotes = new HashMap<>();
    private HashMap<String, Integer> quickJoinUses = new HashMap<>();

    private SoloKit selectedSoloKit;
    private TeamKit selectedTeamKit;
    private RankedKit selectedRankedKit;
    private MegaKit selectedMegaKit;
    private VictoryDance selectedVictoryDance;
    private KillEffect selectedKillEffect;
    private ProjectileTrail selectedProjectileTrail;
    private DeathCry selectedDeathCry;

    private Cage selectedCage;

    private int coins, soulWell, winStreak, survivedPlayers, losses, wins, games, deaths, blocksPlaced, assists, souls, kills, blocksBroken, eggsThrown;
    private int enderPearlsThrown, paidSouls, soulWellRares, soulWellLegendaries, arrowsHit, arrowsShot, itemsEnchanted, quits, soulsGathered, mobKills;
    private int refillChestDestroy, extraWheels, highestWinStreak, killStreak, highestKillStreak, longestBowShot, voidKills, chestsOpened, timePlayed, mostKills, meleeKills, fastestWin;
    
    private int lossesTeam, lossesSolo, lossesRanked, lossesMega;
    private int lossesTeamNormal, lossesSoloNormal, lossesRankedNormal, lossesMegaNormal;
    private int lossesTeamInsane, lossesSoloInsane, lossesRankedInsane, lossesMegaInsane;
    
    private int deathsTeam, deathsSolo, deathsRanked, deathsMega;
    private int deathsTeamNormal, deathsSoloNormal, deathsRankedNormal, deathsMegaNormal;
    private int deathsTeamInsane, deathsSoloInsane, deathsRankedInsane, deathsMegaInsane;
    
    private int killsTeam, killsSolo, killsRanked, killsMega;
    private int killsTeamNormal, killsSoloNormal, killsRankedNormal, killsMegaNormal;
    private int killsTeamInsane, killsSoloInsane, killsRankedInsane, killsMegaInsane;
    
    private int winsTeam, winsSolo, winsRanked, winsMega;
    private int winsTeamNormal, winsSoloNormal, winsRankedNormal, winsMegaNormal;
    private int winsTeamInsane, winsSoloInsane, winsRankedInsane, winsMegaInsane;
    
    private int survivedPlayersTeam, survivedPlayersSolo, survivedPlayersRanked, survivedPlayersMega;
    private int survivedPlayersTeamNormal, survivedPlayersSoloNormal, survivedPlayersRankedNormal, survivedPlayersMegaNormal;
    private int survivedPlayersTeamInsane, survivedPlayersSoloInsane, survivedPlayersRankedInsane, survivedPlayersMegaInsane;

    private int assistsTeam, assistsSolo, assistsRanked, assistsMega;
    private int chestsOpenedTeam, chestsOpenedSolo, chestsOpenedRanked, chestsOpenedMega;
    private int timePlayedTeam, timePlayedSolo, timePlayedRanked, timePlayedMega;
    private int meleeKillsTeam, meleeKillsSolo, meleeKillsRanked, meleeKillsMega;
    private int mostKillsTeam, mostKillsSolo, mostKillsRanked, mostKillsMega;
    private int arrowsHitTeam, arrowsHitSolo, arrowsHitRanked, arrowsHitMega;
    private int arrowsShotTeam, arrowsShotSolo, arrowsShotRanked, arrowsShotMega;
    private int voidKillsTeam, voidKillsSolo, voidKillsRanked, voidKillsMega;
    private int fastestWinTeam, fastestWinSolo, fastestWinRanked, fastestWinMega;
    private int killstreakTeam, killstreakSolo, killstreakRanked, killstreakMega;
    private int winstreakTeam, winstreakSolo, winstreakRanked, winstreakMega;
    private int longestBowShotTeam, longestBowShotSolo, longestBowShotRanked, longestBowShotMega;
    private int mobKillsTeam, mobKillsSolo, mobKillsRanked, mobKillsMega;
    
    private int gamesTeam, gamesSolo, gamesRanked, gamesMega;
    private boolean usedSoulWell, combatTracker;

    @OutDated
    private int kills_weekly_b, kills_weekly_a, kills_monthly_b, kills_monthly_a, mysteryBoxesSeasonOne, battleAltar /*supposedly old value for soul well*/;
    @OutDated
    private int gamesSoloNormal, gamesSoloInsane, gamesTeamNormal, gamesTeamInsane, lossesOne_V_One, killsOne_V_One, winsOne_V_One, deathsOne_V_One;
    @OutDated
    private boolean legacyAchievement, legacyAchievement2, legacyAchievement3, legacyAchievement4, fix_achievements, fix_achievements2, instantRolls;
    @OutDated
    private boolean X250_rating_rewardskywars_skywars_rating_2, X250_rating_rewardskywars_skywars_rating_5_16, thropyMasters1;
    @OutDated
    private ArrayList<Integer> divisionSkywars_Skywars_Rating = new ArrayList<>();
    @OutDated
    private ArrayList<String> unlockedTaunts = new ArrayList<>(), unlockedPrefixes = new ArrayList<>(), tournamentReward = new ArrayList<>();
    @OutDated
    private String activeTaunt, activeCompanion, activePrefix;
    //</editor-fold>

    public PlayerSkywarsStats(JsonObject json) {
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

            Logger.logWarn("[PlayerAPI.Skywars.initialize] Unknown value: " + key);
        }
    }

    public boolean setValue(String key, JsonElement value){
        switch(key){
            //<editor-fold desc="[Default Values]">
            case "COINS":
                this.coins = value.getAsInt();
                return true;
            case "SOUL_WELL":
                this.soulWell = value.getAsInt();
                return true;
            case "USEDSOULWELL":
                this.usedSoulWell = value.getAsBoolean();
                return true;
            case "WIN_STREAK":
                this.winStreak = value.getAsInt();
                return true;
            case "SURVIVED_PLAYERS":
                this.survivedPlayers = value.getAsInt();
                return true;
            case "LOSSES":
                this.losses = value.getAsInt();
                return true;
            case "GAMES":
                this.games = value.getAsInt();
                return true;
            case "DEATHS":
                this.deaths = value.getAsInt();
                return true;
            case "ASSISTS":
                this.assists = value.getAsInt();
                return true;
            case "WINS":
                this.wins = value.getAsInt();
                return true;
            case "BLOCKS_PLACED":
                this.blocksPlaced = value.getAsInt();
                return true;
            case "SOULS":
                this.souls = value.getAsInt();
                return true;
            case "BLOCKS_BROKEN":
                this.blocksBroken = value.getAsInt();
                return true;
            case "KILLS":
                this.kills = value.getAsInt();
                return true;
            case "EGG_THROWN":
                this.eggsThrown = value.getAsInt();
                return true;
            case "ENDERPEARLS_THROWN":
                this.enderPearlsThrown = value.getAsInt();
                return true;
            case "PAID_SOULS":
                this.paidSouls = value.getAsInt();
                return true;
            case "SOUL_WELL_RARES":
                this.soulWellRares = value.getAsInt();
                return true;
            case "ARROWS_HIT":
                this.arrowsHit = value.getAsInt();
                return true;
            case "ARROWS_SHOT":
                this.arrowsShot = value.getAsInt();
                return true;
            case "SOUL_WELL_LEGENDARIES":
                this.soulWellLegendaries = value.getAsInt();
                return true;
            case "ITEMS_ENCHANTED":
                this.itemsEnchanted = value.getAsInt();
                return true;
            case "QUITS":
                this.quits = value.getAsInt();
                return true;
            case "SOULS_GATHERED":
                this.soulsGathered = value.getAsInt();
                return true;
            case "REFILL_CHEST_DESTROY":
                this.refillChestDestroy = value.getAsInt();
                return true;
            case "EXTRA_WHEELS":
                this.extraWheels = value.getAsInt();
                return true;
            case "HIGHESTWINSTREAK":
                this.highestWinStreak = value.getAsInt();
                return true;
            case "HIGHESTKILLSTREAK":
                this.highestKillStreak = value.getAsInt();
                return true;
            case "WINSTREAK":
                this.winStreak = value.getAsInt();
                return true;
            case "Killstreak":
                this.killStreak = value.getAsInt();
                return true;
            case "COMBATTRACKER":
                this.combatTracker = value.getAsBoolean();
                return true;
            case "LONGEST_BOW_SHOT":
                this.longestBowShot = value.getAsInt();
                return true;
            case "VOID_KILLS":
                this.voidKills = value.getAsInt();
                return true;
            case "CHESTS_OPENED":
                this.chestsOpened = value.getAsInt();
                return true;
            case "TIME_PLAYED":
                this.timePlayed = value.getAsInt();
                return true;
            case "MOST_KILLS_GAME":
                this.mostKills = value.getAsInt();
                return true;
            case "MELEE_KILLS":
                this.meleeKills = value.getAsInt();
                return true;
            case "FASTEST_WIN":
                this.fastestWin = value.getAsInt();
                return true;
            case "MOB_KILLS":
                this.mobKills = value.getAsInt();
                return true;
            case "MYSTERY_BOXES_SEASON_ONE":
                this.mysteryBoxesSeasonOne = value.getAsInt();
                return true;
            case "BATTLE_ALTAR":
                this.battleAltar = value.getAsInt();
                return true;
            //</editor-fold>

            //<editor-fold desc="[4* Gamemode Stats]">
            case "GAMES_TEAM":
                this.gamesTeam = value.getAsInt();
                return true;
            case "GAMES_SOLO":
                this.gamesSolo = value.getAsInt();
                return true;
            case "GAMES_MEGA":
                this.gamesMega = value.getAsInt();
                return true;
            case "GAMES_RANKED":
                this.gamesRanked = value.getAsInt();
                return true;
            case "ASSISTS_TEAM":
                this.assistsTeam = value.getAsInt();
                return true;
            case "ASSISTS_SOLO":
                this.assistsSolo = value.getAsInt();
                return true;
            case "ASSISTS_MEGA":
                this.assistsMega = value.getAsInt();
                return true;
            case "ASSISTS_RANKED":
                this.assistsRanked = value.getAsInt();
                return true;
            case "KILLSTREAK_TEAM":
                this.killstreakTeam = value.getAsInt();
                return true;
            case "KILLSTREAK_SOLO":
                this.killstreakSolo = value.getAsInt();
                return true;
            case "KILLSTREAK_MEGA":
                this.killstreakMega = value.getAsInt();
                return true;
            case "KILLSTREAK_RANKED":
                this.killstreakRanked = value.getAsInt();
                return true;
            case "WINSTREAK_TEAM":
                this.winstreakTeam = value.getAsInt();
                return true;
            case "WINSTREAK_SOLO":
                this.winstreakSolo = value.getAsInt();
                return true;
            case "WINSTREAK_MEGA":
                this.winstreakMega = value.getAsInt();
                return true;
            case "WINSTREAK_RANKED":
                this.winstreakRanked = value.getAsInt();
                return true;
            case "LONGEST_BOW_SHOT_TEAM":
                this.longestBowShotTeam = value.getAsInt();
                return true;
            case "LONGEST_BOW_SHOT_SOLO":
                this.longestBowShotSolo = value.getAsInt();
                return true;
            case "LONGEST_BOW_SHOT_MEGA":
                this.longestBowShotMega = value.getAsInt();
                return true;
            case "LONGEST_BOW_SHOT_RANKED":
                this.longestBowShotRanked = value.getAsInt();
                return true;
            case "FASTEST_WIN_TEAM":
                this.fastestWinTeam = value.getAsInt();
                return true;
            case "FASTEST_WIN_SOLO":
                this.fastestWinSolo = value.getAsInt();
                return true;
            case "FASTEST_WIN_MEGA":
                this.fastestWinMega = value.getAsInt();
                return true;
            case "FASTEST_WIN_RANKED":
                this.fastestWinRanked = value.getAsInt();
                return true;
            case "CHESTS_OPENED_TEAM":
                this.chestsOpenedTeam = value.getAsInt();
                return true;
            case "CHESTS_OPENED_SOLO":
                this.chestsOpenedSolo = value.getAsInt();
                return true;
            case "CHESTS_OPENED_MEGA":
                this.chestsOpenedMega = value.getAsInt();
                return true;
            case "CHESTS_OPENED_RANKED":
                this.chestsOpenedRanked = value.getAsInt();
                return true;
            case "TIME_PLAYED_TEAM":
                this.timePlayedTeam = value.getAsInt();
                return true;
            case "TIME_PLAYED_SOLO":
                this.timePlayedSolo = value.getAsInt();
                return true;
            case "TIME_PLAYED_MEGA":
                this.timePlayedMega = value.getAsInt();
                return true;
            case "TIME_PLAYED_RANKED":
                this.timePlayedRanked = value.getAsInt();
                return true;
            case "MELEE_KILLS_TEAM":
                this.meleeKillsTeam = value.getAsInt();
                return true;
            case "MELEE_KILLS_SOLO":
                this.meleeKillsSolo = value.getAsInt();
                return true;
            case "MELEE_KILLS_MEGA":
                this.meleeKillsMega = value.getAsInt();
                return true;
            case "MELEE_KILLS_RANKED":
                this.meleeKillsRanked = value.getAsInt();
                return true;
            case "MOST_KILLS_GAME_TEAM":
                this.mostKillsTeam = value.getAsInt();
                return true;
            case "MOST_KILLS_GAME_SOLO":
                this.mostKillsSolo = value.getAsInt();
                return true;
            case "MOST_KILLS_GAME_MEGA":
                this.mostKillsMega = value.getAsInt();
                return true;
            case "MOST_KILLS_GAME_RANKED":
                this.mostKillsRanked = value.getAsInt();
                return true;
            case "ARROWS_HIT_TEAM":
                this.arrowsHitTeam = value.getAsInt();
                return true;
            case "ARROWS_HIT_SOLO":
                this.arrowsHitSolo = value.getAsInt();
                return true;
            case "ARROWS_HIT_MEGA":
                this.arrowsHitMega = value.getAsInt();
                return true;
            case "ARROWS_HIT_RANKED":
                this.arrowsHitRanked = value.getAsInt();
                return true;
            case "ARROWS_SHOT_TEAM":
                this.arrowsShotTeam = value.getAsInt();
                return true;
            case "ARROWS_SHOT_SOLO":
                this.arrowsShotSolo = value.getAsInt();
                return true;
            case "ARROWS_SHOT_MEGA":
                this.arrowsShotMega = value.getAsInt();
                return true;
            case "ARROWS_SHOT_RANKED":
                this.arrowsShotRanked = value.getAsInt();
                return true;
            case "VOID_KILLS_TEAM":
                this.voidKillsTeam = value.getAsInt();
                return true;
            case "VOID_KILLS_SOLO":
                this.voidKillsSolo = value.getAsInt();
                return true;
            case "VOID_KILLS_MEGA":
                this.voidKillsMega = value.getAsInt();
                return true;
            case "VOID_KILLS_RANKED":
                this.voidKillsRanked = value.getAsInt();
                return true;
            case "MOB_KILLS_TEAM":
                this.mobKillsTeam = value.getAsInt();
                return true;
            case "MOB_KILLS_SOLO":
                this.mobKillsSolo = value.getAsInt();
                return true;
            case "MOB_KILLS_MEGA":
                this.mobKillsMega = value.getAsInt();
                return true;
            case "MOB_KILLS_RANKED":
                this.mobKillsRanked = value.getAsInt();
                return true;
            //</editor-fold>
            
            //<editor-fold desc="[Losses]">
            case "LOSSES_TEAM":
                this.lossesTeam = value.getAsInt();
                return true;
            case "LOSSES_SOLO":
                this.lossesSolo = value.getAsInt();
                return true;
            case "LOSSES_MEGA":
                this.lossesMega = value.getAsInt();
                return true;
            case "LOSSES_RANKED":
                this.lossesRanked = value.getAsInt();
                return true;

            case "LOSSES_TEAM_INSANE":
                this.lossesTeamInsane = value.getAsInt();
                return true;
            case "LOSSES_SOLO_INSANE":
                this.lossesSoloInsane = value.getAsInt();
                return true;
            case "LOSSES_MEGA_INSANE":
                this.lossesMegaInsane = value.getAsInt();
                return true;
            case "LOSSES_RANKED_INSANE":
                this.lossesRankedInsane = value.getAsInt();
                return true;

            case "LOSSES_TEAM_NORMAL":
                this.lossesTeamNormal = value.getAsInt();
                return true;
            case "LOSSES_SOLO_NORMAL":
                this.lossesSoloNormal = value.getAsInt();
                return true;
            case "LOSSES_MEGA_NORMAL":
                this.lossesMegaNormal = value.getAsInt();
                return true;
            case "LOSSES_RANKED_NORMAL":
                this.lossesRankedNormal = value.getAsInt();
                return true;
            //</editor-fold>
            //<editor-fold desc="[Deaths]">
            case "DEATHS_TEAM":
                this.deathsTeam = value.getAsInt();
                return true;
            case "DEATHS_SOLO":
                this.deathsSolo = value.getAsInt();
                return true;
            case "DEATHS_MEGA":
                this.deathsMega = value.getAsInt();
                return true;
            case "DEATHS_RANKED":
                this.deathsRanked = value.getAsInt();
                return true;

            case "DEATHS_TEAM_INSANE":
                this.deathsTeamInsane = value.getAsInt();
                return true;
            case "DEATHS_SOLO_INSANE":
                this.deathsSoloInsane = value.getAsInt();
                return true;
            case "DEATHS_MEGA_INSANE":
                this.deathsMegaInsane = value.getAsInt();
                return true;
            case "DEATHS_RANKED_INSANE":
                this.deathsRankedInsane = value.getAsInt();
                return true;

            case "DEATHS_TEAM_NORMAL":
                this.deathsTeamNormal = value.getAsInt();
                return true;
            case "DEATHS_SOLO_NORMAL":
                this.deathsSoloNormal = value.getAsInt();
                return true;
            case "DEATHS_MEGA_NORMAL":
                this.deathsMegaNormal = value.getAsInt();
                return true;
            case "DEATHS_RANKED_NORMAL":
                this.deathsRankedNormal = value.getAsInt();
                return true;
            //</editor-fold>
            //<editor-fold desc="[Kills]">
            case "KILLS_TEAM":
                this.killsTeam = value.getAsInt();
                return true;
            case "KILLS_SOLO":
                this.killsSolo = value.getAsInt();
                return true;
            case "KILLS_MEGA":
                this.killsMega = value.getAsInt();
                return true;
            case "KILLS_RANKED":
                this.killsRanked = value.getAsInt();
                return true;

            case "KILLS_TEAM_INSANE":
                this.killsTeamInsane = value.getAsInt();
                return true;
            case "KILLS_SOLO_INSANE":
                this.killsSoloInsane = value.getAsInt();
                return true;
            case "KILLS_MEGA_INSANE":
                this.killsMegaInsane = value.getAsInt();
                return true;
            case "KILLS_RANKED_INSANE":
                this.killsRankedInsane = value.getAsInt();
                return true;

            case "KILLS_TEAM_NORMAL":
                this.killsTeamNormal = value.getAsInt();
                return true;
            case "KILLS_SOLO_NORMAL":
                this.killsSoloNormal = value.getAsInt();
                return true;
            case "KILLS_MEGA_NORMAL":
                this.killsMegaNormal = value.getAsInt();
                return true;
            case "KILLS_RANKED_NORMAL":
                this.killsRankedNormal = value.getAsInt();
                return true;
            //</editor-fold>
            //<editor-fold desc="[Wins]">
            case "WINS_TEAM":
                this.winsTeam = value.getAsInt();
                return true;
            case "WINS_SOLO":
                this.winsSolo = value.getAsInt();
                return true;
            case "WINS_MEGA":
                this.winsMega = value.getAsInt();
                return true;
            case "WINS_RANKED":
                this.winsRanked = value.getAsInt();
                return true;

            case "WINS_TEAM_INSANE":
                this.winsTeamInsane = value.getAsInt();
                return true;
            case "WINS_SOLO_INSANE":
                this.winsSoloInsane = value.getAsInt();
                return true;
            case "WINS_MEGA_INSANE":
                this.winsMegaInsane = value.getAsInt();
                return true;
            case "WINS_RANKED_INSANE":
                this.winsRankedInsane = value.getAsInt();
                return true;

            case "WINS_TEAM_NORMAL":
                this.winsTeamNormal = value.getAsInt();
                return true;
            case "WINS_SOLO_NORMAL":
                this.winsSoloNormal = value.getAsInt();
                return true;
            case "WINS_MEGA_NORMAL":
                this.winsMegaNormal = value.getAsInt();
                return true;
            case "WINS_RANKED_NORMAL":
                this.winsRankedNormal = value.getAsInt();
                return true;
            //</editor-fold>
            //<editor-fold desc="[SurvivedPlayers]">
            case "SURVIVED_PLAYERS_TEAM":
                this.survivedPlayersTeam = value.getAsInt();
                return true;
            case "SURVIVED_PLAYERS_SOLO":
                this.survivedPlayersSolo = value.getAsInt();
                return true;
            case "SURVIVED_PLAYERS_MEGA":
                this.survivedPlayersMega = value.getAsInt();
                return true;
            case "SURVIVED_PLAYERS_RANKED":
                this.survivedPlayersRanked = value.getAsInt();
                return true;

            case "SURVIVED_PLAYERS_TEAM_INSANE":
                this.survivedPlayersTeamInsane = value.getAsInt();
                return true;
            case "SURVIVED_PLAYERS_SOLO_INSANE":
                this.survivedPlayersSoloInsane = value.getAsInt();
                return true;
            case "SURVIVED_PLAYERS_MEGA_INSANE":
                this.survivedPlayersMegaInsane = value.getAsInt();
                return true;
            case "SURVIVED_PLAYERS_RANKED_INSANE":
                this.survivedPlayersRankedInsane = value.getAsInt();
                return true;

            case "SURVIVED_PLAYERS_TEAM_NORMAL":
                this.survivedPlayersTeamNormal = value.getAsInt();
                return true;
            case "SURVIVED_PLAYERS_SOLO_NORMAL":
                this.survivedPlayersSoloNormal = value.getAsInt();
                return true;
            case "SURVIVED_PLAYERS_MEGA_NORMAL":
                this.survivedPlayersMegaNormal = value.getAsInt();
                return true;
            case "SURVIVED_PLAYERS_RANKED_NORMAL":
                this.survivedPlayersRankedNormal = value.getAsInt();
                return true;
            //</editor-fold>
            
            //<editor-fold desc="[OUTDATED]">
            case "KILLS_WEEKLY_B":
                this.kills_weekly_b = value.getAsInt();
                return true;
            case "KILLS_WEEKLY_A":
                this.kills_weekly_a = value.getAsInt();
                return true;
            case "KILLS_MONTHLY_B":
                this.kills_monthly_b = value.getAsInt();
                return true;
            case "KILLS_MONTHLY_A":
                this.kills_monthly_a = value.getAsInt();
                return true;
            case "GAMES_TEAM_INSANE":
                this.gamesTeamInsane = value.getAsInt();
                return true;
            case "GAMES_TEAM_NORMAL":
                this.gamesTeamNormal = value.getAsInt();
                return true;
            case "GAMES_SOLO_NORMAL":
                this.gamesSoloNormal = value.getAsInt();
                return true;
            case "GAMES_SOLO_INSANE":
                this.gamesSoloInsane = value.getAsInt();
                return true;
            case "LOSSES_ONE_V_ONE":
                this.lossesOne_V_One = value.getAsInt();
                return true;
            case "KILLS_ONE_V_ONE":
                this.killsOne_V_One = value.getAsInt();
                return true;
            case "WINS_ONE_V_ONE":
                winsOne_V_One = value.getAsInt();
                return true;
            case "DEATHS_ONE_V_ONE":
                this.deathsOne_V_One = value.getAsInt();
                return true;
            case "ACTIVECOMPANION":
                this.activeCompanion = value.getAsString();
                return true;
            case "ACTIVETAUNT":
                this.activeTaunt = value.getAsString();
                return true;
            case "ACTIVEPREFIX":
                this.activePrefix = value.getAsString();
                return true;
            //</editor-fold>
        }
        return false;
    }

    public boolean setSpecialValue(String key, JsonElement value){
        if(key.contains("INVENTORY")){
            Logger.logInfo("[PlayerAPI.Skywars.initialize] Inventories not yet supported! Skipping inventory value: " + key);
            return true;
        }
        switch(key){
            case "PACKAGES":
                initializePackages(value.getAsJsonArray());
                return true;
            case "ACTIVEKIT_SOLO":
                String kit = value.getAsString().toUpperCase().replaceAll("[\\w+_]*SOLO_", "").replace("-", "_");
                if(!SoloKit.mapping.contains(kit)){
                    Logger.logError("[PlayerAPI.Skywars.initialize] Unknown Active Solo Kit: " + kit);
                    return true;
                }
                selectedSoloKit = SoloKit.valueOf(kit);
                return true;
            case "ACTIVEKIT_TEAM":
                kit = value.getAsString().toUpperCase().replaceAll("[\\w+_]+TEAM_", "").replace("-", "_");
                if(!TeamKit.mapping.contains(kit)){
                    Logger.logError("[PlayerAPI.Skywars.initialize] Unknown Active Team Kit: " + kit);
                    return true;
                }
                selectedTeamKit = TeamKit.valueOf(kit);
                return true;
            case "ACTIVEKIT_RANKED":
                kit = value.getAsString().toUpperCase().replaceAll("[\\w+_]*RANKED_", "").replace("-", "_");
                if(!RankedKit.mapping.contains(kit)){
                    Logger.logError("[PlayerAPI.Skywars.initialize] Unknown Active Ranked Kit: " + kit);
                    return true;
                }
                selectedRankedKit = RankedKit.valueOf(kit);
                return true;
            case "ACTIVEKIT_MEGA":
                kit = value.getAsString().toUpperCase().replaceAll("[\\w+_]*MEGA_", "").replace("-", "_");
                if(!MegaKit.mapping.contains(kit)){
                    Logger.logError("[PlayerAPI.Skywars.initialize] Unknown Active Mega Kit: " + kit);
                    return true;
                }
                selectedMegaKit = MegaKit.valueOf(kit);
                return true;
            case "ACTIVECAGE":
                String cage = value.getAsString().toUpperCase().replaceAll("[\\w+_]*CAGE_", "").replace("-", "_");
                if(!Cage.mapping.contains(cage)){
                    Logger.logError("[PlayerAPI.Skywars.initialize] Unknown Active Cage: " + cage);
                    return true;
                }
                selectedCage = Cage.valueOf(cage);
                return true;
            case "ACTIVEVICTORYDANCE":
                String victoryDance = value.getAsString().toUpperCase().replaceAll("[\\w+_]*VICTORYDANCE_", "").replace("-", "_");
                if(!VictoryDance.mapping.contains(victoryDance)){
                    Logger.logError("[PlayerAPI.Skywars.initialize] Unknown Active Victory Dance: " + victoryDance);
                    return true;
                }
                selectedVictoryDance = VictoryDance.valueOf(victoryDance);
                return true;
            case "ACTIVEKILLEFFECT":
                String killEffect = value.getAsString().toUpperCase().replaceAll("[\\w+_]*KILLEFFECT_", "").replace("-", "_");
                killEffect = killEffect.replace("BLOOD_", ""); //different values in package/active.
                if(!KillEffect.mapping.contains(killEffect)){
                    Logger.logError("[PlayerAPI.Skywars.initialize] Unknown Active Kill Effect: " + killEffect);
                    return true;
                }
                selectedKillEffect = KillEffect.valueOf(killEffect);
                return true;
            case "ACTIVEARROWTRAIL": //this one is outdated
                return true;
            case "ACTIVEPROJECTILETRAIL":
                String arrowTrail = value.getAsString().toUpperCase().replaceAll("[\\w+_]*PROJECTILETRAIL_", "").replace("-", "_");
                if(!ProjectileTrail.mapping.contains(arrowTrail)){
                    Logger.logError("[PlayerAPI.Skywars.initialize] Unknown Projectile Trail: " + arrowTrail);
                    return true;
                }
                selectedProjectileTrail = ProjectileTrail.valueOf(arrowTrail);
                return true;
            case "ACTIVEDEATHCRY":
                String deathCry = value.getAsString().toUpperCase().replaceAll("[\\w+_]*DEATHCRY_", "").replace("-", "_");
                if(!DeathCry.mapping.contains(deathCry)){
                    Logger.logError("[PlayerAPI.Skywars.initialize] Unknown Death Cry : " + deathCry);
                    return true;
                }
                selectedDeathCry = DeathCry.valueOf(deathCry);
                return true;
            case "XEZBETH_LUCK":
                unlockedUpgrades.put(Upgrade.XEZBETH_LUCK, value.getAsInt());
                return true;
            case "HARVESTING_SEASON":
                unlockedUpgrades.put(Upgrade.HARVESTING_SEASON, value.getAsInt());
                return true;
                
        }

        if(key.contains("VOTES")){
            String map = key.replaceAll("[\\w+_]*VOTES_", "");
            mapVotes.put(map, value.getAsInt());
            return true;
        }
        if(key.contains("TOURNAMENTREWARD")){
            String tournament = key.replaceAll("[\\w+_]*TOURNAMENTREWARD_", "");
            tournamentReward.add(tournament);
            return true;
        }
        if(key.contains("QUICKJOIN")){
            String map = key.replaceAll("[\\w+_]*USES_", "");
            quickJoinUses.put(map, value.getAsInt());
            return true;
        }

        if(key.contains("MEGA") && key.contains("Kit")){
            String kit = key.replaceAll("[\\w+_]*MEGA_", "").replace("-", "_");
            if(MegaKit.mapping.contains(kit)){
                this.unlockedMegaKits.put(MegaKit.valueOf(kit), value.getAsInt());
                return true;
            }
            Logger.logError("[PlayerAPI.Skywars.MEGA_STAT] Unknown Mega Kit value: " + kit + " >> " + key);
            return true;
        }

        if(key.contains("RANKED") && key.contains("Kit")){
            String kit = key.replaceAll("[\\w+_]*RANKED_", "").replace("-", "_");
            if(RankedKit.mapping.contains(kit)){
                this.unlockedRankedKits.put(RankedKit.valueOf(kit), value.getAsInt());
                return true;
            }
            Logger.logError("[PlayerAPI.Skywars.RANKED_STAT] Unknown Ranked Kit value: " + kit + " >> " + key);
            return true;
        }

        //<editor-fold desc="[statHashmaps]">
        if(key.contains("SOLO") && key.contains("Kit")){
            String kit = key.replaceAll("[\\w+_]+SOLO_", "");
            if(!SoloKit.mapping.contains(kit)){
                Logger.logError("[PlayerAPI.Skywars.SOLO_STAT] Unknown Solo Kit value: " + kit  + " >> " + key);
                return true;
            }
            SoloKit sKit = SoloKit.valueOf(kit);
            int amount = value.getAsInt();
            if(key.contains("WINS")){
                this.winsBySoloKit.put(sKit, amount);
                return true;
            }else if(key.contains("DEATHS")){
                this.deathsBySoloKit.put(sKit, amount);
                return true;
            }else if(key.contains("LOSSES")){
                this.lossesBySoloKit.put(sKit, amount);
                return true;
            }else if(key.contains("SURVIVED_PLAYERS")){
                this.survivedPlayersBySoloKit.put(sKit, amount);
                return true;
            }else if(key.contains("KILLS")){
                this.killsBySoloKit.put(sKit, amount);
                return true;
            }else if(key.contains("ASSISTS")){
                this.assistsBySoloKit.put(sKit, amount);
                return true;
            }else if(key.contains("GAMES")){
                this.gamesBySoloKit.put(sKit, amount);
                return true;
            }else if(key.contains("ARROWS_HIT")){
                this.arrowsHitBySoloKit.put(sKit, amount);
                return true;
            }else if(key.contains("TIME_PLAYED")){
                this.timePlayedBySoloKit.put(sKit, amount);
                return true;
            }else if(key.contains("CHESTS_OPENED")){
                this.chestsOpenedBySoloKit.put(sKit, amount);
                return true;
            }else if(key.contains("FASTEST_WIN")){
                this.fastestWinBySoloKit.put(sKit, amount);
                return true;
            }else if(key.contains("LONGEST_BOW_SHOT")){
                this.longestBowShotBySoloKit.put(sKit, amount);
                return true;
            }else if(key.contains("ARROWS_SHOT")){
                this.arrowsShotBySoloKit.put(sKit, amount);
                return true;
            }
            Logger.logError("[PlayerAPI.Skywars.SOLO_STAT] Unknown stat: " + key);
            return true;
        }
        
        if(key.contains("TEAM") && key.contains("Kit")){
            String kit = key.replaceAll("[\\w+_]+TEAM_", "").replace("-", "_");
            if(!TeamKit.mapping.contains(kit)){
                Logger.logError("[PlayerAPI.Skywars.TEAM_STAT] Unknown Team Kit value: " + kit  + " >> " + key);
                return true;
            }
            TeamKit sKit = TeamKit.valueOf(kit);
            int amount = value.getAsInt();
            if(key.contains("WINS")){
                this.winsByTeamKit.put(sKit, amount);
                return true;
            }else if(key.contains("DEATHS")){
                this.deathsByTeamKit.put(sKit, amount);
                return true;
            }else if(key.contains("LOSSES")){
                this.lossesByTeamKit.put(sKit, amount);
                return true;
            }else if(key.contains("SURVIVED_PLAYERS")){
                this.survivedPlayersByTeamKit.put(sKit, amount);
                return true;
            }else if(key.contains("KILLS")){
                this.killsByTeamKit.put(sKit, amount);
                return true;
            }else if(key.contains("ASSISTS")){
                this.assistsByTeamKit.put(sKit, amount);
                return true;
            }else if(key.contains("GAMES")){
                this.gamesByTeamKit.put(sKit, amount);
                return true;
            }else if(key.contains("ARROWS_HIT")){
                this.arrowsHitByTeamKit.put(sKit, amount);
                return true;
            }else if(key.contains("TIME_PLAYED")){
                this.timePlayedByTeamKit.put(sKit, amount);
                return true;
            }else if(key.contains("CHESTS_OPENED")){
                this.chestsOpenedByTeamKit.put(sKit, amount);
                return true;
            }else if(key.contains("FASTEST_WIN")){
                this.fastestWinByTeamKit.put(sKit, amount);
                return true;
            }else if(key.contains("LONGEST_BOW_SHOT")){
                this.longestBowShotByTeamKit.put(sKit, amount);
                return true;
            }else if(key.contains("ARROWS_SHOT")){
                this.arrowsShotByTeamKit.put(sKit, amount);
                return true;
            }
            Logger.logError("[PlayerAPI.Skywars.TEAM_STAT] Unknown stat: " + key);
            return true;
        }
        
        if(key.contains("RANKED") && key.contains("Kit")){
            String kit = key.replaceAll("[\\w+_]+RANKED_", "");
            if(!RankedKit.mapping.contains(kit)){
                Logger.logError("[PlayerAPI.Skywars.RANKED_STAT] Unknown Ranked Kit value: " + kit  + " >> " + key);
                return true;
            }
            RankedKit sKit = RankedKit.valueOf(kit);
            int amount = value.getAsInt();
            if(key.contains("WINS")){
                this.winsByRankedKit.put(sKit, amount);
                return true;
            }else if(key.contains("DEATHS")){
                this.deathsByRankedKit.put(sKit, amount);
                return true;
            }else if(key.contains("LOSSES")){
                this.lossesByRankedKit.put(sKit, amount);
                return true;
            }else if(key.contains("SURVIVED_PLAYERS")){
                this.survivedPlayersByRankedKit.put(sKit, amount);
                return true;
            }else if(key.contains("KILLS")){
                this.killsByRankedKit.put(sKit, amount);
                return true;
            }else if(key.contains("ASSISTS")){
                this.assistsByRankedKit.put(sKit, amount);
                return true;
            }else if(key.contains("GAMES")){
                this.gamesByRankedKit.put(sKit, amount);
                return true;
            }else if(key.contains("ARROWS_HIT")){
                this.arrowsHitByRankedKit.put(sKit, amount);
                return true;
            }else if(key.contains("TIME_PLAYED")){
                this.timePlayedByRankedKit.put(sKit, amount);
                return true;
            }else if(key.contains("CHESTS_OPENED")){
                this.chestsOpenedByRankedKit.put(sKit, amount);
                return true;
            }else if(key.contains("FASTEST_WIN")){
                this.fastestWinByRankedKit.put(sKit, amount);
                return true;
            }else if(key.contains("LONGEST_BOW_SHOT")){
                this.longestBowShotByRankedKit.put(sKit, amount);
                return true;
            }else if(key.contains("ARROWS_SHOT")){
                this.arrowsShotByRankedKit.put(sKit, amount);
                return true;
            }
            Logger.logError("[PlayerAPI.Skywars.RANKED_STAT] Unknown stat: " + key);
            return true;
        }
        
        if(key.contains("MEGA") && key.contains("Kit")){
            String kit = key.replaceAll("[\\w+_]+MEGA_", "");
            if(!MegaKit.mapping.contains(kit)){
                Logger.logError("[PlayerAPI.Skywars.MEGA_STAT] Unknown Mega Kit value: " + kit  + " >> " + key);
                return true;
            }
            MegaKit sKit = MegaKit.valueOf(kit);
            int amount = value.getAsInt();
            if(key.contains("WINS")){
                this.winsByMegaKit.put(sKit, amount);
                return true;
            }else if(key.contains("DEATHS")){
                this.deathsByMegaKit.put(sKit, amount);
                return true;
            }else if(key.contains("LOSSES")){
                this.lossesByMegaKit.put(sKit, amount);
                return true;
            }else if(key.contains("SURVIVED_PLAYERS")){
                this.survivedPlayersByMegaKit.put(sKit, amount);
                return true;
            }else if(key.contains("KILLS")){
                this.killsByMegaKit.put(sKit, amount);
                return true;
            }else if(key.contains("ASSISTS")){
                this.assistsByMegaKit.put(sKit, amount);
                return true;
            }else if(key.contains("GAMES")){
                this.gamesByMegaKit.put(sKit, amount);
                return true;
            }else if(key.contains("ARROWS_HIT")){
                this.arrowsHitByMegaKit.put(sKit, amount);
                return true;
            }else if(key.contains("TIME_PLAYED")){
                this.timePlayedByMegaKit.put(sKit, amount);
                return true;
            }else if(key.contains("CHESTS_OPENED")){
                this.chestsOpenedByMegaKit.put(sKit, amount);
                return true;
            }else if(key.contains("FASTEST_WIN")){
                this.fastestWinByMegaKit.put(sKit, amount);
                return true;
            }else if(key.contains("LONGEST_BOW_SHOT")){
                this.longestBowShotByMegaKit.put(sKit, amount);
                return true;
            }else if(key.contains("ARROWS_SHOT")){
                this.arrowsShotByMegaKit.put(sKit, amount);
                return true;
            }
            Logger.logError("[PlayerAPI.Skywars.MEGA_STAT] Unknown stat: " + key);
            return true;
        }
        //</editor-fold>

        //<editor-fold desc="[Perks]">
        if(key.contains("SOLO")){
            String kit = key.replaceAll("[\\w+_]*SOLO_", "").replace("-", "_");
            if(!SoloPerk.mapping.contains(kit)){
                Logger.logError("[PlayerAPI.Skywars.SoloPerk] Unknown Solo Perk value: " + kit  + " >> " + key);
                return true;
            }
            unlockedSoloPerks.put(SoloPerk.valueOf(kit), value.getAsInt());
            return true;
        }
        if(key.contains("TEAM")){
            String kit = key.replaceAll("[\\w+_]*TEAM_", "").replace("-", "_");
            if(!TeamPerk.mapping.contains(kit)){
                Logger.logError("[PlayerAPI.Skywars.TeamPerk] Unknown Team Perk value: " + kit  + " >> " + key);
                return true;
            }
            unlockedTeamPerks.put(TeamPerk.valueOf(kit), value.getAsInt());
            return true;
        }
        if(key.contains("MEGA")){
            String kit = key.replaceAll("[\\w+_]*MEGA_", "");
            if(!MegaPerk.mapping.contains(kit)){
                Logger.logError("[PlayerAPI.Skywars.MegaPerk] Unknown Mega Perk value: " + kit  + " >> " + key);
                return true;
            }
            unlockedMegaPerks.put(MegaPerk.valueOf(kit), value.getAsInt());
            return true;
        }
        if(key.contains("RANKED")){
            String kit = key.replaceAll("[\\w+_]*RANKED_", "").replace("_PERK", "");
            if(!RankedPerk.mapping.contains(kit)){
                Logger.logError("[PlayerAPI.Skywars.RankedPerk] Unknown Ranked Perk value: " + kit  + " >> " + key);
                return true;
            }
            unlockedRankedPerks.put(RankedPerk.valueOf(kit), value.getAsInt());
            return true;
        }
            //</editor-fold>

        return false;
    }

    public void initializePackages(JsonArray array){
        for(JsonElement element: array){
            String key = element.getAsString().toUpperCase().trim().replace("-", "_");

            if(key.contains("FAVORITE")){
                key = key.replaceAll("\\w+_", "");
                favoritedMaps.add(key);
                continue;
            }

            if(key.contains("Cage")){
                key = key.replaceAll("[\\w+_]*CAGE_", "").replace("-", "_");
                if(Cage.mapping.contains(key)){
                    this.unlockedCages.add(Cage.valueOf(key));
                    continue;
                }
                Logger.logError("[PlayerAPI.Skywars.packages] Unknown cage value: " + element.getAsString() + " >> " + key);
                continue;
            }

            if(key.contains("SOLO")){
                key = key.replaceAll("[\\w+_]*SOLO_", "").replace("-", "_");;
                if(SoloKit.mapping.contains(key)){
                    this.unlockedSoloKits.add(SoloKit.valueOf(key));
                    continue;
                }
                Logger.logError("[PlayerAPI.Skywars.packages] Unknown Solo Kit value: " + element.getAsString() + " >> " + key);
                continue;
            }

            if(key.contains("TEAM")){
                key = key.replaceAll("[\\w+_]*TEAM_", "").replace("-", "_");
                if(TeamKit.mapping.contains(key)){
                    this.unlockedTeamKits.add(TeamKit.valueOf(key));
                    continue;
                }
                Logger.logError("[PlayerAPI.Skywars.packages] Unknown Team Kit value: " + element.getAsString() + " >> " + key);
                continue;
            }

            if(key.contains("VICTORYDANCE") || key.contains("VictoryDance")){
                key = key.replaceAll("[\\w+_]*VICTORYDANCE_", "").replaceAll("[\\w+_]*VICTORY_DANCE_", "").replace("-", "_");
                if(VictoryDance.mapping.contains(key)){
                    this.unlockedVictoryDances.add(VictoryDance.valueOf(key));
                    continue;
                }
                Logger.logError("[PlayerAPI.Skywars.packages] Unknown Victory Dance value: " + element.getAsString() + " >> " + key);
                continue;
            }

            if(key.contains("KILLEFFECT") || key.contains("KillEffect")){
                key = key.replaceAll("[\\w+_]*KILLEFFECT_", "").replaceAll("[\\w+_]*KILL_EFFECT_", "").replace("-", "_");
                if(KillEffect.mapping.contains(key)){
                    this.unlockedKillEffects.add(KillEffect.valueOf(key));
                    continue;
                }
                Logger.logError("[PlayerAPI.Skywars.packages] Unknown Kill Effect value: " + element.getAsString() + " >> " + key);
                continue;
            }

            if(key.contains("DEATHCRY")){
                key = key.replaceAll("[\\w+_]*DEATHCRY_", "").replace("-", "_");
                if(DeathCry.mapping.contains(key)){
                    this.unlockedDeathCries.add(DeathCry.valueOf(key));
                    continue;
                }
                Logger.logError("[PlayerAPI.Skywars.packages] Unknown Death Cry value: " + element.getAsString() + " >> " + key);
                continue;
            }

            if(key.contains("PROJECTILETRAIL") || key.contains("ARROWTRAIL")){
                key = key.replaceAll("[\\w+]*ARROWTRAIL_", "").replaceAll("[\\w+]*PROJECTILETRAIL_", "").replace("-", "_");
                if(ProjectileTrail.mapping.contains(key)){
                    this.unlockedProjectileTrails.add(ProjectileTrail.valueOf(key));
                    continue;
                }
                Logger.logError("[PlayerAPI.Skywars.packages] Unknown Projectile Trail value: " + element.getAsString() + " >> " + key);
                continue;
            }

            //<editor-fold desc="[OUTDATED]">
            if(key.contains("DIVISIONSKYWARS")){
                key = key.replaceAll("\\w+_\\w+_\\w+_", "").replace("_16", "");
                int x = Integer.parseInt(key);
                divisionSkywars_Skywars_Rating.add(x);
                continue;
            }

            if(key.contains("TAUNT_")){
                key = key.replaceAll("[\\w+_]*TAUNT_", "");
                this.unlockedTaunts.add(key);
                continue;
            }

            if(key.contains("PREFIX_")){
                key = key.replaceAll("[\\w+_]*PREFIX_", "");
                this.unlockedPrefixes.add(key);
                continue;
            }
            //</editor-fold>

            switch(key){
                //<editor-fold desc="[OUTDATED]">
                case "LEGACYACHIEVEMENT":
                    this.legacyAchievement = true;
                    continue;
                case "LEGACYACHIEVEMENT2":
                    this.legacyAchievement2 = true;
                    continue;
                case "LEGACYACHIEVEMENT3":
                    this.legacyAchievement3 = true;
                    continue;
                case "LEGACYACHIEVEMENT4":
                    this.legacyAchievement4 = true;
                    continue;
                case "FIX_ACHIEVEMENTS":
                    this.fix_achievements = true;
                    continue;
                case "FIX_ACHIEVEMENTS2":
                    this.fix_achievements2 = true;
                    continue;
                case "250_RATING_REWARDSKYWARS_SKYWARS_RATING_2":
                    this.X250_rating_rewardskywars_skywars_rating_2 = true;
                    continue;
                case "250_RATING_REWARDSKYWARS_SKYWARS_RATING_5_16":
                    this.X250_rating_rewardskywars_skywars_rating_5_16 = true;
                    continue;
                case "INSTANT_ROLLS":
                    this.instantRolls = true;
                    continue;
                case "TROPHY_MASTERS_1":
                    this.thropyMasters1 = true;
                    continue;
                //</editor-fold>
            }

            Logger.logError("[PlayerAPI.Skywars.packages] Unknown value: " + element.getAsString());
        }
    }

    //<editor-fold desc=["getters]">
    public ArrayList<TeamKit> getUnlockedTeamKits() {
        return unlockedTeamKits;
    }

    public ArrayList<String> getFavoritedMaps() {
        return favoritedMaps;
    }

    public ArrayList<VictoryDance> getUnlockedVictoryDances() {
        return unlockedVictoryDances;
    }

    public ArrayList<DeathCry> getUnlockedDeathCries() {
        return unlockedDeathCries;
    }

    public ArrayList<Cage> getUnlockedCages() {
        return unlockedCages;
    }

    public ArrayList<ProjectileTrail> getUnlockedProjectileTrails() {
        return unlockedProjectileTrails;
    }

    public ArrayList<KillEffect> getUnlockedKillEffects() {
        return unlockedKillEffects;
    }

    public HashMap<Upgrade, Integer> getUnlockedUpgrades() {
        return unlockedUpgrades;
    }

    public ArrayList<SoloKit> getUnlockedSoloKits() {
        return unlockedSoloKits;
    }

    public HashMap<RankedKit, Integer> getUnlockedRankedKits() {
        return unlockedRankedKits;
    }

    public HashMap<MegaKit, Integer> getUnlockedMegaKits() {
        return unlockedMegaKits;
    }

    public HashMap<SoloPerk, Integer> getUnlockedSoloPerks() {
        return unlockedSoloPerks;
    }

    public HashMap<TeamPerk, Integer> getUnlockedTeamPerks() {
        return unlockedTeamPerks;
    }

    public HashMap<RankedPerk, Integer> getUnlockedRankedPerks() {
        return unlockedRankedPerks;
    }

    public HashMap<MegaPerk, Integer> getUnlockedMegaPerks() {
        return unlockedMegaPerks;
    }

    public HashMap<SoloKit, Integer> getSurvivedPlayersBySoloKit() {
        return survivedPlayersBySoloKit;
    }

    public HashMap<TeamKit, Integer> getSurvivedPlayersByTeamKit() {
        return survivedPlayersByTeamKit;
    }

    public HashMap<RankedKit, Integer> getSurvivedPlayersByRankedKit() {
        return survivedPlayersByRankedKit;
    }

    public HashMap<MegaKit, Integer> getSurvivedPlayersByMegaKit() {
        return survivedPlayersByMegaKit;
    }

    public HashMap<SoloKit, Integer> getLossesBySoloKit() {
        return lossesBySoloKit;
    }

    public HashMap<TeamKit, Integer> getLossesByTeamKit() {
        return lossesByTeamKit;
    }

    public HashMap<RankedKit, Integer> getLossesByRankedKit() {
        return lossesByRankedKit;
    }

    public HashMap<MegaKit, Integer> getLossesByMegaKit() {
        return lossesByMegaKit;
    }

    public HashMap<SoloKit, Integer> getWinsBySoloKit() {
        return winsBySoloKit;
    }

    public HashMap<TeamKit, Integer> getWinsByTeamKit() {
        return winsByTeamKit;
    }

    public HashMap<RankedKit, Integer> getWinsByRankedKit() {
        return winsByRankedKit;
    }

    public HashMap<MegaKit, Integer> getWinsByMegaKit() {
        return winsByMegaKit;
    }

    public HashMap<SoloKit, Integer> getGamesBySoloKit() {
        return gamesBySoloKit;
    }

    public HashMap<TeamKit, Integer> getGamesByTeamKit() {
        return gamesByTeamKit;
    }

    public HashMap<RankedKit, Integer> getGamesByRankedKit() {
        return gamesByRankedKit;
    }

    public HashMap<MegaKit, Integer> getGamesByMegaKit() {
        return gamesByMegaKit;
    }

    public HashMap<SoloKit, Integer> getAssistsBySoloKit() {
        return assistsBySoloKit;
    }

    public HashMap<TeamKit, Integer> getAssistsByTeamKit() {
        return assistsByTeamKit;
    }

    public HashMap<RankedKit, Integer> getAssistsByRankedKit() {
        return assistsByRankedKit;
    }

    public HashMap<MegaKit, Integer> getAssistsByMegaKit() {
        return assistsByMegaKit;
    }

    public HashMap<SoloKit, Integer> getKillsBySoloKit() {
        return killsBySoloKit;
    }

    public HashMap<TeamKit, Integer> getKillsByTeamKit() {
        return killsByTeamKit;
    }

    public HashMap<RankedKit, Integer> getKillsByRankedKit() {
        return killsByRankedKit;
    }

    public HashMap<MegaKit, Integer> getKillsByMegaKit() {
        return killsByMegaKit;
    }

    public HashMap<SoloKit, Integer> getDeathsBySoloKit() {
        return deathsBySoloKit;
    }

    public HashMap<TeamKit, Integer> getDeathsByTeamKit() {
        return deathsByTeamKit;
    }

    public HashMap<RankedKit, Integer> getDeathsByRankedKit() {
        return deathsByRankedKit;
    }

    public HashMap<MegaKit, Integer> getDeathsByMegaKit() {
        return deathsByMegaKit;
    }

    public HashMap<SoloKit, Integer> getArrowsHitBySoloKit() {
        return arrowsHitBySoloKit;
    }

    public HashMap<TeamKit, Integer> getArrowsHitByTeamKit() {
        return arrowsHitByTeamKit;
    }

    public HashMap<RankedKit, Integer> getArrowsHitByRankedKit() {
        return arrowsHitByRankedKit;
    }

    public HashMap<MegaKit, Integer> getArrowsHitByMegaKit() {
        return arrowsHitByMegaKit;
    }

    public HashMap<SoloKit, Integer> getChestsOpenedBySoloKit() {
        return chestsOpenedBySoloKit;
    }

    public HashMap<TeamKit, Integer> getChestsOpenedByTeamKit() {
        return chestsOpenedByTeamKit;
    }

    public HashMap<RankedKit, Integer> getChestsOpenedByRankedKit() {
        return chestsOpenedByRankedKit;
    }

    public HashMap<MegaKit, Integer> getChestsOpenedByMegaKit() {
        return chestsOpenedByMegaKit;
    }

    public HashMap<SoloKit, Integer> getTimePlayedBySoloKit() {
        return timePlayedBySoloKit;
    }

    public HashMap<TeamKit, Integer> getTimePlayedByTeamKit() {
        return timePlayedByTeamKit;
    }

    public HashMap<RankedKit, Integer> getTimePlayedByRankedKit() {
        return timePlayedByRankedKit;
    }

    public HashMap<MegaKit, Integer> getTimePlayedByMegaKit() {
        return timePlayedByMegaKit;
    }

    public HashMap<SoloKit, Integer> getFastestWinBySoloKit() {
        return fastestWinBySoloKit;
    }

    public HashMap<TeamKit, Integer> getFastestWinByTeamKit() {
        return fastestWinByTeamKit;
    }

    public HashMap<RankedKit, Integer> getFastestWinByRankedKit() {
        return fastestWinByRankedKit;
    }

    public HashMap<MegaKit, Integer> getFastestWinByMegaKit() {
        return fastestWinByMegaKit;
    }

    public HashMap<SoloKit, Integer> getArrowsShotBySoloKit() {
        return arrowsShotBySoloKit;
    }

    public HashMap<TeamKit, Integer> getArrowsShotByTeamKit() {
        return arrowsShotByTeamKit;
    }

    public HashMap<RankedKit, Integer> getArrowsShotByRankedKit() {
        return arrowsShotByRankedKit;
    }

    public HashMap<MegaKit, Integer> getArrowsShotByMegaKit() {
        return arrowsShotByMegaKit;
    }

    public HashMap<SoloKit, Integer> getLongestBowShotBySoloKit() {
        return longestBowShotBySoloKit;
    }

    public HashMap<TeamKit, Integer> getLongestBowShotByTeamKit() {
        return longestBowShotByTeamKit;
    }

    public HashMap<RankedKit, Integer> getLongestBowShotByRankedKit() {
        return longestBowShotByRankedKit;
    }

    public HashMap<MegaKit, Integer> getLongestBowShotByMegaKit() {
        return longestBowShotByMegaKit;
    }

    public HashMap<String, Integer> getMapVotes() {
        return mapVotes;
    }

    public HashMap<String, Integer> getQuickJoinUses() {
        return quickJoinUses;
    }

    public SoloKit getSelectedSoloKit() {
        return selectedSoloKit;
    }

    public TeamKit getSelectedTeamKit() {
        return selectedTeamKit;
    }

    public RankedKit getSelectedRankedKit() {
        return selectedRankedKit;
    }

    public MegaKit getSelectedMegaKit() {
        return selectedMegaKit;
    }

    public VictoryDance getSelectedVictoryDance() {
        return selectedVictoryDance;
    }

    public KillEffect getSelectedKillEffect() {
        return selectedKillEffect;
    }

    public Cage getSelectedCage() {
        return selectedCage;
    }

    public int getCoins() {
        return coins;
    }

    public int getSoulWell() {
        return soulWell;
    }

    public int getWinStreak() {
        return winStreak;
    }

    public int getSurvivedPlayers() {
        return survivedPlayers;
    }

    public int getLosses() {
        return losses;
    }

    public int getWins() {
        return wins;
    }

    public int getGames() {
        return games;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getBlocksPlaced() {
        return blocksPlaced;
    }

    public int getAssists() {
        return assists;
    }

    public int getSouls() {
        return souls;
    }

    public int getKills() {
        return kills;
    }

    public int getBlocksBroken() {
        return blocksBroken;
    }

    public int getEggsThrown() {
        return eggsThrown;
    }

    public int getEnderPearlsThrown() {
        return enderPearlsThrown;
    }

    public int getPaidSouls() {
        return paidSouls;
    }

    public int getSoulWellRares() {
        return soulWellRares;
    }

    public int getSoulWellLegendaries() {
        return soulWellLegendaries;
    }

    public int getArrowsHit() {
        return arrowsHit;
    }

    public int getArrowsShot() {
        return arrowsShot;
    }

    public int getItemsEnchanted() {
        return itemsEnchanted;
    }

    public int getQuits() {
        return quits;
    }

    public int getSoulsGathered() {
        return soulsGathered;
    }

    public int getRefillChestDestroy() {
        return refillChestDestroy;
    }

    public int getExtraWheels() {
        return extraWheels;
    }

    public int getHighestWinStreak() {
        return highestWinStreak;
    }

    public int getKillStreak() {
        return killStreak;
    }

    public int getHighestKillStreak() {
        return highestKillStreak;
    }

    public int getLongestBowShot() {
        return longestBowShot;
    }

    public int getVoidKills() {
        return voidKills;
    }

    public int getChestsOpened() {
        return chestsOpened;
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    public int getMostKills() {
        return mostKills;
    }

    public int getMeleeKills() {
        return meleeKills;
    }

    public int getFastestWin() {
        return fastestWin;
    }

    public int getLossesTeam() {
        return lossesTeam;
    }

    public int getLossesSolo() {
        return lossesSolo;
    }

    public int getLossesRanked() {
        return lossesRanked;
    }

    public int getLossesMega() {
        return lossesMega;
    }

    public int getLossesTeamNormal() {
        return lossesTeamNormal;
    }

    public int getLossesSoloNormal() {
        return lossesSoloNormal;
    }

    public int getLossesRankedNormal() {
        return lossesRankedNormal;
    }

    public int getLossesMegaNormal() {
        return lossesMegaNormal;
    }

    public int getLossesTeamInsane() {
        return lossesTeamInsane;
    }

    public int getLossesSoloInsane() {
        return lossesSoloInsane;
    }

    public int getLossesRankedInsane() {
        return lossesRankedInsane;
    }

    public int getLossesMegaInsane() {
        return lossesMegaInsane;
    }

    public int getDeathsTeam() {
        return deathsTeam;
    }

    public int getDeathsSolo() {
        return deathsSolo;
    }

    public int getDeathsRanked() {
        return deathsRanked;
    }

    public int getDeathsMega() {
        return deathsMega;
    }

    public int getDeathsTeamNormal() {
        return deathsTeamNormal;
    }

    public int getDeathsSoloNormal() {
        return deathsSoloNormal;
    }

    public int getDeathsRankedNormal() {
        return deathsRankedNormal;
    }

    public int getDeathsMegaNormal() {
        return deathsMegaNormal;
    }

    public int getDeathsTeamInsane() {
        return deathsTeamInsane;
    }

    public int getDeathsSoloInsane() {
        return deathsSoloInsane;
    }

    public int getDeathsRankedInsane() {
        return deathsRankedInsane;
    }

    public int getDeathsMegaInsane() {
        return deathsMegaInsane;
    }

    public int getKillsTeam() {
        return killsTeam;
    }

    public int getKillsSolo() {
        return killsSolo;
    }

    public int getKillsRanked() {
        return killsRanked;
    }

    public int getKillsMega() {
        return killsMega;
    }

    public int getKillsTeamNormal() {
        return killsTeamNormal;
    }

    public int getKillsSoloNormal() {
        return killsSoloNormal;
    }

    public int getKillsRankedNormal() {
        return killsRankedNormal;
    }

    public int getKillsMegaNormal() {
        return killsMegaNormal;
    }

    public int getKillsTeamInsane() {
        return killsTeamInsane;
    }

    public int getKillsSoloInsane() {
        return killsSoloInsane;
    }

    public int getKillsRankedInsane() {
        return killsRankedInsane;
    }

    public int getKillsMegaInsane() {
        return killsMegaInsane;
    }

    public int getWinsTeam() {
        return winsTeam;
    }

    public int getWinsSolo() {
        return winsSolo;
    }

    public int getWinsRanked() {
        return winsRanked;
    }

    public int getWinsMega() {
        return winsMega;
    }

    public int getWinsTeamNormal() {
        return winsTeamNormal;
    }

    public int getWinsSoloNormal() {
        return winsSoloNormal;
    }

    public int getWinsRankedNormal() {
        return winsRankedNormal;
    }

    public int getWinsMegaNormal() {
        return winsMegaNormal;
    }

    public int getWinsTeamInsane() {
        return winsTeamInsane;
    }

    public int getWinsSoloInsane() {
        return winsSoloInsane;
    }

    public int getWinsRankedInsane() {
        return winsRankedInsane;
    }

    public int getWinsMegaInsane() {
        return winsMegaInsane;
    }

    public int getAssistsTeam() {
        return assistsTeam;
    }

    public int getAssistsSolo() {
        return assistsSolo;
    }

    public int getAssistsRanked() {
        return assistsRanked;
    }

    public int getAssistsMega() {
        return assistsMega;
    }

    public int getChestsOpenedTeam() {
        return chestsOpenedTeam;
    }

    public int getChestsOpenedSolo() {
        return chestsOpenedSolo;
    }

    public int getChestsOpenedRanked() {
        return chestsOpenedRanked;
    }

    public int getChestsOpenedMega() {
        return chestsOpenedMega;
    }

    public int getTimePlayedTeam() {
        return timePlayedTeam;
    }

    public int getTimePlayedSolo() {
        return timePlayedSolo;
    }

    public int getTimePlayedRanked() {
        return timePlayedRanked;
    }

    public int getTimePlayedMega() {
        return timePlayedMega;
    }

    public int getMeleeKillsTeam() {
        return meleeKillsTeam;
    }

    public int getMeleeKillsSolo() {
        return meleeKillsSolo;
    }

    public int getMeleeKillsRanked() {
        return meleeKillsRanked;
    }

    public int getMeleeKillsMega() {
        return meleeKillsMega;
    }

    public int getMostKillsTeam() {
        return mostKillsTeam;
    }

    public int getMostKillsSolo() {
        return mostKillsSolo;
    }

    public int getMostKillsRanked() {
        return mostKillsRanked;
    }

    public int getMostKillsMega() {
        return mostKillsMega;
    }

    public int getArrowsHitTeam() {
        return arrowsHitTeam;
    }

    public int getArrowsHitSolo() {
        return arrowsHitSolo;
    }

    public int getArrowsHitRanked() {
        return arrowsHitRanked;
    }

    public int getArrowsHitMega() {
        return arrowsHitMega;
    }

    public int getArrowsShotTeam() {
        return arrowsShotTeam;
    }

    public int getArrowsShotSolo() {
        return arrowsShotSolo;
    }

    public int getArrowsShotRanked() {
        return arrowsShotRanked;
    }

    public int getArrowsShotMega() {
        return arrowsShotMega;
    }

    public int getVoidKillsTeam() {
        return voidKillsTeam;
    }

    public int getVoidKillsSolo() {
        return voidKillsSolo;
    }

    public int getVoidKillsRanked() {
        return voidKillsRanked;
    }

    public int getVoidKillsMega() {
        return voidKillsMega;
    }

    public int getFastestWinTeam() {
        return fastestWinTeam;
    }

    public int getFastestWinSolo() {
        return fastestWinSolo;
    }

    public int getFastestWinRanked() {
        return fastestWinRanked;
    }

    public int getFastestWinMega() {
        return fastestWinMega;
    }

    public int getKillstreakTeam() {
        return killstreakTeam;
    }

    public int getKillstreakSolo() {
        return killstreakSolo;
    }

    public int getKillstreakRanked() {
        return killstreakRanked;
    }

    public int getKillstreakMega() {
        return killstreakMega;
    }

    public int getWinstreakTeam() {
        return winstreakTeam;
    }

    public int getWinstreakSolo() {
        return winstreakSolo;
    }

    public int getWinstreakRanked() {
        return winstreakRanked;
    }

    public int getWinstreakMega() {
        return winstreakMega;
    }

    public int getLongestBowShotTeam() {
        return longestBowShotTeam;
    }

    public int getLongestBowShotSolo() {
        return longestBowShotSolo;
    }

    public int getLongestBowShotRanked() {
        return longestBowShotRanked;
    }

    public int getLongestBowShotMega() {
        return longestBowShotMega;
    }

    public int getSurvivedPlayersTeam() {
        return survivedPlayersTeam;
    }

    public int getSurvivedPlayersSolo() {
        return survivedPlayersSolo;
    }

    public int getSurvivedPlayersRanked() {
        return survivedPlayersRanked;
    }

    public int getSurvivedPlayersMega() {
        return survivedPlayersMega;
    }

    public int getGamesTeam() {
        return gamesTeam;
    }

    public int getGamesSolo() {
        return gamesSolo;
    }

    public int getGamesRanked() {
        return gamesRanked;
    }

    public int getGamesMega() {
        return gamesMega;
    }

    public boolean isUsedSoulWell() {
        return usedSoulWell;
    }

    public boolean isCombatTracker() {
        return combatTracker;
    }

    public int getKills_weekly_b() {
        return kills_weekly_b;
    }

    public int getKills_weekly_a() {
        return kills_weekly_a;
    }

    public int getKills_monthly_b() {
        return kills_monthly_b;
    }

    public int getKills_monthly_a() {
        return kills_monthly_a;
    }

    public boolean isLegacyAchievement() {
        return legacyAchievement;
    }

    public boolean isLegacyAchievement3() {
        return legacyAchievement3;
    }

    public boolean isLegacyAchievement4() {
        return legacyAchievement4;
    }

    public boolean isFix_achievements() {
        return fix_achievements;
    }

    public boolean isFix_achievements2() {
        return fix_achievements2;
    }

    public ArrayList<Integer> getDivisionSkywars_Skywars_Rating() {
        return divisionSkywars_Skywars_Rating;
    }
    //</editor-fold>
}
