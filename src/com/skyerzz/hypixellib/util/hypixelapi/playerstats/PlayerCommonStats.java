package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
<<<<<<< Updated upstream
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.network.*;
import com.skyerzz.hypixellib.util.games.Gamemode;
import com.skyerzz.hypixellib.util.network.event.Xmas2015;
import com.skyerzz.hypixellib.util.network.event.Xmas2016;
import com.skyerzz.hypixellib.util.network.mysteryvault.Cloak;
import com.skyerzz.hypixellib.util.network.networklevel.MVPPlusColor;
import com.skyerzz.hypixellib.util.network.pet.*;

import java.util.ArrayList;
=======
import com.skyerzz.hypixellib.util.CHAT;
import com.skyerzz.hypixellib.util.ILevel;
import com.skyerzz.hypixellib.util.RANK;

import java.util.Date;
>>>>>>> Stashed changes
import java.util.Map;
import java.util.UUID;

/**
 * Created by Skyerzz-LAPOTOP on 08/03/2017.
 */
public class PlayerCommonStats extends PlayerGameStats implements ILevel{

    //note: eugine == deliveryman

    //<editor-fold desc="[Fields]">
    private int networkLevel, karma, networkEXP, thanksSent, thanksReceived;
    private int mostRecentMinecraftVersion; //5 = 1.8.9 (forge 1722)

<<<<<<< Updated upstream
    /** Hypixel Credit Value */
    private int vanityTokens; //todo check if actual credit value

    private String _id, displayName, mostRecentlyThankedName, mostRecentlyTippedName, playerName, mcVersionRP;
    private UUID mostRecentlyThankedUUID, mostRecentlyTippedUUID;
    private int specSpeed, adsenseTokens, totalRewards, totalDailyRewards, rewardStreak, rewardScore, rewardHighScore;
    private long lastPetJourney, mvpPlusColorUnlocked, vanityFirstConvertedBox, lastAdsenseTime, lastClaimedReward, quickjoinTimestamp, flashingSalePopup;
    private int quickJoinUses, flashingNewsPoppedUp, flashingNewsOpens, flashingSaleOpens, flashingSaleClicks;
=======
    private String _id, displayName, mostRecentlyThankedName, mostRecentlyTippedName;
    private UUID mostRecentlyThankedUUID, mostRecentlyTippedUUID, playerUUID;
>>>>>>> Stashed changes

    private Chat selectedChannel;
    private Rank rank, newPackageRank;
    private UUID uuid;
    private ParticleQuality particleQuality;
    private Gamemode mostRecentGameType;
    private Language userLanguage;
    private Cloak selectedCloak;
    private MVPPlusColor selectedPlusColor;

    private long firstLogin, lastlogin; //todo make into date available through getter

    private boolean mainLobbyTutorialCompleted, spectatorNightVision, newMainTutorial, silence, showTipHolograms, showTNTRunHolograms;

    private ArrayList<Integer> claimedLevelRewards = new ArrayList<>();
    private ArrayList<AdminNPC> foundAdminNPCs = new ArrayList<>();
    private ArrayList<Pet> petStats = new ArrayList<>();
    private ArrayList<Companion> companions = new ArrayList<>();

    //<editor-fold desc="[EVENTS]">
    private ArrayList<Xmas2016> foundXmas2016Presents = new ArrayList<>();
    private ArrayList<Xmas2015> foundXmas2015Presents = new ArrayList<>();

    private boolean finishedXmas2016SantaQuest, startedXmas2016SantaQuest;
    //</editor-fold>

    @OutDated
    /** Used to allow you to go on the testing network */
    private boolean testpass;

    @OutDated
    /** Used to keep track of online time, doesnt work anymore */
    private int timePlaying;

    @OutDated
    /** Amount of grinch gifts collected (christmas game), not sure why its in here */
    private int giftsGrinch;

    //todo find out what values mean
    private boolean clock, warlordsRedeemed, websiteSet, rewardConsumed;
    private String newClock;
    private long lastEugeneMessage, lastSurvey;
    //</editor-fold>

    public PlayerCommonStats(JsonObject json) {
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

            Logger.logWarn("[PlayerAPI.Common.initialize] Unknown value: " + key);
        }
    }

    private boolean setValue(String key, JsonElement value){
        switch(key) {
            //<editor-fold desc="[Values]">
            case "NETWORKLEVEL":
                this.networkLevel = value.getAsInt();
                return true;
            case "_ID":
                this._id = value.getAsString();
                return true;
            case "DISPLAYNAME":
                this.displayName = value.getAsString();
                return true;
            case "CLOCK":
                this.clock = value.getAsBoolean();
                return true;
            case "NEWCLOCK":
                this.newClock = value.getAsString();
                return true;
            case "FIRSTLOGIN":
                this.firstLogin = value.getAsLong();
                return true;
            case "KARMA":
                this.karma = value.getAsInt();
                return true;
            case "LASTLOGIN":
                this.lastlogin = value.getAsLong();
                return true;
            case "MAINLOBBYTUTORIAL":
                this.mainLobbyTutorialCompleted = value.getAsBoolean();
                return true;
            case "MOSTRECENTMINECRAFTVERSION":
                this.mostRecentMinecraftVersion = value.getAsInt();
                return true;
            case "MOSTRECENTLYTHANKED":
                this.mostRecentlyThankedName = value.getAsString();
                return true;
            case "MOSTRECENTLYTIPPED":
                this.mostRecentlyTippedName = value.getAsString();
                return true;
            case "MOSTRECENTLYTHANKEDUUID":
                this.mostRecentlyThankedUUID = parseUUID(value.getAsString());
                return true;
            case "MOSTRECENTLYTIPPEDUUID":
                this.mostRecentlyTippedUUID = parseUUID(value.getAsString());
                return true;
            case "NETWORKEXP":
                this.networkEXP = value.getAsInt();
                return true;
<<<<<<< Updated upstream
            case "PLAYERNAME":
                this.playerName = value.getAsString();
                return true;
            case "TESTPASS":
                this.testpass = value.getAsBoolean();
                return true;
            case "UUID":
                this.uuid = parseUUID(value.getAsString());
                return true;
            case "VANITYTOKENS":
                this.vanityTokens = value.getAsInt();
                return true;
            case "WARLORDSREDEEMED":
                this.warlordsRedeemed = value.getAsBoolean();
                return true;
            case "WEBSITESET":
                this.websiteSet = value.getAsBoolean();
                return true;
            case "THANKSSENT":
                this.thanksSent = value.getAsInt();
                return true;
            case "THANKSRECEIVED":
                this.thanksReceived = value.getAsInt();
                return true;
            case "LASTEUGENEMESSAGE":
                this.lastEugeneMessage = value.getAsLong();
                return true;
            case "LAST_SURVEY":
                this.lastSurvey = value.getAsLong();
                return true;
            case "SPEC_SPEED":
                this.specSpeed = value.getAsInt();
                return true;
            case "SANTA_FINISHED":
                this.finishedXmas2016SantaQuest = value.getAsBoolean();
                return true;
            case "SANTA_QUEST_STARTED":
                this.startedXmas2016SantaQuest = value.getAsBoolean();
                return true;
            case "PETJOURNEYTIMESTAMP":
                this.lastPetJourney = value.getAsInt();
                return true;
            case "SPEC_NIGHT_VISION":
                this.spectatorNightVision = value.getAsBoolean();
                return true;
            case "TIMEPLAYING":
                this.timePlaying = value.getAsInt();
                return true;
            case "NEWMAINTUTORIAL":
                this.newMainTutorial = value.getAsBoolean();
                return true;
            case "VANITYFIRSTCONVERTEDBOX":
                this.vanityFirstConvertedBox = value.getAsLong();
                return true;
            case "LEVELUP_MVP_PLUS":
                this.mvpPlusColorUnlocked = value.getAsLong();
                return true;
            case "SILENCE":
                this.silence = value.getAsBoolean();
                return true;
            case "MCVERSIONRP":
                this.mcVersionRP = value.getAsString();
                return true;
            case "REWARDCONSUMED":
                this.rewardConsumed = value.getAsBoolean();
                return true;
            case "LASTADSENSEGENERATETIME":
                this.lastAdsenseTime = value.getAsLong();
                return true;
            case "LASTCLAIMEDREWARD":
                this.lastClaimedReward = value.getAsLong();
                return true;
            case "TOTALREWARDS":
                this.totalRewards = value.getAsInt();
                return true;
            case "TOTALDAILYREWARDS":
                this.totalDailyRewards = value.getAsInt();
                return true;
            case "REWARDSTREAK":
                this.rewardStreak = value.getAsInt();
                return true;
            case "REWARDSCORE":
                this.rewardScore = value.getAsInt();
                return true;
            case "ADSENSE_TOKENS":
                this.adsenseTokens = value.getAsInt();
                return true;
            case "REWARDHIGHSCORE":
                this.rewardHighScore = value.getAsInt();
                return true;
            case "QUICKJOIN_TIMESTAMP":
                this.quickjoinTimestamp = value.getAsLong();
                return true;
            case "FLASHINGNEWSPOPPEDUP":
                this.flashingNewsPoppedUp = value.getAsInt();
                return true;
            case "QUICKJOIN_USES":
                this.quickJoinUses = value.getAsInt();
                return true;
            case "FLASHINGNEWSOPENS":
                this.flashingNewsOpens = value.getAsInt();
                return true;
            case "FLASHINGSALEPOPUP":
                this.flashingSalePopup = value.getAsLong();
                return true;
            case "FLASHINGSALEOPENS":
                this.flashingSaleOpens = value.getAsInt();
                return true;
            case "FLASHINGSALECLICKS":
                this.flashingSaleClicks = value.getAsInt();
                return true;
            case "SHOW_TIP_HOLOGRAMS":
                this.showTipHolograms = value.getAsBoolean();
                return true;
            case "SHOW_TNTRUN_ACTIONBAR_INFO":
                this.showTNTRunHolograms = value.getAsBoolean();
=======
            case "UUID":
                this.playerUUID = parseUUID(value.getAsString());
>>>>>>> Stashed changes
                return true;
            //</editor-fold>
        }
        return false;
    }

    private UUID parseUUID(String uuid){
        if(uuid.contains("-")){
            return UUID.fromString(uuid);
        }
        String newUUID = uuid.substring(0, 7) + "-" + uuid.substring(8, 11) + "-" + uuid.substring(12, 15) + "-" + uuid.substring(16, 19) + "-" + uuid.substring(20);
        return UUID.fromString(newUUID);
    }

    private boolean setSpecialValue(String key, JsonElement value){
        switch(key){
            case "ACHIEVEMENTS":
                //todo achievements
                return true;
            case "ACHIEVEMENTSONETIME":
                //todo
                return true;
            case "FRIENDREQUESTS":
                //// TODO: 09/03/2017
                return true;
            case "FRIENDREQUESTSUUID":
                //// TODO: 09/03/2017
                return true;
            case "KNOWNALIASES":
                // TODO: 09/03/2017
                return true;
            case "KNOWNALIASESLOWER":
                // TODO: 09/03/2017
                return true;
            case "PARKOURCOMPLETIONS":
                // TODO: 09/03/2017
                return true;
            case "QUESTS":
                // TODO: 09/03/2017
                return true;
            case "SETTINGS":
                // TODO: 14/03/2017
                return true;
            case "HOUSINGMETA":
                // TODO: 16/03/2017
                return true;
            case "VANITYMETA":
                // TODO: 16/03/2017
                return true;
            case "PETCONSUMABLES":
                // TODO: 16/03/2017
                return true;
            case "PETSTATS":
                getPetStats(value.getAsJsonObject());
                return true;
            case "SOCIALMEDIA":
                // TODO: 16/03/2017
                return true;
            case "SPECIALITYCOOLDOWNS":
                // TODO: 16/03/2017
                return true;
            case "GIFTINGMETA":
                // TODO: 16/03/2017
                return true;
            case "QUESTSETTINGS":
                // TODO: 16/03/2017
                return true;
            case "EUGENE":
                // TODO: 17/03/2017
                return true;
            case "VOTING":
                // TODO: 17/03/2017
                return true;
            case "FIREWORKSTORAGE": //outdated
                // TODO: 17/03/2017
                return true;
            case "SPECIALTYCOOLDOWNS":
                // TODO: 17/03/2017
                return true;
            case "FLASHINGNEWSPOPUP":
                // TODO: 20/03/2017
                return true;
            case "MOSTRECENTGAMETYPE":
                String game = value.getAsString().toUpperCase();
                if(Gamemode.mapping.contains(game)){
                    this.mostRecentGameType = Gamemode.valueOf(game);
                }else {
                    Logger.logWarn("[HypixelAPI.common.gameType] Unknown Gametype: " + value.getAsString());
                }
                return true;
            case "RANKPLUSCOLOR":
                String color = value.getAsString().toUpperCase();
                if(MVPPlusColor.PlusColor.mapping.contains(color)){
                    this.selectedPlusColor = new MVPPlusColor(MVPPlusColor.PlusColor.valueOf(color));
                }else {
                    Logger.logWarn("[HypixelAPI.common.RankPlusColor] Unknown PlusColor: " + value.getAsString());
                }
                return true;
            case "CURRENTCLOAK":
                String cloak = value.getAsString().toUpperCase();
                if(Cloak.mapping.contains(cloak)){
                    this.selectedCloak = Cloak.valueOf(cloak);
                }else {
                    Logger.logWarn("[HypixelAPI.common.cloak] Unknown Cloak: " + value.getAsString());
                }
                return true;
            case "USERLANGUAGE":
                String language = value.getAsString().toUpperCase();
                if(Language.mapping.contains(language)){
                    this.userLanguage = Language.valueOf(language);
                }else {
                    Logger.logWarn("[HypixelAPI.common.language] Unknown Language: " + value.getAsString());
                }
                return true;
            case "PARTICLEQUALITY":
                String particleQuality = value.getAsString().toUpperCase();
                if(ParticleQuality.mapping.contains(particleQuality)){
                    this.particleQuality = ParticleQuality.valueOf(particleQuality);
                }else{
                    Logger.logWarn("[HypixelAPI.common.particleQuality] Unknown Particle Quality: " + value.getAsString());
                }
                return true;
            case "STATS":
                //is taken care of in HypixelPlayer already
                return true;
            case "CHANNEL":
                String channel = value.getAsString().toUpperCase();
                if(Chat.mapping.contains(channel)){
                    this.selectedChannel = Chat.valueOf(channel);
                }else{
                    Logger.logWarn("[HypixelAPI.common.channel] Unknown CHANNEL: " + value.getAsString());
                }
                return true;
            case "NEWPACKAGERANK":
                String newpackagerank = value.getAsString().toUpperCase();
                if(Rank.mapping.contains(newpackagerank)){
                    this.newPackageRank = Rank.valueOf(newpackagerank);
                }else{
                    Logger.logWarn("[HypixelAPI.common.newPackageRank] Unknown Rank: " + value.getAsString());
                }
                return true;
            case "RANK":
                String rank = value.getAsString().toUpperCase();
                if(Rank.mapping.contains(rank)){
                    this.rank = Rank.valueOf(rank);
                }else{
                    Logger.logWarn("[HypixelAPI.common.rank] Unknown Rank: " + value.getAsString());
                }
                return true;
        }
        if(key.contains("LEVELINGREWARD_")){
            if(value.getAsBoolean()){
                int level = Integer.parseInt(key.replace("LEVELINGREWARD_", ""));
                this.claimedLevelRewards.add(level);
            }else{
                Logger.logWarn("[HypixelAPI.common.levelReward] FALSE value for reward? " + key);
            }
            return true;
        }
        if(key.contains("XMAS2016_")){
            String present = key.replace("XMAS2016_", "");
            if(value.getAsBoolean() && Xmas2016.mapping.contains(present)){
                this.foundXmas2016Presents.add(Xmas2016.valueOf(present));
            }else{
                Logger.logWarn("[HypixelAPI.common.xmas2016] Couldnt find xmas2016 value OR value was false: " + key);
            }
            return true;
        }
        if(key.contains("PRESENT_FIND_")){
            String present = key.replace("PRESENT_FIND_", "");
            if(value.getAsBoolean() && Xmas2015.mapping.contains(present)){
                this.foundXmas2015Presents.add(Xmas2015.valueOf(present));
            }else{
                Logger.logWarn("[HypixelAPI.common.xmas2015] Couldnt find xmas2015 value OR value was false: " + key);
            }
            return true;
        }
        if(key.contains("REWARD_FIND_")){
            String admin = key.replace("REWARD_FIND_", "");
            if(value.getAsBoolean() && AdminNPC.mapping.contains(admin)){
                this.foundAdminNPCs.add(AdminNPC.valueOf(admin));
            }else{
                Logger.logWarn("[HypixelAPI.common.adminNPC] Couldnt find NPC value OR value was false: " + key);
            }
            return true;
        }
        if(key.contains("DMCRATES-")){
            registerMysteryBoxPacket(key, value.getAsJsonObject());
            return true;
        }
        return false;
    }

<<<<<<< Updated upstream
    private void registerMysteryBoxPacket(String key, JsonObject object){
        // TODO: 17/03/2017
    }

    private void getPetStats(JsonObject json){
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {
            String key = e.getKey().toUpperCase();
            if(PetSpecies.mapping.contains(key)){
                PetSpecies species = PetSpecies.valueOf(key);
                int experience = -1;
                if(json.get(key).getAsJsonObject().get("experience") !=null && !json.get(key).getAsJsonObject().get("experience").isJsonNull()){
                     experience = json.get(key).getAsJsonObject().get("experience").getAsInt();
                }
                String customName = null;
                if(json.get(key).getAsJsonObject().get("name") !=null && !json.get(key).getAsJsonObject().get("name").isJsonNull()){
                    customName = json.get(key).getAsJsonObject().get("name").getAsString();
                }

                if(json.get(key).getAsJsonObject().get("THIRST") !=null && !json.get(key).getAsJsonObject().get("THIRST").isJsonNull()) {
                    JsonObject thirstObject = json.get(key).getAsJsonObject().get("THIRST").getAsJsonObject();

                    PetStat thirst = new PetStat(PetStat.petStatType.THIRST, thirstObject.get("timestamp").getAsLong(), thirstObject.get("value").getAsInt());
                    JsonObject hungerObject = json.get(key).getAsJsonObject().get("HUNGER").getAsJsonObject();
                    PetStat hunger = new PetStat(PetStat.petStatType.HUNGER, hungerObject.get("timestamp").getAsLong(), hungerObject.get("value").getAsInt());
                    JsonObject exerciseObject = json.get(key).getAsJsonObject().get("EXERCISE").getAsJsonObject();
                    PetStat exercise = new PetStat(PetStat.petStatType.EXERCISE, exerciseObject.get("timestamp").getAsLong(), exerciseObject.get("value").getAsInt());

                    this.petStats.add(new Pet(species, customName, experience, thirst, hunger, exercise));
                }else{
                    Logger.logWarn("[HypixelAPI.common.petStats] couldnt find thirst,hunger,exercise for pet: " + key);
                }
                continue;
            }else if(CompanionSpecies.mapping.contains(key)){
                CompanionSpecies species = CompanionSpecies.valueOf(key);
                String customName = null;
                if(json.get(key).getAsJsonObject().get("name") !=null && !json.get(key).getAsJsonObject().get("name").isJsonNull()){
                    customName = json.get(key).getAsJsonObject().get("name").getAsString();
                }
                this.companions.add(new Companion(species, customName));
                continue;
            }
            Logger.logWarn("[PlayerAPI.Common.PetStat] Unknown PET or COMPANION: " + key);
        }
    }

    public int getNetworkLevel(){
        return networkLevel;
    }

    public Rank getRank(){
        if(rank!=null) {
            return rank;
        }
        if(newPackageRank!=null){
            return newPackageRank;
        }
        //couldnt find any rank, lets return default
        return Rank.NONE;
=======
    public double getNetworkLevel(){
        return ILevel.getLevel(getNetworkLevelExperience() + ILevel.getTotalExpToLevel(getLastNetworkLevel())) + 1;
    }

    public int getLastNetworkLevel(){
        return networkLevel;
    }

    public RANK getRank(){
        return (rank!=null) ? rank : (newPackageRank!=null) ? newPackageRank : RANK.NONE;
>>>>>>> Stashed changes
    }

    public UUID getPlayerUUID(){ return playerUUID; }

    public Date getLastLoginDate() { return new Date(lastlogin); }

    public int getNetworkLevelExperience(){ return networkEXP; }
}
