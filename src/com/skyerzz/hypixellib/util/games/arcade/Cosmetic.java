package com.skyerzz.hypixellib.util.games.arcade;

import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 4-9-2016.
 */
public enum Cosmetic {
    KNIFE_MELEE(            "Blocking Dead: Knife",             0,    Rank.NONE,  Gametype.BLOCKING_DEAD), //unchecked
    COMBAT_KNIFE_MELEE(     "Blocking Dead: Combat Knife",      1000, Rank.MVP,      Gametype.BLOCKING_DEAD),
    MACHETE_MELEE(          "Blocking Dead: Machete",           1500, Rank.MVP_PLUS, Gametype.BLOCKING_DEAD),
    KATANA_MELEE(           "Blocking Dead: Katana",            9100, Rank.MVP_PLUS, Gametype.BLOCKING_DEAD),
    GOLF_CLUB_MELEE(        "Blocking Dead: Golf Club",         2500, Rank.VIP_PLUS, Gametype.BLOCKING_DEAD),
    FIRE_AXE_MELEE(         "Blocking Dead: Fire Axe",          5500, Rank.MVP,      Gametype.BLOCKING_DEAD),
    BASEBALL_BAT_MELEE(     "Blocking Dead: Baseball Bat",      3000, Rank.MVP_PLUS, Gametype.BLOCKING_DEAD),
    CRICKET_BAT_MELEE(      "Blocking Dead: Cricket Bat",       6000, Rank.VIP_PLUS, Gametype.BLOCKING_DEAD),
    CLIMBER_PICKAXE_MELEE(  "Blocking Dead: Climber's Pickaxe", 8000, Rank.VIP,      Gametype.BLOCKING_DEAD),
    POLICE_BATON_MELEE(     "Blocking Dead: Riot Stick",        9000, Rank.VIP,      Gametype.BLOCKING_DEAD),

    BOUNTY_HUNTERS_DEFAULT_TRAIL(   "Bounty Hunters: Default Head",  0,     Rank.NONE,   Gametype.BOUNTY_HUNTERS), //has no api value but "default"
    HUNTER_TRAIL(                   "Bounty Hunters: Hunter's Head", 2000,  Rank.VIP,       Gametype.BOUNTY_HUNTERS),
    TARGET_TRAIL(                   "Bounty Hunters: Target's Head", 4000,  Rank.MVP,       Gametype.BOUNTY_HUNTERS),
    MOB_TRAIL(                      "Bounty Hunters: Mob Head",      12000, Rank.VIP_PLUS,  Gametype.BOUNTY_HUNTERS),
    EMOTION_TRAIL(                  "Bounty Hunters: Emotion Head",  8000,  Rank.VIP,       Gametype.BOUNTY_HUNTERS),

    ENDER_SPLEEF_DEFAULT_TRAIL( "Ender Spleef: Default Projectile Trail",   0,    Rank.NONE,  Gametype.ENDER_SPLEEF), // has no api value but "default"
    GREEN_TRAIL(                "Ender Spleef: Green Projectile Trail",     2000, Rank.VIP,      Gametype.ENDER_SPLEEF),
    BLUE_TRAIL(                 "Ender Spleef: Blue Projectile Trail",      2000, Rank.VIP_PLUS, Gametype.ENDER_SPLEEF),
    RED_TRAIL(                  "Ender Spleef: Red Projectile Trail",       2000, Rank.VIP_PLUS, Gametype.ENDER_SPLEEF),
    RAINBOW_TRAIL(              "Ender Spleef: Rainbow Projectile Trail",   4000, Rank.MVP,      Gametype.ENDER_SPLEEF),

    SNOWMAN_DISGUISE("OUTDATED: Snowman Disguise", -1, Rank.NONE, Gametype.THROW_OUT),
    ZOMBIE_DISGUISE("OUTDATED: Zombie Disguise", -1, Rank.NONE, Gametype.THROW_OUT);


    private String displayName;
    private int cost;
    private Rank rankRequirement;
    private Gametype gameType;

    Cosmetic(String displayName, int cost, Rank rankRequirement, Gametype gameType){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
        this.gameType = gameType;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Cosmetic item: Cosmetic.values()){
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

    public Rank getRankRequirement() {
        return rankRequirement;
    }

    public Gametype getGameType() {
        return gameType;
    }
}
