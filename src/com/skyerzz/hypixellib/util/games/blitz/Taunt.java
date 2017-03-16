package com.skyerzz.hypixellib.util.games.blitz;

import com.skyerzz.hypixellib.util.Currency;
import com.skyerzz.hypixellib.util.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 19-11-2016.
 */
public enum Taunt {
    FIREWORK("UNSURE- Launch a firework?", -1, Rank.NONE),
    FIREWORK_EXPLOSION("Firework Explosion Taunt", 0, Rank.VIP),
    I_REFUSE("I Refuse! Taunt", 0, Rank.VIP),
    CHICKEN_DANCE("Chicken Dance Taunt", 0, Rank.VIP_PLUS),
    PIG_DANCE("Pig Dance Taunt", 0, Rank.VIP_PLUS),
    SHEEP_PARADE("Sheep Parade Taunt", 0, Rank.VIP_PLUS),
    BAT_DUDE("Bat Dude Taunt", 0, Rank.VIP_PLUS),
    WOLF_PACK("Wolf Pack Taunt", 0, Rank.VIP_PLUS),
    VILLAGER_MUSIC_BAND("Villager Music Band Taunt", 0, Rank.MVP),
    RICH_JAMES("Rich James Taunt", 0, Rank.MVP),
    COOKIE("Cookie Taunt", 0, Rank.MVP);

    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Taunt(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Taunt item: Taunt.values()){
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

    public Currency getCurrencyType(){ return Currency.COINS; }

    public Rank getRankRequirement(){
        return rankRequirement;
    }
}
