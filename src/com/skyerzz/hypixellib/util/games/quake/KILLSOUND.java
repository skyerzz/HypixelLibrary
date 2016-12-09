package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum KILLSOUND {
    BLAZE_DEATH("Blaze Death", 0, RANKTYPE.DEFAULT),
    HORSE_DEATH("Horse Death", 2000, RANKTYPE.DEFAULT),
    BAT_DEATH("Bat death", 2000, RANKTYPE.DEFAULT),
    ENDERMAN_DEATH("Enderman Death", 4000, RANKTYPE.VIP),
    GOLEM_DEATH("Golem Death", 4000, RANKTYPE.VIP),
    PIG_DEATH("Pig Death", 4000, RANKTYPE.VIP),
    COW_HURT("Cow Hurt", 4000, RANKTYPE.VIP),
    CREEPER_DEATH("Creeper Death", 4000, RANKTYPE.VIP),
    GHAST_DEATH("Ghas Death", 5000, RANKTYPE.VIP_PLUS),
    DRAGON_GROWL("Dragon Growl", 5000, RANKTYPE.VIP_PLUS),
    VILLAGER_MHM("Villager MHM", 5000, RANKTYPE.MVP);

    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    KILLSOUND(String displayName, int cost, RANKTYPE rankRequirement){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
