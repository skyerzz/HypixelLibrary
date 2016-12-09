package com.skyerzz.hypixellib.util.games.arcade;

import com.skyerzz.hypixellib.util.RANKTYPE;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;

/**
 * Created by sky on 4-9-2016.
 */
public enum COSMETIC {
    KNIFE_MELEE(            "Blocking Dead: Knife",             0,    RANKTYPE.DEFAULT,  GAMETYPE.BLOCKING_DEAD), //unchecked
    COMBAT_KNIFE_MELEE(     "Blocking Dead: Combat Knife",      1000, RANKTYPE.MVP,      GAMETYPE.BLOCKING_DEAD),
    MACHETE_MELEE(          "Blocking Dead: Machete",           1500, RANKTYPE.MVP_PLUS, GAMETYPE.BLOCKING_DEAD),
    KATANA_MELEE(           "Blocking Dead: Katana",            9100, RANKTYPE.MVP_PLUS, GAMETYPE.BLOCKING_DEAD),
    GOLF_CLUB_MELEE(        "Blocking Dead: Golf Club",         2500, RANKTYPE.VIP_PLUS, GAMETYPE.BLOCKING_DEAD),
    FIRE_AXE_MELEE(         "Blocking Dead: Fire Axe",          5500, RANKTYPE.MVP,      GAMETYPE.BLOCKING_DEAD),
    BASEBALL_BAT_MELEE(     "Blocking Dead: Baseball Bat",      3000, RANKTYPE.MVP_PLUS, GAMETYPE.BLOCKING_DEAD),
    CRICKET_BAT_MELEE(      "Blocking Dead: Cricket Bat",       6000, RANKTYPE.VIP_PLUS, GAMETYPE.BLOCKING_DEAD),
    CLIMBER_PICKAXE_MELEE(  "Blocking Dead: Climber's Pickaxe", 8000, RANKTYPE.VIP,      GAMETYPE.BLOCKING_DEAD),
    POLICE_BATON_MELEE(     "Blocking Dead: Riot Stick",        9000, RANKTYPE.VIP,      GAMETYPE.BLOCKING_DEAD),

    BOUNTY_HUNTERS_DEFAULT_TRAIL(   "Bounty Hunters: Default Head",  0,     RANKTYPE.DEFAULT,   GAMETYPE.BOUNTY_HUNTERS), //has no api value but "default"
    HUNTER_TRAIL(                   "Bounty Hunters: Hunter's Head", 2000,  RANKTYPE.VIP,       GAMETYPE.BOUNTY_HUNTERS),
    TARGET_TRAIL(                   "Bounty Hunters: Target's Head", 4000,  RANKTYPE.MVP,       GAMETYPE.BOUNTY_HUNTERS),
    MOB_TRAIL(                      "Bounty Hunters: Mob Head",      12000, RANKTYPE.VIP_PLUS,  GAMETYPE.BOUNTY_HUNTERS),
    EMOTION_TRAIL(                  "Bounty Hunters: Emotion Head",  8000,  RANKTYPE.VIP,       GAMETYPE.BOUNTY_HUNTERS),

    ENDER_SPLEEF_DEFAULT_TRAIL( "Ender Spleef: Default Projectile Trail",   0,    RANKTYPE.DEFAULT,  GAMETYPE.ENDER_SPLEEF), // has no api value but "default"
    GREEN_TRAIL(                "Ender Spleef: Green Projectile Trail",     2000, RANKTYPE.VIP,      GAMETYPE.ENDER_SPLEEF),
    BLUE_TRAIL(                 "Ender Spleef: Blue Projectile Trail",      2000, RANKTYPE.VIP_PLUS, GAMETYPE.ENDER_SPLEEF),
    RED_TRAIL(                  "Ender Spleef: Red Projectile Trail",       2000, RANKTYPE.VIP_PLUS, GAMETYPE.ENDER_SPLEEF),
    RAINBOW_TRAIL(              "Ender Spleef: Rainbow Projectile Trail",   4000, RANKTYPE.MVP,      GAMETYPE.ENDER_SPLEEF),

    SNOWMAN_DISGUISE("OUTDATED: Snowman Disguise", -1, RANKTYPE.DEFAULT, GAMETYPE.THROW_OUT),
    ZOMBIE_DISGUISE("OUTDATED: Zombie Disguise", -1, RANKTYPE.DEFAULT, GAMETYPE.THROW_OUT);


    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;
    private GAMETYPE gameType;

    COSMETIC(String displayName, int cost, RANKTYPE rankRequirement, GAMETYPE gameType){
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

    public RANKTYPE getRankRequirement() {
        return rankRequirement;
    }

    public GAMETYPE getGameType() {
        return gameType;
    }
}
