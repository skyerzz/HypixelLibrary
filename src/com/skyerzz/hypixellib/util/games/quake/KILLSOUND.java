package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum KILLSOUND {
    BLAZE_DEATH("Blaze Death", 0, RANK.NONE),
    HORSE_DEATH("Horse Death", 2000, RANK.NONE),
    BAT_DEATH("Bat death", 2000, RANK.NONE),
    ENDERMAN_DEATH("Enderman Death", 4000, RANK.VIP),
    GOLEM_DEATH("Golem Death", 4000, RANK.VIP),
    PIG_DEATH("Pig Death", 4000, RANK.VIP),
    COW_HURT("Cow Hurt", 4000, RANK.VIP),
    CREEPER_DEATH("Creeper Death", 4000, RANK.VIP),
    GHAST_DEATH("Ghas Death", 5000, RANK.VIP_PLUS),
    DRAGON_GROWL("Dragon Growl", 5000, RANK.VIP_PLUS),
    DRAGON_DEATH("Dragon Growl", 5000, RANK.VIP_PLUS),
    VILLAGER_MHM("Villager MHM", 5000, RANK.MVP);

    private String displayName;
    private int cost;
    private RANK rankRequirement;

    KILLSOUND(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(KILLSOUND item: KILLSOUND.values()){
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
