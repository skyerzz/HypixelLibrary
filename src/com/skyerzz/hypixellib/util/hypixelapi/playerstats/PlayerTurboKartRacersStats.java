package com.skyerzz.hypixellib.util.hypixelapi.playerstats;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.skyerzz.hypixellib.util.games.turbokartracers.*;
import com.skyerzz.hypixellib.Logger;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by sky on 31-7-2016.
 */
public class PlayerTurboKartRacersStats extends PlayerGameStats {

    //<editor-fold desc="[Variables]">
    private int coins;
    private int wins;

    private int boxPickups;
    private int coinPickups;

    private int bananaHitsSent;
    private int bananaHitsReceived;
    private int blueTorpedoHits;

    private int lapsCompleted;
    private int goldTrophies;
    private int silverTrophies;
    private int bronzeTrophies;

    private int goldTrophiesWeekly_b, goldTrophiesWeekly_a;
    private int goldTrophiesMonthly_b, goldTrophiesMonthly_a;
    private int goldTrophiesOlympus, goldTrophiesJungleRush, goldTrophiesHypixelGP, goldTrophiesRetro, goldTrophiesCanyon;

    private int silverTrophiesWeekly_b, silverTrophiesWeekly_a;
    private int silverTrophiesMonthly_b, silverTrophiesMonthly_a;
    private int silverTrophiesOlympus, silverTrophiesJungleRush, silverTrophiesHypixelGP, silverTrophiesRetro, silverTrophiesCanyon;

    private int bronzeTrophiesWeekly_b, bronzeTrophiesWeekly_a;
    private int bronzeTrophiesMonthly_b, bronzeTrophiesMonthly_a;
    private int bronzeTrophiesOlympus, bronzeTrophiesJungleRush, bronzeTrophiesHypixelGP, bronzeTrophiesRetro, bronzeTrophiesCanyon;
    
    private int boxPickupsWeekly_b, boxPickupsWeekly_a;
    private int boxPickupsMonthly_b, boxPickupsMonthly_a;
    private int boxPickupsOlympus, boxPickupsJungleRush, boxPickupsHypixelGP, boxPickupsRetro, boxPickupsCanyon;

    private int olympusPlays, junglerushPlays, hypixelGPPlays, retroPlays, canyonPlays;

    private ArrayList<HELMET> unlockedHelmets = new ArrayList<>();
    private ArrayList<KARTSKIN> unlockedKartSkins = new ArrayList<>();
    private ArrayList<PANTS> unlockedPants = new ArrayList<>();
    private ArrayList<JACKET> unlockedJackets = new ArrayList<>();
    private ArrayList<SHOES> unlockedShoes = new ArrayList<>();
    private ArrayList<HORN> unlockedHorns = new ArrayList<>();
    private ArrayList<PARTICLETRAIL> unlockedParticleTrails = new ArrayList<>();
    private ArrayList<KartPart> unlockedKartParts = new ArrayList<>();

    private HELMET selectedHelmet;
    private PANTS selectedPants;
    private JACKET selectedJacket;
    private SHOES selectedShoes;

    private Kart selectedKart;

    private boolean canyonMuted,endgameMuted,lobbyMuted,hypixelGPMuted,jungleRushMuted,retroMuted,olympusMuted;
    //</editor-fold>

    public PlayerTurboKartRacersStats(JsonObject json) {
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

            Logger.logWarn("[PlayerAPI.TurboKartRacers.initialize] Unknown value: " + key);
        }
    }

    private boolean setValue(String key, JsonElement value) {
        switch (key) {
            //<editor-fold desc="[Values]">
            case "COINS":
                this.coins = value.getAsInt();
                return true;
            case "BOX_PICKUPS":
                this.boxPickups = value.getAsInt();
                return true;
            case "BANANA_HITS_SENT":
                this.bananaHitsSent = value.getAsInt();
                return true;
            case "BANANA_HITS_RECEIVED":
                this.bananaHitsReceived = value.getAsInt();
                return true;
            case "LAPS_COMPLETED":
                this.lapsCompleted = value.getAsInt();
                return true;
            case "COINS_PICKED_UP":
                this.coinPickups = value.getAsInt();
                return true;
            case "BLUE_TORPEDO_HIT":
                this.blueTorpedoHits = value.getAsInt();
                return true;
            case "GOLD_TROPHY":
                this.goldTrophies = value.getAsInt();
                return true;
            case "SILVER_TROPHY":
                this.silverTrophies = value.getAsInt();
                return true;
            case "BRONZE_TROPHY":
                this.bronzeTrophies = value.getAsInt();
                return true;
            case "WINS":
                this.wins = value.getAsInt();
                return true;
            //</editor-fold>

            //<editor-fold desc="[Plays]">
            case "OLYMPUS_PLAYS":
                this.olympusPlays = value.getAsInt();
                return true;
            case "JUNGLERUSH_PLAYS":
                this.junglerushPlays = value.getAsInt();
                return true;
            case "HYPIXELGP_PLAYS":
                this.hypixelGPPlays = value.getAsInt();
                return true;
            case "RETRO_PLAYS":
                this.retroPlays = value.getAsInt();
                return true;
            case "CANYON_PLAYS":
                this.canyonPlays = value.getAsInt();
                return true;
            //</editor-fold>

            //<editor-fold desc="[GoldThropies]">
            case "GOLD_TROPHY_OLYMPUS":
                this.goldTrophiesOlympus = value.getAsInt();
                return true;
            case "GOLD_TROPHY_JUNGLERUSH":
                this.goldTrophiesJungleRush = value.getAsInt();
                return true;
            case "GOLD_TROPHY_HYPIXELGP":
                this.goldTrophiesHypixelGP = value.getAsInt();
                return true;
            case "GOLD_TROPHY_RETRO":
                this.goldTrophiesRetro = value.getAsInt();
                return true;
            case "GOLD_TROPHY_CANYON":
                this.goldTrophiesCanyon = value.getAsInt();
                return true;
            case "GOLD_TROPHY_WEEKLY_A":
                this.goldTrophiesWeekly_a = value.getAsInt();
                return true;
            case "GOLD_TROPHY_WEEKLY_B":
                this.goldTrophiesWeekly_b = value.getAsInt();
                return true;
            case "GOLD_TROPHY_MONTHLY_A":
                this.goldTrophiesMonthly_a = value.getAsInt();
                return true;
            case "GOLD_TROPHY_MONTHLY_B":
                this.goldTrophiesMonthly_b = value.getAsInt();
                return true;
            //</editor-fold>

            //<editor-fold desc="[Silver Throphies]"
            case "SILVER_TROPHY_OLYMPUS":
                this.silverTrophiesOlympus = value.getAsInt();
                return true;
            case "SILVER_TROPHY_JUNGLERUSH":
                this.silverTrophiesJungleRush = value.getAsInt();
                return true;
            case "SILVER_TROPHY_HYPIXELGP":
                this.silverTrophiesHypixelGP = value.getAsInt();
                return true;
            case "SILVER_TROPHY_RETRO":
                this.silverTrophiesRetro = value.getAsInt();
                return true;
            case "SILVER_TROPHY_CANYON":
                this.silverTrophiesCanyon = value.getAsInt();
                return true;
            case "SILVER_TROPHY_WEEKLY_A":
                this.silverTrophiesWeekly_a = value.getAsInt();
                return true;
            case "SILVER_TROPHY_WEEKLY_B":
                this.silverTrophiesWeekly_b = value.getAsInt();
                return true;
            case "SILVER_TROPHY_MONTHLY_A":
                this.silverTrophiesMonthly_a = value.getAsInt();
                return true;
            case "SILVER_TROPHY_MONTHLY_B":
                this.silverTrophiesMonthly_b = value.getAsInt();
                return true;
            //</editor-fold>

            //<editor-fold desc="[Bronze Throphies]">
            case "BRONZE_TROPHY_OLYMPUS":
                this.bronzeTrophiesOlympus = value.getAsInt();
                return true;
            case "BRONZE_TROPHY_JUNGLERUSH":
                this.bronzeTrophiesJungleRush = value.getAsInt();
                return true;
            case "BRONZE_TROPHY_HYPIXELGP":
                this.bronzeTrophiesHypixelGP = value.getAsInt();
                return true;
            case "BRONZE_TROPHY_RETRO":
                this.bronzeTrophiesRetro = value.getAsInt();
                return true;
            case "BRONZE_TROPHY_CANYON":
                this.bronzeTrophiesCanyon = value.getAsInt();
                return true;
            case "BRONZE_TROPHY_WEEKLY_A":
                this.bronzeTrophiesWeekly_a = value.getAsInt();
                return true;
            case "BRONZE_TROPHY_WEEKLY_B":
                this.bronzeTrophiesWeekly_b = value.getAsInt();
                return true;
            case "BRONZE_TROPHY_MONTHLY_A":
                this.bronzeTrophiesMonthly_a = value.getAsInt();
                return true;
            case "BRONZE_TROPHY_MONTHLY_B":
                this.bronzeTrophiesMonthly_b = value.getAsInt();
                return true;
            //</editor-fold>

            //<editor-fold desc="Box Pickups">
            case "BOX_PICKUPS_OLYMPUS":
                this.boxPickupsOlympus = value.getAsInt();
                return true;
            case "BOX_PICKUPS_JUNGLERUSH":
                this.boxPickupsJungleRush = value.getAsInt();
                return true;
            case "BOX_PICKUPS_HYPIXELGP":
                this.boxPickupsHypixelGP = value.getAsInt();
                return true;
            case "BOX_PICKUPS_RETRO":
                this.boxPickupsRetro = value.getAsInt();
                return true;
            case "BOX_PICKUPS_CANYON":
                this.boxPickupsCanyon = value.getAsInt();
                return true;
            case "BOX_PICKUPS_WEEKLY_A":
                this.boxPickupsWeekly_a = value.getAsInt();
                return true;
            case "BOX_PICKUPS_WEEKLY_B":
                this.boxPickupsWeekly_b = value.getAsInt();
                return true;
            case "BOX_PICKUPS_MONTHLY_A":
                this.boxPickupsMonthly_a = value.getAsInt();
                return true;
            case "BOX_PICKUPS_MONTHLY_B":
                this.boxPickupsMonthly_b = value.getAsInt();
                return true;
            //</editor-fold>


            default:
                return false;
        }
    }

    private boolean setSpecialValue(String key, JsonElement value) {
        switch (key) {
            case "SKIN_ACTIVE":
            case "FRAME_ACTIVE":
            case "ENGINE_ACTIVE":
            case "BOOSTER_ACTIVE":
            case "HORN":
            case "PARTICLE_TRAIL":
                if (this.selectedKart != null) {
                    setActiveKart();
                }
                return true;
            case "HELMET_ACTIVE":
            case "JACKET_ACTIVE":
            case "PANTS_ACTIVE":
            case "SHOES_ACTIVE":
                setActiveSuitPart(key, value.getAsString());
                return true;
            case "PACKAGES":
                initPackages(value.getAsJsonArray());
                return true;
            case "PARTS":
                initParts(value.getAsString());
                return true;
            default:
                return false;
        }
    }

    private void initParts(String object){
        String jsonString = "[" + object.replace(";", ",") + "]";
        JsonArray array = new JsonParser().parse(jsonString).getAsJsonArray();
        for(JsonElement element: array){
            this.unlockedKartParts.add(KartPart.getKartPartByJson(element.getAsJsonObject().get("GingerbreadPart").getAsJsonObject()));
        }
    }

    private void initPackages(JsonArray array) {
        for(JsonElement element: array) {
            String s = element.getAsString().replace("_unlocked", "").toUpperCase();
            if (HELMET.mapping.contains(s)) {
                this.unlockedHelmets.add(HELMET.valueOf(s));
            } else if (HORN.mapping.contains(s)) {
                this.unlockedHorns.add(HORN.valueOf(s));
            } else if (JACKET.mapping.contains(s)) {
                this.unlockedJackets.add(JACKET.valueOf(s));
            } else if (KARTSKIN.mapping.contains(s)) {
                this.unlockedKartSkins.add(KARTSKIN.valueOf(s));
            } else if (PANTS.mapping.contains(s)) {
                this.unlockedPants.add(PANTS.valueOf(s));
            } else if (PARTICLETRAIL.mapping.contains(s)) {
                this.unlockedParticleTrails.add(PARTICLETRAIL.valueOf(s));
            } else if (SHOES.mapping.contains(s)) {
                this.unlockedShoes.add(SHOES.valueOf(s));
            }else if(s.contains("_MUTED")){
                    muteTrack(s.replace("_MUTED", ""));
            }else{
                Logger.logWarn("[PlayerAPI.TurboKartRacers.initPackages] Unknown value: " + s);
            }
        }
    }

    private void muteTrack(String track){
        switch(track){
            case "CANYON":
                this.canyonMuted = true;
                break;
            case "ENDGAME":
                this.endgameMuted = true;
                break;
            case "LOBBY":
                this.lobbyMuted = true;
                break;
            case "HYPIXEL_GP":
                this.hypixelGPMuted = true;
                break;
            case "JUNGLE_RUSH":
                this.jungleRushMuted = true;
                break;
            case "RETRO":
                this.retroMuted = true;
                break;
            case "OLYMPUS":
                this.olympusMuted = true;
                break;
        }
    }

    private void setActiveKart() {
        String temp = getJsonString("skin_active").toUpperCase();
        KARTSKIN kartSkin = null;
        if (KARTSKIN.mapping.contains(temp)) {
            kartSkin = KARTSKIN.valueOf(temp);
        }

        temp = getJsonString("horn").toUpperCase();
        HORN horn = null;
        if(HORN.mapping.contains(temp)){
            horn = HORN.valueOf(temp);
        }

        temp = getJsonString("particle_trail").toUpperCase();
        PARTICLETRAIL trail = null;
        if(PARTICLETRAIL.mapping.contains(temp)){
            trail = PARTICLETRAIL.valueOf(temp);
        }

        JsonObject tempObject = getJsonObject("frame_active").get("GingerbreadPart").getAsJsonObject();
        KartPart frame = KartPart.getKartPartByJson(tempObject);

        tempObject = getJsonObject("engine_active").get("GingerbreadPart").getAsJsonObject();
        KartPart engine = KartPart.getKartPartByJson(tempObject);

        tempObject = getJsonObject("booster_active").get("GingerbreadPart").getAsJsonObject();
        KartPart booster = KartPart.getKartPartByJson(tempObject);

        this.selectedKart = new Kart(kartSkin, horn, trail, frame, engine, booster);

    }

    private void setActiveSuitPart(String key, String value) {
        if (HELMET.mapping.contains(value)) {
            this.selectedHelmet = HELMET.valueOf(value);
        } else if (PANTS.mapping.contains(value)) {
            this.selectedPants = PANTS.valueOf(value);
        } else if (JACKET.mapping.contains(value)) {
            this.selectedJacket = JACKET.valueOf(value);
        } else if (SHOES.mapping.contains(value)) {
            this.selectedShoes = SHOES.valueOf(value);
        } else {
            Logger.logWarn("[PlayerAPI.TurboKartRacers." + key + "] Unknown value: " + value);
        }
    }


    public int getCoins() {
        return coins;
    }

    public int getWins() {
        return wins;
    }

    public int getBoxPickups() {
        return boxPickups;
    }

    public int getCoinPickups() {
        return coinPickups;
    }

    public int getBananaHitsSent() {
        return bananaHitsSent;
    }

    public int getBananaHitsReceived() {
        return bananaHitsReceived;
    }

    public int getBlueTorpedoHits() {
        return blueTorpedoHits;
    }

    public int getLapsCompleted() {
        return lapsCompleted;
    }

    public int getGoldTrophies() {
        return goldTrophies;
    }

    public int getSilverTrophies() {
        return silverTrophies;
    }

    public int getBronzeTrophies() {
        return bronzeTrophies;
    }

    public int getGoldTrophiesWeekly_b() {
        return goldTrophiesWeekly_b;
    }

    public int getGoldTrophiesWeekly_a() {
        return goldTrophiesWeekly_a;
    }

    public int getGoldTrophiesMonthly_b() {
        return goldTrophiesMonthly_b;
    }

    public int getGoldTrophiesMonthly_a() {
        return goldTrophiesMonthly_a;
    }

    public int getGoldTrophiesOlympus() {
        return goldTrophiesOlympus;
    }

    public int getGoldTrophiesJungleRush() {
        return goldTrophiesJungleRush;
    }

    public int getGoldTrophiesHypixelGP() {
        return goldTrophiesHypixelGP;
    }

    public int getGoldTrophiesRetro() {
        return goldTrophiesRetro;
    }

    public int getGoldTrophiesCanyon() {
        return goldTrophiesCanyon;
    }

    public int getSilverTrophiesWeekly_b() {
        return silverTrophiesWeekly_b;
    }

    public int getSilverTrophiesWeekly_a() {
        return silverTrophiesWeekly_a;
    }

    public int getSilverTrophiesMonthly_b() {
        return silverTrophiesMonthly_b;
    }

    public int getSilverTrophiesMonthly_a() {
        return silverTrophiesMonthly_a;
    }

    public int getSilverTrophiesOlympus() {
        return silverTrophiesOlympus;
    }

    public int getSilverTrophiesJungleRush() {
        return silverTrophiesJungleRush;
    }

    public int getSilverTrophiesHypixelGP() {
        return silverTrophiesHypixelGP;
    }

    public int getSilverTrophiesRetro() {
        return silverTrophiesRetro;
    }

    public int getSilverTrophiesCanyon() {
        return silverTrophiesCanyon;
    }

    public int getBronzeTrophiesWeekly_b() {
        return bronzeTrophiesWeekly_b;
    }

    public int getBronzeTrophiesWeekly_a() {
        return bronzeTrophiesWeekly_a;
    }

    public int getBronzeTrophiesMonthly_b() {
        return bronzeTrophiesMonthly_b;
    }

    public int getBronzeTrophiesMonthly_a() {
        return bronzeTrophiesMonthly_a;
    }

    public int getBronzeTrophiesOlympus() {
        return bronzeTrophiesOlympus;
    }

    public int getBronzeTrophiesJungleRush() {
        return bronzeTrophiesJungleRush;
    }

    public int getBronzeTrophiesHypixelGP() {
        return bronzeTrophiesHypixelGP;
    }

    public int getBronzeTrophiesRetro() {
        return bronzeTrophiesRetro;
    }

    public int getBronzeTrophiesCanyon() {
        return bronzeTrophiesCanyon;
    }

    public int getBoxPickupsWeekly_b() {
        return boxPickupsWeekly_b;
    }

    public int getBoxPickupsWeekly_a() {
        return boxPickupsWeekly_a;
    }

    public int getBoxPickupsMonthly_b() {
        return boxPickupsMonthly_b;
    }

    public int getBoxPickupsMonthly_a() {
        return boxPickupsMonthly_a;
    }

    public int getBoxPickupsOlympus() {
        return boxPickupsOlympus;
    }

    public int getBoxPickupsJungleRush() {
        return boxPickupsJungleRush;
    }

    public int getBoxPickupsHypixelGP() {
        return boxPickupsHypixelGP;
    }

    public int getBoxPickupsRetro() {
        return boxPickupsRetro;
    }

    public int getBoxPickupsCanyon() {
        return boxPickupsCanyon;
    }

    public int getOlympusPlays() {
        return olympusPlays;
    }

    public int getJunglerushPlays() {
        return junglerushPlays;
    }

    public int getHypixelGPPlays() {
        return hypixelGPPlays;
    }

    public int getRetroPlays() {
        return retroPlays;
    }

    public int getCanyonPlays() {
        return canyonPlays;
    }

    public ArrayList<HELMET> getUnlockedHelmets() {
        return unlockedHelmets;
    }

    public ArrayList<KARTSKIN> getUnlockedKartSkins() {
        return unlockedKartSkins;
    }

    public ArrayList<PANTS> getUnlockedPants() {
        return unlockedPants;
    }

    public ArrayList<JACKET> getUnlockedJackets() {
        return unlockedJackets;
    }

    public ArrayList<SHOES> getUnlockedShoes() {
        return unlockedShoes;
    }

    public ArrayList<HORN> getUnlockedHorns() {
        return unlockedHorns;
    }

    public ArrayList<PARTICLETRAIL> getUnlockedParticleTrails() {
        return unlockedParticleTrails;
    }

    public ArrayList<KartPart> getUnlockedKartParts() {
        return unlockedKartParts;
    }

    public HELMET getSelectedHelmet() {
        return selectedHelmet;
    }

    public PANTS getSelectedPants() {
        return selectedPants;
    }

    public JACKET getSelectedJacket() {
        return selectedJacket;
    }

    public SHOES getSelectedShoes() {
        return selectedShoes;
    }

    public Kart getSelectedKart() {
        return selectedKart;
    }

    public boolean isCanyonMuted() {
        return canyonMuted;
    }

    public boolean isEndgameMuted() {
        return endgameMuted;
    }

    public boolean isLobbyMuted() {
        return lobbyMuted;
    }

    public boolean isHypixelGPMuted() {
        return hypixelGPMuted;
    }

    public boolean isJungleRushMuted() {
        return jungleRushMuted;
    }

    public boolean isRetroMuted() {
        return retroMuted;
    }

    public boolean isOlympusMuted() {
        return olympusMuted;
    }
}
