package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.Currency;
import com.skyerzz.hypixellib.util.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum Killsound {
    BLAZE_DEATH("Blaze Death", 0, Rank.NONE),
    HORSE_DEATH("Horse Death", 2000, Rank.NONE),
    BAT_DEATH("Bat death", 2000, Rank.NONE),
    ENDERMAN_DEATH("Enderman Death", 4000, Rank.VIP),
    GOLEM_DEATH("Golem Death", 4000, Rank.VIP),
    PIG_DEATH("Pig Death", 4000, Rank.VIP),
    COW_HURT("Cow Hurt", 4000, Rank.VIP),
    CREEPER_DEATH("Creeper Death", 4000, Rank.VIP),
    GHAST_DEATH("Ghas Death", 5000, Rank.VIP_PLUS),
    DRAGON_GROWL("Dragon Growl", 5000, Rank.VIP_PLUS),
    DRAGON_DEATH("Dragon Growl", 5000, Rank.VIP_PLUS),
    VILLAGER_MHM("Villager MHM", 5000, Rank.MVP);

    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Killsound(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Killsound item: Killsound.values()){
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
