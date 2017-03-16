package com.skyerzz.hypixellib.util.games.arcade;

import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 4-9-2016.
 */
public enum COSMETIC {
    KNIFE_MELEE(            "Blocking Dead: Knife",             0,    RANK.NONE,  GAMETYPE.BLOCKING_DEAD), //unchecked
    COMBAT_KNIFE_MELEE(     "Blocking Dead: Combat Knife",      1000, RANK.MVP,      GAMETYPE.BLOCKING_DEAD),
    MACHETE_MELEE(          "Blocking Dead: Machete",           1500, RANK.MVP_PLUS, GAMETYPE.BLOCKING_DEAD),
    KATANA_MELEE(           "Blocking Dead: Katana",            9100, RANK.MVP_PLUS, GAMETYPE.BLOCKING_DEAD),
    GOLF_CLUB_MELEE(        "Blocking Dead: Golf Club",         2500, RANK.VIP_PLUS, GAMETYPE.BLOCKING_DEAD),
    FIRE_AXE_MELEE(         "Blocking Dead: Fire Axe",          5500, RANK.MVP,      GAMETYPE.BLOCKING_DEAD),
    BASEBALL_BAT_MELEE(     "Blocking Dead: Baseball Bat",      3000, RANK.MVP_PLUS, GAMETYPE.BLOCKING_DEAD),
    CRICKET_BAT_MELEE(      "Blocking Dead: Cricket Bat",       6000, RANK.VIP_PLUS, GAMETYPE.BLOCKING_DEAD),
    CLIMBER_PICKAXE_MELEE(  "Blocking Dead: Climber's Pickaxe", 8000, RANK.VIP,      GAMETYPE.BLOCKING_DEAD),
    POLICE_BATON_MELEE(     "Blocking Dead: Riot Stick",        9000, RANK.VIP,      GAMETYPE.BLOCKING_DEAD),

    BOUNTY_HUNTERS_DEFAULT_TRAIL(   "Bounty Hunters: Default Head",  0,     RANK.NONE,   GAMETYPE.BOUNTY_HUNTERS), //has no api value but "default"
    HUNTER_TRAIL(                   "Bounty Hunters: Hunter's Head", 2000,  RANK.VIP,       GAMETYPE.BOUNTY_HUNTERS),
    TARGET_TRAIL(                   "Bounty Hunters: Target's Head", 4000,  RANK.MVP,       GAMETYPE.BOUNTY_HUNTERS),
    MOB_TRAIL(                      "Bounty Hunters: Mob Head",      12000, RANK.VIP_PLUS,  GAMETYPE.BOUNTY_HUNTERS),
    EMOTION_TRAIL(                  "Bounty Hunters: Emotion Head",  8000,  RANK.VIP,       GAMETYPE.BOUNTY_HUNTERS),

    ENDER_SPLEEF_DEFAULT_TRAIL( "Ender Spleef: Default Projectile Trail",   0,    RANK.NONE,  GAMETYPE.ENDER_SPLEEF), // has no api value but "default"
    GREEN_TRAIL(                "Ender Spleef: Green Projectile Trail",     2000, RANK.VIP,      GAMETYPE.ENDER_SPLEEF),
    BLUE_TRAIL(                 "Ender Spleef: Blue Projectile Trail",      2000, RANK.VIP_PLUS, GAMETYPE.ENDER_SPLEEF),
    RED_TRAIL(                  "Ender Spleef: Red Projectile Trail",       2000, RANK.VIP_PLUS, GAMETYPE.ENDER_SPLEEF),
    RAINBOW_TRAIL(              "Ender Spleef: Rainbow Projectile Trail",   4000, RANK.MVP,      GAMETYPE.ENDER_SPLEEF),

    SNOWMAN_DISGUISE("OUTDATED: Snowman Disguise", -1, RANK.NONE, GAMETYPE.THROW_OUT),
    ZOMBIE_DISGUISE("OUTDATED: Zombie Disguise", -1, RANK.NONE, GAMETYPE.THROW_OUT);


    private String displayName;
    private int cost;
    private RANK rankRequirement;
    private GAMETYPE gameType;

    COSMETIC(String displayName, int cost, RANK rankRequirement, GAMETYPE gameType){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
        this.gameType = gameType;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(COSMETIC item: COSMETIC.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getCost() {
        return cost;
    }

    public RANK getRankRequirement() {
        return rankRequirement;
    }

    public GAMETYPE getGameType() {
        return gameType;
    }
}
