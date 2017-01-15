package com.skyerzz.hypixellib.util.games.blitz;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 19-11-2016.
 */
public enum TAUNT{
    FIREWORK("UNSURE- Launch a firework?", -1, RANKTYPE.DEFAULT),
    FIREWORK_EXPLOSION("Firework Explosion Taunt", 0, RANKTYPE.VIP),
    I_REFUSE("I Refuse! Taunt", 0, RANKTYPE.VIP),
    CHICKEN_DANCE("Chicken Dance Taunt", 0, RANKTYPE.VIP_PLUS),
    PIG_DANCE("Pig Dance Taunt", 0, RANKTYPE.VIP_PLUS),
    SHEEP_PARADE("Sheep Parade Taunt", 0, RANKTYPE.VIP_PLUS),
    BAT_DUDE("Bat Dude Taunt", 0, RANKTYPE.VIP_PLUS),
    WOLF_PACK("Wolf Pack Taunt", 0, RANKTYPE.VIP_PLUS),
    VILLAGER_MUSIC_BAND("Villager Music Band Taunt", 0, RANKTYPE.MVP),
    RICH_JAMES("Rich James Taunt", 0, RANKTYPE.MVP),
    COOKIE("Cookie Taunt", 0, RANKTYPE.MVP);

    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    TAUNT(String displayName, int cost, RANKTYPE rankRequirement){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
