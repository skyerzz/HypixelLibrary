package com.skyerzz.hypixellib.util.games.blitz;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 19-11-2016.
 */
public enum TAUNT{
    FIREWORK("UNSURE- Launch a firework?", -1, RANK.NONE),
    FIREWORK_EXPLOSION("Firework Explosion Taunt", 0, RANK.VIP),
    I_REFUSE("I Refuse! Taunt", 0, RANK.VIP),
    CHICKEN_DANCE("Chicken Dance Taunt", 0, RANK.VIP_PLUS),
    PIG_DANCE("Pig Dance Taunt", 0, RANK.VIP_PLUS),
    SHEEP_PARADE("Sheep Parade Taunt", 0, RANK.VIP_PLUS),
    BAT_DUDE("Bat Dude Taunt", 0, RANK.VIP_PLUS),
    WOLF_PACK("Wolf Pack Taunt", 0, RANK.VIP_PLUS),
    VILLAGER_MUSIC_BAND("Villager Music Band Taunt", 0, RANK.MVP),
    RICH_JAMES("Rich James Taunt", 0, RANK.MVP),
    COOKIE("Cookie Taunt", 0, RANK.MVP);

    private String displayName;
    private int cost;
    private RANK rankRequirement;

    TAUNT(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(TAUNT item: TAUNT.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getCost(){
        return cost;
    }

    public CURRENCY getCurrencyType(){ return CURRENCY.COINS; }

    public RANK getRankRequirement(){
        return rankRequirement;
    }
}
