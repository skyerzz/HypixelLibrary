package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.mojangapi.UUIDHandler;
import com.skyerzz.hypixellib.util.network.*;
import com.skyerzz.hypixellib.util.games.Gamemode;
import com.skyerzz.hypixellib.util.network.collectibles.ParticlePack;
import com.skyerzz.hypixellib.util.network.event.Xmas2015;
import com.skyerzz.hypixellib.util.network.event.Xmas2016;
import com.skyerzz.hypixellib.util.network.collectibles.Cloak;
import com.skyerzz.hypixellib.util.network.networklevel.MVPPlusColor;
import com.skyerzz.hypixellib.util.network.collectibles.pet.*;
import com.skyerzz.hypixellib.util.ILevel;
import com.skyerzz.hypixellib.util.network.parkour.Parkour;


import java.util.ArrayList;
import java.util.Date;
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

    /** Hypixel Credit Value */
    private int vanityTokens; //todo check if actual credit value

    private String _id, displayName, mostRecentlyThankedName, mostRecentlyTippedName, playerName, mcVersionRP;
    private UUID mostRecentlyThankedUUID, mostRecentlyTippedUUID, playerUUID;
    private int specSpeed, adsenseTokens, totalRewards, totalDailyRewards, rewardStreak, rewardScore, rewardHighScore;
    private long lastPetJourney, mvpPlusColorUnlocked, vanityFirstConvertedBox, lastAdsenseTime, lastClaimedReward, quickjoinTimestamp, flashingSalePopup;
    private int quickJoinUses, flashingNewsPoppedUp, flashingNewsOpens, flashingSaleOpens, flashingSaleClicks, flashingSalePoppedUp, fortuneBuff;

    private Chat selectedChannel;
    private Rank rank, newPackageRank;
    private UUID uuid;
    private ParticleQuality particleQuality;
    private Gamemode mostRecentGameType;
    private Language userLanguage;
    private Cloak selectedCloak;
    private MVPPlusColor selectedPlusColor;

    private long firstLogin, lastlogin, lastLogout; //todo make into date available through getter

    private boolean mainLobbyTutorialCompleted, spectatorNightVision, newMainTutorial, silence, showTipHolograms, showTNTRunHolograms, showTNTTagActionbarInfo, fly, combatTracker;

    private ArrayList<Integer> claimedLevelRewards = new ArrayList<>();
    private ArrayList<AdminNPC> foundAdminNPCs = new ArrayList<>();
    private ArrayList<Pet> petStats = new ArrayList<>();
    private ArrayList<Companion> companions = new ArrayList<>();
    private ArrayList<String> knownAliases = new ArrayList<>();

    //currentPet can be pet/companion
    private PetSpecies currentPet;
    private CompanionSpecies currentCompanion;

    private ParticlePack currentParticlePack;

    private NetworkSettings networkSettings;

    private Parkour parkour;

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

    @OutDated
    /** rank before eula (i think) */
    private Rank packageRank;

    @OutDated
    /** wardrobe function is long gone*/
    private String wardrobe;

    //todo find out what values mean
    private boolean clock, warlordsRedeemed, websiteSet, rewardConsumed;
    private String newClock;
    private long lastEugeneMessage, lastSurvey;
    private boolean eulaCoins;

    //UNKNOWN values (pancake doesnt know either):
    private boolean reverted, notifiedOfStuff;
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
            case "LASTLOGOUT":
                this.lastLogout = value.getAsLong();
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
                this.mostRecentlyThankedUUID = UUIDHandler.parseUUID(value.getAsString());
                return true;
            case "MOSTRECENTLYTIPPEDUUID":
                this.mostRecentlyTippedUUID = UUIDHandler.parseUUID(value.getAsString());
                return true;
            case "NETWORKEXP":
                this.networkEXP = value.getAsInt();
                return true;
            case "PLAYERNAME":
                this.playerName = value.getAsString();
                return true;
            case "TESTPASS":
                this.testpass = value.getAsBoolean();
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
                return true;
            case "UUID":
                this.playerUUID = UUIDHandler.parseUUID(value.getAsString());
                return true;
            case "EULACOINS":
                this.eulaCoins = value.getAsBoolean();
                return true;
            case "FLY":
                this.fly = value.getAsBoolean();
                return true;
            case "REVERTED":
                this.reverted = value.getAsBoolean();
                return true;
            case "NOTIFIEDOFSTUFF":
                this.notifiedOfStuff = value.getAsBoolean();
                return true;
            case "FLASHINGSALEPOPPEDUP":
                this.flashingSalePoppedUp = value.getAsInt();
                return true;
            case "COMBATTRACKER":
                this.combatTracker = value.getAsBoolean();
                return true;
            case "GIFTS_GRINCH":
                this.giftsGrinch = value.getAsInt();
                return true;
            case "WARDROBE":
                this.wardrobe = value.getAsString();
                return true;
            case "FORTUNEBUFF":
                this.fortuneBuff = value.getAsInt();
                return true;
            case "SHOW_TNTTAG_ACTIONBAR_INFO":
                this.showTNTTagActionbarInfo = value.getAsBoolean();
                return true;
            //</editor-fold>
        }
        return false;
    }

    private boolean setSpecialValue(String key, JsonElement value){
        switch(key){
            //<editor-fold desc="[Values]">
            case "ACHIEVEMENTS":
                //todo achievements
                return true;
            case "ACHIEVEMENTSONETIME":
                //todo
                return true;
            case "FRIENDREQUESTS":
                //// TODO: 09/03/2017 find out what this is
                return true;
            case "FRIENDREQUESTSUUID":
                //// TODO: 09/03/2017 find out what this is sent/recieve
                return true;
            case "KNOWNALIASES":
                setKnownAliases(value.getAsJsonArray());
                return true;
            case "KNOWNALIASESLOWER":
                //not using this one, function to get the aliases in lowercase isnt needed.
                return true;
            case "PARKOURCOMPLETIONS":
                this.parkour = new Parkour(value.getAsJsonObject());
                return true;
            case "QUESTS":
                // TODO: 09/03/2017
                return true;
            case "SETTINGS":
                this.networkSettings = new NetworkSettings(value.getAsJsonObject());
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
            case "GADGET":
                //// TODO: 13-6-2017
                return true;
            case "TRANSFORMATION":
                // TODO: 13-6-2017
                return true;
            case "BOOSTERCOOLDOWNS":
                // TODO: 13-6-2017
                return true;
            case "HALLOWEEN2016COOLDOWNS":
                // TODO: 13-6-2017
                return true;
            case "HOLIDAY2016COOLDOWNS":
                // TODO: 13-6-2017
                return true;
            case "LANGUAGE":
                // TODO: 13-6-2017
                return true;
            case "SURVEY":
                // TODO: 13-6-2017
                return true;
            case "COMPASSSTATS":
                // TODO: 13-6-2017
                return true;
            case "CURRENTHAT":
                // TODO: 13-6-2017
                return true;
            case "CHALLENGES":
                // TODO: 13-6-2017
                return true;
            case "PARTICLEPACK":
            case "PP": //blame Smoarzified for having this string instead of ParticlePack
                String currentPack = value.getAsString().toUpperCase();
                if(ParticlePack.mapping.contains(currentPack)){
                    this.currentParticlePack = ParticlePack.valueOf(currentPack);
                }else{
                    Logger.logWarn("[HypixelAPI.common.currentParticlePack] Unknown ParticlePack: " + value.getAsString());
                }
                return true;
            case "SUMMER2017COOLDOWNS":
                // TODO: 13-6-2017
                return true;
            case "CURRENTPET":
                String currentPet = value.getAsString().toUpperCase();
                if(PetSpecies.mapping.contains(currentPet)){
                    this.currentPet = PetSpecies.valueOf(currentPet);
                }else if(CompanionSpecies.mapping.contains(currentPet)){
                    this.currentCompanion = CompanionSpecies.valueOf(currentPet);
                }else{
                    Logger.logWarn("[HypixelAPI.common.currentPet] Unknown pet/companion: " + value.getAsString());
                }
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
            case "PACKAGERANK":
                String packageRank = value.getAsString().toUpperCase();
                if(Rank.mapping.contains(packageRank)){
                    this.packageRank = Rank.valueOf(packageRank);
                }else{
                    Logger.logWarn("[HypixelAPI.common.PackageRank] Unknown Rank: " + value.getAsString());
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
            //</editor-fold>
        }
        //<editor-fold desc="[IfStatements]">
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
        //</editor-fold>
        return false;
    }

    private void registerMysteryBoxPacket(String key, JsonObject object){
        // TODO: 17/03/2017
    }

    private void setKnownAliases(JsonArray array){
        if(array.isJsonNull() || array ==null){
            return;
        }
        for(JsonElement element: array){
            this.knownAliases.add(element.getAsString());
        }
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

                if( json.get(key).getAsJsonObject().get("THIRST") !=null && !json.get(key).getAsJsonObject().get("THIRST").isJsonNull() &&
                    json.get(key).getAsJsonObject().get("HUNGER") !=null && !json.get(key).getAsJsonObject().get("HUNGER").isJsonNull() &&
                    json.get(key).getAsJsonObject().get("EXERCISE") !=null && !json.get(key).getAsJsonObject().get("EXERCISE").isJsonNull()) {
                    JsonObject thirstObject = json.get(key).getAsJsonObject().get("THIRST").getAsJsonObject();

                    PetStat thirst = new PetStat(PetStat.petStatType.THIRST, thirstObject.get("timestamp").getAsLong(), thirstObject.get("value").getAsInt());
                    JsonObject hungerObject = json.get(key).getAsJsonObject().get("HUNGER").getAsJsonObject();
                    PetStat hunger = new PetStat(PetStat.petStatType.HUNGER, hungerObject.get("timestamp").getAsLong(), hungerObject.get("value").getAsInt());
                    JsonObject exerciseObject = json.get(key).getAsJsonObject().get("EXERCISE").getAsJsonObject();
                    PetStat exercise = new PetStat(PetStat.petStatType.EXERCISE, exerciseObject.get("timestamp").getAsLong(), exerciseObject.get("value").getAsInt());

                    this.petStats.add(new Pet(species, customName, experience, thirst, hunger, exercise));
                }else{
                    //disabled debug
                    //Logger.logWarn("[HypixelAPI.common.petStats] couldnt find thirst,hunger,exercise for pet: " + key);
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

    public double getNetworkLevel(){
        return ILevel.getExactLevel(getNetworkLevelExperience() + ILevel.getTotalExpToLevel(getLastNetworkLevel())) + 1;
    }

    public int getLastNetworkLevel(){
        return networkLevel;
    }

    public Rank getRank(){
        return (rank!=null) ? rank : (newPackageRank!=null) ? newPackageRank : Rank.NONE;
    }

    public UUID getPlayerUUID(){ return playerUUID; }

    public Date getLastLoginDate() { return new Date(lastlogin); }

    public int getNetworkLevelExperience(){ return networkEXP; }
}
