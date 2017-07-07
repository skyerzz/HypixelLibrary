package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.mojangapi.UUIDHandler;
import com.skyerzz.hypixellib.util.network.*;
import com.skyerzz.hypixellib.util.games.Gamemode;
import com.skyerzz.hypixellib.util.network.collectibles.*;
import com.skyerzz.hypixellib.util.network.collectibles.gadget.Gadget;
import com.skyerzz.hypixellib.util.network.collectibles.hat.AnimatedHat;
import com.skyerzz.hypixellib.util.network.collectibles.hat.Hat;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.BoxGiveaway;
import com.skyerzz.hypixellib.util.network.collectibles.suit.Suit;
import com.skyerzz.hypixellib.util.network.collectibles.suit.SuitPart;
import com.skyerzz.hypixellib.util.network.collectibles.suit.SuitType;
import com.skyerzz.hypixellib.util.network.event.Xmas2015;
import com.skyerzz.hypixellib.util.network.event.Xmas2016;
import com.skyerzz.hypixellib.util.network.networklevel.MVPPlusColor;
import com.skyerzz.hypixellib.util.network.collectibles.pet.*;
import com.skyerzz.hypixellib.util.network.ILevel;
import com.skyerzz.hypixellib.util.network.parkour.Parkour;


import java.util.*;

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
    private int specSpeed, adsenseTokens, totalRewards, totalDailyRewards, rewardStreak, rewardScore, rewardHighScore, vanityConvertedBoxToday, vanityCraftedBoxToday;
    private long lastPetJourney, vanityFirstConvertedBox,vanityFirstCraftedBox, lastAdsenseTime, lastClaimedReward, quickjoinTimestamp, flashingSalePopup;
    private int quickJoinUses, flashingNewsPoppedUp, flashingNewsOpens, flashingSaleOpens, flashingSaleClicks, flashingSalePoppedUp, fortuneBuff;

    private String prefix;
    private Chat selectedChannel;
    private Rank rank, newPackageRank;
    private UUID uuid;
    private ParticleQuality particleQuality;
    private Gamemode mostRecentGameType;
    private Language userLanguage;
    private Cloak selectedCloak;
    private MVPPlusColor selectedPlusColor;
    private Gadget selectedGadget;
    private Emote selectedEmote;

    private long firstLogin, lastlogin, lastLogout; //todo make into date available through getter

    private boolean mainLobbyTutorialCompleted, spectatorNightVision, newMainTutorial, silence, showTipHolograms, showTNTRunHolograms, showTNTTagActionbarInfo, fly, combatTracker, autoSpawnPet, beamLink;
    private boolean showWizardsActionbarInfo, showWizardsCooldownNotifications, autoDetectLanguage;

    private ArrayList<Integer> claimedLevelRewards = new ArrayList<>();
    private ArrayList<AdminNPC> foundAdminNPCs = new ArrayList<>();
    private ArrayList<Pet> petStats = new ArrayList<>();
    private ArrayList<Companion> companions = new ArrayList<>();
    private ArrayList<String> knownAliases = new ArrayList<>();
    private ArrayList<Hat> unlockedHats = new ArrayList<>();
    private ArrayList<AnimatedHat> unlockedAnimatedHats = new ArrayList<>();
    private ArrayList<PetSpecies> unlockedPets = new ArrayList<>();
    private ArrayList<CompanionSpecies> unlockedCompanions = new ArrayList<>();
    private ArrayList<Morph> unlockedMorphs = new ArrayList<>();
    private ArrayList<Cloak> unlockedCloaks = new ArrayList<>();
    private ArrayList<MVPPlusColor.PlusColor> unlockedMVPPlusColors = new ArrayList<>();
    private ArrayList<Gesture> unlockedGestures = new ArrayList<>();
    private ArrayList<Emote> unlockedEmotes = new ArrayList<>();
    private HashMap<PetConsumable, Integer> petConsumables = new HashMap<>();
    private ArrayList<Gadget> unlockedGadgets = new ArrayList<>();
    private ArrayList<Suit> unlockedSuits = new ArrayList<>();
    private ArrayList<Banner> unlockedBanners = new ArrayList<>();
    private ArrayList<BoxGiveaway> boxGiveaways = new ArrayList<>();

    /**shows join/leave notifications of guild*/
    private boolean guildNotifications;

    /**if pet is out and about or disabled*/
    private boolean petActive;

    /**THIS IS NOT THAT spectators are(n't) visible as ghosts when you die, gotta ask plancke. todo ask plancke*/
    private boolean spectatorsInvisible;

    /**Spectator Stats, Assumingly.*/
    private boolean specSpectatorsInvisible, specAlwaysFlying;

    /**See /guild join invites? todo figure this out.*/
    private boolean seeRequests;

    //todo figure out what this is
    private boolean notifications;

    /**translation notifications*/
    private boolean translationMessageFirstLogin, translationMessageFirstLoginDutch, translationMessageFirstLoginEnglish, translationMessageFirstLoginGerman, translationMessageFirstLoginFrench;

    /**Spectator settings*/

    /**the network update book version*/
    private String networkUpdateBookVersion;

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

    @OutDated
    /** back when tournaments actually existed*/
    private int tournamentTokens;

    //todo find out what values mean
    private boolean clock, warlordsRedeemed, websiteSet, rewardConsumed;
    private String newClock;
    private long lastEugeneMessage, lastSurvey;
    private boolean eulaCoins;
    private boolean chat; //togglechat on/off? even though chatVisibility should take care of that
    private String disguise; //assuming horsemask, legacy.
    private boolean punchBypassFreq,punchBypassStaffOnly, adventureTester, friendInvisible, punchDisabled; //assuming all legacy, plancke's stats.

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
            case "PREFIX":
                this.prefix = value.getAsString();
                return true;
            case "AUTODETECTLANGUAGE":
                this.autoDetectLanguage = value.getAsBoolean();
                return true;
            case "PUNCHBYPASSFREQ":
                this.punchBypassFreq = value.getAsBoolean();
                return true;
            case "PUNCHBYPASSSTAFFONLY":
                this.punchBypassStaffOnly = value.getAsBoolean();
                return true;
            case "ADVENTURETESTER":
                this.adventureTester = value.getAsBoolean();
                return true;
            case "FRIENDINVISIBLE":
                this.friendInvisible = value.getAsBoolean();
                return true;
            case "PUNCHDISABLED":
                this.punchDisabled = value.getAsBoolean();
                return true;
            case "AUTO_SPAWN_PET":
                this.autoSpawnPet = value.getAsBoolean();
                return true;
            case "VANITYCONVERTEDBOXTODAY":
                this.vanityConvertedBoxToday = value.getAsInt();
                return true;
            case "VANITYCRAFTEDBOXTODAY":
                this.vanityCraftedBoxToday = value.getAsInt();
                return true;
            case "VANITYFIRSTCRAFTEDBOX":
                this.vanityFirstCraftedBox = value.getAsLong();
                return true;
            case "TRANSLATIONMSGFIRSTLOGIN":
                this.translationMessageFirstLogin = value.getAsBoolean();
                return true;
            case "TRANSLATIONMSGFIRSTLOGINDUTCH":
                this.translationMessageFirstLoginDutch = value.getAsBoolean();
                return true;
            case "TRANSLATIONMSGFIRSTLOGINENGLISH":
                this.translationMessageFirstLoginEnglish = value.getAsBoolean();
                return true;
            case "TRANSLATIONMSGFIRSTLOGINGERMAN":
                this.translationMessageFirstLoginGerman = value.getAsBoolean();
                return true;
            case "TRANSLATIONMSGFIRSTLOGINFRENCH":
                this.translationMessageFirstLoginFrench = value.getAsBoolean();
                return true;
            case "BEAMLINK":
                this.beamLink = value.getAsBoolean();
                return true;
            case "NOTIFICATIONS":
                this.notifications = value.getAsBoolean();
                return true;
            case "PETACTIVE":
                this.petActive = value.getAsBoolean();
                return true;
            case "SPECTATORS_INVISIBLE": //todo is lagacy?
                this.spectatorsInvisible = value.getAsBoolean();
                return true;
            case "TOURNAMENTTOKENS":
                this.tournamentTokens = value.getAsInt();
                return true;
            case "SEEREQUESTS":
                this.seeRequests = value.getAsBoolean();
                return true;
            case "GUILDNOTIFICATIONS":
                this.guildNotifications = value.getAsBoolean();
                return true;
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
            case "SPEC_SPECTATORS_INVISIBLE":
                this.specSpectatorsInvisible = value.getAsBoolean();
                return true;
            case "SPEC_ALWAYS_FLYING":
                this.specAlwaysFlying = value.getAsBoolean();
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
            case "SHOW_WIZARDS_ACTIONBAR_INFO":
                this.showWizardsActionbarInfo = value.getAsBoolean();
                return true;
            case "SHOW_WIZARDS_COOLDOWN_NOTIFICATIONS":
                this.showWizardsCooldownNotifications = value.getAsBoolean();
                return true;
            case "NETWORK_UPDATE_BOOK":
                this.networkUpdateBookVersion = value.getAsString();
                return true;
            case "CHAT":
                this.chat = value.getAsBoolean();
                return true;
            case "DISGUISE":
                this.disguise = value.getAsString();
                return true;
            //</editor-fold>

            //values that are not important for anyone!
            case "PLOTRESETS": //probably legacy for housing plot resets. only certain staff has this value
            case "SENDCERBERUSMESSAGES":
            case "DISABLESENDALL":
            case "BUILDTEAM":
                //you dont need to know what these mean ;)
            case "TODO":
            case "PETUPDATE":
                //blame plancke for having this value. no idea what it does. probably dated late 2015
            case "ELITE":
                //elite team? assuming legacy.
            case "LEVELUP_VIP":
            case "LEVELUP_VIP_PLUS":
            case "LEVELUP_MVP":
            case "LEVELUP_MVP_PLUS":
                //unknown, probably legacy.
                Logger.logSkippedValue("[PlayerAPI.Common.initialize] " + key);
                return true;

            //these values are for gamemodes, and not used in this section. idk why they are even here in the API.
            case "NORMAL_ECONOMIST":
            case "INSANE_LOW_GRAVITY":
            case "NORMAL_NO_MERCY":
            case "INSANE_TANK":
            case "NORMAL_SWIMMING_CHAMPION":
            case "NORMAL_LOW_GRAVITY":
            case "NORMAL_NOURISHMENT":
            case "INSANE_NO_MERCY":
            case "NORMAL_MONSTER_TAMER":
            case "INSANE_SWIMMING_CHAMPION":
            case "INSANE_KNOWLEDGE":
            case "NORMAL_MEDICINE":
            case "NORMAL_MASTER_BREWER":
            case "NORMAL_COLD_BLOOD":
            case "INSANE_NOTORIETY":
            case "NORMAL_BOW_FLEX":
            case "NORMAL_ARROW_RECOVERY":
            case "INSANE_BOW_FLEX":
                //speedUHC?
            case "COINS":
                //no idea.
            case "REDISBACKUP1":
            case "REDISBACKUP":
                //blame codename.
                Logger.logSkippedValue("[PlayerAPI.Common.initialize] " + key);
                return true;
            case "HYPIXEL_TUTORIAL_TUTORIAL": //legacy tutorial value.
            case "MAINTUT2": //legacy tutorial value.
            case "MAINTUT1": //legacy tutorial value.
            case "DISABLETIPMESSAGES": //most likely a slipped warlords value.
            case "VOTESMISSED": //no idea. something with the website voting system i think? probably legacy, only in Hypixel's stats.
            case "GADGET": //replaced by CurrentGadget i believe.
            case "CUSTOMFILTER": //blame crypt for having a great custom filter
            case "CHATALERTS": //replaced by NetworkSetting.chatAlerts
            case "GORE": //replaced by NetworkSetting.Bloodvisibility
            case "PLAYERVISIBILITY": //replaced by NetworkSetting.playervisibility
            case "NETWORKEXPNEW": //Agent incremented the wrong field, causing this value. has ZERO use. #blameAgent
                //note these are legacy, skip!
                Logger.logSkippedValue("[PlayerAPI.Common.initialize] " + key);
                return true;
        }
        if(key.contains("TOURNAMENTREWARD_")){
            Logger.logSkippedValue("[PlayerAPI.Common.initialize] " + key);
            return true;
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
            case "BOXGIVEAWAYS":
                setBoxGiveaways(value.getAsJsonObject());
                return true;
            case "VANITYFAVORITES":
                //// TODO: 5-7-2017
                return true;
            case "OUTFIT":
                //todo check if this actually is used? 5-7-17
                return true;
            case "FRIENDREQUESTS":
            case "FRIENDREQUESTSUUID":
            case "FRIENDBLOCKSUUID":
                //note these are legacy according to plancke
            case "MULTITUNNEL":
                //note: staff thing, not sure if its meant to be in API. doesnt seem to work anyways.
                Logger.logSkippedValue("[PlayerAPI.Common.initialize] " + key);
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
            case "CURRENTEMOTE":
                this.selectedEmote = Emote.getFromString(value.getAsString());
                return true;
            case "SETTINGS":
                this.networkSettings = new NetworkSettings(value.getAsJsonObject());
                return true;
            case "HOUSINGMETA":
                // TODO: 16/03/2017
                return true;
            case "VANITYMETA":
                setVanityMeta(value.getAsJsonObject().get("packages").getAsJsonArray());
                return true;
            case "PETCONSUMABLES":
                setPetConsumables(value.getAsJsonObject());
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
            case "CURRENTGADGET":
                this.selectedGadget = Gadget.getFromString(value.getAsString());
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
                this.currentParticlePack = ParticlePack.getFromString(value.getAsString());
                if(this.currentParticlePack==null){
                    Logger.logWarn("[HypixelAPI.common.currentParticlePack] Unknown ParticlePack: " + value.getAsString());
                }
                return true;
            case "SUMMER2017COOLDOWNS":
                // TODO: 13-6-2017
                return true;
            case "CURRENTPET":
                this.currentPet = PetSpecies.getFromString(value.getAsString());
                this.currentCompanion = CompanionSpecies.getFromString(value.getAsString());
                if(currentCompanion == null && currentPet ==null){
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

            //legacy
            case "QUEST":
                //note: legacy for questSettings?
                return true;
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
            if(key.contains("_2016")){ //idk how these got here, blame Megalation & deprecatedNether.
                return true;
            }
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

    private void setBoxGiveaways(JsonObject json){
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase();
            BoxGiveaway boxGiveaway = BoxGiveaway.getFromString(key);
            if(boxGiveaway!=null){
                this.boxGiveaways.add(boxGiveaway);
                continue;
            }

            Logger.logWarn("[PlayerAPI.Common.BoxGiveaway] Unknown box giveaway: " + key);
        }
    }

    private void setPetConsumables(JsonObject json){
        for (Map.Entry<String, JsonElement> e : json.entrySet()) {

            String key = e.getKey().toUpperCase();
            PetConsumable consumable = PetConsumable.getFromString(key);
            if(consumable!=null){
                this.petConsumables.put(consumable, e.getValue().getAsInt());
                continue;
            }

            Logger.logWarn("[PlayerAPI.Common.PetConsumable] Unknown pet consumable: " + key);
        }
    }

    private void setVanityMeta(JsonArray array){
        ArrayList<SuitPart> suitParts = new ArrayList<>();
        for(JsonElement e: array){
            String temp = e.getAsString();


            //some legacy values/values that arent used.
            switch(temp.toUpperCase()){
                case "CLOAK_8.0": //only hypixel has the cloak values.
                case "CLOAK_7.0":
                case "CLOAK_3.0":
                case "CLOAK_1.0":
                case "PET_POWERED_CREEPER": //changed to "creeper_powered"
                case "DISGUISE_IRON_GOLEM"://todo check if actually legacy.
                case "TRANSFORMATION_BLAZE": // see below
                case "TRANSFORMATION_PIG"://only hypixel seems to have these 2.
                    //only hypixel has these
                    Logger.logSkippedValue("[HypixelAPI.Common.Vanity] Skipping Legacy value: " + temp);
                    continue;
            }

            Hat hat = Hat.getFromString(temp);
            if(hat!=null){
                this.unlockedHats.add(hat);
                continue;
            }
            AnimatedHat animatedHat = AnimatedHat.getFromString(temp);
            if(animatedHat!=null){
                this.unlockedAnimatedHats.add(animatedHat);
                continue;
            }
            PetSpecies pet = PetSpecies.getFromString(temp);
            if(pet!=null){
                this.unlockedPets.add(pet);
                continue;
            }
            CompanionSpecies companion = CompanionSpecies.getFromString(temp);
            if(companion!=null){
                this.unlockedCompanions.add(companion);
                continue;
            }
            Morph morph = Morph.getFromString(temp);
            if(morph!=null){
                this.unlockedMorphs.add(morph);
                continue;
            }
            Cloak cloak = Cloak.getFromString(temp);
            if(cloak!=null){
                this.unlockedCloaks.add(cloak);
                continue;
            }
            MVPPlusColor.PlusColor color = MVPPlusColor.PlusColor.getFromString(temp);
            if(color!=null){
                this.unlockedMVPPlusColors.add(color);
                continue;
            }
            Gesture gesture = Gesture.getFromString(temp);
            if(gesture!=null){
                this.unlockedGestures.add(gesture);
                continue;
            }
            Emote emote = Emote.getFromString(temp);
            if(emote!=null){
                this.unlockedEmotes.add(emote);
                continue;
            }
            Gadget gadget = Gadget.getFromString(temp);
            if(gadget!=null){
                //todo inlude rank-gadgets in gadgets arraylist.
                this.unlockedGadgets.add(gadget);
                continue;
            }
            SuitPart suitPart = SuitPart.getFromString(temp);
            if(suitPart!=null){
                suitParts.add(suitPart);
                continue;
            }
            Banner banner = Banner.getFromString(temp);
            if(banner!=null){
                this.unlockedBanners.add(banner);
                continue;
            }

            Logger.logWarn("[HypixelAPI.common.Vanity] No valid value found: " + temp);
        }
        setSuits(suitParts);
    }

    private void setSuits(ArrayList<SuitPart> suitParts){
        ArrayList<SuitPart> suit = new ArrayList<>();
        ArrayList<SuitPart> toRemove = new ArrayList<>();
        while(!suitParts.isEmpty()){
            suit.clear();
            toRemove.clear();
            SuitPart part = suitParts.remove(0);
            SuitType type = part.getSuitType();
            suit.add(part);
            for(SuitPart parts: suitParts){
                if(parts.getSuitType() == type){
                    suit.add(parts);
                    toRemove.add(parts);
                }
            }
            for(SuitPart p: toRemove){
                suit.remove(p);
            }
            Suit s = new Suit(type, suit.toArray(new SuitPart[suit.size()]));
            this.unlockedSuits.add(s);
        }
        //todo this
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
            switch(key){
                case "HORSE_BROWN_BABY"://legacy, replaced by BROWN_HORSE_BABY
                    Logger.logSkippedValue("[HypixelAPI.Common.PetStat] Skipping Legacy value: " + key);
                    continue;
            }
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

    public ArrayList<ParticlePack> getUnlockedParticlePacks(){
        return packageRank==Rank.MVP_PLUS||newPackageRank==Rank.MVP_PLUS ? new ArrayList<ParticlePack>(Arrays.asList(ParticlePack.values())) : null;
    }

    public int getKarma() {
        return karma;
    }

    public int getNetworkEXP() {
        return networkEXP;
    }

    public int getThanksSent() {
        return thanksSent;
    }

    public int getThanksReceived() {
        return thanksReceived;
    }

    public int getMostRecentMinecraftVersion() {
        return mostRecentMinecraftVersion;
    }

    public int getVanityTokens() {
        return vanityTokens;
    }

    public String get_id() {
        return _id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getMostRecentlyThankedName() {
        return mostRecentlyThankedName;
    }

    public String getMostRecentlyTippedName() {
        return mostRecentlyTippedName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getMcVersionRP() {
        return mcVersionRP;
    }

    public UUID getMostRecentlyThankedUUID() {
        return mostRecentlyThankedUUID;
    }

    public UUID getMostRecentlyTippedUUID() {
        return mostRecentlyTippedUUID;
    }

    public int getSpecSpeed() {
        return specSpeed;
    }

    public int getAdsenseTokens() {
        return adsenseTokens;
    }

    public int getTotalRewards() {
        return totalRewards;
    }

    public int getTotalDailyRewards() {
        return totalDailyRewards;
    }

    public int getRewardStreak() {
        return rewardStreak;
    }

    public int getRewardScore() {
        return rewardScore;
    }

    public int getRewardHighScore() {
        return rewardHighScore;
    }

    public long getLastPetJourney() {
        return lastPetJourney;
    }

    public long getVanityFirstConvertedBox() {
        return vanityFirstConvertedBox;
    }

    public long getLastAdsenseTime() {
        return lastAdsenseTime;
    }

    public long getLastClaimedReward() {
        return lastClaimedReward;
    }

    public long getQuickjoinTimestamp() {
        return quickjoinTimestamp;
    }

    public long getFlashingSalePopup() {
        return flashingSalePopup;
    }

    public int getQuickJoinUses() {
        return quickJoinUses;
    }

    public int getFlashingNewsPoppedUp() {
        return flashingNewsPoppedUp;
    }

    public int getFlashingNewsOpens() {
        return flashingNewsOpens;
    }

    public int getFlashingSaleOpens() {
        return flashingSaleOpens;
    }

    public int getFlashingSaleClicks() {
        return flashingSaleClicks;
    }

    public int getFlashingSalePoppedUp() {
        return flashingSalePoppedUp;
    }

    public int getFortuneBuff() {
        return fortuneBuff;
    }

    public Chat getSelectedChannel() {
        return selectedChannel;
    }

    public Rank getNewPackageRank() {
        return newPackageRank;
    }

    public UUID getUuid() {
        return uuid;
    }

    public ParticleQuality getParticleQuality() {
        return particleQuality;
    }

    public Gamemode getMostRecentGameType() {
        return mostRecentGameType;
    }

    public Language getUserLanguage() {
        return userLanguage;
    }

    public Cloak getSelectedCloak() {
        return selectedCloak;
    }

    public MVPPlusColor getSelectedPlusColor() {
        return selectedPlusColor;
    }

    public long getFirstLogin() {
        return firstLogin;
    }

    public long getLastlogin() {
        return lastlogin;
    }

    public long getLastLogout() {
        return lastLogout;
    }

    public boolean isMainLobbyTutorialCompleted() {
        return mainLobbyTutorialCompleted;
    }

    public boolean isSpectatorNightVision() {
        return spectatorNightVision;
    }

    public boolean isNewMainTutorial() {
        return newMainTutorial;
    }

    public boolean isSilence() {
        return silence;
    }

    public boolean isShowTipHolograms() {
        return showTipHolograms;
    }

    public boolean isShowTNTRunHolograms() {
        return showTNTRunHolograms;
    }

    public boolean isShowTNTTagActionbarInfo() {
        return showTNTTagActionbarInfo;
    }

    public boolean isFly() {
        return fly;
    }

    public boolean isCombatTracker() {
        return combatTracker;
    }

    public ArrayList<Integer> getClaimedLevelRewards() {
        return claimedLevelRewards;
    }

    public ArrayList<AdminNPC> getFoundAdminNPCs() {
        return foundAdminNPCs;
    }

    public ArrayList<Pet> getPetStats() {
        return petStats;
    }

    public ArrayList<Companion> getCompanions() {
        return companions;
    }

    public ArrayList<String> getKnownAliases() {
        return knownAliases;
    }

    public ArrayList<Hat> getUnlockedHats() {
        return unlockedHats;
    }

    public ArrayList<AnimatedHat> getUnlockedAnimatedHats() {
        return unlockedAnimatedHats;
    }

    public ArrayList<PetSpecies> getUnlockedPets() {
        return unlockedPets;
    }

    public ArrayList<CompanionSpecies> getUnlockedCompanions() {
        return unlockedCompanions;
    }

    public ArrayList<Morph> getUnlockedMorphs() {
        return unlockedMorphs;
    }

    public ArrayList<Cloak> getUnlockedCloaks() {
        return unlockedCloaks;
    }

    public ArrayList<MVPPlusColor.PlusColor> getUnlockedMVPPlusColors() {
        return unlockedMVPPlusColors;
    }

    public ArrayList<Gesture> getUnlockedGestures() {
        return unlockedGestures;
    }

    public ArrayList<Emote> getUnlockedEmotes() {
        return unlockedEmotes;
    }

    public HashMap<PetConsumable, Integer> getPetConsumables() {
        return petConsumables;
    }

    public ArrayList<Gadget> getUnlockedGadgets() {
        return unlockedGadgets;
    }

    public ArrayList<Suit> getUnlockedSuits() {
        return unlockedSuits;
    }

    public PetSpecies getCurrentPet() {
        return currentPet;
    }

    public CompanionSpecies getCurrentCompanion() {
        return currentCompanion;
    }

    public ParticlePack getCurrentParticlePack() {
        return currentParticlePack;
    }

    public NetworkSettings getNetworkSettings() {
        return networkSettings;
    }

    public Parkour getParkour() {
        return parkour;
    }

    public ArrayList<Xmas2016> getFoundXmas2016Presents() {
        return foundXmas2016Presents;
    }

    public ArrayList<Xmas2015> getFoundXmas2015Presents() {
        return foundXmas2015Presents;
    }

    public boolean isFinishedXmas2016SantaQuest() {
        return finishedXmas2016SantaQuest;
    }

    public boolean isStartedXmas2016SantaQuest() {
        return startedXmas2016SantaQuest;
    }

    public boolean isTestpass() {
        return testpass;
    }

    public int getTimePlaying() {
        return timePlaying;
    }

    public int getGiftsGrinch() {
        return giftsGrinch;
    }

    public Rank getPackageRank() {
        return packageRank;
    }

    public String getWardrobe() {
        return wardrobe;
    }

    public boolean isClock() {
        return clock;
    }

    public boolean isWarlordsRedeemed() {
        return warlordsRedeemed;
    }

    public boolean isWebsiteSet() {
        return websiteSet;
    }

    public boolean isRewardConsumed() {
        return rewardConsumed;
    }

    public String getNewClock() {
        return newClock;
    }

    public long getLastEugeneMessage() {
        return lastEugeneMessage;
    }

    public long getLastSurvey() {
        return lastSurvey;
    }

    public boolean isEulaCoins() {
        return eulaCoins;
    }

    public boolean isReverted() {
        return reverted;
    }

    public boolean isNotifiedOfStuff() {
        return notifiedOfStuff;
    }

    public ArrayList<Banner> getUnlockedBanners(){ return unlockedBanners;}
}
